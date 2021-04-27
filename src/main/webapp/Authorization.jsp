<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <style type="text/css">
    body{
	background: #F5F5DC;
}
   .blok-center {
    width: 500px; 
    height: auto;
    margin: auto; 
  
   background: #FFE4C4;
    padding: 10px; 
   }
   .text{
   color: #000000;
   }
  
    </style>
        <title>login form</title>
    </head>
    <body>
    <div class="blok-center">
        <form method="post" action="login">
        <br>Логин   :<input type="text" name="email" required maxlenth = 16 /><br/>
        <br>Пароль:<input type="text" name="pass" required maxlenth = 16 /><br/>
        <p><input type="submit" value="Войти" /></p>
        </form>
        </div>
    </body>
    


</html>