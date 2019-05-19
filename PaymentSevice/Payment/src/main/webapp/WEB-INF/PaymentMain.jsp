<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment</title>

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
  	left: 0;
  	top: 45%;
  	width: 100%;
  	text-align: center;
  	font-size: 20px;}
	

	input {
	margin: 1px 0;
	padding-left: 3%;
	font-size: 14px;}


	input[type="submit"]{
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
  	
	input[type="submit"]:hover{
  	background-color: #6FB7E9;
  	transition: 0.3s ease;}

</style>
</head>

<body>
<div class = "personal">
			<h1><u> Payment Information </u> </h1>
		</div>
<div class = " cont"> 
		
		
		<input id = "button" type = "submit" value = "Add payment details"/>
		<br>
		<br>
		<input id = "button" type = "Submit" value = "See card details"/>

	
</div>

</body>
</html>