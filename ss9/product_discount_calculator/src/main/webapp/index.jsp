<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<fieldset>
    <legend>
        Product Discount Calculator
    </legend>
    <form action="/display-discount" method="post">
        <input type="text" name="name-product" value="Product Description" placeholder="Product Description">
        <input type="number" name="price" value="0" placeholder="Price">
        <input type="number" name="discountPercent" value="0" placeholder="%">
        <input type="submit" value="Result">
    </form>
</fieldset>
</body>
</html>