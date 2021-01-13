<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Manage Categories  - Evergreen Bookstore Administration</title>
</head>
<body>
	<jsp:directive.include file="header.jsp" />
	<div align="center">
		<h2>Category Management</h2>
		<h3>
			<a href="category_form.jsp">Create new Category</a>
		</h3>
	</div>
	<c:if test="${message != null}">
	<div align="center">
		<h4><i>${message}</i></h4>
	</div>
	</c:if>
	<div align="center">
		<table border="1" cellpadding="5">
			<tr>
				<th>Index</th>
				<th>ID</th>
				<th>Name</th>
				<th>Actions</th>
			</tr>
			<c:forEach var="cat" items="${listCategory}" varStatus="status">
				<tr>
					<td>${status.index + 1}</td>
					<td>${cat.id}</td>
					<td>${cat.name}</td>
					<td><a href="edit_user?id=${cat.id}">Edit</a> &nbsp;
					    <a href="javascript:confirmDelete(${cat.id})">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>


	<jsp:directive.include file="footer.jsp" />
	<script>
		function confirmDelete(id){
			if(confirm('Are you sure you want to delete the user with ID ' + id + ' ?')){
				window.location = 'delete_user?id='+ id;
			}
		}
	</script>
</body>
</html>