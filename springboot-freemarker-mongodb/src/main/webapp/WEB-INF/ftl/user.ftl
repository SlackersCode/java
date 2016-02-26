<html>
<head>
	<title>User</title>
</head>
<body>

	<#if success??>
		<div style="border: 1px solid;padding:15px 10px 15px 50px;color: #4F8A10;background-color: #DFF2BF; width: 110px;">${success}</div>
	</#if>
	
	<form role="form" name="form" action="/user" method="post">
	  Username:<br>
	  <input type="text" name="username" placeholder="Username" value="${user.username}" required>
	  <br>
	  Password:<br>
	  <input type="password" name="password" placeholder="Password" value="${user.password}" required>
	  <br>
	  <input type="submit" value="Submit">
	</form>
	
	<#if users?size gt 0>
		<#list users as user>
			<ul>
				<li>Username: ${user.username}</li>
			</ul>
		</#list>
	</#if>
</body>