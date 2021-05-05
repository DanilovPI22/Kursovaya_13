<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <style type="text/css">
    

   .blok-center {
    width: 500px; 
    height: auto;
    margin: auto; 
  
   background: #c8cbcc;
    padding: 10px; 
    border-radius: 5px;
   }
   .text{
   color: #000000;
   font-family: serif;
   }

.button8 {

  display: inline-block;
  color: #785959;
  font-weight: 700;
  text-decoration: none;
  user-select: none;
  padding: .5em 2em;
  outline: none;
  border: 2px solid;
  border-radius: 1px;
  transition: 0.2s;
} 
.button8:hover { background: rgba(255,255,255,.2); box-shadow: 0 2px 0 #006599;
  transform: translateY(-3px);}
.button8:active { background: white; }
    
  
    </style>
        <title>login form</title>
    </head>
    <body background = "https://img4.goodfon.ru/wallpaper/nbig/7/70/material-wallpaper-design-abstract-material-design-colors-4k.jpg">
    <div class="blok-center">
        <form method="post" action="login">
        <br>Логин   :<input type="text" name="email" required maxlenth = 16 /><br/>
        <br>Пароль:<input type="text" name="pass" required maxlenth = 16 /><br/>
        <p><input class = "button8" type="submit" value="Войти" /></p>
        </form>
        </div>
    </body>
    


</html>