<%@ include file="/common/common.jsp" %>
<div align="center">
	<img src="images/BookstoreAdminLogo.png">
	<div style="padding-bottom: 20px">
		Welcome,Admin | <a href="logout">Logout</a>
	</div>
	<div>
		<a href="${userList}">Users</a> |
	    <a href="${categoryList}">Categories</a> | 
		<a	href="books">Books</a> | 
		<a href="customer">Customers</a> | 
	    <a href="reviews">Reviews</a> | 
		<a href="orders">Order</a>
	</div>
</div>
