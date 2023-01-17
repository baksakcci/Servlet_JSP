<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>notice register</title>
</head>
<body>
    <form action="/noticeReg" method="post">
        <label>제목 : </label>
        <input name="title" type="text"/>
        <label>내용 : </label>
        <textarea name="content"></textarea>
        <input value="register" type="submit"/>
    </form>
</body>
</html>
