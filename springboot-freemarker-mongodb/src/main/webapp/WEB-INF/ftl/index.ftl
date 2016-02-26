<html>
<head>
	<title>Hello World!</title>
</head>
<body>
	Hello ${user}!
	
	<br />
	
	<form role="form" name="form" action="/" method="post">
		<input type="text" name="user" placeholder="User"
							value="${user}" required />
		<input type="submit" value="Say hello" />
	</form>
</body>
</html>