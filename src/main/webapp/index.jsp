<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Manchester United</title>
    <link rel="stylesheet" href="css/style.css" />
    <script src="https://kit.fontawesome.com/71a0cc919a.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>
</head>
<body>

<section  class="main-content">
    <header class="header">
        <div class="control">
            <div class="nav-item">
                <a href="#"> <button type="button" class="btn btn-outline-light" ><img src="/img/logo.png"></button></a>
            </div>
            <div class="nav-bar">
                <a href="#home0" class="nav-items" style="color: #FFFFFF">Giới thiệu</a>
                <a href="#home1" class="nav-items" style="color: #FFFFFF">Blog hot</a>
                <a href="#home2" class="nav-items" style="color: #FFFFFF">BLOG VỀ LẬP TRÌNH</a>
            </div>
        </div>
        <div class="option">
            <select name="language" id="">
                <option value="lang">Ngôn Ngữ</option>
                <option value="lang">Tiếng Việt</option>
                <option value="lang">Tiếng Anh</option>
            </select>
            <div class="sign">
                <a href="/login" class="sign-items" style="color: #FFFFFF">Đăng Nhập</a>
            </div>
        </div>
    </header>

    <div id="carouselExampleCaptions" class="carousel slide" data-ride="carousel">
        <main id="home1">
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="https://www.salesforce.com/content/dam/blogs/ca/Blog%20Posts/The-Purpose-and-Goals-of-Your-Blog-opengraph-.png" class="d-block w-100" class="d-block w-100" alt="...">
                    <div class="carousel-caption d-none d-md-block">
                        <h5 style="color: #97212D">Lưu giữ kỷ niệm của bạn</h5>
                        <p style="color: #97212D">Lưu các khoảnh khắc quan trọng. Blogger cho phép bạn lưu trữ an toàn hàng nghìn bài đăng, ảnh và nhiều nội dung khác qua Google.</p>
                    </div>
                </div>
                <div class="carousel-item">
                    <img src="https://www.salesforce.com/content/dam/blogs/ca/Blog%20Posts/anatomy-of-a-blog-post-deconstructed-open-graph.jpg" class="d-block w-100" class="d-block w-100" alt="...">
                    <div class="carousel-caption d-none d-md-block" >
                        <h5 style="color: #97212D">Tham gia cùng hàng triệu người dùng khác</h5>
                        <p style="color: #97212D">Dù bạn chia sẻ chuyên môn của mình, tin nổi bật hoặc một ý tưởng bạn nghĩ ra, bạn luôn có người đồng hành trên Blogger. Đăng ký để khám phá lý do tại sao hàng triệu người đăng nội dung thể hiện niềm đam mê của mình ở đây.</p>
                    </div>
                </div>
                <div class="carousel-item">
                    <img src="https://www.blogger.com/about/img/social/facebook-1200x630.jpg" class="d-block w-100" alt="...">
                    <div class="carousel-caption d-none d-md-block">
                        <h5 style="color: #97212D">Chọn thiết kế hoàn hảo</h5>
                        <p style="color: #97212D">Tạo blog tuyệt đẹp phù hợp với phong cách của bạn. Chọn trong một tuyển tập gồm các mẫu dễ sử dụng – tất cả đều có bố cục linh hoạt và hàng trăm hình nền – hoặc thiết kế điều gì đó mới lạ.

                        </p>
                    </div>
                </div>
            </div>
            <button class="carousel-control-prev" type="button" data-target="#carouselExampleCaptions" data-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-target="#carouselExampleCaptions" data-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </button>
        </main>
    </div>
    <div class="view-content">
        <main id="home0">
            <div class="card text-center">
                <div class="card-header">
                    <ul class="nav nav-tabs card-header-tabs">
                        <li class="nav-item">
                            <a class="nav-link active" href="#">Active</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">link</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link disabled">mor</a>
                        </li>
                    </ul>
                </div>
                <div class="card-group">
                    <div class="card">
                        <img src="..." class="card-img-top" alt="...">
                        <div class="card-body">
                            <h5 class="card-title">TOP BLOG TRENDING1</h5>
                            <p class="card-text">NỘI DUNG BẢNG 1</p>
                            <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
                        </div>
                    </div>
                    <div class="card">view_number
                        <img src="(img/7.png)" class="card-img-top" alt="...">
                        <div class="card-body">
                            <h5 class="card-title"  >TOP BLOG TRENDING2</h5>
                            <p class="card-text">
                                <h1> test ở dây</h1>
                                <c:forEach var="pos" items="${post}">
                            ${pos.title}
                            ${pos.view_number}
                            ${pos.content}
                            ${pos.image}
                            ${pos.date}
                            </c:forEach>
                            </p>
                            <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
                        </div>
                    </div>
                    <div class="card">
                        <img src="..." class="card-img-top" alt="...">
                        <div class="card-body">
                            <h5 class="card-title">Card title</h5>
                            <p class="card-text">TOP BLOG TRENDING1 </p>
                            <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
                        </div>
                    </div>
                </div>
            </div>
        </main>
    </div>
    <div class="view-content">
        <main id="home2">
            <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                </ol>
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="img/1.png" class="d-block w-100" alt="...">
                        <div class="carousel-caption d-none d-md-block">
                            <img src="img/download.jpeg">
                            <form>
                                <div class="form-row">
                                    <div class="col-md-6 mb-3">
                                        <label for="validationServer01">First name</label>
                                        <input type="text" class="form-control is-valid" id="validationServer01" value="Mark" required>
                                        <div class="valid-feedback">
                                            Looks good!
                                        </div>
                                    </div>
                                    <div class="col-md-6 mb-3">
                                        <label for="validationServer02">Last name</label>
                                        <input type="text" class="form-control is-valid" id="validationServer02" value="Otto" required>
                                        <div class="valid-feedback">
                                            Looks good!
                                        </div>
                                    </div>
                                </div>
                                <div class="form-row">
                                    <div class="col-md-6 mb-3">
                                        <label for="validationServer03">City</label>
                                        <input type="text" class="form-control is-invalid" id="validationServer03" aria-describedby="validationServer03Feedback" required>
                                        <div id="validationServer03Feedback" class="invalid-feedback">
                                            Please provide a valid city.
                                        </div>
                                    </div>
                                    <div class="col-md-3 mb-3">
                                        <label for="validationServer04">State</label>
                                        <select class="custom-select is-invalid" id="validationServer04" aria-describedby="validationServer04Feedback" required>
                                            <option selected disabled value="">Choose...</option>
                                            <option>...</option>
                                        </select>
                                        <div id="validationServer04Feedback" class="invalid-feedback">
                                            Please select a valid state.
                                        </div>
                                    </div>
                                    <div class="col-md-3 mb-3">
                                        <label for="validationServer05">Zip</label>
                                        <input type="text" class="form-control is-invalid" id="validationServer05" aria-describedby="validationServer05Feedback" required>
                                        <div id="validationServer05Feedback" class="invalid-feedback">
                                            Please provide a valid zip.
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="form-check">
                                        <input class="form-check-input is-invalid" type="checkbox" value="" id="invalidCheck3" aria-describedby="invalidCheck3Feedback" required>
                                        <label class="form-check-label" for="invalidCheck3">
                                            Agree to terms and conditions
                                        </label>
                                        <div  id="invalidCheck3Feedback" class="invalid-feedback">
                                            You must agree before submitting.
                                        </div>
                                    </div>
                                </div>
                                <button class="btn btn-primary" type="submit">Submit form</button>
                            </form>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <img src="img/2.png" class="d-block w-100" alt="...">
                    </div>
                    <div class="carousel-item">
                        <img src="img/3.png" class="d-block w-100" alt="...">
                    </div>
                </div>
                <button class="carousel-control-prev" type="button" data-target="#carouselExampleIndicators" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </button>
                <button class="carousel-control-next" type="button" data-target="#carouselExampleIndicators" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </button>
            </div>
        </main>
    </div>
</section>
</body>
</html>
