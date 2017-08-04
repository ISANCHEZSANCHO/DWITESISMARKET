<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 3/08/2017
  Time: 10:52 PM
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="service" class="pe.edu.utp.tesissupportapp.services.TAService"/>
<form action="thesisAssessors" method="post">

    <input type="text" name="id" value="${thesisAssessor.id}"
    <c:out value="${action == 'create' ? 'readonly=\"readonly\"' : '' }"/>

    <input type="text" name="first_name" value="${thesisAssessor.first_name}"/>
    <input type="text" name="last_name" value="${thesisAssessor.last_name}"/>
    <input type="text" name="email" value="${thesisAssessor.email}"/>
    <input type="text" name="password" value="${thesisAssessor.password}"/>
    
    <input type="hidden" value="create" name="action"/>
    <input type="submit"/>
</form>
