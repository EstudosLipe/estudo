# HTML (HYPERTEXT MARKUP LANGUANGE)

- É uma linguagem de marcação
- Não é uma linguagem de programação
- Arquivos de extensão _`.html`_

### ANATOMIA DAS TAGS
- Sintaxe: _`<tag>Conteudo</tag>`_

    ***`<tag>`***: Abertura da tag

    ***`Conteudo`***: Conteudo que recebe as propriedades desta tag

    ***`</tag>`***: Fechamento da tag
    
    ```
        <h1>Titulo</h1>
    ```

### COMENTARIOS
- Serve para ignorar parte do texto, explicar conteudo etc.
- Sintaxe:  `<!--Comentario-->`

### QUEBRA DE LINHAS
- Sintexa: _`<br>`_ ou _`<br/>`_

### FLUXO DE CODIGO DO HTML
Dentro do HTML as tags funcionam de 2 formas de exibição:
- ***BLOCO***: Ocupa todo os espaço disponivel de largura e os proximos elementos sãa exibidos abaixo dele.
    - <p></p>
    - <ul><li></li></ul>
    - <div></div>
- ***INLINE***: Ocupa somente o tamanho usado pelo elemento e, havendo espaço, coloca os proximos na mesma linha que ele 
    - <a></a>
Porém podemos manipular isto aplicando o _`css`_.

### ANINHAMENTO DE CODIGO
Podemos colocar tags dentro de tags. Adicionamos _`father tags`_ e dentro delas adicionamos _`sons tags`_:
```html
    <!-- 
        <p> Elemento pai </p>
        <b> Elemento filho </b>
    -->
    <p>
        <b>
            Lorem ipsum dolor sit amet consectetur, adipisicing elit. Animi sapiente odit, illo harum
            dolorum rerum excepturi
        </b>, 
        cumque aliquid voluptatum ipsam laudantium aliquam? Veritatis adipisci esse pariatur 
        expedita voluptatibus consequatur nobis!
    </p>
```

### ATRIBUTOS
Atributos em HTML são informações extras ou configurações utilizadas por uma tag.

Veja abaixo a seguinte tag:
```html
    <img src="" alt="">
```
- ***Sintaxe***: atributo=""
- existem atributos globais, utilizadas por qualquer tag, como _`id`_, _`class`_, _`width`_, e atributos especificos a tag como _`src`_ do exemplo acima
- Os atributos são separados por espaços.
- A omissão de aspas na sintaxe da definição de um atributo é possivel, porém, não é recomendada devido alguns navegadores não interpretarem bem.
- A utilização de aspas de duplas é recomendada.

### ATRIBUTOS BOOLEANOS
São atributos que não dependem de valores, apenas a invocação deles já fazem ele funcionar

Veja abaixo a seguinte tag:
```html
    <h1>Hello World</h1>
    <h1 hidden>Eu não existo</h1>
```
![hidden_atribute](../../assets/hidden_atributes.png)

### ATRIBUTOS GLOBAL
São atributos utilizados por qualquer tag HTML

### ID (TAG GLOBAL)
- Sintaxe: <tag id="id">Conteudo</tag>
- Funciona como um identificador unico daquela tag.
- Boas Práticas:
    - Não iniciar com numeros ou caracteres especiais.
    - Não utilizar espaços e sim **`-`**.
- Pode ser acessada por diversos recursos como: 
    ```HTML
    <!-- Ancoras (links): -->
    <a href="#id">Home</a>
    ```
    ```css
    /*Estilização (css)*/
    #id{
        color: red;
    }
    ```
    ```js
    //Manipulação (JavaScript, React, etc):
    document.getElementById("id")
    ```
### CLASS (TAG GLOBAL)
- Sintaxe: <tag class="class">Conteudo</tag>
- Funciona para classificar uma tag.
- Boas Práticas:
    - Não iniciar com numeros ou caracteres especiais.
    - Não utilizar espaços e sim **`-`**.
- Pode ser acessada por diversos recursos como: 
    ```css
    /*Estilização (css)*/
    .class{
        color: red;
    }
    ```
    ```js
    //Manipulação (JavaScript, React, etc):
    document.querySelector(".class")
    ```
### SEMÂNTICAS
Elementos HTML que dão significado ao seu código. Melhorando os motores de busca, leitores de telas e etc.

### TITULOS E PARAGRAFOS
No HTML temos 6 tags que se diferencia em tamanhos e usos:
```html
<h1>Cabeçalho nível 1</h1>
<h2>Cabeçalho nível 2</h2>
<h3>Cabeçalho nível 3</h3>
<h4>Cabeçalho nível 4</h4>
<h5>Cabeçalho nível 5</h5>
<h6>Cabeçalho nível 6</h6>
```