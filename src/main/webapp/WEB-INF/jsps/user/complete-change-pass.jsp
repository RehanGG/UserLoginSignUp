<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <title>Change Pass Status</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <link rel="stylesheet" href="styles.css">
</head>
<body>
  <div class="container-message">
    <h2>Change Pass Status</h2>
    <div class="status-message">
    	<% if ("changed".equals(request.getAttribute("status"))) { %>
                Password Changed
       <% } else if ("invalid".equals(request.getAttribute("status"))) { %>
           Invalid old password
       <% } %>
    </div>
    <div class="btn-goto-profile">
    	<% if ("changed".equals(request.getAttribute("status"))) { %>
                 <a href="/user/profile" class="btn btn-primary">Go to Profile</a>
       <% } else if ("invalid".equals(request.getAttribute("status"))) { %>
            <a href="/user/changepassword" class="btn btn-primary">Go Back</a>
       <% } %>
     
    </div>
  </div>

  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>