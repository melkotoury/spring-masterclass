<%--
  Created by IntelliJ IDEA.
  User: melkotoury
  Date: 5/27/2017
  Time: 7:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome!</title>
</head>
<body>
<%
    String messages[] = (String[]) request.getAttribute("myWelcomeMessage");
    String welcomeMessage = "";
    for (String msg : messages) {
        welcomeMessage += msg + " ";
    }
    out.print(welcomeMessage);

%>
</body>
</html>
