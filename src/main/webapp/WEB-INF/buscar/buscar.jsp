<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="ISO-8859-1">
<title>Entrega</title>
<link rel="stylesheet" href="/css/formulario1.css">
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet"
	integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN"
	crossorigin="anonymous">
<link rel="stylesheet" href="fonts/style1.css">
</head>

<body>
	<nav class="navbar navbar-expand-md navbar-dark bg-dark">
		<div class="container">
			<h4 class="text-light">My Control</h4>

			<div class="collapse navbar-collapse justify-content-end"
				id="navbarsExampleDefault">
				<ul class="navbar-nav m-auto">
					<li class="nav-item"><a class="nav-link" a
						href="#sobrenosotros">Sobre Nosotros</a></li>
					<li class="nav-item"><a class="nav-link" href="/"><span
							class="icon-home"></span></a></li>

					<li class="nav-item"><a class="nav-link" a href="#contactenos">Contáctenos</a>
					</li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="contenedor fondo">
		<button type="button" class="btn btn-default btn-circle btn-xl">
			<span class="icon-dropbox"></span>
		</button>


		<button class="btn btn-secondary dropdown-toggle p-3 agregar"
			type="button" id="dropdownMenuButton" data-toggle="dropdown"
			aria-haspopup="true" aria-expanded="false">Agregar Persona</button>
		<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
			<a class="dropdown-item" href="#">Agregar Residente</a> <a
				class="dropdown-item" href="#">Buscar visita</a> <a
				class="dropdown-item" href="#">Buscar </a>
		</div>

		<footer class="text-light">
			<div class="container">
				<div class="row">
					<div class="col-md-3 col-lg-4 col-xl-3">
						<a name="sobrenosotros">
							<h5>Sobre Nosotros</h5>
						</a>
						<hr class="bg-white mb-2 mt-0 d-inline-block mx-auto w-25">
						<p class="mb-0 text-justify">My control nos permite un manejo
							optimizado de la información, junto con el control de los datos
							de personas, tanto en edificios residenciales como coorporativos.
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
							<li><i class="fa fa-envelope mr-2 mt-3"></i>
								contacto@mycontrol.cl</li>
							<li><i class="fa fa-phone mr-2 mt-3"></i> +56223373568</li>

						</ul>
					</div>

					<div class="col-12 copyright mt-3">
						<p>
							<a href="#">Volver al inicio</a>
						</p>
						<p class="text-right">
							Creado con <i class="fa fa-heart"></i> por <a><i>Equipo
									MyControl</i></a>
						</p>
						
					</div>
				</div>
			</div>
		</footer>
	</div>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>

</html>























