<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <title>Authentication</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <link rel="stylesheet" href="styles.css">
</head>
<body>
  <div class="container-message">
    <h2>Auth Status</h2>
    <div class="status-message">
    	<% if ("invalid".equals(request.getAttribute("status"))) { %>
                Invalid credentials
       <% } else if ("valid".equals(request.getAttribute("status"))) { %>
           Logged in!
       <% } %>
    </div>
    <div class="btn-goto-profile">
    	<% if ("invalid".equals(request.getAttribute("status"))) { %>
                 <a href="/user/login" class="btn btn-primary">Go Back</a>
       <% } else if ("valid".equals(request.getAttribute("status"))) { %>
            <a href="/user" class="btn btn-primary">Go to Profile</a>
       <% } %>
     
    </div>
  </div>

  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>