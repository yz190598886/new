<%--
  Created by IntelliJ IDEA.
  User: youthz
  Date: 2018/5/6
  Time: 23:41
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link href="/static/css/style.css" rel='stylesheet' type='text/css' />
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <title>Insert title here</title>
</head>
<body>

<div class="main">
    <div class="login-form">
        <h1>Please fill in the information</h1>
        <div class="head">
            <img src="/static/images/user.png" alt=""/>
        </div>
        <form action="/register" method="post" >
            <table>
              <tr>name:<input type="text"  name="username1" /></tr>
               <tr>password:<input type="password" name="password"/></tr>

                <input type="submit"  value="save" />

            </table>
        </form>
    </div>


</div>

