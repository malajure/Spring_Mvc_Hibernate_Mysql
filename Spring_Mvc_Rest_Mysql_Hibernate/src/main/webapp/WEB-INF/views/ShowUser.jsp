<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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

#page-wrap {
     width: 800px;
     margin: 0 auto;
}
</style>


<script type="text/javascript">

function deleteUser(userId){
    if(confirm('Do you want to delete this User ?')){
        var url = 'delete/'+userId;
        window.location.href = url;
    }
}
</script>



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

<div style="padding-left:16px">
  <h2>Top Navigation Example</h2>
  <p>Some content..</p>
</div>
<div align="center">
<h2> Registered Student List</h2>


</div>
<table border="3" align="center">
<tr>
              <th> FirstName</th>
              <th> LastName </th>
              <th>Date-of-Birth</th>
              <th>Email</th>
              <th>Action</th>
              
</tr>

<c:forEach var="students" items="${users}">
   
   <tr>
     <td>${students.firstName} </td>
     <td>${students.lastName} </td>
     <td>${students.dob} </td>
     <td>${students.email} </td>
   <td>
            <a href="#" onclick="deleteUser(${students.id})">Delete ></a>
            </td>
   </tr>
   
</c:forEach>


</table>
</div>

</body>
</html>