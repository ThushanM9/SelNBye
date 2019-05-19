<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Login form</title>

<style>
	body{
	background-color: #EBEDEF;
	margin: 0;
	padding:0;
	font-family : "Montserrat", sans-serif;}

	.container{
	width: 360px;
	height:600px;
	background-color: #A2D9CE  ;
	position : absolute;
	top:50%;
	left : 50%;
	transform : translate(-50%, -50%);
	text-align :center;}

	.container h1{
	font-size: 40px;
	margin-top:125px;
	margin-bottom: 60px;}
	
	.tbox{
	width : 260px;
	height: 40px;
	background : #ECF0F1  ;
	border-radius: 10px;
	margin : 10px auto;}

	.tbox input{
	background : none;
	border : none;
	text-align:center;
	width : 90%;
	line-height : 37px;
	font-family : "Montserrat", sans-serif;
	font-size : 14px;
	color: #333;}
	
	input[type="submit"]{
	width : 260px;
	height: 40px;
	background : #138D75 ;
	border-radius: 10px;
	margin : 14px auto;
	display: block;
	font-family : "Montserrat", sans-serif;	
	font-size : 16 px;
	border : none;
	color : white;
	cursor : pointer;}
	
	input[type="submit"]:hover{
  	background-color: #6FB7E9;
  	transition: 0.3s ease;}	

</style>
</head>

<body>
	<div class = "container">
		<h1> LOG IN </h1>
		<form >
			<div class ="tbox">
				<input type = "text" value="" placeholder="@username"/>
			<div>

			<div class ="tbox">
				<input type = "password" value="" placeholder="Password"/>
			<div>
			
			<input type ="submit" name = "" value ="LOG IN"/>
		</form>
	</div>
</body>
</html>