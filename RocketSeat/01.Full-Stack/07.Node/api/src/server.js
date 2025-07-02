// Importação com ES Module
import http from "node:http";

// Criação do servidor
const server = http.createServer((req, res) => {
    return res.end("Servidor OK xx");
})

server.listen(3333) // Porta mais comum