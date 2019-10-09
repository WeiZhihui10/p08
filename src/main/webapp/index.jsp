<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/8
  Time: 10:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <script src="js/jquery-1.8.2.min.js"></script>
</head>
<body>
<form  id="form1" action="login1">
    username:<input type="text" name="username" id="username"></br>
    password:<input type="password" name="userpwd" id="userpwd"></br>
    <input type="submit" value="login" onclick="return login()">
    <span id="msg"></span>
</form>
<script>
    function login() {
        var isLogin=false;
        var username=$("#username").val();//获取表单的输入值
        var userpwd=$("#userpwd").val();//获取表单的输入值
        var form=document.getElementById("form1");
        if(username!=null&&userpwd!=null&&username!=""&&userpwd!=""){
        $.ajax({
            type: "post",
            url: "login",
            data: {"username": username, "userpwd": userpwd},
            dataType: "json",
            success: function (data) {
                if (data.msg != undefined) {
                    $("#msg").html(data.msg);
                }
                else {
                    location.href="success.html";
                }
            }
            }
        )}else{
            isLogin=false;
            $("#msg").html("用户名密码不能为空")
        }
        return isLogin;
    }
</script>
</body>
</html>
