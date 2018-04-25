<user-update>
    <form onsubmit="{saveUser}" show="{user}">
        <input type="text" name="name" value="{user.name}">
        <input type="text" name="email" value="{user.email}">
        <input type="text" name="username" value="{user.username}">
        <input type="submit" value="Save">
    </form>

    <script>
        this.user = null;

        opts.bus.on('userSelected', (user) => {
            this.user = user;
            this.update();
        });

        this.saveUser = (event) => {
            event.stopPropagation();
            event.preventDefault();
            this.user.name = this.root.querySelector('input[name=name]').value;
            this.user.username = this.root.querySelector('input[name=username]').value;
            this.user.email = this.root.querySelector('input[name=email]').value;

            // pass user data on to api
            fetch (`http://localhost:8080/UserRestApi/users/${this.user.id}?name=${this.user.name}&email=${this.user.email}&username=${this.user.username}`, {method: 'PUT'})
                .then((response) => {
                    
                        opts.bus.trigger('userSaved');
                        this.user = null;
                        this.update();
                        opts.bus.trigger('newMessage', "User successfully saved!");
                        console.log("true");
                    
                })
                .catch((response) => {
                    console.log("Something went horribly wrong!");
                })

            
            return false;
        }
    </script>
</user-update>