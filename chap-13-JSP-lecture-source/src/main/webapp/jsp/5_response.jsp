<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2024-03-21
  Time: 오후 2:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
String menuName= (String) request.getAttribute("menuName");
int amount= (Integer) request.getAttribute("amount");
int oderprice= (Integer) request.getAttribute("oderprice");
%>
<h3>주문메뉴:<%=menuName%>></h3>
<h3>주문 수량:<%=amount%></h3>
<h2>가격:<%=oderprice%></h2>
</body>
</html>
