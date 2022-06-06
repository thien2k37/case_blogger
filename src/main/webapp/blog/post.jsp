<%--
  Created by IntelliJ IDEA.
  User: thien
  Date: 04/06/2022
  Time: 18:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="/css/style_post.css" />
    <link rel="stylesheet" href="/themify-icons/themify-icons.css" />
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>
</head>
<body>
<div class="all">
    <div class="nav">
        <div class="nav-item">
            <a href="#"> <button type="button" class="btn btn-outline-light" style="background-color: #FFFFFF"><img src="/img/logo.png"></button></a>
        </div>
        <div class="nav-item">
            <form class="form-inline my-2 my-lg-0 ">
                <input class="form-control mr-sm-2 " type="search" placeholder="Tên Blog" aria-label="Search">
                <button class="btn btn-outline-light my-2 my-sm-0 " type="submit">Tìm Kiếm</button>
            </form>
        </div>
        <div class="nav-item login">
            <div class="btn-group">
                <button type="button" class="btn btn-light dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                    Action
                </button>
                <div class="dropdown-menu">
                    <a class="dropdown-item" href="#">Action</a>
                    <a class="dropdown-item" href="#">Đăng Xuất</a>
                </div>
            </div>
        </div>
    </div>
    <div class="main">
        <div class="left">
            <div class="menu">
                <div id="create">
                    <a href="new_blog.jsp"> <button type="button" class="btn btn-outline-danger ti-pencil-alt">+ Bài Đăng Mới</button></a>
                </div>

                <div class="select-one">
                    <ul class="select">
                        <li><a class="new-blog ti-receipt"></a></li>
                        <li><a href="#"> Bài Đăng</a></li>
                    </ul>
                    <ul class="select">
                        <li><a class="new-blog ti-bar-chart"></a></li>
                        <li><a href="#"> Thống kê</a></li>
                    </ul>
                    <ul class="select">
                        <li><a class="new-blog ti-comment-alt"></a></li>
                        <li><a href="#"> Nhận xét</a></li>
                    </ul>
                    <ul class="select">
                        <li><a class="new-blog ti-money"></a></li>
                        <li><a href="#"> Thu Nhập</a></li>
                    </ul>
                    <ul class="select">
                        <li><a class="new-blog ti-list"></a></li>
                        <li><a href="#"> Chủ đề</a></li>
                    </ul>
                    <ul class="select">
                        <li><a class="new-blog ti-money"></a></li>
                        <li><a href="#"> Thu Nhập</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="mid">
            <div class="slides">
                <div id="carouselExampleCaptions" class="carousel slide" data-ride="carousel">
                    <ol class="carousel-indicators">
                        <li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
                        <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
                        <li data-target="#carouselExampleCaptions" data-slide-to="2"></li>
                    </ol>
                    <div class="carousel-inner">

                    </div>
                    <button class="carousel-control-prev" type="button" data-target="#carouselExampleCaptions" data-slide="prev">
                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                        <span class="sr-only">Previous</span>
                    </button>
                    <button class="carousel-control-next" type="button" data-target="#carouselExampleCaptions" data-slide="next">
                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                        <span class="sr-only">Next</span>
                    </button>
                </div>
            </div>
            <div class="mid-item"></div>
            <div class="mid-item"></div>
            <div class="mid-item"></div>
            <div class="mid-item"></div>
            <div class="mid-item"></div>
            <div class="mid-item"></div>
            <div class="mid-item"></div>
            <div class="mid-item"></div>
        </div>
    </div>
</div>
</body>
</html>
