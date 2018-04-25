<movie-list>
    <table class="table">
        <tr each="{movies}">
            <th>{Title}</th>
            <td>{Year}</td>
    </table>

    <script>
        this.movies = [];
        opts.bus.on('newMovieList', (newList) => {
            this.movies = newList;
            this.update();
        });
    </script>


</movie-list>
