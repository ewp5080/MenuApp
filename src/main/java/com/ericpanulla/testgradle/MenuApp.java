package com.ericpanulla.testgradle;

import javax.ws.rs.core.Application;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class MenuApp {

    public static void main(String[] args) throws Exception{
    	 final Server server = new Server(Integer.valueOf(System.getenv("PORT")));
         final ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
         context.setContextPath("/");
         server.start();
         server.join();  
    }
}
