<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="style3.css" rel="stylesheet" type="text/css">


  <script >
    function adm() {

	   // Получаем значение выбранного поля
	   var selected = adm2.value;
	  adm2.options[adm2.selectedIndex].setAttribute("selected", "selected");
	   // Получаем элемент, в котором будем менять шрифт.
	   var change = document.getElementsByClassName('select');

	   // Меняем шрифт на полученный из поля select
	   change[0].style.fontFamily = selected;
	   change[1].style.fontFamily = selected;
	   change[2].style.fontFamily = selected;
	   change[3].style.fontFamily = selected;
	   change[4].style.fontFamily = selected;
	 }
   </script>

  <script>
function change()
{
var id=0;
block_id='block_'+id;
s=document.getElementById('svet');
d=s.options[s.selectedIndex].text;;
next='block_'+d;
a=document.getElementById(next).innerHTML;
//b=document.getElementById(block_id).innerHTML;
document.getElementById(block_id).innerHTML='<div id="'+block_id+'">'+a+'</div>';
//document.getElementById(next).innerHTML='<div id="'+next+'">'+b+'</div>';
}
</script>

  <script>
function change1()
{
var id=0;
block_id='block1_'+id;
s=document.getElementById('svet1');
d=s.options[s.selectedIndex].text;;
next='block1_'+d;
a=document.getElementById(next).innerHTML;
//b=document.getElementById(block_id).innerHTML;
document.getElementById(block_id).innerHTML='<div id="'+block_id+'">'+a+'</div>';
//document.getElementById(next).innerHTML='<div id="'+next+'">'+b+'</div>';
}
</script>

  <script>
function change2()
{
var id=0;
block_id='block2_'+id;
s=document.getElementById('svet2');
d=s.options[s.selectedIndex].text;;
next='block2_'+d;
a=document.getElementById(next).innerHTML;
//b=document.getElementById(block_id).innerHTML;
document.getElementById(block_id).innerHTML='<div id="'+block_id+'">'+a+'</div>';
//document.getElementById(next).innerHTML='<div id="'+next+'">'+b+'</div>';
}
</script>
</head>
<body background = "https://img4.goodfon.ru/wallpaper/nbig/7/70/material-wallpaper-design-abstract-material-design-colors-4k.jpg">
<form align="center" action="calc" method="post">
<p><div class="tabs">
    <input type="radio" name="tab" value="ObBukvy"  id="tab_1" checked >
    <label for="tab_1">Объёмные буквы</label>

    <input type="radio" name="tab" value="Lightbox"  id="tab_2">
    <label for="tab_2">Лайтбоксы</label>

    <input type="radio" name="tab" value="Vyvesky"  id="tab_3">
    <label for="tab_3">Вывески</label>
    
    <input type="radio" name="tab" value="" id="tab_4">
    <label for="tab_4">Разработчики</label>
   

    <div id="txt_1">
    
        <p><h1 class="select">Пользовательский аккаунт</h1><p><img src="images/bukv.jpg" width="10%" height="2%" align="top"></p>



        <label for="first">Слово:</label>
        <input pattern=^[А-Яа-яЁё]+$  title="Возможен ввод только русскоязычных слов, без использования цифр. Пробелы ставить запрещено" type="text" name="first" id="first" value="${first}" maxlength = "10" >
        <label for="second">Высота слова: </label>
        <input title = "Возможно использование только числовых значений" type="text" pattern=^[0-9]+$ name="second" id="second" value="${second}" maxlength = "3" max = "200">
        
        <p><label>Выберите шрифт</label>
       
        </p>
        <p><select name = "shrift" id = "shrift" value = "${shrift}" class = "combo" >
        <option selected disabled value="">-</option>
        <option value="1">Без засечек</option>
    <option value="2">Прописной</option>
    <option value="3">С засечками</option>
   
   </select>
   </p>
   <p><label>Выберите вид букв</label></p>
