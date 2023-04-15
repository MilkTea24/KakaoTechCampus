package com.springexample.servletexample;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet; //jakarta EE로 바뀌면서 javax.servlet에서 jakarta.servlet이 됨
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = {"/hello"}) //어떤 URL에 대해 처리해주는 서블릿인지 알려주기 위함 이외에도 web.xml이라고 하는 배포 서술자를 이용할 수 있다.
public class HelloServlet extends HttpServlet { //모든 서블릿은 기본적으로 HTTP 서블릿 클래스를 상속받으면서 시작할 수 있다.
    //ctrl + O로 오버라이드할 수 있는 메서드 목록을 보여줌
    //POST, GET과 같은 각각의 메소드에 대해서 오버라이드할 수도 있고 service를 오버라이드하면 모든 메서드에 대해서 동작한다.
    //서블릿 컨테이너로부터 hTTPServletRequest, HttpServletResplonse를 받을 수 있다.

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 요청 데이터로부터 실행할 이름정보를 꺼내기
        String requestName = request.getParameter("name");         //HTTPservletRequest 객체로부터 이름 정보를 받을 수 있다.

        //2. 실행하는 서블릿의 이름정보 찾기
        String servletName = getServletConfig().getServletName(); //HTTPServlet 클래스에는 서블렛의 정보를 가지고 있는 getServletConfig라는 메소드가 준비되어 있다.

        //3. 두 이름 정보를 바탕으로 HTML 작성하기
        StringBuilder html = new StringBuilder();
        html.append("""
                <html>
                    <head>
                        <title>초 간단 서블릿 개발하기</title>
                    </head>
                    <body>
                """);
        html.append("       <h1>" + requestName + "님 안녕하세요.</h1>");
        html.append("       <h1>저는 " + servletName + "입니다.</h1>");
        html.append("   </body>");
        html.append("</html>");

        //4. HTTP 응답 작성하기(상태코드, 헤더, 응답 콘텐트)
        response.setStatus(200); //상태코드
        response.setContentType("text/html; charset=UTF-8"); //헤더 : 보낼려는 콘텐트의 정보 적어주기
        response.getWriter().write(html.toString()); //HttpServletResponse 객체에서 Writer 객체를 불러와 콘텐트를 첨부할 수 있다.

        //작성된 서블릿 프로그램을 실행하기 위해서는 서블릿 컨테이너가 반드시 필요하다.
    }
}
