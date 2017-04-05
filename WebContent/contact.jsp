<!doctype html>
<html>
<head>
<title>Contact</title>
</head>
<body>
	<h1>Contact me!</h1>
	<p>Fill out the form below to contact me!</p>
	
	<p><em>${message}</em></p>
	
		<form action="connect" method="post">
		<label for="firstName">First Name: </label>
		<input name="firstName" value="${user.firstName}"><br>
		
		<label for="lastName">Last Name: </label>
		<input name="lastName" value="${user.lastName}"><br>
		
		<label for="email">Email: </label>
		<input name="email" value="${user.email}"><br>
		
		<input type="submit" value="Send!">
		</form>

</body>
</html>