<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 5/08/2017
  Time: 3:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta content="text/html; charset=UTF-8" http-equiv="Content-Type" />
    <title>Modificar Perfil</title>
    <meta name="Description" lang="es" content="Clases particulares para estudiantes: TesisMarket, sitio Web puesta en relación entre Profesor y estudiante" />
    <script>
        (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
                (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
            m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
        })(window,document,'script','//www.google-analytics.com/analytics.js','ga');

        ga('create', 'UA-54513173-1', 'auto');
        ga('require', 'displayfeatures');
        ga('send', 'pageview');

    </script>
    <meta name="viewport" content="width=device-width, initial-scale=1" />                <link rel="stylesheet" type="text/css" href="css/globales.css" />
    <link rel="stylesheet" type="text/css" href="css/global2.css" />
    <link rel="apple-touch-icon" sizes="57x57" href="img/logo57x57.jpg" />
    <link rel="apple-touch-icon" sizes="60x60" href="img/logo60X60.jpg" />
    <link rel="icon" type="image/png" href="img/logo32x32.jpg" sizes="32x32" />
    <link rel="icon" type="image/png" href="img/logo16x16.jpg" sizes="16x16" />
    <meta name="msapplication-TileColor" content="#ffffff" />
    <meta name="theme-color" content="#ffffff" />
    <style type="text/css">.popin-overlay.hidden,.notification.hidden{visibility:hidden}</style>
</head>
<body>

<div id="fb-root"></div>


<div
        class="header header-dashboard"><div
        class="header-burger-dropshadow"></div><div
        class="header-inner"><div
        class="header-inner-cell header-inner-cell-logo">
    <button
            class="header-burger-button">
<span
        class="header-burger-icon"></span>
    </button>
    <a
            class="header-logo header-logo-normal" href="/" title="title_logo_Superprof, clases particulares">
        <img
                src="img/logo.png"
                srcset="img/logo.png"
                width="145"
                height="47"
                alt="Tesis Market" />
    </a></div><div
        class="header-inner-cell header-inner-cell-menu mobile-only">
    <button
            class="header-burger-close"></button><div
        class="header-menu-inner"><div
        class="userConnected-v2" style="background-image: url('img/user-icon.png')"></div>
    <a
            class="header-item" href="Paneldecontrol.jsp">Mi panel de control</a>
    <a
            class="header-item" href="Solicitudesdeclase.jsp">Mis solicitudes de clases</a>

    <a
            class="header-item" href="Modificarperfil.jsp">Mi perfil</a>
    <button
            class="header-item a-js heart-icon-v2Before" data-href="/panel-de-control-mis-solicitudes-clases.html">Mensajes

    </button>
    <button
            class="header-item heart-icon-v2Before a-js favoris-mobile hidden" data-href="/mis-anuncios.html">Favoritos
        <span
                class="heart-icon-v2 favourites-button-nb hidden">0</span>
    </button>
    <a
            class="header-item" href="/ayuda.html">Ayuda</a>
    <a
            class="header-item link_inscription" href="Nuevoanuncio.jsp">Dar clases</a>

    <a
            class="header-item deconnexion" href="/deconnexion.php">Desconectarse</a></div></div><div
        class="header-inner-cell header-inner-cell-button header-right-v2 desktop-only"><button
        class="header-item header-itemLink a-js heart-icon-v2Before" data-href="/panel-de-control-mis-solicitudes-clases.html">Mensajes </button>
    <button
            class="header-item header-itemLink heart-icon-v2Before a-js favourites-button hidden" data-href="/mis-anuncios.html">Favoritos
        <span
                class="heart-icon-v2 favourites-button-nb hidden">0</span>
    </button>
    <a
            class="header-item header-itemLink" href="/ayuda.html">Ayuda</a>
    <button
            class="button button-radius a-js btn-donner-cours" data-href="/nuevo-anuncio.html">Dar clases</button><div
            class="header-item">
        <a
                href="Paneldecontrol.jsp" class="userConnected-v2" style="background-image: url('img/user-icon.png')"></a><div
            class="header-popinMenuContainer"><ul
            class="header-popinMenu" ><li><a
            href="Paneldecontrol.jsp">Mi panel de control</a></li><li><a
            href="Solicitudesdeclase.jsp">Mis solicitudes de clases</a></li>
        <li><a
                href="Modificarperfil.jsp">Mi perfil</a></li><li><a
                class="" href="Nuevoanuncio.jsp">Dar clases</a></li>
        <li><a
                href="/deconnexion.php">Desconectarse</a></li></ul></div></div></div></div><div
        class="header-dashboard-submenu"><div
        class="wrapper"><ul
        class="desktop-only"><li>
    <a
            href="Paneldecontrol.jsp" class="dashboard-header-link ">Panel de control</a></li><li>
    <a
            href="Solicitudesdeclase.jsp" class="dashboard-header-link ">Mis solicitudes de clases</a></li>
    <li>
        <a
                href="Modificarperfil.jsp" class="dashboard-header-link current">Modificar mi perfil</a></li></ul>


    <a
            href="Paneldecontrol.jsp" class="mobile-only back-to-site">
        Volver al panel de control
    </a>
