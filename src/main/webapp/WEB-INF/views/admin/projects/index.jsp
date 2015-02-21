<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>

   <h1 class="page-header">当前项目列表</h1>

    <a href="#">新增项目</a>
    <br />
    <div class="ui-table-container">
      <table class="ui-table">
        <thead>
          <tr>
            <th>ID</th>
            <th>项目名称</th>
            <th>立项日期</th>
            <th>结束日期</th>
            <th>客户名称</th>
            <th>负责人</th>
            <th>甲方负责人</th>
            <th>操作</th>
          </tr>
        </thead>
        <tbody>
        <c:forEach var="xm" items="${allXm }" >
          <tr>
            <td>${xm.id } </td>
            <td>${xm.name }</td>
            <td><fmt:formatDate value="${xm.lxrq }" pattern="yyyy年MM月dd日" /></td>
            <td><fmt:formatDate value="${xm.wcrq }" pattern="yyyy年MM月dd日" /></td>
            <td>${xm.sskhxx.name }</td>
            <td>${xm.fzrxx.name }</td>
            <td>${xm.jffzr.name }</td>
            <td>
              <a href="<c:url value="/admin/projects/${xm.id }" />"><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span>View</a> 
              <a href="<c:url value="/admin/projects/${xm.id }" />"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span>Del</a>
            </td>
          </tr>
        </c:forEach>
        </tbody>
      </table>
    </div>