<h1>User-Login-SignUp WebApp with Java</h1>

<p>A university project done in Java runtime using MVC1 architecture.</p>

<h2>Table of Contents</h2>
<ul>
  <li><a href="#how-to-install-and-run">How to Install and Run</a></li>
  <li><a href="#mysql-database">MySQL Database</a></li>
  <li><a href="#app-pages">App Pages</a></li>
</ul>

<h2 id="how-to-install-and-run">How to Install and Run</h2>

<p>To install and run this project, please follow these steps:</p>

<ol>
  <li>Install Eclipse.</li>
  <li>Install Tomcat 7.0.</li>
  <li>Install MySQL.</li>
  <li>Install Maven.</li>
  <li>Build and run the project.</li>
</ol>

<h2 id="mysql-database">MySQL Database</h2>

<p>To set up the MySQL database for the project, execute the following SQL commands:</p>

<pre><code>CREATE DATABASE `mvc1` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `fullname` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
</code></pre>

<h2 id="app-pages">App Pages</h2>

<p>The web application consists of the following pages:</p>

<h3>Home Page</h3>
<img src="/path/to/home-page.png" alt="Home Page">

<h3>Login</h3>
<img src="/path/to/login.png" alt="Login">

<h3>Signup</h3>
<img src="/path/to/signup.png" alt="Signup">

<h3>Profile</h3>
<img src="/path/to/profile.png" alt="Profile">

<h3>Change Password</h3>
<img src="/path/to/change-password.png" alt="Change Password">

<p>Feel free to customize the paths to the images according to your project's directory structure.</p>

<p>Enjoy using the User-Login-SignUp WebApp with Java!</p>
