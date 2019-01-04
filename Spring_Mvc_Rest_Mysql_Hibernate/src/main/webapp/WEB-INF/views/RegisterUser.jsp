<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.topnav {
  overflow: hidden;
  background-color: #333;
}

.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
  background-color: #4CAF50;
  color: white;
}

h2
{
 text-align: center;
}

#page-wrap {
     width: 800px;
     margin: 0 auto;
}


</style>
</head>
<body>

<div id="page-wrap">

<h1> San IT Training </h1>
<div class="topnav">
  <a class="active" href="home">Home</a>
  <a href="#news">News</a>
  <a href="view">View</a>
  <a href="registerForm">Register</a>
</div>

<div style="padding-left:16px;">
 <h2>${companyName}</h2>
 <h1>${message}</h1>
</div>
<div align="center">
     <form action="./userRegistraion" method="post">
     <table>
      
      <tr><td>FirstName</td>     <td>   <input type="text" name="firstName"/></td></tr>
      <tr><td>LastName</td>     <td>   <input type="text" name="lastName"/></td></tr>
      <tr><td>DOB</td>     <td>   <input type="text" name="dob"/></td></tr>
      <tr><td>Email</td>     <td>   <input type="text" name="email"/></td></tr>
      <tr><td><input type="submit" value="Register"/>
     </table>
     
     
     </form>


</div>
</div>

</body>
</html>
