<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Natures Best</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="" name="keywords">
    <meta content="" name="description">

    <!-- Favicon -->
    <link href="img/favicon.ico" rel="icon">
    <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;500&family=Lora:wght@600;700&display=swap" rel="stylesheet"> 

    <!-- Icon Font Stylesheet -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

    <!-- Libraries Stylesheet -->
    <link href="lib/animate/animate.min.css" rel="stylesheet">
    <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

    <!-- Customized Bootstrap Stylesheet -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Template Stylesheet -->
    <link href="css/style.css" rel="stylesheet">
    <!-- home page -->
    <link href="landing.jsp" rel="home page">
    </head>
<body>
    <div class="content" style="height: 93vh">
      <h3 style="text-align:center;margin-top:7%">
        Welcome to <span style="font-weight: 700">Natures</span> Best
      </h3>
      <div class="container">
        <div class="row">
          <div  class="col-md-6 order-md-2">
            <img style="margin-left:10%;position:relative"
              src="img\girl with fruits.jpg"
              alt="Image"
              class="img-fluid"
            />
          </div>
          <div class="col-md-6 contents">
            <div class="row justify-content-center">
              <div class="col-md-8">
                <div class="mb-4" style="margin-left:25%;border-right: 100%;">
                  <h3 style="margin-top:50px">Admin <strong>Login</strong></h3>
                
                <form action="LoginAuthentication" method="get">
                <p style="color:red">Invalid credentials</p>
                  <div class="form-group first">
                    <label for="username">Username</label>
                    <input type="text" class="form-control" id="username" name="Username" />
                  </div>
                  <div class="form-group last mb-4">
                    <label for="password">Password</label>
                    <input type="password" class="form-control" id="id_password" name="Password"/>
                    <i
                      class="far fa-eye-slash"
                      id="togglePassword"
                      style="
                        display: flex;
                        float: right;
                        margin-top: -35px;
                        position: relative;
                      "
                    ></i>
                  </div>
                  <input
                    type="submit"
                    value="Log In"
                    class="btn text-white btn-block btn-primary"
                  />
                </div>
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
      <footer
        style="
          display: flex;
          justify-content: center;
          position: sticky;
          background-color: #41f050;
          padding: 10px 10px;
          margin-top: 205px;
        "
      >
        @Copyright | Natures Best | 2022- All Right Reserved.
      </footer>
    </div>

  </body>
</html>
s