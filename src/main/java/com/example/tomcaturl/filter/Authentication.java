package com.example.tomcaturl.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebFilter(urlPatterns = "/user/*")
public class Authentication implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        String uri = request.getRequestURI();
        if (uri.equals("/user/index")){
            //跳转到登录页面
            response.sendRedirect("/login");
            return;
        }

        System.out.println(uri);
        filterChain.doFilter(servletRequest,servletResponse);
    }


}
