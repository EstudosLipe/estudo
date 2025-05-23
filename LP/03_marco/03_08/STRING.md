# AULA DE LP 08/03/2024

### Revisão aula passada
- Programação divida em 3 processos (ENtrada, Processamento e Saida)
- Uso da memoria para armazenar valores:
    - **VARIAVEIS**: A ULA decide qual espaço para utilizar para armazenar essa variavel de acordo com o seu tipo
    - **ARRAY**: Armazena um conjunto de dados na memoria.

        _SINTAX: int vet = new int[5]._

        _Esses valores são acessados através do index, iniciado em 0._
    
        _Divididas em unidirecionais, ou seja, possui somente um index. E multidimensionais, ou seja, são aquelas que possuem mais de um index_

## STRING
- **STRING**: é um array de caracteres, porém, é uma classe.
- O armazenamento de String é feito através do ***sc.next()*** ou ***sc.nexLine()***
- A String são constantes, ou seja, não é possivel alterar a String, ele cria um novo OBJ para cada manipulação.
    - Inclusive: ao concatenar Strings, não alteramos o conteudo, e sim criamos novos OBJ com esse valores concatenados.
    - Possui "melhorias" para a Classe Sting, com ***StringBuffer*** e ***StringBuilder***.
- Possui diversos _methods_, que te ajuda na manipulação deste OBJ em si.
    Ex.: length(); toLowerCase(); 

## CONSTRUTORES DE UMA STRING
- Criação de um novo OBJ
- String()
- String(bytes[]) =

## CONCATENAÇÃO
- Pode-se concatenar strings utilizando o +
- Pode-se concatenar strings utilizando alguns metodos;
    - concat();
    - format();

## COMPARAÇÂO DE STRINGS
- Não é possivel realizar comparações de strings utilizando (==)
- utiliza-se metódos

#### OBS:
- Utilize sempre a padronização