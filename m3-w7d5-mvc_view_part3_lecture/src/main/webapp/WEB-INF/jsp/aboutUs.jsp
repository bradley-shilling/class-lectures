<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<c:url value='/css/site.css' var="cssLink"/>
<link rel="stylesheet" type="text/css" href="${cssLink }">

<title>Solar System Geek - About Us</title>
</head>

<body>
<c:url var="homeLink" value="/" />
<a href="${homeLink }"> 
	<c:url var="logoLink" value="/img/ssg_logo.png" />
    <img src="${logoLink}" id="logo" />
</a>

<div id="content">

    <nav>
    		<ul>
    		
    			<c:url var="homeLink" value="/" />
    			<li><a href="${homeLink}">Home</a></li>
    			
    			<c:url var="aboutUsLink" value="/aboutUs" />
    			<li><a href="${aboutUsLink }">About Us</a></li>
    			
    			<c:url var="favoritesLink" value="/link/favorites" />
    			<li><a href="${favoritesLink }">Favorite Link</a></li>
    		</ul>
    </nav>
    
        <h1>About Us</h1>>
    


<p>
	Solar System Geek is an educational resource dedicated to learning about the Solar System! Pluto is not a planet!!!
</p>

</div> <%-- ends the content div --%>

<p class="copyright">Copyright &copy; Solar System Geek Inc 2017</p>

</body>

</html>