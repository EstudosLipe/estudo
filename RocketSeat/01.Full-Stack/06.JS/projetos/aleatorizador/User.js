class UserConfigs {
    #qtdDices;
    #minValDices;
    #maxValDices;
    #dices;
    constructor(qtdDices, minValDices, maxValDices) {
        this.qtdDices = qtdDices
        this.minValDices = minValDices
        if (maxValDices > minValDices) {
            this.maxValDices = maxValDices
        } else {
            throw new Error("Digite um numero maior que o minimo né porra");
        }
        this.dices = this.userDices()
    }

    getDices() {
        return this.dices
    }
    getDtdDices() {
        return this.qtdDices
    }
    getMinValDices() {
        return this.minValDices
    }
    getMaxValDices() {
        return this.maxValDices
    }

    userDices() {
        let dices = []
        while (dices.length != this.qtdDices) {
            let diceResult = this.rollDice()
            if (diceResult > this.minValDices && diceResult < this.maxValDices + 1) {
                dices.push(parseInt(diceResult))
            }
        }
        return dices
    }

    rollDice() {
        let diceResult = Math.random() * 100;
        return diceResult
    }
}