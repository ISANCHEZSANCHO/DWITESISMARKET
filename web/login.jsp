<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 14/07/2017
  Time: 10:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link href="css/login.css" rel="stylesheet">

    <link href="css/footer.css" rel="stylesheet">
    <link rel="stylesheet" href="css/estilos.css">
    <link rel="stylesheet" href="css/globales.css">
    <link rel="stylesheet" href="css/global2.css">
    <link rel="stylesheet" href="css/buscar.css">
    <title>Ingresar</title>
</head>
<body>
<div class="container">
    <div class="card card-container">
        <!-- <img class="profile-img-card" src="//lh3.googleusercontent.com/-6V8xOA6M7BA/AAAAAAAAAAI/AAAAAAAAAAA/rzlHcD0KYwo/photo.jpg?sz=120" alt="" /> -->
        <img id="profile-img" class="profile-img-card" src="//ssl.gstatic.com/accounts/ui/avatar_2x.png" />
        <p id="profile-name" class="profile-name-card"></p>
        <form class="form-signin" action="<c:url value="/validateThesisAssessor"/>" method="post">
            <span id="reauth-email" class="reauth-email"></span>
            <input type="email" id="inputEmail" name="email" class="form-control" placeholder="Correo Electrónico" required autofocus>
            <input type="password" id="inputPassword" name="password" class="form-control" placeholder="Contraseña" required>
            <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit" value="Ingresar" name="action"/>Ingresar</button>
        </form><!-- /form -->
         <p>¿Todavía no eres miembro? <a href="registro.jsp" class="form-control" >
            Registrate
       </a></p>
        <p><a href="#" class="forgot-password" >
            ¿Has olvidado tu contraseña?
        </a></p>
    </div><!-- /card-container -->
</div><!
<section class="footer-center">
<jsp:include page="Footer.jsp"/>
</section>
</body>
</html>
