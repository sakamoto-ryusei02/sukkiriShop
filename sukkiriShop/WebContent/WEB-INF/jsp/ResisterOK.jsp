<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.Account"%>
    <%
    Account newaccount = (Account) request.getAttribute("newaccount");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>スッキリ商店</title>
</head>
<body>
<p>ユーザー登録成功</p>
<p>以下内容で登録しました</p>
<p>
ユーザID：<%= newaccount.getUserId() %><br>
パスワード：<%= newaccount.getPass() %><br>
名前：<%= newaccount.getName() %><br>
年齢：<%= newaccount.getAge() %><br>
メールアドレス：<%= newaccount.getMail() %><br>
</p>
<a href="/sukkiriShop/WelcomeServlet">トップへ</a>

</body>
</html>