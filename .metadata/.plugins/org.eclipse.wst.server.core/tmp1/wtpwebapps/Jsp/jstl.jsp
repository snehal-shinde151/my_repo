<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%
 int age;
 %>
<c:if test="${param.age>=18 }">
  <p> adult</p>
</c:if>

<c:set var="score" value="10" scope="session"/>

<c:choose>
     <c:when test="${score>90 }">
     <p>A</p>
     </c:when>
     
     <c:when test="${score>70}">
     <p>B</p>
     </c:when>
     
     <c:otherwise>
     <p>c</p>
     </c:otherwise>
</c:choose>

<c:forEach var="num" begin="0" end="10" stop="2">
<p>${num }</p>

</c:forEach>

<c:forEach var="item" items="$(mylist)">
  <p>${item }</p>
</c:forEach>

</body>
</html>