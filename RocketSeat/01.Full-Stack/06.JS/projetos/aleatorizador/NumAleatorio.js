"use strict";

let rollDices = document.getElementById("form")
let dices = document.getElementById("dices")

rollDices.onsubmit = (event) => {
    event.preventDefault()
    try {
        const userDices = new UserConfigs(
            parseInt(document.getElementById("qtd_dices").value),
            parseInt(document.getElementById("min_val_dices").value),
            parseInt(document.getElementById("max_val_dices").value)
        )
        userDices.getDices().map((dice) => {
            let li = document.createElement('li')
            li.innerHTML = dice;
            dices.appendChild(li)
        });
    } catch (error) {
        alert(error)
    }
}