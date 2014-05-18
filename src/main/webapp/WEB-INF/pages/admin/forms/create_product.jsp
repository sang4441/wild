<%--<form action="/file-upload" class="dropzone">--%>
    <%--<div class="fallback">--%>
        <%--<input name="file" type="file" multiple />--%>
    <%--</div>--%>
<%--</form>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<form action="submit/create" method="post" modelAttribute="item" class="form-horizontal" enctype="multipart/form-data">

    <div class="form-group">
        <label class="col-sm-2 control-label">Image upload</label>
        <div class="col-sm-3">
            <input type="file" name="files[0]">
            <input type="file" name="files[1]">
        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-2 control-label">Name</label>
        <div class="col-sm-3">
            <input name="name" class="form-control"  placeholder="Name">
        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-2 control-label">Gender</label>
        <div class="col-sm-3">
            <select name="genderId" class="form-control">
                <option value="1">Man</option>
                <option value="2">Women</option>
                <option value="3">Unisex</option>
            </select>
        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-2 control-label">Category</label>
        <div class="col-sm-3">
            <select name="categoryId" class="form-control">
                <c:forEach items="${categories}" var="cagegory">
                    <option value="${cagegory.id}">${cagegory.name}</option>
                </c:forEach>
            </select>
        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-2 control-label">Size</label>
        <div class="col-sm-3">
            <input name="size" class="form-control"  placeholder="Size">
        </div>
    </div>
    <div class="form-group">
        <label class="col-sm-2 control-label">Brand</label>
        <div class="col-sm-3">
            <select name="brandId" class="form-control">
                <c:forEach items="${brands}" var="brand">
                    <option value="${brand.id}">${brand.name}</option>
                </c:forEach>
            </select>
        </div>
    </div>
    <%--<div class="form-group">--%>
        <%--<label class="col-sm-2 control-label">Weight</label>--%>
        <%--<div class="col-sm-3">--%>
            <%--<input name="weight" class="form-control"  placeholder="Weight">--%>
        <%--</div>--%>
    <%--</div>--%>
    <div class="form-group">
        <label class="col-sm-2 control-label">Type</label>
        <div class="col-sm-3">
            <input name="type" class="form-control"  placeholder="Type">
        </div>
    </div>
    <div class="form-group">
        <label class="col-sm-2 control-label">Description</label>
        <div class="col-sm-3">
            <textarea name="description" class="form-control" rows="3"></textarea>
        </div>
    </div>
    <div class="form-group">
        <label class="col-sm-2 control-label">Price</label>
        <div class="col-sm-3">
            <input name="price" class="form-control"  placeholder="Price">
        </div>
    </div>
    <div class="form-group">
        <label class="col-sm-2 control-label">Inventory</label>
        <div class="col-sm-3">
            <input name="inventory" class="form-control"  placeholder="Inventory">
        </div>
    </div>
    <div class="form-group">
        <label class="col-sm-2 control-label">Status</label>
        <div class="col-sm-3">
            <select name="statusId" class="form-control">
                <option value="1">Display</option>
                <option value="2">Pending</option>
            </select>
        </div>
    </div>
    <div class="form-group">
        <div class="col-lg-2">
            <button type="submit" class="btn btn-default">Submit</button>
        </div>
    </div>
</form>