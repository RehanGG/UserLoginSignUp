<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <title>Change Password</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <link rel="stylesheet" href="styles.css">
</head>
<body>
  <div class="form-container">
    <h2>Change Password</h2>
    <form action="/user/complete-change-pass" method="POST">
     
      <div class="form-group">
        <label for="oldpass">Old Password:</label>
        <input type="text" id="oldpass" name="oldpass" class="form-control" required>
      </div>
      <div class="form-group">
        <label for="newpass">New Password:</label>
        <input type="password" id="newpass" name="newpass" class="form-control" required>
      </div>
  
     
      <div class="form-group submit-btn">
        <button type="submit" class="btn btn-primary">Submit</button>
      </div>
    </form>
  </div>

  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>