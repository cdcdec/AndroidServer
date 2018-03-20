<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta content="telephone=no" name="format-detection"/>
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0" />
<script type="text/javascript" src="../js/rem750_640.js"></script>
<link rel="stylesheet" href="../css/base.css" type="text/css">
<link rel="stylesheet" href="../css/fileUpload.css" type="text/css">
<title>表单属性驱动</title>
</head>
<body>
	<div class="box">
		<span class="title">&nbsp; 文件上传</span>
		<form action="../FileUploadAction" method="post"
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
</body>
</html>