<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE jsp PUBLIC "-//W3C//DTD jsp 4.01 Transitional//EN">
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理</title>
    <link rel="stylesheet" type="text/css" href="css/common.css"/>
    <link rel="stylesheet" type="text/css" href="css/main.css"/>
    <script type="text/javascript" src="js/libs/modernizr.min.js"></script>
</head>
<body>
<div class="topbar-wrap white">
    <div class="topbar-inner clearfix">
        <div class="topbar-logo-wrap clearfix">
            <h1 class="topbar-logo none"><a href="index.jsp" class="navbar-brand">后台管理</a></h1>
            <ul class="navbar-list clearfix">
                <li><a class="on" href="index.jsp">首页</a></li>
            </ul>
        </div>
        <div class="top-info-wrap">
            <ul class="top-info-list clearfix">
                <li><a href="#">管理员</a></li>
                <li><a href="#">修改密码</a></li>
                <li><a href="#">退出</a></li>
            </ul>
        </div>
    </div>
</div>
<div class="container clearfix">
    <div class="sidebar-wrap">
        <div class="sidebar-title">
            <h1>菜单</h1>
        </div>
        <div class="sidebar-content">
            <ul class="sidebar-list">
                <li>
                    <a href="#"><i class="icon-font">&#xe003;</i>常用操作</a>
                    <ul class="sub-menu">
                        <li><a href="yonghuguanli.jsp"><i class="icon-font">&#xe008;</i>学生信息管理</a></li>
                        <li><a href="teacher.jsp"><i class="icon-font">&#xe008;</i>教师信息管理</a></li>
                        
                      
                    </ul>
                </li>
            </ul>
        </div>
    </div>
    <!--/sidebar-->
    <div class="main-wrap">

        <div class="crumb-wrap">
            <div class="crumb-list"><i class="icon-font"></i><a href="index.jsp">首页</a><span class="crumb-step">&gt;</span><span class="crumb-name">学生信息管理</span></div>
        </div>
        <div class="search-wrap">
            <div class="search-content">
            </div>
        </div>
        <div class="result-wrap">
                <div class="result-content">
                    <table class="result-tab" width="100%">
                        <tr>
                           
                            <th>姓名</th>
                            <th>性别</th>
                            <th>年龄</th>
                             <th>生日</th>
                            <th>主修</th>
                            <th>学号</th>
                             <th>班级</th>
                         
                        </tr>
                   
                    <s:iterator value="students" status="st" var="student" >
                        <s:else>
                        <tr>
                        </s:else>
                        <td><s:property value="#student.Sname"/></td>
                        <td><s:property value="#student.Ssex"/></td>
                        <td><s:property value="#student.Sage"/></td>
                        <td><s:property value="#student.Sbirth"/></td>
                        <td><s:property value="#student.Smajor"/></td>
                        <td><s:property value="#student.Sid"/></td>
                        <td><s:property value="#student.Sclass"/></td>
                        
                          
                           
                         <td>
                               <form id="form1" name="form1" method="post" action="deleteyonghu.jsp">
      <input type="text" name="name" value="#student.Sname"  style="display:none;"/>
      <input name="fukuan" type="submit"  value="删除" style="background-color:pink; " >
      </form>
                            </td> 
                        </tr>
                   </s:iterator>
                    </table>
                    <input style= "width:100px;height:50px;color:white;background-color:#FFBBF1;" type="button" id="start_feature" value="添加学生"onclick="window.location.href='tianjiayonghu.jsp?'" />
                </div>
        </div>
    </div>
    <!--/main-->
</div>
</body>
</html>
