<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Name List Example</title>
	</head>
	<body>
		<table>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
				<th>Adult</th>
			</tr>
			<!-- Print out a row for each Person object in personList -->
			<c:forEach var="person" items="${personList}">
				<tr>
					<td><c:out value="${person.firstName} " /></td>
					<td><c:out value="${person.lastName}" /></td>
					<td><c:out value="${person.age}" /></td>
					<td><%-- <c:choose>
						<c:when test="${person.adult}">
						<c:out value="Adult" />
						</c:when>
						<c:when test="${not person.adult}">
						<c:out value="Tiny, Sticky, Non-Adult" />
						</c:when> 
					</c:choose>--%>
					<c:out value="${person.adult ? 'Adult' : 'Tiny, Sticky, Non-Adult'}" />
				</tr>
			</c:forEach>
			
		</table>
	</body>
</html>