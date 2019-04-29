<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<table border="1" width="100%">
<tr>
	
	<td>bookid</td>
	<td>businessCode</td>
	<td>businessName</td>
	<td>recordBusinessCode</td>
	<td>recordBusinessName</td>
	<td>recorder</td>
	<td>recordTime</td>
	<td>startValidity</td>
	<td>endValidity</td>
	<td>businessBookid</td>
	<td>bookType</td>
	<td>applyType</td>
	<td>chargeCustoms</td>
	<td>storeroomCode</td>
	<td>storeroomName</td>
	<td>操作</td>
</tr>

<c:forEach items="${list }" var="book">
<tr>
	
	<td>${book.bookid }</td>
	<td>${book.businessCode}</td>
	<td>${book.businessName}</td>
	<td>${book.recordBusinessCode}</td>
	<td>${book.recordBusinessName}</td>
	<td>${book.recorder}</td>
	<td>${book.recordTimeStr}</td>
	<td>${book.startValidityStr}</td>
	<td>${book.endValidityStr}</td>
	<td>${book.businessBookid}</td>
	<td>${book.bookType}</td>
	<td>${book.applyType}</td>
	<td>${book.chargeCustoms}</td>
	<td>${book.storeroomCode}</td>
	<td>${book.storeroomName}</td>
	<td>
	<a href="/books_delete?bookid=${book.bookid }">删除</a>
	<a href="/books_findById?bookid=${book.bookid }">修改</a>
	</td>
</tr>
</c:forEach>

</table>
<a href="/books_goInput">增加</a>



</body>
</html>