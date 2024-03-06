package com.ohgiraffers.section02.xmlconfig;

import com.mysql.cj.xdevapi.SessionFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Application {
    public static void main(String[] args) {
        String resource="mybatis-config.xml";

        try {
            InputStream inputStream= Resources.getResourceAsStream(resource);
            SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession session=sessionFactory.openSession(false);

            java.util.Date date=session.selectOne("mapper.selectSysdata");

            System.out.println(date);
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
