<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.as.samples.vo.Request"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>---Converted Amount---</h2>
<%
			Request info = (Request) session.getAttribute("person");
		%>
<table border="1" cellpadding="1" cellspacing="0" width="50%">
<tr>
			<td bgcolor="#FAFAF9" style="padding-left: 10px;">source_currency</td>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;">source_currency_amount</td>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;">target_currency</td>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;">target_currency_amount</td>
				
			</tr>
			<tr>
			<td bgcolor="#FAFAF9" style="padding-left: 10px;"><%=info.getSource()%></td>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;"><%=info.getAmount()%></td>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;"><%=info.getTarget()%></td>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;"><%=info.getResult()%></td>
			</tr>
			
</table>
	
</body>
</html>