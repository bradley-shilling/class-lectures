function getDeck(event) {
    // Call API
    fetch("https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1")
        .then((response) => response.json())
        .then((json) => {
            // Get deck id
            let deckId = json.deck_id;

            // Saving deck id
            document.getElementById("deck-id").innerText = deckId;
        });
}

document.getElementById("new-deck").addEventListener("click", getDeck);

function drawCard(event) {
    const deckId = document.getElementById("deck-id").innerText;

    fetch(`https://deckofcardsapi.com/api/deck/${deckId}/draw/`)
        .then((response) => response.json())
        .then((json) => {
            let card = json.cards[0];

            // Get the table
            let table = document.getElementById("drawn-cards");
            let newRow = table.insertRow();

            let suitCell = newRow.insertCell(0);
            let rankCell = newRow.insertCell(1);
            let imageCell = newRow.insertCell(2);

            suitCell.innerText = card.suit;
            rankCell.innerText = card.value;
            imageCell.innerHTML = `<img class="whatever" src="${card.image}" />`;
        });
}

document.getElementById("draw-card").addEventListener("click", drawCard);