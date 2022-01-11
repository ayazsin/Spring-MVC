
<%@ page language="java" contentType="text/html; charset=UTF-8"
	isELIgnored="false" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="model.Person"%>
<%@page import="dao.EmpDao"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><spring:message code="titre.hello" /></title>
<link href="/3SPR-07.1-CORR/assets/style.css" rel="stylesheet" />
</head>
<body>
	<h1>Employee Form</h1>
	<form:form method="post" action="/3SPR-07.1-CORR/hello5/add"
		modelAttribute="employee">
		<fieldset>
			<legend>Fill form please:</legend>
			<table>
				<tr>
					<td><form:label path="first_name">First Name</form:label></td>
					<td><form:input path="first_name" /></td>
					<td><form:errors path="first_name" cssClass="error" /></td>
				</tr>
				<tr>
					<td><form:label path="last_name">Last Name</form:label></td>
					<td><form:input path="last_name" /></td>
					<td><form:errors path="last_name" cssClass="error" /></td>
				</tr>
				<tr>
					<td><form:label path="salary">Salary</form:label></td>
					<td><form:input path="salary" /></td>
					<td><form:errors path="salary" cssClass="error" /></td>
				</tr>
				<tr>
					<td><form:label path="year">Year</form:label></td>
					<td><form:input path="year" /></td>
				</tr>
			</table>
			<table>
				<tr>
					<td><form:label path="">Department: </form:label></td>
					<td><form:select path="department">
							<form:option value="IT" />
							<form:option value="Marketing" />
							<form:option value="Administration" />
							<form:option value="Public Relation" />
						</form:select></td>
				</tr>
			</table>
			<table>
				<tr>
					<td><form:label path="">Gender: </form:label></td>
					<td><form:label path="gender">Female</form:label></td>
					<td><form:radiobutton path="gender" value="female" /></td>
					<td><form:label path="gender">Male</form:label></td>
					<td><form:radiobutton path="gender" value="male" /></td>
				</tr>
				<tr>
					<td><form:label path="">Languages: </form:label></td>
					<td><form:label path="language">English</form:label></td>
					<td><form:checkbox path="language" value="english" /></td>
					<td><form:label path="language">French</form:label></td>
					<td><form:checkbox path="language" value="french" /></td>
					<td><form:label path="language">Spanish</form:label></td>
					<td><form:checkbox path="language" value="spanish" /></td>
				</tr>
				<tr>
					<td><form:label path="">Formation: </form:label></td>
					<td><form:label path="formation">SDLC</form:label></td>
					<td><form:checkbox path="formation" value="SDLC" /></td>
					<td><form:label path="formation">CLPS</form:label></td>
					<td><form:checkbox path="formation" value="CLPS" /></td>
					<td><form:label path="formation">OPCO</form:label></td>
					<td><form:checkbox path="formation" value="OPCO" /></td>
				</tr>
			</table>
			<table>
				<tr>
					<td><input type="submit" value="Submit" /></td>
					<td><h3>${warningSuccess}</h3>
				</tr>

			</table>
		</fieldset>
	</form:form>

	<h1>Table of Employee</h1>

	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Salary</th>
				<th>Year</th>
				<th>Gender</th>
				<th>Languages</th>
				<th>Department</th>
				<th>Formation</th>
			</tr>
		</thead>
		<tbody>
			<%
			List<Person> persons = (ArrayList<Person>) request.getAttribute("persons");

			for (Person person : persons) {
				out.print("<tr><td>" + person.getId() + "</td><td>" + person.getFirst_name() + "</td><td>" + person.getLast_name()
				+ "</td><td>" + person.getSalary() + "</td><td>" + person.getYear() + "</td><td>" + person.getGender() + "</td>");
				out.print("<td>" + person.getLanguage() + "</td>");
				out.print("<td>" + person.getDepartment() + "</td>");
				out.print("<td>" + person.getFormation() + "</td>");
				
				

				out.print("<td><a href='/3SPR-07.1-CORR/hello5/del/" + person.getId() + "'>delete</a></td></tr>");
			}
			%>
		</tbody>
	</table>


</body>
</html>