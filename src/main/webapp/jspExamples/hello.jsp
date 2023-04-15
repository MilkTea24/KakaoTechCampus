<%--
  Created by IntelliJ IDEA.
  User: manja
  Date: 2023-04-15
  Time: 오후 4:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String requestName = request.getParameter("name");
    String servletName = config.getServletName();
%>
<html>
<head>
    <meta charset = "UTF-8">
    <title>초 간단 JSP 개발하기</title>
</head>
<body>
    <h1><%= requestName %>님 안녕하세요.</h1>
    <h1>저는 <%= servletName %>입니다.</h1>
</body>
</html>
