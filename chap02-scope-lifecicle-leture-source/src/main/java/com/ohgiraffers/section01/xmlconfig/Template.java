package com.ohgiraffers.section01.xmlconfig;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Template {
    /*sqlsessionfactory는 애플리케이션이 존재하는 동안 존재해야하며
    * 여러차례 다시빌드하지않는것이 좋다
    * 애플리 케이션 스코프로 관리하기 위한 가장 간단한 방법은 싱글톤 패턴을 이용하는것*/

    private static SqlSessionFactory sqlsessionFactory;

    public static SqlSession getSqlsession(){
        /*SqlSessionfactoryBuilder를sqlsession을 생성후에도 유지할 필용벗음
        * 따라서 메소드 스코프로 만든다
        * 여러개의 sqlsessionfactory를 빌드하기위해 재사용할수있지만 유지하   지않는것이 좋다*/
        if (sqlsessionFactory==null){
            String resource="mybatis-config.xml";
            try {
                InputStream inputStream= Resources.getResourceAsStream(resource);
                sqlsessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        /*sqlSession은 Thread에 안전하지 않고 공유되지 않아야하며 요청시마다 생성해야한다
        * */
        SqlSession sqlSession=sqlsessionFactory.openSession(false);

        System.out.println("sqlSessionFactory의 hashcode():"+sqlsessionFactory.hashCode());
        System.out.println("sqlSession의 hashcode():"+sqlSession.hashCode());

        return  sqlSession;
    }
}
