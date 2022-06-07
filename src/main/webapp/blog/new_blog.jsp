
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="/css/style_new_blog.css" />
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>
</head>

<body>
<div class="all">
    <div class="nav">
        <div class="nav-item">
            <a href="post.jsp"> <button type="button" class="btn btn-outline-light" ><img src="/img/logo.png"></button></a>
        </div>
        <div class="nav-item login">
            <div class="btn-group">
                <button type="button" class="btn btn-light dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                    <a style="color: #97212D">Tài Khoản</a>
                </button>
                <div class="dropdown-menu">
                    <a class="dropdown-item " href="#">Tài Khoản</a>
                    <a class="dropdown-item" href="#">Đăng Xuất</a>
                </div>
            </div>
        </div>
    </div>

    <div class="form">
        <div class="img_container">
            <img src="/img/blog.jpg" alt="Avatar" class="avatar">
        </div>
        <div class="container">
            <form action="" class="create_blog">
                <div class="form-row">
                    <div class="form-row col-md-6">
                        <label for="inputTitle">Tiêu Dề</label>
                        <input type="text" class="form-control" id="inputTitle">
                    </div>
                    <div class="form-row col-md-6">
                        <label for="inputState">Chủ Đề-Đề Tài</label>
                        <select id="inputState" class="form-control">
                            <option selected>Choose...</option>
                            <option>...</option>
                        </select>
                    </div>
                </div>
                <div class="form-group">
                    <label for="exampleFormControlTextarea1">Nội dung</label>
                    <textarea class="form-control" id="exampleFormControlTextarea1" rows="4"></textarea>
                </div>
                <div class="form-row">
                    <div class="form-group col-md-6">
                        <label for="exampleDate">Chọn ngày</label>
                        <input type="date" class="form-control" id="exampleDate">
                    </div>
                    <div class="form-group col-md-6">
                        <label for="exampleFormControlFile1">Chọn ảnh</label>
                        <input type="file" class="form-control-file" id="exampleFormControlFile1">
                    </div>
                </div>
                <button type="submit" >Đăng Blog</button>
            </form>
        </div>
    </div>
</div>

</body>
</html>
