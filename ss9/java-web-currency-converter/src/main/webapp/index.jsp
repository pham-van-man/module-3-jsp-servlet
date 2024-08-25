<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Currency Converter</title>
</head>
<body>
<h2>Currency Converter</h2>
<form action="/convert" method="post">
    <label for="rate">Rate:</label>
    <input type="text" id="rate" name="rate" placeholder="RATE" value="22000"/>
    <label for="usd">USD:</label>
    <input type="text" id="usd" name="usd" placeholder="USD" value="0"/>
    <input type="submit" id="submit" value="Converter"/>
</form>
</body>
</html>