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

        this.on('mount', () => {
            this.users = [
                {
                    name: 'Jon',
                    email: 'jonny@boy.com',
                    username: 'jonjon'
                },
                {
                    name: 'Barb',
                    email: 'barb@barb.com',
                    username: 'barb'
                },
                {
                    name: 'Joe',
                    email: 'joe@jerickson.net',
                    username: 'joe'
                }
            ];
            this.update();
        });

        this.selectUser = function(event) {
            let selectedUser = event.item;
            opts.bus.trigger('userSelected', selectedUser);

        }
    </script>
</user-list>