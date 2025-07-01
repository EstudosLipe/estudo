<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PokeAPI</title>
</head>

<body>
    <div class="dex">
        
    </div>
    <form action="" method="POST">
        <label for="searchDex">Digite o nome de um Pokemon</label>
        <input type="text" id="searchDex" name="inpurSearchDex">
    </form>
</body>

</html>
<?php
require_once "Pokemon/pokemons.php";
use Pokemon\Pokemons;

$pokemonName = $_POST['inpurSearchDex'];

$pokemon = new Pokemons($pokemonName);

?>
<img src="<?php echo $pokemon->__get("sprite")?>" alt="">