<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Member</title>
</head>
<body>
<h1>Add New Member</h1>

<h3>
<a href="librarianHome">Home </a>
</h3>
<hr>

<form>
<table>
<tr>
<td>Member Name</td>
<td><input type="text" name="memberName"></td>
</tr>
<tr>
<td>Member Type </td>	
<td>
<select>
<option value="">Select </option>
<option value="student">Student </option>
<option value="faculty">Faculty </option>
<option value="staff">Staff </option>
<option value="other">Other </option>
</select>
<td>
</tr>



<tr>
<td>Department	</td>
<td><input type="text" name="memberDepartment"></td>
</tr>
<tr>
<td>Class	</td>
<td><input type="text" name="memberClass"></td>
</tr>
<tr>
<td>Branch	</td>
<td><input type="text" name="memberBranch"></td>
</tr>
<tr>
<td></td>
<td><input type="submit" name="Submit"></td>
</tr>

</table>

</form>


</body>
</html>