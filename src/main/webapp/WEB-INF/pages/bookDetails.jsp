<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Biblioteca</title>
    <link rel="stylesheet" href="<c:url value='/resources/css/main.css'/>" />
    <link rel="stylesheet" href="<c:url value='/resources/css/bookDetails.css'/>" />
    <link rel="stylesheet" href="<c:url value='/resources/css/header.css'/>" />
</head>
<body>
    <%@ include file="../partials/_header.jsp" %>

    <section>
        <h2>Book Information</h2>
        <p>Title: <c:out value="${book.getTitle()}"/></p>
        <p>Author: <c:out value="${book.getAuthor()}"/></p>
        <p>Year Published: <c:out value="${book.getYearPublished()}" /></p>
    </section>
</body>
</html>
