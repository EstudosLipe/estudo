# EXCEPCITION

### Exceções
São estruturas de fluxo que tem por finalidade tratar de ações inesperadas dentro de seu código.

Diferente dos erros, podemos contornar através do códigos, as excessões devemos ter o feeling de quando, como e porque usar, na escrita do nosso códigos, precisamos avaliar todos os cenarios possiveis para que o fluxo do código continue de forma natural.

O Próprio compilador do JAVA quando interpreta algum codigos falho nos retorna se aquilo é uma excessão (a qual podemos contornar) ou um error (neste caso não a nada em que possamos fazer).

### Principais cenarios de excessões

- **java.lang.NullPointerException**: Obteção de informações de uma variavel nula;
- **java.lang.ArithmeticException**: Divisão por zero;
- **java.sql.SQLException**: Erros nas interções com banco de dados SQL;
- **java.io.FileNotFoundException**: Tentativa de manipulação em arquivos não encontrados.

**BIZU:**Sempre que der de cara com alguma exception a dica é sempre pesquisar e entender o porque do erro e como trata-lo com excessões.

### Como tratar as excessões

Utilizamos 3 palavras reservada do java:

- **TRY:** Bloco de código a qual irá ser executado a fim de verificar se ah erros.
- **CATCH:** Bloco de código executado caso haja a captura de um erro no *try*, podendo existir diversos *catchs* dentro dele.
- **FINALLY:** Pouco utilizado, permite a excução de um bloco de códigos que será excutado, independete da existencia de erros ou não.

As palavras-chave *try & catch* são utilizadas em pares:

```java
try{
    // Bloco de código conforme o esperado
}catch(Exception e){
    // Bloco de código que captura as exceções que podem acontecer em caso de flux não previsto.
}
```

### Hierarquia de exceções:
O JAVA, dispões de uma variadade de classes, que represetam exceções organizadas em um hierarquia denominadas ***Checked and Unchecked Exceptions***:

- THROWABLE: tudo é um Throwable
    - Error: Não pode ser tratada.
    - Exception
        - RuntimeException
        - 