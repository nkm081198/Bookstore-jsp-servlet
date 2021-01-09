<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manage Users - Evergreen Bookstore Administration</title>
</head>
<body>
	<jsp:directive.include file="header.jsp" />
	<div align="center">
		<h2>Users Management</h2>
		<h3><a href="">Create new User</a></h3>
	</div>
	<div align="center">
		<table border="1">
			<tr>
				<th>Index</th>
			    <th>ID</th>
			    <th>Email</th>
			    <th>Full Name</th>
			    <th>Actions</th>
			</tr>

		</table>
	</div>


	<jsp:directive.include file="footer.jsp" />
</body>
</html>