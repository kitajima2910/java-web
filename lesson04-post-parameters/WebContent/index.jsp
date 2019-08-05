<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Java Server Page</title>
</head>
<body>
	<h1>Post Parameters</h1>
	<form action="index.html" autocomplete="off">
		<div>Họ và Tên: <input type="text" name="txtName"></div>
		<div>Tiền lương: <input type="text" name="txtSalary"></div>
		<button formmethod="post">Tính</button>
	</form>
</body>
</html>