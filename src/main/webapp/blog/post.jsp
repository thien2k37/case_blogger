<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            <div class="row mt-2">
                <div class="col-9">
                    <table class="table table-dark" style="text-align: center">
                        <thead>
                        <tr>
                            <th scope="col">STT</th>
                            <th scope="col">Tiêu Đề</th>
                            <th scope="col">View</th>
                            <th scope="col">Ngày Đăng</th>
                            <th scope="col">#</th>
                        </tr>
                        </thead>
                        <body>
                        <c:forEach var="c" items="${listPost}">
                            <tr style="text-align: center">
                                <td>${c.id}</td>
                                <td>${c.title}</td>
                                <td>${c.view}</td>
                                <td>${c.date}</td>
                                <td>
                                    <a class="btn btn-secondary" href="/posts?action=edit_blog&id=${c.id}">Sửa</a>
                                    <a class="btn btn-secondary" href="/posts?action=edit_blog&id=${c.id}">Xem</a>
                                    <form action="/posts" id="delete${c.id}" style="display: inline">
                                        <input type="hidden" name="action" value="delete">
                                        <input type="hidden" name="id" value="${c.id}">
                                        <a class="btn btn-danger" onclick="xacNhanDelete(${c.id})">Xóa</a>
                                    </form>
                                </td>
                            </tr>
                        </c:forEach>
                        </body>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
<script>
    function xacNhanDelete(id) {
        if (confirm("Bạn có chắc muốn xoá?")) {
            document.getElementById("delete"+id).submit();
        }
    }
</script>
</body>
</html>
