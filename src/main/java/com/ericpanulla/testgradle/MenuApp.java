package com.ericpanulla.testgradle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class MenuApp extends HttpServlet{
	
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.getWriter().print("Hello from Java built with Gradle!\n");
    }

    public static void main(String[] args) throws Exception{
    	 final Server server = new Server(Integer.valueOf(System.getenv("PORT")));
         final ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
         context.setContextPath("/");
         server.setHandler(context);
         context.addServlet(new ServletHolder(new MenuApp()),"/*");
         server.start();
         server.join();  
    }
}
