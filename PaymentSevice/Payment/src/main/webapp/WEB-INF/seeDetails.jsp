<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>See card details</title>
</head>

<body>
<form:form action="payment.search" method="POST" commandName="payment">
		<table>
			<tr>
				<td><input type="text" name="searchVal" /></td>
				<td><input type="submit" name="action" value="Search" /></td>
			</tr>

		</table>
	</form:form>

	<form:form action="payment.do" method="POST" commandName="payment">
		<table>




			<tr>
				<td>First name</td>
				<td><form:input type="text" path="fname" /></td>
			</tr>
			<tr>
				<td>Last name</td>
				<td><form:input type="text" path="lname" /></td>
			</tr>
			<tr>
				<td>Card Number</td>
				<td><form:input type="text" path="cardno" /></td>
			</tr>
			<tr>
				<td>MM/YY</td>
				<td><form:input type="text" path="expire" /></td>
			</tr>
			<tr>
				<td>CCV</td>
				<td><form:input type="text" path="ccv" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" name="action" value="Add" />
				</td>
			</tr>
		</table>
	</form:form>
	<br>
	<table border="1">

		<th>PID</th>
		<th>First name</th>
		<th>Last name</th>
		<th>Card Number</th>
		<th>MM/YY</th>
		<th>CCV</th>

		<c:forEach items="${paymentList}" var="payment">
			<tr>
				<form:form action="payment.do" method="POST" commandName="payment">
					<td>${payment.pid}</td>
					<td>${payment.fname}</td>
					<td>${payment.lname}</td>
					<td>${payment.cardno}</td>
					<td>${payment.cdate}</td>
					<td>${payment.ccv}</td>

					<form:input path="pid" value="${payment.pid}"
						hidden="hidden" />
					<td><input type="submit" name="action" value="Load" /></td>
					<td><input type="submit" name="action" value="Delete" /></td>
				</form:form>
			</tr>
		</c:forEach>
	</table>

</body>
</html>