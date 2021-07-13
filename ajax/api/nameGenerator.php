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

$random = rand(0,sizeof($namesList)-1);

echo $namesList[$random];