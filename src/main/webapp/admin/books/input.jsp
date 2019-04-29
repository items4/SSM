<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<form action="books_${books==null?'save':'update' }" method="post">
<input type="hidden" name="bookid" value="${books.bookid }">
businessCode<input type="text" name="businessCode" value="${books.businessCode }">
businessName<input type="text" name="businessName" value="${books.businessName }">	
recordBusinessCode<input type="text" name="recordBusinessCode" value="${books.recordBusinessCode }"><br>

recordBusinessName<input type="text" name="recordBusinessName" value="${books.recordBusinessName }" >
recorder<input type="text" name="recorder" value="${books.recorder }">
recordTime<input type="text" name="recordTimeStr" value="${books.recordTimeStr }"><br>
startValidity<input type="text" name="startValidityStr" value="${books.startValidityStr }">
endValidity<input type="text" name="endValidityStr" value="${books.endValidityStr }">
businessBookid<input type="text" name="businessBookid" value="${books.businessBookid }"><br>
bookType<input type="text" name="bookType" value="${books.bookType }">
applyType<input type="text" name="applyType" value="${books.applyType }">
chargeCustoms<input type="text" name="chargeCustoms" value="${books.chargeCustoms }"><br>
storeroomCode<input type="text" name="storeroomCode" value="${books.storeroomCode }">
storeroomName<input type="text" name="storeroomName" value="${books.storeroomName }"><br>
<input type="submit" value="${books==null?'save':'update' }">
</form>
</body>
</html>