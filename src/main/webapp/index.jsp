<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页</title>
</head>
<body>
<h3>欢迎，${sessionScope.user.username }</h3>
<h3>新闻内容，${sessionScope.news.content}</h3>
<h3>新闻图片，<img src="${sessionScope.news.imgs}"  alt="${sessionScope.news.content}" /></h3>
</body>
</html>