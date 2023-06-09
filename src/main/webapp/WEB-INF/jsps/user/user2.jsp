<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
  <title>User Profile</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
  <link rel="stylesheet" href="/styles.css">
</head>
<body>
  <div class=".container-profile">
    <div class="profile-card text-center">
      <h3>User Profile</h3>
      <i class="fas fa-user-circle"></i>
      <p><strong>User ID:</strong> <c:out value="${user.getId()}" /></p>
      <p><strong>Username:</strong> <c:out value="${user.getUsername()}" /></p>
      <p><strong>Full Name:</strong>  <c:out value="${user.getFullName()}" /></p>
      <p><strong>Email:</strong>  <c:out value="${user.getEmail()}" /></p>
      <p><strong>Mobile No:</strong>  <c:out value="${user.getMobileNo()}" /></p>
      <p><strong>Gender:</strong>  <c:out value="${user.getGender()}" /></p>
    </div>
  </div>

  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/js/all.min.js"></script>
</body>
</html>
