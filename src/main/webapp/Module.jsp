<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% 
 HttpSession s=request.getSession();
 String v=(String) s.getAttribute("verification");
 if("notok".equals(v)){
	 response.sendRedirect("index5.jsp");
 }

%>

	<form action="Ex5Servlet2" method="post">
		<label for="select_module">Module de formation</label>
		<select name="module" id="select_module">
			<option>Fais ton choix</option>
			<option value="HTML,300,100,150">HTML</option>
			<option value="Javascript,450,120,200">Javascript</option>
			<option value="PHP,500,200,240">PHP</option>
		</select><br>
		<label for="Nheurs">Nombre de houres</label>
		<input type="number" name="NBRheurs" id="Nheurs"><br>
		
		<label for="suport">Supports</label>
		<input type="checkbox" id="suport" name="Spapier" value="papier">Support papier<br>
		<input type="checkbox" id="suport" name="Selectronique" value="electronique">Support electronique<br>
		
		<input type="submit" value="OK">
		<input type="submit" value="ok">
	</form>

</body>
</html>