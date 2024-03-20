<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Filter&wrapper</title>
</head>
<body>
<h1>Filter</h1>
<h3>filter Lifecycle</h3>
<a href="first/filter">필터 사용하기</a>
<hr>
<h3>필터 활용</h3>
<form action="member/regist" method="post">
    <label>ID:</label>
    <label>
        <input type="text" name="userId">
    </label>
    <br>
    <label>P/W:</label>
    <label>
        <input type="password" name="password">
    </label>
    <br>
    <label>name:</label>
    <label>
        <input type="text" name="name">
    </label>
    <br>
    <button type="submit">join</button>

</form>

</body>
</html>