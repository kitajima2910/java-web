<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Java Server Page</title>
</head>
<body>
	<h1>Message: ${ keyMsg }</h1>
	<a href="message.html">Click Me!</a>
	<form action="message.html" autocomplete="off">
		<label for="txtName">Name: </label><input type="text" id="txtName" name="txtName">
		<button formmethod="post">Gửi</button>
	</form>
</body>
</html>