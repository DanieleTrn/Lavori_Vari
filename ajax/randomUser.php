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
                    
                    //recupero il JSON ottenuto dal server
                    var datas = this.responseText;
                    var json = JSON.parse(datas);
                    var name = json.results[0].name.first;
                    console.log(name);
                    //Metto delle immagini sulla pagina
                    var img = document.createElement("img");
                    img.src = json.results[0].picture.large;
                    var spanDoc = document.getElementById("demo");
                    spanDoc.appendChild(img);

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