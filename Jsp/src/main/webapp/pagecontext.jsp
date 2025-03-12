<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String age=request.getParameter("a");
int a;

a=Integer.parseInt(age);
if(a>18){
	out.println("valid");
	pageContext.setAttribute("key","1" , PageContext.APPLICATION_SCOPE);
	pageContext.setAttribute("key","2" , PageContext.SESSION_SCOPE);
	pageContext.setAttribute("key","3" , PageContext.PAGE_SCOPE);
	pageContext.setAttribute("key","4" , PageContext.REQUEST_SCOPE);
	response.sendRedirect("Getfile.jsp");
}else{
	out.println("Invalid");
}

%>
</body>
</html>