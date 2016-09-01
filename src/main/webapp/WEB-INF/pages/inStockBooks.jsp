<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Biblioteca</title>
    <link rel="stylesheet" href="<c:url value='/resources/css/main.css'/>" />
    <link rel="stylesheet" href="<c:url value='/resources/css/inStockBooks.css'/>" />
    <link rel="stylesheet" href="<c:url value='/resources/css/header.css'/>" />
</head>


<%--availabe books not centerned left justified --%>
<%--navigation is still available --%>
    <body>
        <%@ include file="../partials/_header.jsp" %>
        <section>
            <ul id="instockBooks">
                <c:forEach var="book" items="${inStockBooks}">
                    <li class="bookTitles">
                        <a id="book-details" href="books/${book.getId()}">
                            <c:out value="${book.getTitle()}"/>
                        </a>
                    </li>
                </c:forEach>
            </ul>
        </section>
    </body>

</html>
