<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Biblioteca</title>
    <%--<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">--%>
    <link re="stylesheet" href="<c:url value='/resources/css/main.css'/>" />
    <link rel="stylesheet" href="<c:url value='/resources/css/index.css'/>" />
    <link rel="stylesheet" href="<c:url value='/resources/css/header.css'/>" />
    <title>Biblioteca</title>
</head>

<body>
    <%@ include file="../partials/_header.jsp" %>
    <section>
        <h2 id="welcome-tagline">Welcome To Biblioteca</h2>
        <h3>Menu Options:</h3>
        <button class="menu-buttons"><a class="menu-links" href="/books">View In Stock Books</a></button>
    </section>
</body>
</html>