// const btn = document.querySelector("button")
// const detailsCar = document.getElementById("details_car")
// const carList = []

// btn.addEventListener("click", () => {
//     let values = document.querySelectorAll("input");
//     let car = new criarCarro(values[0].value, values[0].value, values[1].value, values[2].value);
//     carList.push(car);

//     console.log(carList);
// })

// function criarCarro(nameObj, name, mark, year) {
//     nameObj = {};

//     nameObj.name = name;
//     nameObj.mark = mark;
//     nameObj.year = year;

//     nameObj.showDetails = function () {
//         return (`Carro: ${this.name}<br>Marca: ${this.mark}<br>Ano: ${this.year}`)
//     }

//     return nameObj;
// }

class Car{
    constructor(name, mark, year){
        this.name = name;
        this.mark = mark;
        this.year = year;
    }

    sendNome(){
        console.log(this.mark)
    }
}