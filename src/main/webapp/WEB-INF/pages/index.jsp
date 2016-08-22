<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <%--<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">--%>
    <link rel="stylesheet" href="<c:url value='../../resources/css/index.css'/>" />
    <title>Welcome</title>
</head>
<body>
    <header>
        <h1 id="logo"><a href="#">Biblioteca</a></h1>
    </header>
    <section>
        <h2 id="welcome-tagline">Welcome To Biblioteca</h2>
        <p>Currently In Stock Books:</p>
        <ul id="instockBooks">
            <c:forEach var="book" items="${inStockBooks}">
                <li class="bookTitles"><c:out value="${book.getTitle()}"/></li>
            </c:forEach>
        </ul>
    </section>
</body>
</html>