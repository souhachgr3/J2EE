<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Modifier Etudiant</h1>
<form method="POST">
		<label for="id">ID :</label>
        <input type="number" id="id" name="id" value="${item.id}"><br><br>
        
        <label for="nom">Nom:</label>
        <input type="text" id="nom" name="nom" value="${item.nom}"><br><br>
        
        <label for="prenom">Prenom:</label>
        <input type="text" id="prenom" name="prenom" value="${item.prenom}"><br><br>
        
        <label for="age">Age:</label>
        <input type="text" id="age" name="age" value="${item.age}"><br><br>
        <button type="submit">Valider</button>
         <input type="reset" value="Remettre à zéro">
         </form>
   
</body>
</html>