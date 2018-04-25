<user-list>
    <table class="table">
        <thead>
            <tr>
                <th>Name</th>
                <th>Email</th>
                <th>User Name</th>
            </tr>
        </thead>
        <tbody>
            <tr each="{users}" onclick="{selectUser}">
                <td>{name}</td>
                <td>{email}</td>
                <td>{username}</td>
            </tr>
        </tbody>
    </table>

    <script>
        this.users = [];

        

        this.pullUsers = function() {
            fetch('http://localhost:8080/UserRestApi/users')
            .then((response) => response.json())
            .then((json) => {
                this.users = json;
                this.update();
            });
        }

        this.selectUser = function(event) {
            let selectedUser = event.item;
            opts.bus.trigger('userSelected', selectedUser);

        }

        this.on('mount', this.pullUsers);

        opts.bus.on('userSaved', this.pullUsers);
    </script>
</user-list>