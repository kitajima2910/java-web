<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Java Server Page</title>
</head>
<body>
	<h1>${ title }</h1>
	<p>Tên: ${ name }</p>
	<p>Tuổi: ${ age }</p>
	<a href="index?name=PXH&age=24">Click me!</a>
	<form action="index" autocomplete="off">
		<label for="txtName">Tên: </label><input type="text" id="txtName" name="txtName"><br>
		<label for="txtAge">Tuổi: </label><input type="text" id="txtAge" name="txtAge"><br>
		<button formmethod="get">Click me!</button>
	</form>
</body>
</html>