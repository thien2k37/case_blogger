<%--
  Created by IntelliJ IDEA.
  User: thien
  Date: 05/06/2022
  Time: 10:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/css/style_manage_blogger.css" />
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>
</head>
<body>
<div id="main">
    <div id="header">
        <ul id="nav">
            <li>
                <div class="nav-item">
                    <a href="#"> <button type="button" class="btn btn-outline-light"><img src="/img/logo.png"></button></a>
                </div>
            </li>
            <li><a href="">Người dùng</a></li>
            <li><a href="">Lượt Xem</a></li>
            <li>
                <a href="#">Chủ đề</a>
                <ul class="sub_nav">
                    <li><a>Cuộc sống</a></li>
                    <li><a>Lập-Trình</a></li>
                    <li><a>...</a></li>
                </ul>
            </li>
        </ul>
        <div id="nav_search">
            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="search" placeholder="Nhập tiêu đề" aria-label="Search">
                <button class="btn btn-outline-light my-2 my-sm-0" type="submit">Tìm kiếm</button>
            </form>
        </div>
    </div>
    <div id="slider">

    </div>
</div>
</body>
</html>