<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Registration form</title>

<style>
	body{
	padding: 60px 0;
	background-color: #EBEDEF;
	margin: 0 auto;
	width: 600px;}
	
	.main{
	background-color: #16A085;
	color: #fff;
	padding: 15px 0;
	text-align: center;}
 
	.simple{
	flex-direction: column;
	text-align : center;
	margin : 100px 100px;}

	register{
	width : 100%; 
	background-color:#fff;}


	input[id="button"]{
	width : 380px;
	padding : 10px;
	border-radius :5px;
	outline : 0px;}

	h1 {
	font-size: 1.5em;
	font-family: arial}

	input[id="phone"]{
	width : 380px;
	padding : 10px;
	border-radius :5px;
	outline : 0px;}
	
	h2{
	font-size : 1.0em;
	font-family : arial;}
	
	input[id="rad"]{
	font-size:50px;}

	input[id="butt"]{
	display: block;
	height: 60px;
	width: 100%;
	border: none;
	background-color: #16A085;
	color: #fff;
	margin-top: 2px;
	curson: pointer;
	font-size: 0.9em;
	text-transform: uppercase;
  	font-weight: bold;
  	cursor: pointer;}	

	input[id="butt"]:hover{
  	background-color: #6FB7E9;
  	transition: 0.3s ease;}	
</style>
</head>

<body>
	<div class="main">
		<h1> <u> Registration Form </u> </h1>
	</div>
	<div class = "simple">
		<form id = "register">
			<input type = "text" name ="fname" id="button" placeholder = "Enter your First name"/>
			<br><br>
			<input type = "text" name ="lname" id="button" placeholder = "Enter your Last name"/>
			<br><br>
			<input type = "email" name ="email" id="button" placeholder = "Enter your email address"/>
			<br><br>
			<input type = "password" name ="pass" id="button" placeholder = "Enter your password"/>
			<br><br>

			<input type = "number" name ="num" id="phone" placeholder = "Enter Mobile phone No"/>
			<br><br><br>
			 
			<input id = "rad" type ="radio" name = "rad" value ="m"/> Male
			<input id = "rad" type ="radio" name = "rad" value ="f"/> Female 
		<br><br>

			<input type = "submit" value ="Register" id="butt"/> 

		</form>
	</div>
</body>
</html>