</div></div>
    <div
            class="header-dashboard-page-submenu"><div
            class="wrapper desktop-only"><ul>
        <li><a
                href="Modificarperfil.jsp" class="dashboard-page-submenu-link current">Datos</a></li>
        <li><a
                href="panel-de-control-localisacion.html" class="dashboard-page-submenu-link ">Dirección</a></li>
        <li><a
                href="panel-de-control-perfil-foto.html" class="dashboard-page-submenu-link ">Foto</a></li>
        <li><a
                href="panel-de-control-perfil-mi-cuenta.html" class="dashboard-page-submenu-link ">Cuenta</a></li>
        <li><a
                href="panel-de-control-mi-perfil-facturas.html" class="dashboard-page-submenu-link ">Facturas</a></li>
    </ul></div><div
            class="wrapper mobile-only update-announce-submenu-container"><ul><li
            class="dropdown" data-remember-choice="true" data-title="test">
<span
        class="dashboard-page-submenu-link dropdown-toggle">Datos</span><ul
            class="update-announce-submenu-content">
        <li><a
                href="Modificarperfil.jsp" class="dashboard-page-submenu-link current">Datos</a></li>
        <li><a
                href="panel-de-control-localisacion.html" class="dashboard-page-submenu-link ">Dirección</a></li>
        <li><a
                href="panel-de-control-perfil-foto.html" class="dashboard-page-submenu-link ">Foto</a></li>
        <li><a
                href="panel-de-control-perfil-mi-cuenta.html" class="dashboard-page-submenu-link ">Cuenta</a></li>
        <li><a
                href="panel-de-control-mi-perfil-facturas.html" class="dashboard-page-submenu-link ">Facturas</a></li>
    </ul></li></ul></div></div></div></div><div class="page-dashboard submenu"><div class="wrapper"><div
        class="dashboard-column dashboard-sidebar"><div
        class="component-dashboard-sidebar teacher"><div
        class="dashboard-profile-picture">
    <div class="default-profile-photo big"></div><div
        class="dashboard-profile-information"><div
        class="dashboard-profile-name">Italo</div>
    <button
            class="dashboard-profile-options a-js" data-href="/panel-de-control-mi-perfil.html"></button></div></div><div
        class="dashboard-sidebar-section dashboard-sidebar-recommandation">
    <a
            href="Comentarios.jsp" class="button button-medium button-transparent">Mis opiniones</a></div><div
        class="dashboard-sidebar-section dashboard-sidebar-follow">
    <a
            class="follow-button favourites-button big" href="/mis-anuncios.html">
<span
        class="favourites-button-icon">
<span
        class="heart-icon-v2 ">0</span>
</span>
        Favoritos
    </a>
