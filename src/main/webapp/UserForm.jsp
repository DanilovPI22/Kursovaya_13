<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Калькулятор - площадь ромба test </title>
</head>
<body background = "https://img4.goodfon.ru/wallpaper/nbig/7/70/material-wallpaper-design-abstract-material-design-colors-4k.jpg">
        <p><h1 color = "white">Пользовательский аккаунт</h1>



        <label for="first" >Слово:</label>
        <input type="text" name="first" id="first" value="${first}" maxlength = "10" >
        <label for="second">Высота слова: </label>
        <input type="text" name="second" id="second" value="${second}" maxlength = "3" >
        
        <p><label>Выберите шрифт</label>
       
        </p>
        <p><select name = "shrift" id = "shrift" value = "${shrift}" class = "combo" >
        <option selected disabled value="">-</option>
        <option value="1">Без засечек</option>
    <option value="2">Прописной</option>
    <option value="3">С засечками</option>
   
   </select>
   </p>
    </body>
</html>