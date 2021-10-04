<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 23.07.2021
  Time: 18:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/add" method="post">
    <label>
      Name:
    </label>
    <input type="text" name="item_name">
    <label>
      Price:
    </label>
    <input type="text" name="item_price">
    <label>
      Amount:
    </label>
    <input type="text" name="item_amount">
    <button> ADD ITEM </button>
  </form>
  </body>
</html>