</div></div></div><div class="dashboard-column dashboard-content"><div
        id="phone-check-popin" class="popin-overlay hidden"><div
        class="popin-background"></div><div
        class="popin-container"><div
        class="popin-close popin-close-button"></div><div
        class="popin-content"><div
        class="phone-verif-popin"><h2 class="title-popin">Verificación de tu número de móvil</h2><p>Has introducido tu número de móvil <span
        class="mobile-phone">994693967</span>.<br>No te preocupes: tu número sólo se transmitirá con los miembros de Superprof cuando la solicitud de clases esté confirmada.</p><p>Introduce el código que vas a recibir por SMS para verificar tu número de móvil, por favor:</p><form
        action="" method="POST" class="form-inline"><div
        class="input-container">
    <input
            type="text" class="input" name="verification-code" placeholder="Código de verificación"/></div>
    <input
            type="submit" name="submit_sms" class="button" value="OK"/>
    <button
            type="button" class="button button-transparent" id="resend-code">Enviadme el código</button></form></div></div></div></div>
    <div
            class="update-profile-header"><h1 class="dashboard-title">Modificar mi perfil</h1></div><div
            class="update-profile-form">
        <div
                class="form-section"><div
                class="form-column form-column-label"><p
                class="form-label">información general</p></div><div
                class="form-column form-column-inputs"><form
                action="" class="update-profile-form-submit component-form" method="POST"><div
                class="input-container"><div
                class="input select">
            <select
                    name="sexe" data-type="required">
                <option
                        value="H"  selected>Hombre</option><option
                    value="F" >Mujer</option>
            </select></div></div><div
                class="input-container">
            <input
                    type="text" class="input" name="name" data-type="required" placeholder="Nombre" value="Italo"/></div><div
                class="input-container">
            <input
                    type="text" class="input" name="lastname" data-type="required" placeholder="Apellidos" value="Sanchez sancho"/></div><div
                class="input-container date_naissance" data-type="required">
            <label
                    class="label-inline">
                Fecha de nacimiento
            </label><div
                class="input select date_ddn_jour">
            <select
                    class="select-ddn" name="date_ddn_jour" id="date_ddn_jour" ><option
                    value="">Día</option>
                <option
                        value="01">01</option><option
                        value="02" selected="selected">02</option><option
                        value="03">03</option><option
                        value="04">04</option><option
                        value="05">05</option><option
                        value="06">06</option><option
                        value="07">07</option><option
                        value="08">08</option><option
                        value="09">09</option><option
                        value="10">10</option><option
                        value="11">11</option><option
                        value="12">12</option><option
                        value="13">13</option><option
                        value="14">14</option><option
                        value="15">15</option><option
                        value="16">16</option><option
                        value="17">17</option><option
                        value="18">18</option><option
                        value="19">19</option><option
                        value="20">20</option><option
                        value="21">21</option><option
                        value="22">22</option><option
                        value="23">23</option><option
                        value="24">24</option><option
                        value="25">25</option><option
                        value="26">26</option><option
                        value="27">27</option><option
                        value="28">28</option><option
                        value="29">29</option><option
                        value="30">30</option><option
                        value="31">31</option>
            </select></div><div
                class="input select date_ddn_mois">
            <select
                    class="select-ddn" name="date_ddn_mois" id="date_ddn_mois"><option
                    value="">Mes</option>
                <option
                        value="01">01</option><option
                        value="02">02</option><option
                        value="03">03</option><option
                        value="04">04</option><option
                        value="05">05</option><option
                        value="06" selected="selected">06</option><option
                        value="07">07</option><option
                        value="08">08</option><option
                        value="09">09</option><option
                        value="10">10</option><option
                        value="11">11</option><option
                        value="12">12</option>
            </select></div><div
                class="input select date_ddn_annee">
            <select
                    class="select-ddn" name="date_ddn_annee" id="date_ddn_annee"><option
                    value="">Año</option>
                <option
                        value="2017">2017</option><option
                        value="2016">2016</option><option
                        value="2015">2015</option><option
                        value="2014">2014</option><option
                        value="2013">2013</option><option
                        value="2012">2012</option><option
                        value="2011">2011</option><option
                        value="2010">2010</option><option
                        value="2009">2009</option><option
                        value="2008">2008</option><option
                        value="2007">2007</option><option
                        value="2006">2006</option><option
                        value="2005">2005</option><option
                        value="2004">2004</option><option
                        value="2003">2003</option><option
                        value="2002">2002</option><option
                        value="2001">2001</option><option
                        value="2000">2000</option><option
                        value="1999">1999</option><option
                        value="1998">1998</option><option
                        value="1997">1997</option><option
                        value="1996">1996</option><option
                        value="1995">1995</option><option
                        value="1994">1994</option><option
                        value="1993">1993</option><option
                        value="1992">1992</option><option
                        value="1991">1991</option><option
                        value="1990">1990</option><option
                        value="1989" selected="selected">1989</option><option
                        value="1988">1988</option><option
                        value="1987">1987</option><option
                        value="1986">1986</option><option
                        value="1985">1985</option><option
                        value="1984">1984</option><option
                        value="1983">1983</option><option
                        value="1982">1982</option><option
                        value="1981">1981</option><option
                        value="1980">1980</option><option
                        value="1979">1979</option><option
                        value="1978">1978</option><option
                        value="1977">1977</option><option
                        value="1976">1976</option><option
                        value="1975">1975</option><option
                        value="1974">1974</option><option
                        value="1973">1973</option><option
                        value="1972">1972</option><option
                        value="1971">1971</option><option
                        value="1970">1970</option><option
                        value="1969">1969</option><option
                        value="1968">1968</option><option
                        value="1967">1967</option><option
                        value="1966">1966</option><option
                        value="1965">1965</option><option
                        value="1964">1964</option><option
                        value="1963">1963</option><option
                        value="1962">1962</option><option
                        value="1961">1961</option><option
                        value="1960">1960</option><option
                        value="1959">1959</option><option
                        value="1958">1958</option><option
                        value="1957">1957</option><option
                        value="1956">1956</option><option
                        value="1955">1955</option><option
                        value="1954">1954</option><option
                        value="1953">1953</option><option
                        value="1952">1952</option><option
                        value="1951">1951</option><option
                        value="1950">1950</option><option
                        value="1949">1949</option><option
                        value="1948">1948</option><option
                        value="1947">1947</option><option
                        value="1946">1946</option><option
                        value="1945">1945</option><option
                        value="1944">1944</option><option
                        value="1943">1943</option><option
                        value="1942">1942</option><option
                        value="1941">1941</option><option
                        value="1940">1940</option><option
                        value="1939">1939</option><option
                        value="1938">1938</option><option
                        value="1937">1937</option><option
                        value="1936">1936</option><option
                        value="1935">1935</option><option
                        value="1934">1934</option><option
                        value="1933">1933</option><option
                        value="1932">1932</option><option
                        value="1931">1931</option><option
                        value="1930">1930</option><option
                        value="1929">1929</option><option
                        value="1928">1928</option><option
                        value="1927">1927</option><option
                        value="1926">1926</option><option
                        value="1925">1925</option><option
                        value="1924">1924</option><option
                        value="1923">1923</option><option
                        value="1922">1922</option><option
                        value="1921">1921</option><option
                        value="1920">1920</option><option
                        value="1919">1919</option><option
                        value="1918">1918</option><option
                        value="1917">1917</option>
            </select></div></div><div
                class="input-container  verified">
            <input
                    type="email" class="input mail-input" name="email" data-type="email" placeholder="Correo" value="italoosmar@gmail.com"/><span
                class="verified-label">Verificado</span>
        </div>
            <div
                    class="input-container  verification">
                <input
                        type="tel" class="input phone-input" name="mobile" data-type="tel" placeholder="Móvil" value="994693967"/>
                <button
                        tabindex="92" class="button button-transparent popin-link send-verification-phone" data-target="phone-check-popin" data-ajax-check-url="/ajax/ajax-AW.php">Verificar</button></div><div
                    class="input-container">
                <input
                        type="tel" class="input" name="phone" placeholder="Teléfono fijo" value=""/></div><div
                    class="input-container"><div
                    class="buttons-container">
                <label
                        class="component-radio-register radio-webcam radio">
                    <input
                            type="radio" value="skype" name="outil" >Skype
                </label>
                <label
                        class="component-radio-register radio-webcam radio">
                    <input
                            type="radio" value="hangout" name="outil">Google Hangouts
                </label></div><div
                    class="input-container hidden">
                <input
                        type="text" name="outil_identifier" class="input" placeholder="Usuario" value=""></div></div>
            <input
                    type="submit" tabindex="90" class="button" name="submit_profile" value="Confirmar los cambios"/></form></div></div>
    </div></div></div></div><div
        class="notification valid hidden with-sub" id="errorNotification" data-timeout="15000"><div
        class="wrapper"><p
        class="notification-text"></p><div
        class="notification-close"></div></div></div>

</body>
</html>
