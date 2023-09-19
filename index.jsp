<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
            int count = 0;
            if (application.getAttribute("count") != null) {
            count = (Integer)application.getAttribute("count");
            }
            count++;
            application.setAttribute("count", count);
        %>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>number of visitors  : <%= count %></p>
    </body>
</html>