<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>Sign Up</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <link rel="stylesheet" href="styles.css">
</head>
<body>
  <div class="form-container">
    <h2>Sign Up</h2>
    <form action="/user/register-success" method="POST">
      <div class="form-group">
        <label for="fullname">Full Name:</label>
        <input name="fullname" type="text" id="fullname" class="form-control" required>
      </div>
      <div class="form-group">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" class="form-control" required>
      </div>
      <div class="form-group">
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" class="form-control" required>
      </div>
      <div class="form-group">
        <label for="gender">Gender:</label>
        <div class="form-check">
          <input type="radio" id="male" name="gender" class="form-check-input" value="male" required>
          <label for="male" class="form-check-label">Male</label>
        </div>
        <div class="form-check">
          <input type="radio" id="female" name="gender" class="form-check-input" value="female" required>
          <label for="female" class="form-check-label">Female</label>
        </div>
      </div>
       <div class="form-group submit-btn">
  		<button type="submit" class="btn btn-primary">Sign Up</button>
  		<a href="/user/login" class="btn btn-secondary">Login</a>
	  </div>
    </form>
  </div>

  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
