<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

   <h1>当前项目列表</h1>

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
            <!--<th>Contract Amount</th>-->
            <th>简介</th>
            <!--
                <th>Feature</th>
            <th>Runing Info</th>
            <th>Develope Tools</th>
            -->
            <th>我方项目经理</th>
            <th>客户项目经理</th>
            <!--
                <th>Create Time</th>
            <th>Create Employee ID</th>
            <th>Modify Time</th>
            <th>Modify Employee ID</th>
            -->
            <th>操作</th>
          </tr>
        </thead>
        <tbody>
        <c:forEach var="xm" items="${allXm }" >
          <tr>
            <td>${xm.id } </td>
            <td>${xm.name }</td>
            <td>i.setupDate(</td>
            <td>i.finishedDate(</td>
            <td>i.belongTo(</td>
            <td>i.summary(</td>
            <td>i.leaderId(</td>
            <td>i.costumerLeaderId(</td>
            <td>
              <a href="urla(\"show\", i.id()"><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span></a>
              <a href="urla(\"edit\", i.id()"><span class="glyphicon glyphicon-edit" aria-hidden="true"></span></a>
              Remove
            </td>
          </tr>
        </c:forEach>
        </tbody>
      </table>
    </div>