<movie-search>
    <!-- html form -->
    <form class="form-inline" onsubmit="{doSearch}">
        <input type="text" name="search" id="search" placeholder="Search for a Movie." />
        <input type="submit" value="Search" />
    </form>

    <!-- js -->
    <script>
        this.doSearch = function(event) {
            event.preventDefault();
            event.stopPropagation();

            let searchTerms = this.root.querySelector('input[name=search]').value;

            fetch(`http://omdbapi.com/?apikey=e78b4fa0&s=${searchTerms}`)
                .then((response) => response.json())
                //send to bus
                .then((json) => opts.bus.trigger('newMovieList', json.Search));

            return false;
        }
    </script>
</movie-search>