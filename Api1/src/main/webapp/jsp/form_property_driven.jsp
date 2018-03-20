<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta content="telephone=no" name="format-detection"/>
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0" />
<script type="text/javascript" src="js/rem_adapter_size.js"></script>
<link rel="stylesheet" href="css/base.css" type="text/css">
<link rel="stylesheet" href="css/android/form_property_driven.css" type="text/css">
<title>表单属性驱动</title>
</head>
<body>
	<div class="indexForm">
		<form action="Login" method="post">
			<div class="row">
				<span class="sText">用户名:</span> <input class="iText" type="text"
					name="username" />
			</div>
			<div class="row">
				<span class="sText" class="sText">密码:</span> <input type="text"
					class="iText" name="password" />
			</div>
			<div class="row">
				<input class="submit" type="submit" value="登陆" /> <input
					class="submit" type="reset" value="取消" />
			</div>
		</form>
	</div>
</body>
</html>