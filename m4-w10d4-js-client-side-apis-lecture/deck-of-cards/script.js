const endpoint = "https://deckofcardsapi.com/api/deck/";

//2. If I have already set up a deck, continue drawing from that
let deckId = '';

// 1. When I click DRAW I call the API to create a new deck and draw a card.
function draw() {

    // Create the endpoint url   
    const path = (deckId === '') ? `new/draw/?count=1` : `${deckId}/draw/?count=1`;
    const url = endpoint + path;

    // Call the endpoint
    fetch(url)
        .then(response => response.json())
        .then(json => {            
            deckId = json.deck_id;
            document.cookie = deckId;
            displayCard(json.cards[0]); // Read the first card
            updateCount(json.remaining); //3. Update the count remaining
        });

}

// 1. When I draw a card, display it in the cards div
function displayCard(card) {

    // Get the #cards DIV
    const container = document.querySelector('#cards');

    // Clear it
    container.innerHTML = '';

    // Create an image for the png file
    const img = document.createElement("img");
    img.src = card.image;
    img.title = `${card.value} or ${card.suit}`;

    // Add the image to the #cards DIV
    container.appendChild(img);

}

//3. Update the count remaining
function updateCount(remainingAmount){
    
    // Get the remaining span
    const placeholder = document.querySelector("#remaining .placeholder");
    
    // Update its value
    placeholder.innerText = remainingAmount;

    // Show the parent
    placeholder.parentElement.classList.remove("hidden");

}

//4. When I reload the page the existing deck id is used
window.onload = function() { 
    deckId = document.cookie;
}