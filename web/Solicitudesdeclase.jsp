<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 5/08/2017
  Time: 11:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta content="text/html; charset=UTF-8" http-equiv="Content-Type" />
    <title>Panel de control</title>
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
            class="header-logo header-logo-normal" href="/" title="title_logo_Tesis Market, clases particulares">
        <img
                src="img/logo.png"
                srcset="img/logo.png"
                width="145"
                height="47"
                alt="TesisMarket" />
    </a></div><div
        class="header-inner-cell header-inner-cell-menu mobile-only">
    <button
            class="header-burger-close"></button><div
        class="header-menu-inner"><div
        class="userConnected-v2" style="background-image: url('img/user-icon.png')"></div>
    <a
            class="header-item" href="/panel-de-control.html">Mi panel de control</a>
    <a
            class="header-item" href="/panel-de-control-mis-solicitudes-clases.html">Mis solicitudes de clases</a>

    <a
            class="header-item" href="/panel-de-control-mi-perfil.html">Mi perfil</a>
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
            class="header-item link_inscription" href="/nuevo-anuncio.html">Dar clases</a>

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
                href="/panel-de-control.html" class="userConnected-v2" style="background-image: url('img/icon.jpg')"></a><div
            class="header-popinMenuContainer"><ul
            class="header-popinMenu" ><li><a
            href="/panel-de-control.html">Mi panel de control</a></li><li><a
            href="/panel-de-control-mis-solicitudes-clases.html">Mis solicitudes de clases</a></li>
        <li><a
                href="/panel-de-control-mi-perfil.html">Mi perfil</a></li><li><a
                class="" href="/nuevo-anuncio.html">Dar clases</a></li>
        <li><a
                href="/deconnexion.php">Desconectarse</a></li></ul></div></div></div></div><div
        class="header-dashboard-submenu"><div
        class="wrapper"><ul
        class="desktop-only"><li>
    <a
            href="/panel-de-control.html" class="dashboard-header-link ">Panel de control</a></li><li>
    <a
            href="/panel-de-control-mis-solicitudes-clases.html" class="dashboard-header-link current">Mis solicitudes de clases</a></li>
    <li>
        <a
                href="/panel-de-control-mi-perfil.html" class="dashboard-header-link ">Modificar mi perfil</a></li></ul>


    <a
            href="/panel-de-control.html" class="mobile-only back-to-site">
        Volver al panel de control
    </a>
</div></div>
    <div
            class="header-dashboard-page-submenu"><div
            class="wrapper desktop-only"><ul>
        <li><a
                href="panel-de-control-mis-solicitudes-clases.html" class="dashboard-page-submenu-link current">Todas mis solicitudes</a></li>
        <li><a
                href="panel-de-control-mis-solicitudes-clases-aceptadas.html" class="dashboard-page-submenu-link ">Mis solicitudes aceptadas</a></li>
        <li><a
                href="panel-de-control-mis-solicitudes-clases-comentario.html" class="dashboard-page-submenu-link ">Mis opiniones</a></li>
    </ul></div><div
            class="wrapper mobile-only update-announce-submenu-container"><ul><li
            class="dropdown" data-remember-choice="true" data-title="test">
<span
        class="dashboard-page-submenu-link dropdown-toggle">Todas mis solicitudes</span><ul
            class="update-announce-submenu-content">
        <li><a
                href="panel-de-control-mis-solicitudes-clases.html" class="dashboard-page-submenu-link current">Todas mis solicitudes</a></li>
        <li><a
                href="panel-de-control-mis-solicitudes-clases-aceptadas.html" class="dashboard-page-submenu-link ">Mis solicitudes aceptadas</a></li>
        <li><a
                href="panel-de-control-mis-solicitudes-clases-comentario.html" class="dashboard-page-submenu-link ">Mis opiniones</a></li>
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
            href="/panel-de-control-mis-solicitudes-clases-comentario.html" class="button button-medium button-transparent">Mis opiniones</a></div><div
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
</div></div></div>

</body>
</html>