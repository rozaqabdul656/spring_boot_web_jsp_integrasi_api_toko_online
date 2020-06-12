<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Toko Online Admin</title>
	<tiles:insertAttribute name="css_import" />
	

</head>

<body class="materialdesign">

	<tiles:insertAttribute name="header" />
	<tiles:insertAttribute name="sidebar" />
	<tiles:insertAttribute name="body" />
	<tiles:insertAttribute name="footer" />
	
	

</body>
	<tiles:insertAttribute name="js_import" />
	
</html>