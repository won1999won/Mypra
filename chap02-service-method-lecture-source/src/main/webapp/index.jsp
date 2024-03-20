<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>service method</title>
</head>
<body>
<h1>service method 의 역할</h1>
<h3>get 방식 요청</h3>
<a href="request-service">서비스 메소드 요청</a>
<h4>form 태그의 method 속성을  get로 설정(생략가능)</h4>
<h4> a 태그의 href 속성 값 요청</h4>
<form action="request-survice" method="get">
    <input type="submit" value="get방식 요청 전송">
</form>
<h3>POST 방식의 요청</h3>
<h4>form 태그의 method 속성을  post로 설정</h4>
<form action="request-survice" method="post">
    <input type="submit" value="POST방식 요청 전송">
</form>

<br/>
<a href="hello-servlet">service method</a>
</body>
</html>