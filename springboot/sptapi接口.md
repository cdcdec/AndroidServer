# 接口

1. http://ip:端口/sptapi/person/id或http://ip:端口/sptapi/id/person

  或者http://ip:端口/sptapi/person 


  id>4或id<=0或者没有id,返回结果一样；id=1,4之间,返回结果不一样。

   get或post请求

``` 
例1
{
        "id": 0,
        "name": "张飞",
        "age": 1850,
        "bodyWeight": 180.19,
        "height": 180.5,
        "gender": true,
        "contacts": {
            "qq": "00000",
            "phone": "13000000000",
            "wechat": "00001",
            "email": "00000@qq.com"
        },
        "address": {
            "origin": "幽州涿郡",
            "account": "河北涿州",
            "currentAddress": "四川阆中"
        },
        "career": "军人",
        "education": "HighSchool",
        "birthdate": "0167-08-05",
        "hobbies": [
            "武术",
            "军事",
            "美食",
            "旅游"
        ],
        "currentdate": "2018-04-10 12:37:27",
        "annexs": [
            "https://cdcdec.github.io/images/thumbnail_0.jpg",
            "https://cdcdec.github.io/images/thumbnail_1.jpg",
            "https://cdcdec.github.io/images/thumbnail_2.jpg"
        ]
    }
```

2. http://ip:端口/sptapi/origin?id=90   get或post请求

   ```
   与例1一样

   ```

3. http:ip:端口号/sptapi/persons,返回person列表

   ```
   //例2
   [
       {
           "id": 0,
           "name": "张飞",
           "age": 1850,
           "bodyWeight": 180.19,
           "height": 180.5,
           "gender": true,
           "contacts": {
               "qq": "00000",
               "phone": "13000000000",
               "wechat": "00001",
               "email": "00000@qq.com"
           },
           "address": {
               "origin": "幽州涿郡",
               "account": "河北涿州",
               "currentAddress": "四川阆中"
           },
           "career": "军人",
           "education": "HighSchool",
           "birthdate": "0167-08-05",
           "hobbies": [
               "武术",
               "军事",
               "美食",
               "旅游"
           ],
           "currentdate": "2018-04-10 14:50:28",
           "annexs": [
               "https://cdcdec.github.io/images/thumbnail_0.jpg",
               "https://cdcdec.github.io/images/thumbnail_1.jpg",
               "https://cdcdec.github.io/images/thumbnail_2.jpg"
           ]
       },
       {
           "id": 1,
           "name": "马云",
           "age": 53,
           "bodyWeight": 180.19,
           "height": 180.5,
           "gender": true,
           "contacts": {
               "qq": "10000",
               "phone": "13010101010",
               "wechat": "10001",
               "email": "10000@qq.com"
           },
           "address": {
               "origin": "浙江省绍兴嵊州市(原嵊县)谷来镇",
               "account": "浙江省杭州市",
               "currentAddress": "浙江省杭州市"
           },
           "career": "商人",
           "education": "University",
           "birthdate": "1964-11-15",
           "hobbies": [
               "演讲",
               "表演",
               "演讲",
               "聊天"
           ],
           "currentdate": "2018-04-10 14:50:28",
           "annexs": [
               "https://cdcdec.github.io/images/1024_1.jpg",
               "https://cdcdec.github.io/images/1024_2.jpg",
               "https://cdcdec.github.io/images/1024_3.jpg"
           ]
       },
       {
           "id": 2,
           "name": "马化腾",
           "age": 46,
           "bodyWeight": 180.19,
           "height": 180.5,
           "gender": true,
           "contacts": {
               "qq": "20000",
               "phone": "13020202020",
               "wechat": "20001",
               "email": "20000@qq.com"
           },
           "address": {
               "origin": "广东潮阳县(现汕头市潮南区)",
               "account": "海南岛东方市八所港",
               "currentAddress": "广东深圳"
           },
           "career": "商人",
           "education": "University",
           "birthdate": "1971-11-29",
           "hobbies": [],
           "currentdate": "2018-04-10 14:50:28",
           "annexs": [
               "https://cdcdec.github.io/images/1024_4.jpg",
               "https://cdcdec.github.io/images/1024_5.jpg",
               "https://cdcdec.github.io/images/1024_6.jpg"
           ]
       },
       {
           "id": 3,
           "name": "刘强东",
           "age": 44,
           "bodyWeight": 180.19,
           "height": 180.5,
           "gender": true,
           "contacts": {
               "qq": "30000",
               "phone": "13030303030",
               "wechat": "30001",
               "email": "30000@qq.com"
           },
           "address": {
               "origin": "湖南湘潭县",
               "account": "江苏省宿迁市",
               "currentAddress": "北京朝阳"
           },
           "career": "商人",
           "education": "University",
           "birthdate": "1974-03-14",
           "hobbies": [
               "演讲",
               "旅游"
           ],
           "currentdate": "2018-04-10 14:50:28",
           "annexs": [
               "https://cdcdec.github.io/images/sketch_eyes.jpg",
               "https://cdcdec.github.io/images/sketch_greetwal_high.jpg",
               "https://cdcdec.github.io/images/sketch_tree2_normal.jpg",
               "https://cdcdec.github.io/images/sketch_tree_immediate.jpg"
           ]
       },
       {
           "id": 4,
           "name": "董明珠",
           "age": 63,
           "bodyWeight": 160.19,
           "height": 53,
           "gender": true,
           "contacts": {
               "qq": "40000",
               "phone": "13040404040",
               "wechat": "40001",
               "email": "40000@qq.com"
           },
           "address": {
               "origin": "江苏省南京市",
               "account": "江苏省南京市",
               "currentAddress": "广东珠海"
           },
           "career": "商人",
           "education": "University",
           "birthdate": "1954-09-01",
           "hobbies": [
               "演讲",
               "旅游"
           ],
           "currentdate": "2018-04-10 14:50:28",
           "annexs": [
               "https://cdcdec.github.io/images/i750_1.jpg",
               "https://cdcdec.github.io/images/i750_2.jpg",
               "https://cdcdec.github.io/images/i750_3.jpg"
           ]
       }
   ]
   ```

   4. http:ip:端口号/sptapi/upPerson   post方式

      上传例1所示的json数据并返回

   5. http:ip:端口号/sptapi/upload   post方式  单文件(键名:file)和两个参数(键名:name,键名:id)上传

      ```
      上传的文件保存位置：e:/sptapi/upload
      {
          "annexs": [
              "feature_part_container_bg0_48a55610-7e8a-45fe-a0df-c8efbdbbab0f.png"
          ], 
          "name": "张飞257", 
          "id": 3099, 
          "result": "SUCCESS"
      }
      ```

      ​

   6. http:ip:端口号/sptapi/uploads   post方式  多文件(键名:file)和两个参数(键名:name,键名:id)上传

      ```
      上传的文件保存位置：e:/sptapi/upload
      {
          "annexs": [
              "feature_part_container_bg0_c9cdc8a1-df3d-4c56-9893-f190ec4e0674.png", 
              "feature_lv_349c19d7-0935-4a7c-bad6-6b19a0e9538b.png", 
              "feature_arrow_up_a711947e-cc7b-4430-a9b6-7f333eed31be.png", 
              "feature_dot_6a952c41-4758-4d8b-a934-136681961a05.png"
          ], 
          "name": "张飞2578", 
          "id": 30999, 
          "result": "SUCCESS"
      }
      ```

      ​