<%--
  Created by IntelliJ IDEA.
  User: manja
  Date: 2023-04-15
  Time: 오후 11:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Hello, Spring Web Application</title>
    <style>
        html, body {height:100%;}
        html {display:table; width:100%;}
        body {display:table-cell; text-align:center; vertical-align:middle}
    </style>
</head>
<body>
    <h2>${nowTime.name} 님 안녕하세요.</h2>
    <p>현재 시간은 <spring:eval expression="nowTime.currentDateTime"/> 입니다.</p>
</body>
</html>
