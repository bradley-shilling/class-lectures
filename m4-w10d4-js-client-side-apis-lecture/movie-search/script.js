
//1. When the user enters a search query, request the OMDB API 
function search() {

    // Get the search box
    const title = document.querySelector("#search").value;

    // Define the endpoint
    const endpoint = `http://www.omdbapi.com/?apikey=e78b4fa0&s=${title}`;

    // Set fetch parameters
    const settings = {
        method: 'GET'
    };

    // Fetch the endpoint
    fetch(endpoint, settings)
    .then(response => response.json())   // Receive the data
    .then(json => displayMovies(json.Search));
}

function displayMovies(movieData) { 

    // Get the movie container
    const moviesDiv = document.querySelector("#movies");

    // Loop through the movie data
    movieData.forEach(movie => {
    
        // Create an img for each poster
        const img = document.createElement("img");
        img.src = movie.Poster;
        img.title = movie.Title;

        // Add the img to the div
        moviesDiv.appendChild(img);
    });

    

}