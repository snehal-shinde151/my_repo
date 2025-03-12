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
int a=5;
int b=10;
out.print("answer is: "+(a+b));
out.print("<br>");
%>
<%
  int i,j;
  for(i=1;i<=4;i++){
	  for(j=1;j<=i;j++){
		out.print("*");  
	  }
	  out.print("<pre>");
  }
%>
<%
  int c=10;
  int d=23;
%>
<%= c*d %>

<%!

	 int count=0;
	 void increment()
     {
    	 count++;
     }
%>
<%
out.print(count);

%>
</body>
</html>