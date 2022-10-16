const HOST = window.location.protocol + "//"+window.location.host
const GAME_CONFIG_PATH = HOST +"/configGame"

const PLAYERS_AMOUNT_INPUT_ID = "playerAmount"
const MATCHES_AMOUNT_INPUT_ID = "matchesAmount"
const START_GAME_BTN_ID = "startGameBtn";

const PLAYERS_AMOUNT_INPUT = document.getElementById(PLAYERS_AMOUNT_INPUT_ID)
const MATCHES_AMOUNT_INPUT = document.getElementById(MATCHES_AMOUNT_INPUT_ID)

function startGame() {
    fetch(buildGetPath(
        GAME_CONFIG_PATH,
        [ PLAYERS_AMOUNT_INPUT.value, MATCHES_AMOUNT_INPUT.value]
    ))
        .then(response => response.json())
        .then(data => console.log(data))
        .catch(err => console.error(err));
}

function buildGetPath(mainPath,values) {
    let valuesString = ""

    for (let i = 0; i < values.length; i++) {
        valuesString += values[i];
        if (i != (values.length - 1)) {
            valuesString += "&"
        }
    }
    return mainPath + "?" + valuesString
}