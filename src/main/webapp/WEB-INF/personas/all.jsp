<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Personas</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">

		<table class="table table-dark table-striped table-bordered mt-5">
			<thead>
				<tr>
					<th scope="col">Nombre</th>
					<th scope="col">Apellido</th>
					<th scope="col">Rut</th>
					<th scope="col">Fecha de Nacimiento</th>
				</tr>
			</thead>
			<c:forEach items="${personas}" var="persona">

				<tr>
					<td><c:out value="${persona.nombre}" /></td>
					<td><c:out value="${persona.apellido}" /></td>
					<td><c:out value="${persona.rut}" /></td>
					<td><c:out value="${persona.fechaNacimiento}" /></td>
				</tr>
			</c:forEach>
		</table>

	</div>
</body>
</html>