package org.ServletEx;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("in service");
//        res.getWriter().println("hi ");

        res.setContentType("text/html");

        PrintWriter out = res.getWriter();
        out.println("<h1>Hello World</h1>");
    }
}
