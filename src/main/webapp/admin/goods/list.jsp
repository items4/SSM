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
	
	<td>企业账册编号</td>
	<td>主管海关</td>
	<td>仓库名称</td>
	
	
	<td>货主企业编码</td>
	<td>货主企业名称</td>
	<td>货物料号</td>
	<td>货主料号</td>
	<td>商品编码</td>
	<td>商品名称</td>
	<td>商品规格型号</td>
	<td>物料类型</td>
	<td>计量单位</td>
	<td>法定单位</td>
	<td>申报单价</td>
	<td>币制</td>
	<td>备注</td>
	<td>gid</td>
	<td>操作</td>
</tr>

<c:forEach items="${list }" var="goods">
<tr>
	
	<td>${goods.book.businessBookid}</td>
	<td>${goods.book.chargeCustoms}</td>
	<td>${goods.book.storeroomName}</td>
	
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
	<td>
	<a href="/goods_delete?gid=${goods.gid }">删除</a>
	<a href="/goods_findById?gid=${goods.gid }">修改</a>
	</td>
</tr>
</c:forEach>

</table>
<a href="/goods_goInput">增加</a>



</body>
</html>