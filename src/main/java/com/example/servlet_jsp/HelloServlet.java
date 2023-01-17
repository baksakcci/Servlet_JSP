package com.example.servlet_jsp;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        // query string을 받아옴. 만일 url에 추가 안할 시 Null exception 에러
        int cnt = Integer.parseInt(request.getParameter("cnt"));

        for(int i = 0; i < cnt; i++) {
            out.println("반복해서 출력하는 Servlet</br>");
        }
    }
}