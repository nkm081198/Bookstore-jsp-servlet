<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create New User</title>
</head>
<body>
	<jsp:directive.include file="header.jsp" />
	<div align="center">
		<h2>Create New User</h2>
	</div>

	<div align="center">
		<form action="create_user" method="post">
			<table>
				<tr>
					<td>Email:</td>
					<td><input type="text" name="email" size="20" /></td>
				</tr>
				<tr>
					<td>Full name:</td>
					<td><input type="text" name="fullname" size="20" /></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password" size="20" /></td>
				</tr>
				<tr><td>&nbsp;</td></tr>
				<tr>
					<td colspan="2" align="center">
					   <input type="submit" value="Save" />
					   <input type="button" value="Cancel" />
					</td>
				</tr>
			</table>
		</form>
	</div>
	<jsp:directive.include file="footer.jsp" />
</body>
</html>