<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2024-03-21
  Time: 오후 12:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
String expType=exception.getClass().getName();
    String exmassge=exception.getMessage();
%>
<h1><%=expType%></h1>
<h3><%=exmassge%></h3>

</body>
</html>
