<!DOCTYPE html>
<html>
<head>
<script>

        <!-- Creo la funzione per prendere dal server il nome casuale -->
        function randomName(){
            var xhttp = new XMLHttpRequest(); <!-- Un oggetto che ci consente di richiedere la risorsa al server -->

            <!-- Definisco il metodo che gestisce i cambiamenti dello status della richiesta -->
            xhttp.onreadystatechange = function(){

                
                <!-- readyState è la proprietà che indica lo stato della richiesta, 4 significa che il server ha processato la richiesta e risposto al client  -->
                <!-- status è la variabile che memorizza il codice di stato, 200 significa che la risorsa è stata trovata -->

                if(this.readyState == 4 && this.status == 200){

                    <!-- Inserisco nel textfield (riga 30) il valore trovato (memorizzato in responseText) -->
                    document.getElementById("demo").value = this.responseText;
                }
            }; <!-- Fine del metodo  -->
            
                
            <!-- Apro la richiesta da inviare al server inviando i seguenti parametri: -->
            <!-- 1. Scelta del metodo di invio (GET e SET) -->
            <!-- 2. Definisco il percorso della risorsa richiesta -->
            <!-- 3. valore booleano, se true la connessione sarà asincrona, false se sincrona -->
                 
                xhttp.open("GET","./api/nameGenerator.php",true);
                xhttp.send(); <!-- Invio la richiesta, onreadystatechange processerà la richiesta quando completa -->
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