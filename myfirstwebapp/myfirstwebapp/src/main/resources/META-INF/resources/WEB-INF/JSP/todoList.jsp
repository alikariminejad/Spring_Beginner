<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<HTML>
<head>
    <TITLE>Todos</TITLE>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</head>

<BODY>
<h2>Hey ${name}!</h2>
<hr>
<h2>Your Todos</h2>
<table>
    <thead>

        <tr>
        <th>ID</th>
        <th>Description</th>
        <th>Target Date</th>
        <th>Is Done?</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${todos}" var="todo">
            <tr>
            <td>${todo.id}</td>
            <td>${todo.description}</td>
            <td>${todo.targetdate}</td>
            <td>${todo.done}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</BODY>
</HTML>