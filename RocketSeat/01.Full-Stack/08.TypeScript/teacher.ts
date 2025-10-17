// Estendendo interface
interface Person {
    id: number,
    name: string,
    size: "small" | "medium" | "large" // Restrição de valores (val1 | val2| valN)
}

// Utilize a palavra reservada extends + interface para que a nova interface herde suas propriedades
interface Teacher extends Person {
    subject: string[]
}

interface Student extends Person {
    age: number
}

let teacher: Teacher = { id: 1, name: "Andreia Machion", subject: ["Algoritmos", "Estrutura de dados"], size:"large" }
let student: Student = { id: 1, name: "Philip Viana", age: 19, size:"small" }