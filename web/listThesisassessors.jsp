<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 15/07/2017
  Time: 5:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List ThesisAssesor</title>
</head>
<body>
<jsp:useBean id="service" class="pe.edu.utp.tesissupportapp.services.TAService"/>

<c:forEach var="thesisAssessors" items="${service.thesis_assessors}">

    <p><c:out value="${thesisAssessors.firstName}"/>
        <c:out value="${thesisAssessors.lastName}"/>
        <c:out value="${thesisAssessors.email}"/>
        <c:out value="${thesisAssessors.password}"/>
         <a href="thesisAssessors?action=edit&id=<c:out value="${thesisAssessors.id}"/>">
            Edit
        </a>
    </p>
</c:forEach>
<a href="thesisAssessors?action=add">Add thesisAssessors</a>
</body>
</html>
