<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<title>
    Add todo
</title>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
<link href="webjars\bootstrap-datepicker\1.9.0\css\bootstrap-datepicker.standalone.css" rel="stylesheet">

<body>
<div class="container">
<h1>
    Adding a todo
</h1>
    <form:form method="post" modelAttribute="todo">
        <fieldset class="mb-3">
        <form:label path="description">Description</form:label>
        <form:input type="text" path="description" required="required" />
        <form:errors path="description" cssClass="text-warning"/>
        </fieldset>
        <fieldset class="mb-3">
        <form:label path="targetdate">Target Date</form:label>
        <form:input type="text" path="targetdate" required="required" />
        <form:errors path="targetdate" cssClass="text-warning"/>
        </fieldset>
        <form:input type="hidden" path="id" />
        <form:input type="hidden" path="done" />
        <input type="submit" class="btn btn-success" />
    </form:form>
</div>
<script src="webjars\bootstrap\5.1.3\js\bootstrap.min.js"></script>
<script src="webjars\jquery\3.6.0\jquery.min.js"></script>
<script src="webjars\bootstrap-datepicker\1.9.0\js\bootstrap-datepicker.min.js" ></script>
<script type="text/javascript">
    $('#targetdate').datepicker({
        format: 'yyyy-mm-dd',
        startDate: '+1d'
    });
</script>
</body>
</html>

