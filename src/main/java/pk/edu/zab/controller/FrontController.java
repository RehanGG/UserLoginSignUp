package pk.edu.zab.controller;



import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assignment.CommonFunctions;


public class FrontController extends HttpServlet {
	private RequestDispatcher dispatch;
	private String controller;
	//private UserController userController;
	//private String view;
	private String kase;
	private int count=0;
       
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("\n\nBASE : ********************"+request.getRequestURI()+"     "+count+++"********************");
		resolveUrl(request.getRequestURI());
		request.setAttribute("kase", kase);
		
//		System.out.println("Resolve URL^^^^^^^^^^^^^^^^^^^^^"+url+"^^^^^^^^^^^^^^^^^^^^^^^");
//		
//		if(url == null){
//			view = "/WEB-INF/jsps/error.jsp?"+request.getRequestURI();// goto error page with typed url
//			System.out.println("resolve URL returned null");
//		}else if(url.equals("/")){// home page case
//			System.out.println("homepage case");
//			view = "/WEB-INF/jsps/home/home.html";
//			//System.out.println(view);
//		}else{ // here we need to send it to the corresponding servlet with the view information
//			
//				if(controller != "static" ) {
//			
//					if(controller.equals("public")){
//						view = "/WEB-INF/pub/"+url+".jsp";
//					}else{
//					view = "/WEB-INF/jsps/"+controller+"/"+url+".jsp";
//					}
//				} else {
//					view = url;
//				}
//			
//			
//		}
		
		System.out.println("CONTROLLER: " + controller);
		System.out.println("KASE: " + kase);
		
		// need to invoke the relative controller here
		if(controller.equals("home")){
			
			dispatch = request.getRequestDispatcher("/HomeController");
			dispatch.forward(request, response);
			
		}else if(controller.equals("user")){
			
//			request.setAttribute("view",view);
			//request.setAttribute("kase", kase);
			dispatch = request.getRequestDispatcher("/UserController");
			dispatch.forward(request, response);
			
		}else if(controller.equals("static")) {
			
			//request.setAttribute("kase", kase);
			dispatch = request.getRequestDispatcher("/StaticController");
			dispatch.forward(request, response);
			
		}else{
			CommonFunctions.getFileContent("/WEB-INF/common/404.html", response, getServletContext());
		}
		
		System.out.println("Resolving done\n\n");
	}
	
	public void resolveUrl(String uri0){
		System.out.println("inside resolveURL with url:"+uri0);
	
		if(uri0== null){
			
			System.out.println("Should not occur at all:resolveUrl");
			
		}else if(uri0.equals("/")){
		
			//view = "/";
			controller="home";
			kase = "home";
			
		}else if(uri0.contains(".")){
			
			System.out.println("static resource");
			controller ="static";
			String[] parts = uri0.split("/");
	        kase = parts[parts.length - 1];
	        
		}else if(uri0.split("/").length == 2){// should make it strong here by checking the pages in the db
			
			String parts[] = uri0.split("/");
			controller = parts[parts.length-1];
			//view=parts[parts.length-1];
			kase=parts[parts.length-1];
			System.out.println("Inside resolve URL: "+kase);
			
		}else if(uri0.split("/").length == 3){
			
			String parts[] = uri0.split("/");
			// if statement required for parts.lenght > 2
			controller = parts[parts.length-2];
			//System.out.println("CONTROLLER TO INVOKE: " + controller);
			kase = parts[parts.length-1];
			//System.out.println("kase from resolve URL:"+kase);
			//view = parts[parts.length-1];
		}else{// written just for now
			System.out.println("%%%%%%%%%%%%%%%  not able to handle this url:"+uri0+"%%%%%%%%%%%%%%%%%%%%");
			String parts[] = uri0.split("/");
			for(int i=0;i<parts.length;i++){
				System.out.println("%%%%%%%%%%%%%%%%%"+parts[i]+"%%%%%%%%%%%%%%%%%%%");
			}
		}
		
		//return view;
		
	}



}

