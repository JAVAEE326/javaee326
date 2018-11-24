package Servlet;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class QuickStartServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servlet快速入门");
        // 参数servletResponse方法getWriter()获取字符输出流
        PrintWriter w = servletResponse.getWriter();
        w.write("hello world");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
