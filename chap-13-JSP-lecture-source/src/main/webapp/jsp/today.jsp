<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2024-03-21
  Time: 오후 12:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%Date date=new Date();
    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyY mmM ddD a hhH ssS" );

    String output=simpleDateFormat.format(date);
%>
<%=output%>

</body>
</html>
