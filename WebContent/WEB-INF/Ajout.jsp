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
<h1>Ajouter Etudiant</h1>
<form method="POST">
		<label for="id">ID :</label>
        <input type="number" id="id" name="id" required><br><br>
        
        <label for="nom">Nom:</label>
        <input type="text" id="nom" name="nom" required><br><br>
        
        <label for="prenom">Prenom:</label>
        <input type="text" id="prenom" name="prenom" required><br><br>
        
        <label for="age">Age:</label>
        <input type="text" id="age" name="age" required><br><br>
        <button type="submit">Valider</button>
         <input type="reset" value="Remettre à zéro">
         </form>
     <c:if test="${not empty list}">
    <table border="1">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Prenom</th>
            <th>Age</th>
            <th>Action</th>
        </tr>
        <c:forEach var="item" items="${list}">
            <tr>
                <td>${item.id}</td>
                <td>${item.nom}</td>
                <td>${item.prenom}</td>
                <td>${item.age}</td>
<td> 
              <a href="Supp?id=${item.id}"><button >Supprimer</button> </a>
              <a href="Modif?id=${item.id}"><button >Modifier</button></a>
                </td>            
                </tr>
        </c:forEach>
    </table>
    </c:if>
</body>
</html>