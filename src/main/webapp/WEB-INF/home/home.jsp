<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="ISO-8859-1">
            <title>Inicio</title>
            <link rel="stylesheet" href="/css/formulario.css">
            <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet"
                id="bootstrap-css">
            <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet"
                integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN"
                crossorigin="anonymous">
            <link rel="stylesheet" href="fonts/style.css">
        </head>

        <body>
            <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
                <div class="container">
                    <h4 class="text-light">My Control</h4>

                    <div class="collapse navbar-collapse justify-content-end" id="navbarsExampleDefault">
                        <ul class="navbar-nav m-auto">
                            <li class="nav-item">
                                <a class="nav-link" a href="#sobrenosotros">Sobre Nosotros</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="/"><span class="icon-home"></span></a>
                            </li>

                            <li class="nav-item">
                                <a class="nav-link" a href="#contactenos">Contáctenos</a>
                            </li>
                        </ul>

                        <form class="form-inline my-2 my-lg-0">
                    </div>
                    <a class="btn btn-success btn-m ml-3" href="/login">
                        Iniciar Sesión <span class="icon-user-o"></span>
                        <span class="badge badge-light"></span>
                    </a>
                    </form>
                </div>
            </nav>
            <section class="jumbotron text-center amigable fondo">
                <div class="container">
                    <img alt="logo" id="logo" class="img-fluid" src="img/logo.png">
                    <h1 class="jumbotron-heading">| Amigable | Eficiente | Seguro |</h1>

                </div>
            </section>
            <div class="container">
                <div class="row">
                    <div class="col">
                        <nav aria-label="breadcrumb">
                            <ol class="breadcrumb">
                                <li class="breadcrumb-item"><a href="/">Inicio</a></li>
                                <li class="breadcrumb-item active" aria-current="page">Registrarse</li>
                            </ol>
                        </nav>
                    </div>
                </div>
            </div>
            <div class="container">

                <div class="container breadcrumb bg-info registro">
                    <h1 class="well">Registrarse</h1>
                    <div class="col-lg-12  col-lg-6 well">
                        <div class="row">
                            <form:form class="col-sm-12">
                                <div class="col-sm-12">
                                    <div class="row">
                                        <div class="col-sm-12 col-lg-6 orm-group">
                                            <label>Correo:</label>
                                            <input type="email" placeholder="Ingrese Correo" class="form-control"
                                                name="email">
                                        </div>
                                        <div class="col-sm-12 col-lg-6 form-group">
                                            <label>Contraseña:</label>
                                            <input type="password" placeholder="Ingrese contraseña" class="form-control"
                                                name="password">
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-sm-12 col-lg-6 form-group">
                                            <label>Nombre Edificio:</label>
                                            <input type="text" placeholder="Nombre edificio" class="form-control">
                                        </div>
                                        <div class="col-sm-12 col-lg-6 form-group">
                                            <label>Confirmar Contraseña:</label>
                                            <input type="password" placeholder="Confirme su contraseña"
                                                class="form-control">
                                        </div>


                                    </div>
                                    <div class="row">
                                        <div class="col-sm-12 col-lg-6 form-group">
                                            <label>Rut:</label>
                                            <input type="text" placeholder="Ingrese su Rut" class="form-control">
                                        </div>
                                        <div class="col-sm-12  col-lg-6 form-group">
                                            <label>Direccion:</label>
                                            <input type="text" placeholder="Ingrese su dirección" class="form-control">
                                        </div>

                                    </div>
                                    <div class="row">
                                        <div class="col-sm-12 form-group">
                                            <h5>¿Ya tienes cuenta?</h5>
                                        </div>
                                        <div class="col-sm-12 login__buttons">
                                            <a class="btn btn-lg btn-secondary cuenta" href="/login">Iniciar Sesión
                                                <span class="icon-arrow-right"></span>
                                            </a>
                                            <a class="btn btn-lg btn-secondary" href="/login">Vamos
                                                <span class="icon-arrow-right "></span>
                                            </a>
                                        </div>
                                    </div>


                                </div>
                                </form>
                        </div>
                    </div>
                </div>
            </div>
            </div>

            <!-- FOOTEER -->
            <footer class="text-light">

                <div class="container">
                    <div class="row">
                        <div class="col-lg-3 col-lg-4 col-xl-3">
                            <a name="sobrenosotros">
                                <h5>Sobre Nosotros</h5>
                            </a>
                            <hr class="bg-white mb-2 mt-0 d-inline-block mx-auto w-25">
                            <p class="mb-0 text-justify">
                                My control nos permite un manejo optimizado de la
                                información, junto
                                con el control de los datos de personas, tanto en edificios residenciales como
                                coorporativos.
                            </p>
                        </div>

                        <div class="col-lg-3 col-lg-2 col-xl-2 mx-auto">
                            <h5>Others links</h5>
                            <hr class="bg-white mb-2 mt-0 d-inline-block mx-auto w-25">
                            <ul class="list-unstyled">
                                <li><a href="">Link 1</a></li>
                                <li><a href="">Link 2</a></li>
                                <li><a href="">Link 3</a></li>
                                <li><a href="">Link 4</a></li>
                            </ul>
                        </div>

                        <div class="col-lg-4 col-lg-3 col-xl-3">
                            <a name="contactenos">
                                <h5>Contáctenos</h5>
                            </a>
                            <hr class="bg-white mb-2 mt-0 d-inline-block mx-auto w-25">
                            <ul class="list-unstyled">
                                <li><i class="fa fa-home mr-2"></i> Mycontrol en Slack</li>
                                <li><i class="fa fa-envelope mr-2 mt-3"></i> contacto@mycontrol.cl</li>
                                <li><i class="fa fa-phone mr-2 mt-3"></i> +56223373568</li>

                            </ul>
                        </div>

                        <div class="col-12 copyright mt-3">
                            <p>
                                <a href="#">Volver al inicio</a>
                            </p>
                            <p class="text-right">Creado <i class="fa fa-heart"></i> por <a><i>Equipo
                                        MyControl</i></a>
                            </p>
                        </div>
                    </div>
                </div>
            </footer>
        </body>

        </html>