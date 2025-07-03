// Importação com ES Module
import http from "node:http";
import { url } from "node:inspector";

// Criação do servidor
const server = http.createServer(async (req, res) => {

    // Extrai o método, e URL da requisição
    const { method, url } = req;

    if (method === "GET" && url === "/products") {
        return res.writeHead(200).end("Listando produtos")
    }

    if (method === "POST" && url === "/products") {
        // Concatenar os chuks
        const buffers = []
        for await (const chunk of req) {
            buffers.push(chunk);
        }


        // Montagem dos chunks (Buffer.concat(buffers))
        console.log(Buffer.concat(buffers).toString())

        return res.writeHead(201).end("produtos Criados")
    }

    return res.writeHead(404).end("Não encontrado" + method + url);
})

server.listen(3333) // Porta mais comum