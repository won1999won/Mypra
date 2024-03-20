package com.ohgiraffers.section02.annotation;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
//loadonstartup 소성으로 우선순의 지정(작을수록 우선도)서버가 시작될때마다 인스턴스 생성밎 init()를 호출
@WebServlet(value = "/anotation-lifecycle",loadOnStartup = 1)
public class LifeCycleTestServlet extends HttpServlet {
    private int initCount=1;
    private int serviceCount=1;
    private int destroyCount=1;



    //    기본생성자
    @Override //최초 서블릿 요청시 동작 메소드
    public void init() throws ServletException {
//       서블릿 컨테이너에의해 호출 최초요청시에만 실행함
        System.out.println("anotation 매핑 init() 메소드 호출"+initCount++);
    }
    //    최초요청시에는 init()이후에 동작하고 두번째부터 바로 호출
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("anotation 매핑 service() 메소드 호출"+serviceCount++);
    }

    //    컨테이너가 종료될때 호출되는 메소드로 자원반납기능으로 주로 사용된다
    @Override
    public void destroy() {
        System.out.println("anotation 매핑 destroy() 메소드 호출"+destroyCount++);
    }

    public LifeCycleTestServlet(){



    }
}
