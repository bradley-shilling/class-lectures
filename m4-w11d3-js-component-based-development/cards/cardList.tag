<card-list>
    <!-- HTML structure of the component -->
    <div id="deck" class="row"> <button id="new-deck" onclick="{getDeck}">Create Deck</button><span id="deck-id">{deck}</span></div>
    <div id="draw" class="row"><button id="draw-card" onclick="{drawCard}">DRAW!</button></div>
    <table id="drawn-cards" class="table">
            <tr>
                <th>Suit</th>
                <th>Rank</th>
                <th>Image</th>
            </tr>
            <tr each={cards}>
                <td>{suit}</td>
                <td>{value}</td>
                <td><img src="{image}"></td>
            </tr>
    </table>




    <!-- CSS specific to this component -->
    <style>
    #drawn-cards img {
        max-width: 110px;
    }
    </style>




    <!-- Javascript to handle behavior of component -->
    <script>
        this.deck;
        this.cards = [];

        this.getDeck = function(event) {
            // Call API
            fetch("https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1")
                .then((response) => response.json())
                .then((json) => {
                    // Get deck id
                    let deckId = json.deck_id;

                    this.deck = deckId;
                    this.update();
                });
            }


this.drawCard = function(event) {
    fetch(`https://deckofcardsapi.com/api/deck/${this.deck}/draw/`)
        .then((response) => response.json())
        .then((json) => {
            let card = json.cards[0];

            this.cards.push(card);
            this.update();
        });
}

    </script>
</card-list>