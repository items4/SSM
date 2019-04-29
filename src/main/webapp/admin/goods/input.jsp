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


<form action="goods_${goods==null?'save':'update' }" method="post">
<input type="hidden" name="gid" value="${goods.gid }">

企业账册编号
<select name="bookid">
	<c:forEach items="${books }" var="book">
  <option value ="${book.bookid }" ${book.bookid==goods.bookid?'selected':'' }>${book.businessBookid }</option>
  </c:forEach>
</select>
货主企业编码<input type="text" name="hostBusinessCode" value="${goods.hostBusinessCode }">	
货主企业名称<input type="text" name="hostBusinessName" value="${goods.hostBusinessName }"><br>

货物料号<input type="text" name="goodsCode" value="${goods.goodsCode }" >
货主料号<input type="text" name="hostGoodsCode" value="${goods.hostGoodsCode }">
商品编码<input type="text" name="waresCode" value="${goods.waresCode }"><br>
商品名称<input type="text" name="waresName" value="${goods.waresName }">
商品规格型号<input type="text" name="waresType" value="${goods.waresType }">
物料类型<input type="text" name="goodsType" value="${goods.goodsType }"><br>
计量单位<input type="text" name="unit" value="${goods.unit }">
法定单位<input type="text" name="unitInLaw" value="${goods.unitInLaw }">
申报单价<input type="text" name="unitPrice" value="${goods.unitPrice }"><br>
币制<input type="text" name="currencySystem" value="${goods.currencySystem }">
备案<input type="text" name="remark" value="${goods.remark }"><br>
<input type="submit" value="${goods==null?'save':'update' }">
</form>
</body>
</html>