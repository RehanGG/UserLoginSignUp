package com.assignment;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

public class CommonFunctions {
	
	public static void getFileContent(String filePath, HttpServletResponse response, ServletContext servletContext ) throws IOException {
	    InputStream inputStream = servletContext.getResourceAsStream(filePath);
	    if(inputStream != null) {
	    	
	    	String fileExtension = filePath.substring(filePath.lastIndexOf('.') + 1);
	    	String contentType;
            switch (fileExtension.toLowerCase()) {
                case "css":
                    contentType = "text/css";
                    break;
                case "png":
                    contentType = "image/png";
                    break;
                case "html":
                    contentType = "text/html";
                    break;
                default:
                    contentType = "application/octet-stream";
                    break;
            }
            response.setContentType(contentType);
            
            byte[] buffer = new byte[4096];
            int bytesRead;
            OutputStream outputStream = response.getOutputStream();
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            outputStream.flush();
	    	
	    } else {
	    	response.sendRedirect("/notFound");
	    }
	}

}
