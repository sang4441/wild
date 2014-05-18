<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!DOCTYPE HTML>
<!DOCTYPE html>
<html lang="en" ng-app>`
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Dashboard Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="/ANBD/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="/ANBD/resources/css/dropzone.css" rel="stylesheet">
    <link href="/ANBD/resources/css/jquery.fileupload.css" rel="stylesheet">
    <link href="/ANBD/resources/css/jquery.fileupload-ui.css" rel="stylesheet">
    <link href="/ANBD/resources/css/style.css" rel="stylesheet">
    <link href="/ANBD/resources/css/style.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy this line! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>

    <![endif]-->
</head>

<body>

<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Project name</a>
        </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#">Dashboard</a></li>
                <li><a href="#">Settings</a></li>
                <li><a href="#">Profile</a></li>
                <li><a href="#">Help</a></li>
            </ul>
            <form class="navbar-form navbar-right">
                <input type="text" class="form-control" placeholder="Search...">
            </form>
        </div>
    </div>
</div>

<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <ul class="nav nav-sidebar">
                <li class="active"><a href="#">Products</a></li>
                <li><a href="#">Reports</a></li>
                <%--<li><a href="#">Analytics</a></li>--%>
                <%--<li><a href="#">Export</a></li>--%>
            </ul>
            <%--<ul class="nav nav-sidebar">--%>
                <%--<li><a href="">Nav item</a></li>--%>
                <%--<li><a href="">Nav item again</a></li>--%>
                <%--<li><a href="">One more nav</a></li>--%>
                <%--<li><a href="">Another nav item</a></li>--%>
                <%--<li><a href="">More navigation</a></li>--%>
            <%--</ul>--%>
            <%--<ul class="nav nav-sidebar">--%>
                <%--<li><a href="">Nav item again</a></li>--%>
                <%--<li><a href="">One more nav</a></li>--%>
                <%--<li><a href="">Another nav item</a></li>--%>
            <%--</ul>--%>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <c:choose>
                <c:when test="${not empty content}">
                    <c:set var="content" value="${content}.jsp"/>
                    <jsp:include page="${content}"/>
                </c:when>
                <c:otherwise>
                    <%--<jsp:include page="find_club.jsp"/>--%>
                </c:otherwise>
            </c:choose>
        </div>
    </div>
</div>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script src="/ANBD/resources/js/bootstrap.min.js"></script>
<script src="/ANBD/resources/js/dropzone.js"></script>
<script src="/ANBD/resources/js/vendor/jquery.ui.widget.js"></script>
<script src="/ANBD/resources/js/jquery.iframe-transport.js"></script>
<script src="/ANBD/resources/js/jquery.fileupload.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min.js"></script>
<script src="../../public/js/admin/admin_product.js"></script>
<%--<script>--%>
    <%--$(function () {--%>
        <%--$('#fileupload').fileupload({--%>
            <%--dataType: 'json',--%>
            <%--add: function (e, data) {--%>
                <%--data.context = $('<button/>').text('Upload')--%>
                        <%--.appendTo(document.body)--%>
                        <%--.click(function () {--%>
                            <%--data.context = $('<p/>').text('Uploading...').replaceAll($(this));--%>
                            <%--data.submit();--%>
                        <%--});--%>
            <%--},--%>
            <%--done: function (e, data) {--%>
                <%--data.context.text('Upload finished.');--%>
            <%--}--%>
        <%--});--%>
    <%--});--%>
<%--</script>--%>
</body>
</html>