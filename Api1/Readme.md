# Android Server Api1

### 文件和参数上传

api/mobileupload

```txt
上传文件及参数，并返回json数据.
访问:http://ip/api/mobileupload
post:username===>cdc,password===>123,upload==>1.jpg,2.png
返回:{"username":"cdc","password":"123","files":["1.jpg","2.png"]}

```

### 获取json数据

```txt
接口:http://ip/api/getJson1
返回数据:{"JSONResult":"success","data":{"data_id":"123","data_imgpath":"skko","data_level":"jsjko","data_name":"hjjk"}}


接口:http://ip/api/getJson2,
返回数据:{"data":{"data_id":"123","data_imgpath":"skko","data_level":"jsjko","data_name":"hjjk"}}

```

### 上传json数据,并返回json数据

```txt
接口:http://ip/api/json/action,post--->json数据
返回:上传的json数据

```

### get或post上传

```txt
接口:http://ip/api/simple,
返回:{"username":"aaron","password":"aaronno"}

接口:http://ip/api/simple?p1=eee&p2=3345,
返回:{"username":"eee","password":"3345"}


接口:http://ip/api/simple,
post:p1=eee,p2=3345,
返回:{"username":"eee","password":"3345"}


```