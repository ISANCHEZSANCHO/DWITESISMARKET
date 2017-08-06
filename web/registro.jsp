<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 15/07/2017
  Time: 11:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
          <link href="css/footer.css" rel="stylesheet">
        <link rel="stylesheet" href="css/globales.css">
    <link rel="stylesheet" href="css/global2.css">
    <link rel="stylesheet" href="css/buscar.css">

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css">

    <!-- Website CSS style -->
    <link rel="stylesheet" type="text/css" href="css/registro.css">

    <!-- Website Font style -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">

    <!-- Google Fonts -->
    <link href='https://fonts.googleapis.com/css?family=Passion+One' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'>

    <title>Registrarse</title>
</head>
<body>

<div class="container">
    <div class="row main">
        <div class="panel-heading">
            <div class="panel-title text-center">
                <h1 class="title"><img src="img/logo.png" width="250px"></h1>
                <hr />
            </div>
        </div>
        <div class="main-login main-center">
            <form class="form-horizontal" action="<c:url value="/thesisAssessors"/>" method="post" >

                <div class="form-group">
                    <label for="password" class="cols-sm-2 control-label">Usuario</label>
                    <div class="cols-sm-10">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
                            <input type="text" class="form-control" name="username" id="username"  placeholder="Ingrese usuario "/>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <label for="password" class="cols-sm-2 control-label">Contraseña</label>
                    <div class="cols-sm-10">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                            <input type="password" class="form-control" name="password" id="password"  placeholder="Ingrese contraseña"/>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <label for="last_name" class="cols-sm-2 control-label">Apellidos</label>
                    <div class="cols-sm-10">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                            <input type="text" class="form-control" name="last_name" id="last_name"  placeholder="Ingrese Apellidos"/>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <label for="first_name" class="cols-sm-2 control-label">Nombres</label>
                    <div class="cols-sm-10">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                            <input type="text" class="form-control" name="first_name" id="first_name"  placeholder="Ingrese Nombres"/>
                        </div>
                    </div>
                </div>

                                <div class="form-group">
                    <label for="email" class="cols-sm-2 control-label">Correo electrónico</label>
                    <div class="cols-sm-10">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
                            <input type="text" class="form-control" name="email" id="email"  placeholder="Ingrese correo"/>
                        </div>
                    </div>
                </div>



                <div class="form-group">
                    <label for="password" class="cols-sm-2 control-label">Telefono móvil</label>
                    <div class="cols-sm-10">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
                            <input type="text" class="form-control" name="phone_number" id="phone_number"  placeholder="Ingrese móvil"/>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <label for="password" class="cols-sm-2 control-label">Género</label>
                    <div class="cols-sm-10 input select">
                        <div class="input-group">
                            <select
                                    name="sexe" data-type="required">
                                <option
                                        value="H"  selected>Hombre</option><option
                                    value="F" >Mujer</option>
                            </select>
                            </div>
                    </div>
                </div>

                <div class="form-group">
                    <label for="email" class="cols-sm-2 control-label">País</label>
                    <div class="cols-sm-10">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
                            <input type="text" class="form-control" name="country" id="country"  placeholder="Ingrese País"/>
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <label for="email" class="cols-sm-2 control-label">Ciudad</label>
                    <div class="cols-sm-10">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
                            <input type="text" class="form-control" name="city" id="city"  placeholder="Ingrese ciudad"/>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <label for="email" class="cols-sm-2 control-label">Dirección</label>
                    <div class="cols-sm-10">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
                            <input type="text" class="form-control" name="street" id="street"  placeholder="Ingrese dirección"/>
                        </div>
                    </div>
                </div>
<%--<div class="form-group">
    <label for="confirm" class="cols-sm-2 control-label">Confirmar contraseña</label>
    <div class="cols-sm-10">
        <div class="input-group">
            <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
            <input type="password" class="form-control" name="confirm" id="confirm"  placeholder="Confirm your Password"/>
        </div>
    </div>
</div>--%>

<div class="form-group ">
    <input type="hidden" value="create" name="action"/>
    <button type="button" class="btn btn-primary btn-lg btn-block login-button" value="thesisAssessor" name="action"/>Registrar</button>
</div>
<div class="login-register">
    <a href="login.jsp">Ingresar</a>
</div>
</form>
</div>
</div>
</div>

<script type="text/javascript" src="assets/js/bootstrap.js"></script><hr />

<section class="footer-center">
    <jsp:include page="Footer.jsp"/>
</section>
</body>
</html>
