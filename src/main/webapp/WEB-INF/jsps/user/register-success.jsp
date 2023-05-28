<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>Registration Status</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <link rel="stylesheet" href="styles.css">
</head>
<body>
  <div class="container-message">
    <h2>Registration Status</h2>
    <div class="status-message">
    	<% if ("registered".equals(request.getAttribute("status"))) { %>
                Account Registered
       <% } else if ("exists".equals(request.getAttribute("status"))) { %>
           Username already taken, try another
       <% } %>
    </div>
    <div class="btn-goto-profile">
    	<% if ("registered".equals(request.getAttribute("status"))) { %>
                 <a href="/user/login" class="btn btn-primary">Go to Login</a>
       <% } else if ("exists".equals(request.getAttribute("status"))) { %>
            <a href="/user/signup" class="btn btn-primary">Go Back</a>
       <% } %>
     
    </div>
  </div>

  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
