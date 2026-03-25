<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<HTML>
<TITLE>
    Todos
</TITLE>
<BODY>
<h2>Hey ${name}!</h2>
<hr>
<h2>your Todos</h2>
<table>
    <thead>
        <tr>
        <th>id</th>
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