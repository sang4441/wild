<h2 class="sub-header">Product Listing</h2>
<div class="form-group">
    <div class="col-sm-3">
        <input ng-model="query" name="size" class="form-control"  placeholder="Search">
    </div>
</div>
<div><a href="product/new"><button type="button" class="btn btn-default">New Product</button></a></div>
<div class="table-responsive">
    <div ng-controller="Product">
        <table class="table table-striped">
            <thead>
            <tr>
                <th>#</th>
                <th>Image</th>
                <th>Name</th>
                <%--<th>Gender</th>--%>
                <th>Category</th>
                <th>Brand</th>
                <th>Size</th>
                <th>Price</th>
                <%--<th>Inventory</th>--%>
                <th>Status</th>
            </tr>
            </thead>
            <tbody>
                <tr ng-repeat="item in items | filter:query">
                    <td>{{item.id}}</td>
                    <td><img src="../../{{item.imageAddress[0]}}" alt="Smiley face" height="42" width="42"></td>
                    <td>{{item.name}}</td>
                    <%--<td>{{item.gender}}</td>--%>
                    <td>{{item.category}}</td>
                    <td>{{item.brandName}}</td>
                    <td>{{item.size}}</td>
                    <td>{{item.price}}</td>
                    <%--<td>{{item.inventory}}</td>--%>
                    <td>{{item.status}}</td>
                </tr>
            </tbody>
        </table>
    </div>
</div>