package pk.edu.zab.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assignment.CommonFunctions;


public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//String afile="file1.xlsx";
    

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("HomeController invoked");
		if(request.getAttribute("kase").equals("home")) {
			CommonFunctions.getFileContent("/WEB-INF/jsps/home/home.html", response, getServletContext());
		} else {
			response.sendRedirect("/notFound");
		}
	}





	

	

}
