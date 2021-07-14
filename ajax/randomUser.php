<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pagina RandomUser</title>
</head>
<body>
    <script>
        function getRandomUser(){
            let xhttp = new XMLHttpRequest();
            xhttp.onreadystatechange = function(){
                if(this.readyState == 4 && this.status == 200){
                    var datas = this.responseText;
                    console.log(datas.results);
                    /*var nome = datas[0].results.name.first
                    document.getElementById("demo").innerHTML = nome;*/
                }
            };
            xhttp.open("GET","https://randomuser.me/api/",true);
            xhttp.send();
        }
    </script>

    <button type="button" onclick="getRandomUser()">Clicca qua</button>
    <span id="demo"></p>
</body>
</html>