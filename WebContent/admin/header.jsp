<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="xxx" value="http://localhost:8080/BookStoreWebsite/admin/list_users" />
<div align="center">
	<img src="images/BookstoreAdminLogo.png">
	<div style="padding-bottom: 20px">
		Welcome,Admin | <a href="logout">Logout</a>
	</div>
	<div>
		<a href="${xxx}">Users</a> | <a href="users">Categories</a> | <a
			href="books">Books</a> | <a href="customer">Customers</a> | <a
			href="reviews">Reviews</a> | <a href="orders">Order</a>
	</div>
</div>
