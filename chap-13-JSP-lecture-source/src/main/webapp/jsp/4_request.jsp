<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2024-03-21
  Time: 오후 1:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>메뉴 주문</h1>
<form action="/menu/oder" method="post">
    <select id="menu" name="menuName">
        <option value="1">1</option>
        <option value="2">2</option>
        <option value="3">3</option>
        <option value="4">4</option>
        <option value="5">5</option>
        <option value="6">6</option>

    </select>
    <input type="number" min="0" max="20" step="1" name="amount">
    <button type="submit">chos</button>
</form>

</body>
</html>
