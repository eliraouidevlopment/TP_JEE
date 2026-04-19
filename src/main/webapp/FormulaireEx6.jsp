<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
      <%
        HttpSession sessionVerif = request.getSession();
        

        if(!"ok".equals(sessionVerif.getAttribute("validation"))) {

            response.sendRedirect("loginEx6.html");
            
        }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
		
		<form action="AfficherEx6Servlet" method="post">
			
			<label for="nom">Nom :</label>
			<input type="text" id="nom" name="name">
			
			<label for="mot_passe">Mot de passe :</label>
			<input type="password" id="mot_passe" name="password">
			
			<label for="email">Email :</label>
			<input type="email" id="email" name="Email">
			
			<label for="age">Age :</label>
			<input type="number" id="age" name="Age"><br>
			
			<label for="select_payer">Pays :</label>
			<select name="payer" id="select_payer">
				
				<option value="maroc">maroc</option>
				<option value="elgerie">elgerie</option>	
				<option value="france">france</option>
			</select> <br>
			
			Sexe : <input type="radio" name="sexe" value="homme"> Homme <input type="radio" name="sexe" value="femme"> Femme <br>
			
		
			<input type="submit" value="Envoyer">
			<input type="reset" value="Effacer">
			
			
			
			
			
		</form>

</body>
</html>