<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% String contentPath = request.getContextPath() ; %>

<%-- 这里先使用jsp片段的方式，等后面菜单多的时候，可考虑再改为数据库方式 --%>

<ul class="nav nav-sidebar">
	<li class="active"><a href="<%=contentPath %>/admin/projects">项目列表 <span class="sr-only">(项目列表)</span></a></li>
	<li><a href="#">菜单1</a></li>
	<li><a href="#">菜单2</a></li>
	<li><a href="#">菜单3</a></li>
</ul>
