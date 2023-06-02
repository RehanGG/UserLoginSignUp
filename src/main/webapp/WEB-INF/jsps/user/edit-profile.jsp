<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <title>Edit Profile</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <link rel="stylesheet" href="styles.css">
</head>
<body>
  <div class="form-container">
    <h2>Edit Profile</h2>
    <form action="/user/confirm-edit-profile" method="POST">
     
     
     <div class="form-group">
        <label for="id">User ID:</label>
        <input type="text" id="id" name="id" readonly="readonly" class="form-control" value="<c:out value="${user.getId()}" />">
      </div>
     
      <div class="form-group">
        <label for="name">Full Name:</label>
        <input type="text" id="name" name="name" class="form-control"  value="<c:out value="${user.getFullName()}" />" required>
      </div>
      
      <div class="form-group">
		  <label for="gender">Gender:</label>
		  <div class="form-check">
		    <input type="radio" id="male" name="gender" class="form-check-input" value="male" 
		    <c:choose>
		      <c:when test="${'male' eq user.getGender()}">
		        checked
		      </c:when>
		    </c:choose>
		    required>
		    <label for="male" class="form-check-label">Male</label>
		  </div>
		  <div class="form-check">
		    <input type="radio" id="female" name="gender" class="form-check-input" value="female"
		    <c:choose>
		      <c:when test="${'female' eq user.getGender()}">
		        checked
		      </c:when>
		    </c:choose>
		    required>
		    <label for="female" class="form-check-label">Female</label>
		  </div>
		</div>
      
      
      <div class="form-group">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" readonly="readonly" class="form-control" value="<c:out value="${user.getUsername()}" />">
      </div>
      
      <div class="form-group">
        <label for="email">Email:</label>
        <input type="text" id="email" name="email" readonly="readonly" class="form-control" value="<c:out value="${user.getEmail()}" />">
      </div>
      
      <div class="form-group">
        <label for="mobile">Mobile No:</label>
        <input type="text" id="mobile" name="mobile" readonly="readonly" class="form-control" value="<c:out value="${user.getMobileNo()}" />">
      </div>
  
     
      <div class="form-group submit-btn">
        <button type="submit" class="btn btn-primary">Update</button>
      </div>
    </form>
  </div>

  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>