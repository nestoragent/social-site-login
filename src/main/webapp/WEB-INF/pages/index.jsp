<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
        /* Remove the navbar's default margin-bottom and rounded borders */
        .navbar {
            margin-bottom: 0;
            border-radius: 0;
        }

        /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
        .row.content {
            height: 450px
        }

        /* Set gray background color and 100% height */
        .sidenav {
            padding-top: 20px;
            background-color: #f1f1f1;
            height: 100%;
        }

        /* Set black background color, white text and some padding */
        footer {
            background-color: #555;
            color: white;
            padding: 15px;
        }

        /* On small screens, set height to 'auto' for sidenav and grid */
        @media screen and (max-width: 767px) {
            .sidenav {
                height: auto;
                padding: 15px;
            }

            .row.content {
                height: auto;
            }
        }
    </style>
</head>
<body>

<div class="container-fluid text-center">
    <div class="row content">
        <div class="col-sm-12 text-center">
            <h1>Welcome</h1>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et
                dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip
                ex ea commodo consequat. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia
                deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut
                labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi
                ut aliquip ex ea commodo consequat.</p>
            <hr>
            <h3>Test</h3>
            <p>Lorem ipsum...</p>

            <form:form method = "GET" action = "/vk/login">
                <table>
                    <tr>
                        <td>
                            <button>
                                <img alt="Sign in with Twitter"
                                     src="https://g.twimg.com/dev/sites/default/files/images_documentation/sign-in-with-twitter-gray.png">
                            </button>
                        </td>
                    </tr>
                </table>
            </form:form>

            <form:form action="loginButtons" method="post">
                <c:forEach var="listValue" items="${buttonsList}">
                    <button name="${listValue}" type="submit" class="btn btn-primary">Login via ${listValue}
                        <img alt="Sign in with Twitter"
                             src="https://g.twimg.com/dev/sites/default/files/images_documentation/sign-in-with-twitter-gray.png">
                    </button>
                    <br>
                </c:forEach>
            </form:form>

        </div>
    </div>
</div>

</body>
</html>
