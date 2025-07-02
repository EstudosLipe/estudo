// console.log("Hello World")

// Importação com CommonJS
// const http = require("http")

// Importação com ES Module
// import http from "http"

import http from "node:http"

// Criação do servidor
    // Como parâmetro uma arrow function para podemos trabalhar com as requisições e devoluções de resposta para quem solicitou.
    const server = http.createServer((req, res) => {
        // Retorna uma resposta ao iniciar o servidor e acessa-lo via navegador (http://localhost:3333);
        return res.end("Servidor responde, você responde?"); //Qualquer alteração na resposta precisa que o server seja reiniciado. A menos que utilize a flag (--watch)
    })

// Devemos passar uma porta para nosso servidor ser acessado, fazemos isso utilizando o método listen(int port)
server.listen(3333) // Porta mais comum