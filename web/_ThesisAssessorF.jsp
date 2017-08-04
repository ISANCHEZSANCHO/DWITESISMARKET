<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 4/08/2017
  Time: 12:12 PM
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="service" class="pe.edu.utp.tesissupportapp.services.TAService"/>

<form action="thesisAssessors" method="post">


    <input type="text" name="id" value="${thesisAssessor.id}"
            <c:out value="${action == 'edit' ? 'readonly=\"readonly\"' : '' }"/>

    <input type="text" name="username" value="${thesisAssessor.username}"/>
    <input type="text" name="password" value="${thesisAssessor.password}"/>
    <input type="text" name="last_name" value="${thesisAssessor.last_name}"/>
    <input type="text" name="first_lastame" value="${thesisAssessor.first_lastame}"/>
    <input type="text" name="email" value="${thesisAssessor.email}"/>
    <input type="text" name="photo_path" value="${thesisAssessor.photo_path}"/>
    <input type="text" name="phone_number" value="${thesisAssessor.phone_number}"/>
    <input type="text" name="gender" value="${thesisAssessor.gender}"/>
    <input type="text" name="degree_document" value="${thesisAssessor.degree_document}"/>
    <input type="text" name="country" value="${thesisAssessor.country}"/>
    <input type="text" name="city" value="${thesisAssessor.city}"/>
    <input type="text" name="street" value="${thesisAssessor.street}"/>
    <input type="text" name="cv_path" value="${thesisAssessor.cv_path}"/>

    <input type="hidden" value="update" name="action"/>
    <input type="submit"/>
</form>