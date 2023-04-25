package com.spring.example.servletexample;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = {"/improved-hello"})
public class ImprovedHelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String requestName = request.getParameter("name");
        String servletName = getServletConfig().getServletName();

        //JSP에 전달할 정보 작성하기
        request.setAttribute("requestName", requestName);
        request.setAttribute("servletName", servletName);

        //JSP에 전달하기
        request.getRequestDispatcher("/jspExamples/improved-hello.jsp") //웹앱부터 jsp까지의 위치 작성하기
                .forward(request, response);
    }
}
