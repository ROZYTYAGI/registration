<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
h1
{
margin-left: 450px;
font-size: 24;
font-style: normal;
}
h3
{
margin-left: 625px;
font-size: 35;
font-style: normal;
text-colour:white;
}
.button {
    background-color: #333; 
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
}
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
}
li {
    float: left;
}
li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}
li a:hover {
    background-color: #111;
}
</style>
</head>
<body>

<body >
</background-image>
<ul>
  <li><a class="active" href="#home">
  <h1>FLIGHT  TICKET  BOOKING  SYSTEM</h1>
  </a></li>
</ul>
<title>SIGN-UP</title>
<div>
<h3>
SIGN-UP
</h3>
<br><p><font color="red">${message}</p>
<center>
<form action="/addCustomer"  method="post" >
First name:  <input type="text" name="firstName" />
<br>
<br>
Middle name:  <input type="text" name="middleName" />
<br>
<br>
Last name:  <input type="text" name="lastName" />
<br>
<br>
Email ID :  <input type="text" name="email_id" />
<br>
<br>
Contact No.:  <input type="text" name="contact" />
<br>
<br>
Password:  <input type="password" name="password" />
<br>
<br>
Confirm Password:  <input type="password" name="confirmPassword" />
<br>
<br>
</center>
</center>
</div>
<center>
<input type="submit" name="submit" class="button" value="SUBMIT">
</form>
</center>
</body>
</html>