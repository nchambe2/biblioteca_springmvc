<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Biblioteca</title>
    <link rel="stylesheet" href="<c:url value='/resources/css/main.css'/>" />
    <link rel="stylesheet" href="<c:url value='/resources/css/bookDetails.css'/>" />
    <link rel="stylesheet" href="<c:url value='/resources/css/header.css'/>" />
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js" type="text/javascript"></script>
    <script type=text/javascript src="<c:url value='/resources/js/checkoutBook.js' />"></script>
</head>
<body>
    <%@ include file="../partials/_header.jsp" %>

    <section>
        <p id="success-message"></p>
        <h2>Book Information</h2>
        <p>Title: <c:out value="${book.getTitle()}"/></p>
        <p>Author: <c:out value="${book.getAuthor()}"/></p>
        <p>Year Published: <c:out value="${book.getYearPublished()}" /></p>
        <button value="${book.getId()}" id="checkout-button">Checkout</button>
    </section>
</body>
</html>
