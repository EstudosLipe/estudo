<?php
namespace Pokemon;

class PokeApi
{
    private $ch;

    public function __construct(string $pokemon)
    {
        $ch = curl_init();
        curl_setopt($ch, CURLOPT_URL, "https://pokeapi.co/api/v2/pokemon/$pokemon/");
        curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
        $this->ch = json_decode(curl_exec($ch), true);
        curl_close($ch);
    }
    public function __set($atribute, $value)
    {
        $this->$atribute = $value;
    }
    public function __get($atribute)
    {
        return $this->$atribute;
    }
}