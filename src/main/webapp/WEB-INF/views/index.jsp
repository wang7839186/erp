<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
   <head>
      <title>Bootstrap 101 Template</title>
      <jsp:include page="include.jsp"></jsp:include>
      <style>
	    body {
	    padding-top: 50px;
	    padding-left: 50px;
	    }
    </style>
   </head>
   <body>
      <h1>Hello, world!</h1>
      
      <table class="table table-striped">
		   <caption>条纹表格布局</caption>
		   <thead>
		      <tr>
		         <th>名称</th>
		         <th>城市</th>
		         <th>密码</th>
		      </tr>
		   </thead>
		   <tbody>
		      <tr>
		         <td>Tanmay</td>
		         <td>Bangalore</td>
		         <td>560001</td>
		      </tr>
		      <tr>
		         <td>Sachin</td>
		         <td>Mumbai</td>
		         <td>400003</td>
		      </tr>
		      <tr>
		         <td>Uma</td>
		         <td>Pune</td>
		         <td>411027</td>
		      </tr>
		   </tbody>
		</table>
		
		<!-- 标准的按钮 -->
<button type="button" class="btn btn-default">默认按钮</button>

<!-- 提供额外的视觉效果，标识一组按钮中的原始动作 -->
<button type="button" class="btn btn-primary">原始按钮</button>

<!-- 表示一个成功的或积极的动作 -->
<button type="button" class="btn btn-success">成功按钮</button>

<!-- 信息警告消息的上下文按钮 -->
<button type="button" class="btn btn-info">信息按钮</button>

<!-- 表示应谨慎采取的动作 -->
<button type="button" class="btn btn-warning">警告按钮</button>

<!-- 表示一个危险的或潜在的负面动作 -->
<button type="button" class="btn btn-danger">危险按钮</button>

<!-- 并不强调是一个按钮，看起来像一个链接，但同时保持按钮的行为 -->
<button type="button" class="btn btn-link">链接按钮</button>


<img src="images/test.png" 
   class="img-rounded">
<img src="images/test.png" 
   class="img-circle">
<img src="images/test.png" 
   class="img-thumbnail">
   
   <p>
   <button type="button" class="btn btn-default">
      <span class="glyphicon glyphicon-sort-by-attributes"></span>
   </button>
   <button type="button" class="btn btn-default">
      <span class="glyphicon glyphicon-sort-by-attributes-alt"></span>
   </button>
   <button type="button" class="btn btn-default">
      <span class="glyphicon glyphicon-sort-by-order"></span>
   </button>
   <button type="button" class="btn btn-default">
      <span class="glyphicon glyphicon-sort-by-order-alt"></span>
   </button>
</p>
<button type="button" class="btn btn-default btn-lg">
  <span class="glyphicon glyphicon-user"></span> User
</button>
<button type="button" class="btn btn-default btn-sm">
  <span class="glyphicon glyphicon-user"></span> User
</button>
<button type="button" class="btn btn-default btn-xs">
  <span class="glyphicon glyphicon-user"></span> User
</button>


<div class="navbar navbar-fixed-top navbar-inverse" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Project name</a>
        </div>
        <div class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="#"><span class="glyphicon glyphicon-home">Home</span></a></li>
            <li><a href="#shop"><span class="glyphicon glyphicon-shopping-cart">Shop</span></a></li>
            <li><a href="#support"><span class="glyphicon glyphicon-headphones">Support</span></a></li>
          </ul>
        </div><!-- /.nav-collapse -->
      </div><!-- /.container -->
    </div>

	<div class="dropdown">
   <button type="button" class="btn dropdown-toggle" id="dropdownMenu1" 
      data-toggle="dropdown">
      主题
      <span class="caret"></span>
   </button>
   <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
      <li role="presentation">
         <a role="menuitem" tabindex="-1" href="#">Java</a>
      </li>
      <li role="presentation">
         <a role="menuitem" tabindex="-1" href="#">数据挖掘</a>
      </li>
      <li role="presentation">
         <a role="menuitem" tabindex="-1" href="#">
            数据通信/网络
         </a>
      </li>
      <li role="presentation" class="divider"></li>
      <li role="presentation">
         <a role="menuitem" tabindex="-1" href="#">分离的链接</a>
      </li>
   </ul>
</div>
	
      
   </body>
</html>