<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'narver.jsp' starting page</title>
    <%--
    <link type="text/css" rel="stylesheet" href="<%=basePath %>css/style.css" />
    <script type="text/javascript" src="<%=basePath %>scripts/function.js"></script>
     --%>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <div id="header" class="wrap">
	  <div id="logo">
		<img src="<%=basePath %>images/logo.gif" />
	  </div>
	  <div class="help">
		<a href="#" class="shopping">购物车</a>
		<a href="/easybuy/index/enterLogin">登录</a>
		<a href="register.html">注册</a>
		<a href="guestbook.html">留言</a>
	  </div>
	  <div class="navbar">
		<ul class="clearfix">
		  <li class="current"><a href="#">首页</a></li>
		  <li><a href="#">图书</a></li>
		  <li><a href="#">百货</a></li>
		  <li><a href="#">品牌</a></li>
		  <li><a href="#">促销</a></li>
		</ul>
	  </div>
	</div>
	<div id="childNav">
	  <div class="wrap">
		<ul class="clearfix">
		  <li class="first"><a href="#">音乐</a></li>
		  <li><a href="#">电影</a></li>
		  <li><a href="#">少儿</a></li>
		  <li><a href="#">动漫</a></li>
		  <li><a href="#">小说</a></li>
		  <li><a href="#">外语</a></li>
		  <li><a href="#">数码相机</a></li>
	 	  <li><a href="#">笔记本</a></li>
		  <li><a href="#">羽绒服</a></li>
		  <li><a href="#">秋冬靴</a></li>
		  <li><a href="#">运动鞋</a></li>
		  <li><a href="#">美容护肤</a></li>
		  <li><a href="#">家纺用品</a></li>
		  <li><a href="#">婴幼奶粉</a></li>
		  <li><a href="#">饰品</a></li>
		  <li class="last"><a href="#">Investor Relations</a></li>
		</ul>
	  </div>
	</div>
  </body>
</html>
