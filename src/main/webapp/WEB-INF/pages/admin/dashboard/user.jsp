<h2 class="sub-header">Users</h2>
<div class="form-group">
    <div class="col-sm-3">
        <input ng-model="query" name="size" class="form-control"  placeholder="Search">
    </div>
</div>
<div><a href="user/new"><button type="button" class="btn btn-default">New User</button></a></div>
<div class="table-responsive">
    <div ng-controller="User">
        <table class="table table-striped">
            <thead>
            <tr>
                <th>#</th>
                <th>Name</th>
                <th>Gender</th>
                <th>Email</th>
                <th>Phone</th>
                <th>Description</th>
                <th>Province</th>
                <th>City</th>
                <th>Street 1</th>
                <th>Street 2</th>
                <th>Role</th>
                <th>Created Date</th>
            </tr>
            </thead>
            <tbody>
            <tr ng-repeat="user in users | filter:query">
                <td>{{user.id}}</td>
                <td>{{user.name}}</td>
                <td>{{user.gender}}</td>
                <td>{{user.email}}</td>
                <td>{{user.phone}}</td>
                <td>{{user.description}}</td>
                <td>{{user.province}}</td>
                <td>{{user.city}}</td>
                <td>{{user.street1}}</td>
                <td>{{user.street2}}</td>
                <td>{{user.role}}</td>
                <td>{{user.date_created}}</td>
            </tr>
            </tbody>
        </table>
    </div>
</div>