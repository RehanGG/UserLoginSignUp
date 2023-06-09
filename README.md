<h1 style="color: #336699; font-family: Arial, sans-serif;">User-Login-SignUp WebApp with Java</h1>
<p style="font-family: Arial, sans-serif;">A university project done in Java runtime using MVC1 architecture.</p>
 <h2 id="version-1.1.0">Updates in Version 1.1.0</h2>
  <p>In version 1.1.0, the following changes have been added:</p>
  <ul>
    <li>The user have addtional data required, Email and Mobile No ✅</li>
    <li>Users can now update/edit their profile ✅</li>
  </ul>
<h2 style="color: #336699; font-family: Arial, sans-serif;">Table of Contents</h2>
<ul>
  <li><a href="#how-to-install-and-run" style="font-family: Arial, sans-serif;">How to Install and Run</a></li>
  <li><a href="#mysql-database" style="font-family: Arial, sans-serif;">Database Structure</a></li>
  <li>
  <a href="#app-pages" style="font-family: Arial, sans-serif;">App Pages</a>
   <ul>
      <li><a href="#home-page" style="font-family: Arial, sans-serif;">Home Page</a></li>
      <li><a href="#login-page" style="font-family: Arial, sans-serif;">Login</a></li>
      <li><a href="#signup-page" style="font-family: Arial, sans-serif;">Signup</a></li>
      <li><a href="#profile-page" style="font-family: Arial, sans-serif;">Profile</a></li>
      <li><a href="#edit-profile-page" style="font-family: Arial, sans-serif;">Edit Profile</a></li>
      <li><a href="#change-password-page" style="font-family: Arial, sans-serif;">Change Password</a></li>
    </ul>
  </li>
</ul>
<h2 id="how-to-install-and-run" style="color: #336699; font-family: Arial, sans-serif;">How to Install and Run</h2>
<p style="font-family: Arial, sans-serif;">To install and run this project, please follow these steps:</p>
<ol>
  <li>Install Eclipse - Java EE.</li>
  <li>Install Tomcat 7.0.</li>
  <li>Install MySQL.</li>
  <li>Install Maven.</li>
  <li>Build and run the project.</li>
</ol>
<h2 id="mysql-database" style="color: #336699; font-family: Arial, sans-serif;">Database Structure</h2>
<p style="font-family: Arial, sans-serif;">To set up the MySQL database for the project, execute the following SQL commands:</p>
<pre><code style="font-family: Arial, sans-serif;">CREATE DATABASE `mvc1` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
use mvc1;
CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(100) DEFAULT NULL,
  `password` varchar(60) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `fullname` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `mobile` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
</code></pre>
<h2 id="app-pages" style="color: #336699; font-family: Arial, sans-serif;">App Pages</h2>
<p style="font-family: Arial, sans-serif;">The web application consists of the following pages:</p>
<h3 style="color: #336699; font-family: Arial, sans-serif;">Home Page</h3>
<img src="/screenshots/home.png" alt="Home Page" id="home-page">
<h3 style="color: #336699; font-family: Arial, sans-serif;">Login</h3>
<img src="/screenshots/login.png" alt="Login" id="login-page">
<h3 style="color: #336699; font-family: Arial, sans-serif;">Signup</h3>
<img src="/screenshots/create-account.png" alt="Signup" id="signup-page">

<h3 style="color: #336699; font-family: Arial, sans-serif;">Profile</h3>
<img src="/screenshots/view-profile.png" alt="Profile" id="profile-page">

<h3 style="color: #336699; font-family: Arial, sans-serif;">Edit Profile</h3>
<img src="/screenshots/edit-profile.png" alt="Edit Profile"id="edit-profile-page">

<h3 style="color: #336699; font-family: Arial, sans-serif;">Change Password</h3>
<img src="/screenshots/change-password.png" alt="Change Password" id="change-password-page">
<p style="font-family: Arial, sans-serif;">Enjoy using the User-Login-SignUp WebApp with Java!</p>