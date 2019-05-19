<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment Form</title>

<style> 
	body {
	padding: 60px 0;
	background-color: #EBEDEF;
	margin: 0 auto;
	width: 600px;}	
	
	.form-container {
	flex-direction: column;
	justify-content: center;
	align-items: center;}
	
	.personal{
	background-color: #16A085;
	color: #fff;
	padding: 1px 0;
	text-align: center;}
	
	h1 {
	font-size: 1.3em;
	font-family: "Roboto"}
	
	h2{
	font-size : 1.0em;
	font-family : arial;}
  
	input {
	margin: 1px 0;
	padding-left: 3%;
	font-size: 14px;}

	input[type="text"]{
	display: block;
	height: 50px;
	width: 97%;
	border: none;}

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
<form>
	<div class = " form-container">
		<div class = "personal">
			<h1> Payment Information</h1>
		</div>
		<form:form action="payment.do" method="POST" commandName="payment">
	
		<pre><br> <h2> Card Type : 
				<input id = "up" type ="radio" name = "card" value ="Debit card"/> Debit Card
				<input id = "up" type ="radio" name = "card" value ="Credit card"/> Credit Card </h2><br> </pre>
		
		<input id = "coeft" type ="text" name = "Firstname" placeholder ="First Name"/>
		<input id = "coright" type ="text" name = "Lastname" placeholder ="Last Name"/>
		<input id = "cofiled" type ="text" name = "number" placeholder ="Card Number"/>
		<input id = "coleft" type ="text" name = "expiry" placeholder ="MM / YY"/>
		<input id = "coright" type ="text" name = "ccv" placeholder ="CCV"/>
		
		<br>
		
		<input id = "button" type = "submit" value = "Done"/>
		<br> <br> <br>
		<input id = "button" type = "submit" value = "Back to Home"/>
		
		
	</div>
</form>
</body>
</html>