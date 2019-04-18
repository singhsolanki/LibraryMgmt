<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
        <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Login</title>
        </head>
        <body>
        
        	<h1>Add New User</h1>
        	<hr>
        
        
            <form:form id="addNewUser" modelAttribute="addNewUser" action="addNewUserProcess" method="post">
            
                <table>
                    <tr>
                      <tr>
                    <td><form:label path="userName">Name</form:label></td>
                    <td><form:input path="userName"/></td>
                </tr>
                <tr>
                    <td><form:label path="userPassword">Password</form:label></td>
                    <td><form:input path="userPassword" type="password"/></td>
                </tr>
                
                <tr>
                    <td><form:label path="userType">User Type</form:label></td>
                    <td><form:input path="userType"/></td>
                </tr>
                
                <tr>
                    <td><form:label path="userEmail">Email</form:label></td>
                    <td><form:input path="userEmail"/></td>
                </tr>
                
                <tr>
                    <td><form:label path="userAddress">Address</form:label></td>
                    <td><form:input path="userAddress"/></td>
                </tr>
                
                <tr>
                    <td><form:label path="userCity">City</form:label></td>
                    <td><form:input path="userCity"/></td>
                </tr>
                
                
				<tr>
                    <td><form:label path="userContact">Contact No</form:label></td>
                    <td><form:input path="userContact"/></td>
                </tr>
                
                                                                           
                   <tr>
                        <td></td>
                        <td align="left">
                           <input type="submit" value="Submit">
                        </td>
                    </tr>
                    <tr></tr>
                    <tr>
                        <td></td>
                        <td><a href="index.jsp">Home</a>
                        </td>
                    </tr>
                </table>
            </form:form>
            <table>
                <tr>
                    <td style="font-style: italic;  font-weight:bold; color: red;">${message}</td>
                </tr>
            </table>
        </body>
        </html>