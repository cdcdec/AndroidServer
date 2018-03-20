/**
 * 获取终端类型
 * 
 * @returns {String}
 */
function getTerminalType() {
	var u = navigator.userAgent;
	var back = '';
	console.log(u);
	if (/(iPhone|iPad|iPod|iOS)/i.test(navigator.userAgent)) {
		back = 'IOS';
	} else if (/(Android)/i.test(navigator.userAgent)) {
		back = 'Android';
	} else {
		back = 'PC';
	}
	console.log('终端类型:' + back);
	return back;
}
/**
 * 获取XMLHttpRequest
 * 
 * @returns
 */
function getXmlHttp() {
	var xmlhttp;
	if (window.XMLHttpRequest) {
		// IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
		xmlhttp = new XMLHttpRequest();
	} else {
		// IE6, IE5 浏览器执行代码
		xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
	}
	return xmlhttp;
}


var xmlhttp;
/**
 * 
 * @param url
 */
function sendRequest(url) {
	xmlhttp=getXmlHttp();
	xmlhttp.open("GET", url, true);
	xmlhttp.setRequestHeader("Content-Type", "text/html;charset=utf-8");
	xmlhttp.onreadystatechange = processResponse;
	xmlhttp.send(null);
}
function processResponse() {
	if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
		document.write(xmlhttp.responseText);
	}
}

/**
 * 通过js添加css样式
 * 
 * @param cssPath
 */
function includeLinkStyle(cssPath) {
	var link = document.createElement('link');
	link.rel = 'stylesheet';
	link.type = 'text/css';
	link.href = cssPath;
	document.getElementsByTagName('head')[0].appendChild(link);
}

function browserRedirect() {
	var browser = getTerminalType();
	switch (browser) {
	case 'Android':
		//window.location.href重定向后,浏览器地址栏会改变
		//window.location.href = "/api/html/android_index.html";
		sendRequest("/api/html/android/android_index.html");
		break;
	case 'IOS':
		//window.location.href = "/api/html/android_index.html";
		sendRequest("/api/html/android/android_index.html");
		break;
	case 'PC':
		//window.location.href = "/api/html/pc_index.html";
		sendRequest("/api/html/pc/pc_index.html");
		break;

	}
}

browserRedirect();