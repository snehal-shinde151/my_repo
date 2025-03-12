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
String Age=request.getParameter("A");
int A=Integer.parseInt(Age);

if(A>18){
	//System.out.println("Hello");
	
	//response.sendRedirect("/login.html");
	
	session.setAttribute("snehal","123");
	
}
else{
	
	System.out.println("Hii");

}
%>
</body>
</html>