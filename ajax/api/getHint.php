<?php
$namesList = [
"Anna",
"Gino",
"Luca",
"Paolo",
"Laura",
"Andrea",
"Luisa",
"Eleonora",
"Alessia",
"Alberta"
];

$digit = $_GET['q'];
$res = "";
$hint = "";
for($x = 0; $x < sizeof($namesList);$x++){
    $nameToCheck = $namesList[$x];
    $nameFormat = strtolower($nameToCheck);
    $subLen = strlen($digit);
    $name = "";
        for($y = 0; $y < strlen($digit);$y++){
            $name .= $nameFormat[$y];
        }
        if($digit === $name){
            if($hint === ""){
                $hint = $nameToCheck;
            }else{
                $hint .= ", ". $nameToCheck;
            }
                
        }
    }

if($hint === ""){
    echo "Non ci sono suggerimenti";
}else{
    echo $hint;
} 