<%@page import="sdust.easybuy.model.EasyBuyProductCategory"%>
<%@page import="sdust.easybuy.services.EasyBuyProductCategoryService"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="sdust.easybuy.model.EasyBuyProduct"%>
<%@page import="sdust.easybuy.services.EasyBuyProductService"%>
<%@page import="sdust.easybuy.services.EasyBuyNewsService"%>
<%@page import="sdust.easybuy.model.EasyBuyNews"%>
<%@page import="sdust.easybuy.model.EasyBuyComment"%>
<%@page import="sdust.easybuy.services.EasyBuyCommentService"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<jsp:include page="narver.jsp" flush="true" />
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>易买网 - 首页2</title>
<link type="text/css" rel="stylesheet" href="<%=basePath%>css/style.css" />
<script type="text/javascript" src="<%=basePath%>scripts/function.js"></script>
</head>
<body>
	<div id="main" class="wrap">
		<div class="lefter">
			<div class="box">
				<h2>商品分类</h2>
				<dl>
					<%
						List<EasyBuyProductCategory> ebpcs = new EasyBuyProductCategoryService()
								.getAllProductCategories();
						for(EasyBuyProductCategory ebpc1 : ebpcs){
							if(ebpc1.getEpcParentId() == 0){
					%>
							<dt><%=ebpc1.getEpcName() %>></dt>
					<%		for(EasyBuyProductCategory ebpc2 : ebpcs){ 
								if(ebpc2.getEpcParentId() == ebpc1.getEpcId()){
					 %>
								<dd><a href="product-list.html"><%=ebpc2.getEpcName() %></a></dd>
					<%		} } }%>	
					<%	} %>
				</dl>
			</div>
			<div class="spacer"></div>
			<div class="last-view">
				<h2>最近浏览</h2>
				<dl class="clearfix">
					<%
						EasyBuyProductService productService = new EasyBuyProductService();
						List<EasyBuyProduct> products = productService.getAllProducts();
						for (EasyBuyProduct product : products) {
					%>
					<dt>
						<img src=<%=basePath%><%=product.getEpFileName()%> height="55"
							width="55" />
					</dt>
					<dd>
						<a href="/easybuy/product/showView/<%=product.getEpId()%>"><%=product.getEpName()%></a>
					</dd>
					<%
						}
					%>
				</dl>
			</div>
		</div>
		<div class="main">
			<div class="price-off">
				<h2>今日特价</h2>
				<ul class="product clearfix">
					<%
						products = productService.getAllProducts();
						for (EasyBuyProduct product : products) {
					%>
					<li>
						<dl>
							<dt>
								<a href="/easybuy/product/showView/<%=product.getEpId()%>"
									target="_blank"><img src=<%=basePath%><%=product.getEpFileName()%> /></a>
							</dt>
							<dd class="title">
								<a href="/easybuy/product/showView/<%=product.getEpId()%>"
									target="_blank"><%=product.getEpName()%></a>
							</dd>
							原价:
							<dd class="beforeDiscount"><%=product.getEpPrice()%></dd>
							特价:
							<dd class="price"><%=new DecimalFormat("0.00").format(product.getEpPrice() * 0.8)%></dd>
						</dl>
					</li>
					<%
						}
					%>


				</ul>
			</div>
			<div class="side">
				<div class="news-list">
					<h4>最新公告</h4>
					<ul>
						<%
							EasyBuyCommentService commentService = new EasyBuyCommentService();
							List<EasyBuyComment> comments = commentService.getAllComments();
							for (EasyBuyComment comment : comments) {
						%>
						<li><a href="news-view.html" target="_blank"><%=comment.getEcContent()%></a></li>
						<%
							}
						%>
					</ul>
				</div>
				<div class="spacer"></div>
				<div class="news-list">
					<h4>新闻动态</h4>
					<ul>
						<c:foreach>

						</c:foreach>


						<%
							EasyBuyNewsService newsService = new EasyBuyNewsService();
							List<EasyBuyNews> newses = newsService.getTopNewses();
							for (EasyBuyNews news : newses) {
						%>
						<li><a href="news-view.html" target="_blank"><%=news.getEnTitle()%></a></li>
						<%
							}
						%>
					</ul>
				</div>
			</div>
			<div class="spacer clear"></div>
			<div class="hot">
				<h2>热卖推荐</h2>
				<ul class="product clearfix">
					<%
						products = productService.getAllProducts();
						for (EasyBuyProduct product : products) {
					%>
					<li>
						<dl>
							<dt>
								<a href="/easybuy/product/showView/<%=product.getEpId()%>"
									target="_blank"><img src=<%=basePath%><%=product.getEpFileName()%> /></a>
							</dt>
							<dd class="title">
								<a href="/easybuy/product/showView/<%=product.getEpId()%>"
									target="_blank"><%=product.getEpName()%></a>
							</dd>
							<dd class="price"><%=product.getEpPrice()%></dd>
						</dl>
					</li>
					<%
						}
					%>
				</ul>
			</div>
		</div>
		<div class="clear"></div>
	</div>
	<div id="footer">Copyright &copy; 2010 北风教育 All Rights Reserved.
		京ICP证1000001号</div>
</body>
</html>
