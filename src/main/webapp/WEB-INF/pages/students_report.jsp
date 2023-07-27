
<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"/>

<c:if test="${!empty resultMsg}">
<h3 style="color:white;text-align:center;background-color: blue;border-radius: 15px;border: 2px solid yellow;padding:8px;width=500px">${resultMsg}</h3>
</c:if>

<div class="container"> 
<c:choose>
	<c:when test="${!empty studentsData}">
		<!-- <table border="1" bgcolor="cyan" align="center"> -->
		<!-- <table border="1" class="table table-striped"> -->
		 <table border="1" class="table table-hover" width="100%">
		   
			 <tr class="table-info"> 
				<th>StudentID</th>
				<th>Student Name</th>
				<th>Studnet Branch</th>
				<th>Student Addrs</th>
				<th>Student EmailID</th>
				<th>Student Fee</th>
				<th>Opertions</th>
			</tr>
			<c:forEach var="stud" items="${studentsData}">
				<tr class>
					<td>${stud.studentId}</td>
					<td>${stud.studentName}</td>
					<td>${stud.studentBranch}</td>
					<td>${stud.studentAddrs}</td>
					<td>${stud.studentEmailId}</td>
					<td>${stud.studentFee}</td>
					<td><a href="edit?no=${stud.studentId}" class="btn btn-primary">Edit</a>&nbsp;&nbsp;
						&nbsp;<a onclick="return confirm('DO you want to delete record')" href="delete?no=${stud.studentId}" class="btn btn-danger">Delete</a></td>
				</tr>

			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
		<h1 style="color: red; text-align: center">Records Not Found</h1>
	</c:otherwise>
</c:choose>
</div>

<br><br>
<hr>
<!-- <h1 style="text-align:center"><a href="add"><img src="images/register.jpg" width="70px" height="70px">Add Student</a></h1>
 -->
  <h1 style="text-align:center"><a href="add"><button type="button" class="btn btn-primary">Add Student</button></a></h1>
 
