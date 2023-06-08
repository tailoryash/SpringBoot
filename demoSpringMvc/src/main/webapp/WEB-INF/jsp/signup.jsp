<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page isELIgnored="false"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Sign Up demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
  </head>
  <body>
     <div class  = "container mt-5">
           <h3 class = "text-center"> ${Header}
                                   ${Desc}</h3>
           <form method = "post" action="/login">
           <div class="form-group mt-2">
                          <label for="username">User Name</label>
                          <input type="text" name ="username" class="form-control" id="username" aria-describedby="username" placeholder = "Enter a username">

                        </div>
             <div class="form-group mt-2">
               <label for="exampleInputEmail1">Email address</label>
               <input type="email" name = "email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder = "Enter Email">
               <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
             </div>
             <div class="form-group mt-2">
               <label for="exampleInputPassword1">Password</label>
               <input type="password" name = "password" class="form-control" id="exampleInputPassword1" placeholder = "Enter Password">
             </div>

 <div class = "container text-center mt-5">
             <button type="submit" class="btn btn-success">Submit</button>
             </div>
           </form>
     </div>


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
  </body>
</html>