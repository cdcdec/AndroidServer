<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆</title>
<script type="text/javascript" src="js/rem_adapter_size.js"></script>
<link rel="stylesheet" href="css/index.css" type="text/css">
<link rel="stylesheet" href="css/base.css" type="text/css">
</head>
<body>
	<div class="indexForm">
		<h2 class="title">表单属性驱动</h2>
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

	<div class="indexForm">
		<h2 class="title">表单模型驱动</h2>
		<form action="MLogin" method="post">
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
		<h2 class="title">表单标签驱动</h2>
		<s:form action="SLogin" method="post">
			<div class="row">
				<span class="sText">用户名:</span>
				<s:textfield class="iText" name="us.username" />
			</div>
			<div class="row">
				<span class="sText">密码:</span>
				<s:textfield name="us.password" class="iText" />
			</div>

			<div class="row">
				<s:submit class="submit" value="登陆" />
				<s:reset class="submit" value="取消" />
			</div>
		</s:form>
	</div>
	<p class="websource">
		<a class="websourceTitle" href="getWebSource.jsp">获取网络资源</a>
	</p>
	<div class="indexFormFile">
		<h2 class="title">&nbsp; 文件上传</h2>
		<form action="FileUploadAction" method="post"
			enctype="multipart/form-data">
			<div class="rowFile">
				<span class="sText">用户名:</span> 
				<input class="iText" type="text"
					name="username" />
			</div>
			<div class="rowFile">
				<span class="sText">密码:</span> 
				<input type="text"
					name="password" class="iText" />
			</div>
			<div class="rowFile">
				<span class="sTextFile">上传图片1:</span> 
				<input type="file"
					name="upload" class="iText" />
			</div>
			<div class="rowFile">
				<span class="sTextFile">上传图片2:</span> 
				<input type="file"
					name="upload" class="iText" />
			</div>
			<div class="rowFile">
				<span class="sTextFile">上传图片3:</span> 
				<input type="file"
					name="upload" class="iText" />
			</div>
			<div class="rowFile">
				<input class="submit" type="submit" value="提交" />
				<input type="reset" class="submit" value="取消" />
			</div>

		</form>
	</div>
	
	<div class="indexFormFile">
		<h2 class="title">&nbsp; 文件上传</h2>
		<form action="mobileupload" method="post"
			enctype="multipart/form-data">
			<div class="rowFile">
				<span class="sText">用户名:</span> 
				<input class="iText" type="text"
					name="username" />
			</div>
			<div class="rowFile">
				<span class="sText">密码:</span> 
				<input type="text"
					name="password" class="iText" />
			</div>
			<div class="rowFile">
				<span class="sTextFile">上传文件1:</span> 
				<input type="file"
					name="upload" class="iText" />
			</div>
			<div class="rowFile">
				<span class="sTextFile">上传文件2:</span> 
				<input type="file"
					name="upload" class="iText" />
			</div>
			<div class="rowFile">
				<span class="sTextFile">上传文件3:</span> 
				<input type="file"
					name="upload" class="iText" />
			</div>
			<div class="rowFile">
				<input class="submit" type="submit" value="提交" />
				<input type="reset" class="submit" value="取消" />
			</div>

		</form>
	</div>
</body>
</html>