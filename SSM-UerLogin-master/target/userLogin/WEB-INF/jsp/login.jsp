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
<script type="text/javascript">
    function checkIP(){//js表单验证方法
        var text1=document.getElementById("username").value;//通过id获取需要验证的表单元素的值
        var text2=document.getElementById("password").value;
        if(text1==""||text2==""){//当上面获取的值为空时
            alert("不能为空哦！");//弹出提示
			return false;
        }
        else{
            document.forms[0].submit();
		}
    }
</script>
<body>

		<div class="main">
			<div class="login-form">
				<h1>Welcome !  骚年</h1>
				<div class="head">
					<img src="/static/images/user.png" alt=""/>
				</div>

				<form  method="post"  action="/checkLogin">
					<table>
					<input id="username" type="text"  name="username"  />
					<input id="password" type="password" name="password"  />

					<input type="button"  value="LOGIN" onclick="checkIP()"/>

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