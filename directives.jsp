<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8" %>
<%@page language="java"%>

<%-- import java packages --%>
<%@page import="java.util.*" %>

<%-- Session management --%>
<%@page session="true" %>

<%-- information about JSP Page --%>
<%@page info="hello" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Page Directive Example</title>
</head>
<body>
	<h1>Page Directive Example</h1>
	<p>The current date and time is: 20</p>

	<%-- Comment directive --%>
	<%-- This is a comment --%>

	<%-- Declaration directive --%>	
	<%! int count = 0; %>

	<%-- Expression directive --%>
	<%= "The count is: " + count %>
</body>
</html>