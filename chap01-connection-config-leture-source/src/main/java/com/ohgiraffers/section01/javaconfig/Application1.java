package com.ohgiraffers.section01.javaconfig;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

public class Application1 {
    private  static  String DRIVER="com.mysql.cj.jdbc.Driver";
    private  static  String URL="jdbc:mysql://localhost/menudb";
    private  static  String USER="ohgiraffers";
    private  static  String PASSWORD="ohgiraffers";

    public static void main(String[] args) {
        /*DB접속에 관한 환경설정
        * -----------
        * JdbcTraceactionFactory:수동 커밋
        * ManagedTransactionFactory:자동 커밋
        * -------------------
        * PooledDAtaSource:커넥션풀사용
        * UnpooledDAtaSource:커넥션풀 미사용
        * -----------------*/
        Environment environment =new Environment("dev" //환경 정보이름(구분을 위한 id값)
                ,new JdbcTransactionFactory() // 트랜잭션 매니저 종류결정
                ,new PooledDataSource(DRIVER,URL,USER,PASSWORD)); // 커넥션풀 사용유무 결정


        Configuration configuration=new Configuration(environment);
        /*설정 객체에따른 매퍼등록(쿼리작성의 위치를 매퍼에 전달)*/
        configuration.addMapper(Mapper.class);
        /*SqlSessionFactory:sqlSession 객체생성을 위한 팩토리역할
        * SqlSessionFactoryBuilder:SqlSessionFactoryBuilder 인터페이스 타입의 하위 구현객체를  생성하기위한 빌드
        * build():설정에대한 정보를 담고있는 configuration타입의 객체혹은 외부 설정파일과 연결된
        *  Stream을 매개변수로 전달하면 sqlSessionFactory 인터페이스 타입의 객체를 반환 */
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(configuration);

        /*openSession():sqlSession 인터페이스 타입의 객체를 반환 하는 메소드로 boolean타입을 인자로 전달*/
        SqlSession sqlsession=sqlSessionFactory.openSession(false); //자동 커밋에 대한 옵션

        /*getMapper():configuration 에 등록된 매퍼를 동일 타입에 대해 반환*/
        Mapper mapper=sqlsession.getMapper(Mapper.class);

        /*mapper 인터페이스에 작성된 메소드를 호출해 쿼리실행*/
        java.util.Date date=mapper.selectSysdate();

        System.out.println(date);
        sqlsession.close();

    }
}