<select name="svet" class="form-select" id="svet" onchange="change()" value = "${svet }" >
                <option selected disabled value=""><a href="#" >-</a></option>
                <option value="1"><a href="#">Световые</a></option>
                <option value="2"><a href="#">Не световые</a></option>
</select>



<div id="block_0"></div>
<div id="block_Световые" style="visibility: hidden;">
<p><label>Выберите вид освещения</label></p>
   <p><select name = "osv" id = "osv" value = "${osv}" class = "combo" >
   <option selected disabled value="">-</option>
        <option value="1">Контражурная подсветка</option>
    <option value="2">Открытый диод</option>
    
    </select>
   
   </p>
   <p><label>Выберите мощность диодов</label></p>
   <p><select name = "diod" id = "diod" value = "${diod}" class = "combo" >
   <option selected disabled value="">-</option>
        <option value="1">3 Вт</option>
    <option value="2">5 Вт</option>
    
    </select>
   
   </p>
</div>
<div id="block_Не световые" style="visibility: hidden;">

</div>
  <p> <label for="itog">Промокод: </label> </p>
        <p><input type="text" name="promo" id="promo" value="${promo}" ></p>



  <p> <label for="itog">Итог: </label> </p>
        <p><input type="text" name="itog" id="itog" value="${itog}" disabled ></p>
  
    <input class = "button8" type="submit" name="sign" value="Рассчитать">
<p><a class = "button8" href="Authorization.jsp">Авторизация</a></p>
     </div>   
     
  

<div id = "txt_2">
<p><h1 class="select">Пользовательский аккаунт</h1><p><img src="images/light.jpg" width="10%" height="2%" align="top"></p>


        <label for="first">Высота лайтбокса:</label>
        <input title = "Возможно использование только числовых значений" type="text" pattern=^[0-9]+$ name="first1" id="first1" value="${first1}" maxlength = "10" max = "200">
        <label for="second">Ширина лайтбокса: </label>
        <input title = "Возможно использование только числовых значений" type="text" pattern=^[0-9]+$ name="second1" id="second1" value="${second1}" maxlength = "3" max = "200">
        
        <p><label>Выберите вид лайтбокса</label>
       
        </p>
        <p><select name = "typelb" id = "typelb" value = "${typelb}" class = "combo" >
        <option selected disabled value="">-</option>
        <option value="1">Алюминиевый профиль + поликарбонат</option>
    <option value="2">ПВХ профиль + акрил</option>
    <option value="3">Цельноклееный</option>
    <option value="4">Подвесной двухсторонний</option>
    <option value="5">Для сменной информации</option>
    <option value="6">Сложной формы</option>
   </select>
   </p>
   <p><label>Выберите тип освещения</label></p>
<select name="svet1" class="form-select" id="svet1" onchange="change1()" value = "${svet1 }" >
                <option selected disabled value=""><a href="#" >-</a></option>
                <option value="1"><a href="#">Диоды</a></option>
                <option value="2"><a href="#">Лампы</a></option>
</select>
<div id="block1_0">
</div>
<div id="block1_Диоды" style="visibility: hidden;">
<p><label>Выберите мощность диодов</label></p>
   <p><select name = "diod1" id = "diod1" value = "${diod1}" class = "combo" >
   <option selected disabled value="">-</option>
        <option value="1">8-10 Вт</option>
    <option value="2">10-12 Вт</option>
    
    </select>
   
   
</div>
<div id="block1_Лампы" style="visibility: hidden;">
</p>
   <p><label>Выберите мощность ламп</label></p>
   <p><select name = "lamp" id = "lamp" value = "${lamp}" class = "combo" >
   <option selected disabled value="">-</option>
        <option value="1">3 Вт</option>
    <option value="2">5 Вт</option>
    
    </select>
   
   </p>
