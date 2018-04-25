<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Name List Example</title>
	</head>
	<body>
		<ol>
			<!-- Print out all names from nameList -->
			<c:forEach  var="name" items="${nameList}">
				<li><c:out value="${name}" /></li>
			</c:forEach>
			
		</ol>
	</body>
</html>