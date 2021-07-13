<!DOCTYPE html>
<html>
<head>
<script>
        function randomName(){
            var xhttp = new XMLHttpRequest();
            xhttp.onreadystatechange = function(){
                if(this.readyState == 4 && this.status == 200){
                    document.getElementById("demo").value = this.responseText;
                }
            };
                console.log("apro e invio");
                xhttp.open("GET","nameGenerator.php",true);
                xhttp.send();
        }
    </script>
</head>
<body>
    <h1>Generatore nomi</h1>

    <p>
    <input type="text" id="demo">
    <button type="button" onclick="randomName()">Clicca qua</button>
    </p>

</body>
</html>