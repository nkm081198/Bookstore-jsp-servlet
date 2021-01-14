<%@ include file="/common/common.jsp" %>
<div align="center">

	<img src="D:\NgocNH\Bookstore-jsp-servlet\WebContent\images\BookstoreAdminLogo.png">
	<div style="padding-bottom: 20px">
		Welcome,Admin | <a href="logout">Logout</a>
	</div>
	<div>
	<div>
	   <a href="${userList}">
	  <img src="D:\NgocNH\Bookstore-jsp-servlet\WebContent\images\User.PNG"/><br/> Users
	   </a> |
	</div>
		<a href="${userList}">Users</a> |
	    <a href="${categoryList}">Categories</a> | 
		<a	href="books">Books</a> | 
		<a href="customer">Customers</a> | 
	    <a href="reviews">Reviews</a> | 
		<a href="orders">Order</a>
	</div>
	
</div>
