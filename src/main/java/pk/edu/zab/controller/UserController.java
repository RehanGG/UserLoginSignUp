package pk.edu.zab.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.assignment.UserDAO;
import com.assignment.models.User;


public class UserController extends HttpServlet {
	private String view,kase,controller;
	private String username;
	private String password;
	private UserDAO userDao;
	
	@Override
	public void init() throws ServletException {
		super.init();
		userDao = new UserDAO(getServletContext());
		 
	}


	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("UserController invoked");
		System.out.println("View: "+request.getAttribute("kase")); 
		kase = (String) request.getAttribute("kase");
		view = "/WEB-INF/jsps/user/"+kase+".jsp";
		
		if(kase.equals("auth")){
			
			if(isUserLoggedIn(request)) {
				response.sendRedirect("/user/profile");
				return;
			} 
			
			username = request.getParameter("username");
			password = request.getParameter("password");
			
			if(username == null) {
				response.sendRedirect("/user/login");
				return;
			}
			
			
			
			String status = userDao.loginUser(username, password);
			if(status == "valid") {
				request.getSession(true).setAttribute("username", username);
			}
			request.setAttribute("status", status);
			request.getRequestDispatcher(view).forward(request, response);
			
		}else if(kase.equals("login")){
			
			if(isUserLoggedIn(request)) {
				response.sendRedirect("/user/profile");
				return;
			} 
			
			//view = (String) request.getAttribute("view");
			request.getRequestDispatcher(view).forward(request, response);
			
			
		}else if(kase.equals("logout")){
			
			request.getSession(true).removeAttribute("username");
			response.sendRedirect("/user/login");
			//view = (String) request.getAttribute("view");
			//.getRequestDispatcher(view).forward(request, response);
			
		}else if(kase.equals("profile") || kase.equals("user")){
			
			
			if(!isUserLoggedIn(request)) {
				response.sendRedirect("/user/login");
				return;
			}
			
			User user = userDao.getUserByUsername((String) request.getSession(false).getAttribute("username"));
			request.setAttribute("user", user);
			//view = (String) request.getAttribute("view");
			//request.getRequestDispatcher(view).forward(request, response);
			
			request.getRequestDispatcher("/WEB-INF/jsps/user/user.jsp").forward(request, response);
			
			
		}else if(kase.equals("register-success")){
			
			if(isUserLoggedIn(request)) {
				response.sendRedirect("/user/profile");
				return;
			}
			
			if(request.getParameter("username") == null) {
				response.sendRedirect("/user/signup");
				return;
			}

			User newUser = User.fromRequest(request);
			String status = userDao.registerUser(newUser, request.getParameter("password"));
			request.setAttribute("status", status);
			request.getRequestDispatcher(view).forward(request, response);
		}else if(kase.equals("changepassword")){
			
			if(!isUserLoggedIn(request)) {
				response.sendRedirect("/user/login");
				return;
			}
			
			request.getRequestDispatcher(view).forward(request, response);
			
		}else if(kase.equalsIgnoreCase("signup")){
			if(isUserLoggedIn(request)) {
				response.sendRedirect("/user/profile");
				return;
			}
			
			request.getRequestDispatcher(view).forward(request, response);
		}else if(kase.equals("verify")){
			
		}else if(kase.equals("forgetpassword")){
			
		}else if(kase.equals("reset-pass")){
			
		}else if(kase.equals("complete-change-pass")){
			if(!isUserLoggedIn(request)) {
				response.sendRedirect("/user/login");
				return;
			}
			
			if(request.getParameter("oldpass") == null) {
				response.sendRedirect("/user/changepassword");
				return;
			}
			
			String status = userDao.changePassword((String) request.getSession(false).getAttribute("username"), request.getParameter("oldpass"), request.getParameter("newpass"));
			request.setAttribute("status", status);
			request.getRequestDispatcher(view).forward(request, response);
			
		}else{
				response.sendRedirect("/notFound");
		}
		
	}

	
	 private boolean isUserLoggedIn(HttpServletRequest request) {
	    HttpSession session = request.getSession(false);
	    if (session != null) {
	        String username = (String) session.getAttribute("username");
	        System.out.println(username);
	        return username != null;
	    }
	    return false;
	 }

}
