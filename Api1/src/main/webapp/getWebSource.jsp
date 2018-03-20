<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆</title>
<link rel="stylesheet" href="css/index.css" type="text/css">
<link rel="stylesheet" href="css/base.css" type="text/css">
</head>
<body>
	<div class="indexForm">
		<h2 class="title">ServletRequestAware等接口</h2>
		<form action="GetWebSourceFirst.action" method="post">
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

	<div class="indexForm">
		<h2 class="title">RequestAware接口</h2>
		<form action="GetWebSourceSecond.action" method="post">
			<div class="row">
				<span class="sText">用户名:</span> <input class="iText" type="text"
					name="username" />
			</div>
			<div class="row">
				<span class="sText" class="sText">密码:</span> <input type="text"
					name="password" class="iText" />
			</div>
			<div class="row">
				<input class="submit" type="submit" value="登陆" /> <input
					type="reset" class="submit" value="取消" />
			</div>
		</form>
	</div>
	<div class="indexForm">
		<h2 class="title">RequestAware接口</h2>
		<form action="GetWebSourceThird.action" method="post">
			<div class="row">
				<span class="sText">用户名:</span> <input class="iText" type="text"
					name="username" />
			</div>
			<div class="row">
				<span class="sText" class="sText">密码:</span> <input type="text"
					name="password" class="iText" />
			</div>
			<div class="row">
				<input class="submit" type="submit" value="登陆" /> <input
					type="reset" class="submit" value="取消" />
			</div>
		</form>
	</div>

	<div class="indexForm">
		<h2 class="title">ActionContext</h2>
		<form action="GetWebSourceThird.action" method="post">
			<div class="row">
				<span class="sText">用户名:</span> <input class="iText" type="text"
					name="username" />
			</div>
			<div class="row">
				<span class="sText" class="sText">密码:</span> <input type="text"
					name="password" class="iText" />
			</div>
			<div class="row">
				<input class="submit" type="submit" value="登陆" /> <input
					type="reset" class="submit" value="取消" />
			</div>
		</form>
	</div>
	
	<div class="indexForm">
		<h2 class="title">ServletActionContext</h2>
		<form action="GetWebSourceFourth.action" method="post">
			<div class="row">
				<span class="sText">用户名:</span> <input class="iText" type="text"
					name="username" />
			</div>
			<div class="row">
				<span class="sText" class="sText">密码:</span> <input type="text"
					name="password" class="iText" />
			</div>
			<div class="row">
				<input class="submit" type="submit" value="登陆" /> <input
					type="reset" class="submit" value="取消" />
			</div>
		</form>
	</div>
</body>
</html>