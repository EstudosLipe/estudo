<?php
namespace Pokemon;

require_once "Pokemon/pokeApi.php";
use Pokemon\PokeApi;

class Pokemons
{
    private $pokeApi;
    private $nome;
    private $numeroDex;
    private $sprite;
    private $detalhes;

    public function __construct(string $pokemon)
    {
        ;
        $this->__set("pokeApi", new PokeApi($pokemon));

        $pokeApi = $this->__get("pokeApi")->__get("ch");

        $this->nome = $pokemon;

        $this->sprite = $pokeApi["sprites"]['back_default'];

        $this->numeroDex = $pokeApi["order"];
    }

    public function __get($atribute)
    {
        return $this->$atribute;
    }

    public function __set($atribute, $value)
    {
        $this->$atribute = $value;
    }
}