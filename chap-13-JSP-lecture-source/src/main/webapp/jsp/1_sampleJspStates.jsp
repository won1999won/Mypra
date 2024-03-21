<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2024-03-21
  Time: 오후 12:02
  To change this template use File | Settings | File Templates.
--%>
<%--지시자태그--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!--html 주석-->
    <%--JSP 주석--%>

    <!--선언 태그-->
    <%!
    private String name;
    private int age;
    %>
    <!--scriptlet 태그-->
    <%
    //주석=자바 주석과 동일
        name="lion";
        age=10;
        System.out.println("name:"+name);
        System.out.println("age:"+age);

        for (int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }
    %>
    <!--expression 태그-->
<%--    printwriter로 브라우저에 값을 내보내 브라우저에서 보여주기--%>
    name:<%=name%> <br>
    age:<%=age%><br>
</head>
<body>

</body>
</html>
