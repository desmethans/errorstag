<%@page contentType='text/html' pageEncoding='UTF-8' session='false'%>
<%@taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>
<%@taglib prefix='form' uri='http://www.springframework.org/tags/form'%>
<!doctype html>
<html lang='nl'>
<head>
<title>Person</title>
</head>
<body>
<form:form commandName='person'>
<form:label path='firstname'>First name:</form:label><br/>
<form:input path='firstname' autofocus='autofocus'/><br/>
<form:label path='lastname'>Last name:</form:label><br/>
<form:input path='lastname'/><br/>
<form:label path='title'>Title:</form:label><br/>
<form:input path='title'/><br/>
<input type='submit' value='OK'>
<div><form:errors path="*"/></div>
</form:form>
 </body>
</html>