package pk.edu.zab.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assignment.CommonFunctions;


public class StaticController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("StaticController invoked");
		System.out.println("View: "+request.getAttribute("kase")); 
		String view = "/WEB-INF/common/" + request.getAttribute("kase");
		CommonFunctions.getFileContent(view, response, getServletContext());
		
	}

	
	

}
