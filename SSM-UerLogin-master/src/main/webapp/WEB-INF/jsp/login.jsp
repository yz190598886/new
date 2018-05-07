<%--<%@ page language="java" contentType="text/html; charset=utf-8"--%>
	<%--pageEncoding="utf-8"%>--%>
<%--<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">--%>
<%--<html>--%>
<%--<head>--%>
<%--<meta http-equiv="Content-Type" content="text/html; charset=utf-8">--%>
<%--<title>Insert title here</title>--%>
<%--</head>--%>
<%--<body>--%>

	<%--<form action="/user/checkLogin" method="post">--%>
		<%--<table>--%>
			<%--<tr>--%>
				<%--<td>用户名:</td>--%>
				<%--<td><input id="username" name="username" type="text"></td>--%>
			<%--</tr>--%>
			<%--<tr>--%>
				<%--<td>密码:</td>--%>
				<%--<td><input id="password" name="password" type="password"></td>--%>
			<%--</tr>--%>
			<%--<tr>--%>
				<%--<td><input type="submit" value="登录"></td>--%>
			<%--</tr>--%>
		<%--</table>--%>
	<%--</form>--%>
<%--</body>--%>
<%--</html>--%>

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
				<h1>Welcome !  骚年</h1>
				<div class="head">
					<img src="/static/images/user.png" alt=""/>
				</div>
				<form action="/checkLogin" method="post" >
					<table>
					<input type="text"  name="username"  />
					<input type="password" name="password"  />

					<input type="submit"  value="LOGIN" />

					<p><a href="/registration">registration</a></p>
					</table>
				</form>
			</div>

			<div class="copy-right">
				<p><br>Be it frost or ice</br>
					Your spirit runs to mine, fast or slow</p>
			</div>

		</div>


	</body>
</html>