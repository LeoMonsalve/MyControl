<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="ISO-8859-1">
            <title>Encomienda</title>
            <link rel="stylesheet" href="/css/formulario.css">
            <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet"
                id="bootstrap-css">
            <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet"
                integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN"
                crossorigin="anonymous">
            <link rel="stylesheet" href="fonts/style.css">
        </head>

        <body>

            <nav class="navbar navbar-expand-md navbar-dark bg-dark">
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
            <div class="container bg-dark">

                <div class="container breadcrumb bg-success registro fondo">
                     <div class="buscarencomienda col-lg-6">
                        <label>Buscar Encomienda:</label>
                        <input type="text" placeholder="Ingrese número de Encomienda" class="form-control">
                        <div class="row">
                            <div class="col-sm-3 form-group">
                                <a class="btn btn-lg btn-secondary boton2">Buscar
                                </a>
                            </div>
                        </div>
                        
                     </div>
                   
                    <div class="numero">
                        <label>Número Encomienda:</label>
                        <input type="text" class="form-control">
                    </div>
                    <div class="col-lg-12 well">
                        <div class="row">
                            <form>
                                <div class="col-sm-12">
                                    <div class="row">
                                        <div class="col-sm-6 form-group">
                                            <label>Nombre Empresa:</label>
                                            <input type="text" class="form-control">
                                        </div>
                                        <div class="col-sm-6 form-group">
                                            <label>Fecha de Entrega:</label>
                                            <input type="date" class="form-control">
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-sm-6 form-group">
                                            <label>Nombre Destinatario:</label>
                                            <input type="text" class="form-control">
                                        </div>
                                        <div class="col-sm-6 form-group">
                                            <label>Edificio:</label>
                                            <input type="text" class="form-control">
                                        </div>


                                    </div>
                                    <div class="row">
                                        <div class="col-sm-6 form-group">
                                            <label>Rut Destinatario:</label>
                                            <input type="text" class="form-control">
                                        </div>
                                        <div class="col-sm-6 form-group">
                                            <label>Número Departamento:</label>
                                            <input type="text" class="form-control">
                                        </div>

                                    </div>
                                    <div class="row">
                                        <div class="col-sm-3 form-group">
                                            <a class="btn btn-lg btn-secondary boton2" href="/home">Volver
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

            <footer class="text-light">
                <div class="container">
                    <div class="row">
                        <div class="col-md-3 col-lg-4 col-xl-3">
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

                        <div class="col-md-3 col-lg-2 col-xl-2 mx-auto">
                            <h5>Others links</h5>
                            <hr class="bg-white mb-2 mt-0 d-inline-block mx-auto w-25">
                            <ul class="list-unstyled">
                                <li><a href="">Link 1</a></li>
                                <li><a href="">Link 2</a></li>
                                <li><a href="">Link 3</a></li>
                                <li><a href="">Link 4</a></li>
                            </ul>
                        </div>

                        <div class="col-md-4 col-lg-3 col-xl-3">
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
                            <p class="text-right">Creado con <i class="fa fa-heart"></i> por <a><i>Equipo
                                        MyControl</i></a>
                            </p>
                        </div>
                    </div>
                </div>
            </footer>

        </body>

        </html>