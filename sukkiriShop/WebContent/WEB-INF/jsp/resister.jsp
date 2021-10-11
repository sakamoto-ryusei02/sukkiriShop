<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>スッキリ商店</title>
</head>
<style>
div input{margin-left:30px;}
.button{margin:15px;}
form ,h2{text-align:center;}
</style>
<body>
<h2>ユーザー登録</h2>
<form action="/sukkiriShop/ResisterServlet" method="post" accept-charset="UTF-8">
	<div>ユーザーID:<input type="text" name="userId"></div><br>
	<div>氏名:<input type="text" name="name"></div><br>
	<div>年齢:<input type="text" name="age"></div><br>
	<div>パスワード:<input type="password" name="pass"></div><br>
	<div>パスワード再確認:<input type="password" name="pass"></div><br>
	<div>メールアドレス:<input type="text" name="mail"></div><br>
	<div class="button"><input type="submit" value="登録"></div>
</form>
<a href="/sukkiriShop/WelcomeServlet">トップへ</a>

</body>
</html>