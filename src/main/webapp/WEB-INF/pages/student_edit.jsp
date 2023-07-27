  <%@page isELIgnored="false" %>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"/>
 
<div class="container">
 <h1 style="color:red;text-align:center">Edit Student</h1>
 <form:form modelAttribute="stud">
   <table  bgcolor="cyan" align="center" style="padding:20px">
   <tr>
      <td>Student ID</td>
      <td> <form:input path="studentId" readonly = "true"/> </td>
   </tr>
   <tr>
      <td>Student Name</td>
      <td> <form:input path="studentName"/> </td>
   </tr>
   <tr>
      <td>Student Branch</td>
      <td> <form:input path="studentBranch"/> </td>
   </tr>
   
   <tr>
      <td>Student Addrs</td>
      <td> <form:input path="studentAddrs"/> </td>
   </tr>
   
   <tr>
      <td>Student EmailID</td>
      <td> <form:input path="studentEmailId"/> </td>
   </tr>
   <tr>
      <td>Student Fee</td>
      <td> <form:input path="studentFee"/> </td>
   </tr>
   <tr>
       <td colspan="2" align="center"> <input type="submit" value="Edit Student" class="btn btn-success"/></td>
   </tr>
   </table>
 </form:form>
 </div>