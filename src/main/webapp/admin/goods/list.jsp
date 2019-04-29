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
	<td>hostBusiness_code</td>
	<td>host_business_name</td>
	<td>goods_code</td>
	<td>host_goods_code</td>
	<td>wares_code</td>
	<td>wares_name</td>
	<td>wares_type</td>
	<td>goods_type</td>
	<td>unit</td>
	<td>unit_in_law</td>
	<td>unit_price</td>
	<td>currency_system</td>
	<td>remark</td>
	<td>gid</td>
</tr>

<c:forEach items="${list }" var="goods">
<tr>
	
	<td>${goods.bookid}</td>
	<td>${goods.hostBusinessCode}</td>
	<td>${goods.hostBusinessName}</td>
	<td>${goods.goodsCode}</td>
	<td>${goods.hostGoodsCode}</td>
	<td>${goods.waresCode}</td>
	<td>${goods.waresName}</td>
	<td>${goods.waresType}</td>
	<td>${goods.goodsType}</td>
	<td>${goods.unit}</td>
	<td>${goods.unitInLaw}</td>
	<td>${goods.unitPrice}</td>
	<td>${goods.currencySystem}</td>
	<td>${goods.remark}</td>
	<td>${goods.gid}</td>
</tr>
</c:forEach>

</table>




</body>
</html>