</div>
  <p> <label for="itog">Промокод: </label> </p>
        <p><input type="text" name="promo" id="promo" value="${promo}" ></p>



  <p> <label for="itog">Итог: </label> </p>
        <p><input type="text" name="itog" id="itog" value="${itog}" disabled ></p>
  <input class = "button8" type="submit" name="sign" value="Рассчитать">
<p><a class = "button8" href="Authorization.jsp">Авторизация</a></p>
    
</div>
<div id = "txt_3">
<p><h1 class="select">Пользовательский аккаунт</h1><p><img src="images/vyveska.jpg" width="10%" height="2%" align="top"></p>


        <label for="first">Высота вывески:</label>
        <input title = "Возможно использование только числовых значений" type="text" pattern=^[0-9]+$ name="first2" id="first2" value="${first2}" maxlength = "10" max = "200">
        <label for="second">Ширина вывески: </label>
        <input title = "Возможно использование только числовых значений" type="text" pattern=^[0-9]+$ name="second2" id="second2" value="${second2}" maxlength = "3" max = "200">
       
        <p><label>Выберите материал вывески</label></p>    
       
        <p><select name = "typevyv" id = "typevyv" value = "${typevyv}" class = "combo" >
        <option selected disabled value="">-</option>
        <option value="1">ПВХ</option>
    <option value="2">Композит</option>
    <option value="3">Акрилл</option>
   
   </select>
   </p>
    <p><label>Выберите толщину вывески</label></p>  
        <p><select name = "mm" id = "mm" value = "${mm}" class = "combo" >
        <option selected disabled value="">-</option>
        <option value="1">3 мм</option>
    <option value="2">5 мм</option>
    <option value="3">7 мм</option>
   
   </select>
   </p>
   <p><label>Дополнительные услуги</label></p> 
   <p><input type="checkbox" name="option1" value="a1" >Заламинировать<Br></p>
   <p><input type="checkbox" name="option2" value="a2" >Светоотражающая пленка<Br></p> 
     <p> <label for="itog">Промокод: </label> </p>
        <p><input type="text" name="promo" id="promo" value="${promo}" ></p>
   


  <p> <label for="itog">Итог: </label> </p>
        <p><input type="text" name="itog" id="itog" value="${itog}" disabled ></p>
   <input class = "button8" type="submit" name="sign" value="Рассчитать">
<p><a class = "button8" href="Authorization.jsp">Авторизация</a></p>
   
</div>
<div id = "txt_4">
<p><h1 class = "select">Разработчики</h1>
<p><label>Шамуратов Д.Д</label></p>
<p><label>Данилов В.А</label></p>
<p><label>Колесова В.Ю</label></p>
<p><label>Юсупова Э.А</label></p>
<p><a class = "button8" href="Authorization.jsp">Авторизация</a></p>
</div>
</div>


 
</form>


    <form method="post" align="center" action="serv" target="_blank">
    <input  type="submit" name="download" value="Скачать pdf">
    </form>

<input class="el1" type="button" id="1" value="Опробовать шрифт" onclick="adm()"/>
<script>
window.onload = function() {
	var button = document.getElementById('1');
	   button.click();
	};
	
</script>
   
        <p><select class="el1" name = "adm2" id = "adm2" onchange="localStorage.adm2=this.selectedIndex"  value = "${adm2}" class = "combo" disabled >
        <option  disabled value="">-</option>
        <option value="1" ${adm1 eq '1' ? 'selected' : ''}>Times New Roman</option>
    <option value="comic sans ms" ${adm1 eq 'comic sans ms' ? 'selected' : ''}>comic sans ms</option>
    <option value="sans-serif" ${adm1 eq 'sans-serif' ? 'selected' : ''}>sans-serif</option>
   
   </select>

<script>

//восстанавливаем запомненное значение, если есть

if(localStorage.adm1!==undefined) adm2.selectedIndex = localStorage.adm1;

</script>

</body>
</html>