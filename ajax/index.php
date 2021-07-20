<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Homepage</title>
</head>
<body>
    <p>Trova una persona che comincia con una lettera a tua scelta</p>
    <input type="text" id="inpt" maxlength="1">
    <button type="button" onclick="search()">Cerca</button>

    <script>
        function search(){
            let digit = document.getElementById("inpt").value;
            var flag = false;
            //while(!flag){
                var xhttp = new XMLHttpRequest();
                xhttp.onreadystatechange = function(){
                    var datas = this.responseText;
                    console.log(datas);
                    var obj = JSON.parse(datas);
                    var name = obj.results[0].name.first;
                    if(this.readyState == 4 && this.status == 200 && digit.charAt(0) == name.charAt(0)){
                        console.log(name);
                        flag = true;
                    }
                };
                xhttp.open("GET","https://randomuser.me/api/",true);
                xhttp.send();
            //}
        }
        //prova merge con origin
    </script>
</body>
</html>