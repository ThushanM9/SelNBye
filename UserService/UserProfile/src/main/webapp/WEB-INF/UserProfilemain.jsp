<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Main User Login</title>

<style> 
	body {padding: 60px 0;
	background-color:#EBEDEF  ;
	margin: 0 auto;
	width: 600px;}	
	
	.personal{ color:#16A085;
	padding: 1px 0;
	text-align: center;}
	
	h1 {
	font-size: 2.0em;
	font-family : arial}	
	
	.cont{
	align-items: center;
	flex-direction: column;
	position: absolute;
  	left: 25%;
  	top: 45%;
  	width: 100%;
  	text-align:center;
  	font-size: 30px;}
	

	input {
	margin: 1px 0;
	padding-left: 3%;
	font-size: 14px;
	}


	input[type="button"]{
	display: block;
	height: 80px;
	width: 50%;
	border: none;
	background-color: #16A085;
	color: #fff;
	margin-top: 2px;
	curson: pointer;
	font-size: 0.9em;
	text-transform: uppercase;
  	font-weight: bold;
  	cursor: pointer;
	border-radius: 15px;
	}
  	
	input[type="button"]:hover{
  	background-color: #6FB7E9;
  	transition: 0.3s ease;}

</style>
</head>

<body>
	<div class = "personal">
			<h1> Welcome to our online stole....  </h1>
	</div>
	
	
	<div class = " cont"> 
		
		
		<input id = "button" type = "button" value = "Login"/>
		<br>
		<br>
		<input id = "button" type = "button" value = "Register"/>

	
	</div>
</body>
</html>