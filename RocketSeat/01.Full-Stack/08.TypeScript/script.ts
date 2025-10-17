//Aula 1 - Tipos primitivos - 06/10/2025
let username: string
let age: number
let isFake: boolean

username = "Philip" //String
age = 17 //Number
isFake = false  //Boolean

//Aula 2 - Inferência de tipo e tipagem explicita - 06/10/2025
let mensagem2: string // Tipagem explicita
mensagem2 = "Tudo sim, e você?";

let mensagem1 = "Olá, Tudo bem?" // Inferência de tipo, o próprio TS reconhece o tipo na declaração da variável

//Aula 3 - Tipo Any - 06/10/2025
let variavel //let variavel: any - permite atribuir qualquer valor a está variável

variavel = "Philip" //String
variavel = 17 //Number
variavel = false  //Boolean

//Aula 3 - Arrays - 06/10/2025
let jobs: string[] = []

jobs.push("Analista de sistemas")
jobs.push("Job")
jobs.push("Infraestrutura")
// jobs.push(454) erro

//Aula 3 - Tipagem em funções - 06/10/2025
function sum(x: number, y: number) {
    return x + y;
}
 