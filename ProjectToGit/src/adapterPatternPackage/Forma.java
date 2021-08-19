package adapterPatternPackage;

public interface Forma {
    public int getPerimetro();
    public int getArea();
}

/*
L'adapter pattern è un pattern strutturale che ci consente di rendere compatibili due interfacce senza modificarne il codice.
Per rendere ciò possibile dobbiamo identificare i vari ruoli che copriranno le varie entità

-Target : L'interfaccia che utilizza il client, l'altra interfaccia dovrà adattarsi a essa
-Adaptee: L'interfaccia che necessita di essere adattata.
-Adapter: La classe che adatterà Adaptee
-Client : L'applicazione che usufruisce delle varie entità, utilizzerà principalmente il Target, per evitare
          di riscrivere del codice o di riadattare le librerie sfrutterà l'adapter.

Mettiamo caso che abbiamo un'applicazione su cui lavoriamo. 
Necessitiamo di installare una libreria che implementa un'interfaccia che però sfrutta 
le stesse funzionalità della nostra. Abbiamo dunque bisogno delle classi importate dalla libreria
che però implementano tutt'altra interfaccia che il client non usa, per evitare di riscrivere del codice
ci limitiamo ad adattare l'interfaccia della libreria con una classe Adapter

Nell'esempio fornito in questo package abbiamo due interfacce che eseguono le stesse funzioni, ereditate però da classi differenti.
il client usa principalmente le classi che ereditano dall'interfaccia Forma, dunque adattare un eventuale progetto di grosse
dimensioni all'utilizzo di FormaGeometrica comporterebbe enormi tempi, qui entra in gioco il pattern Adapter.
Riportandoci su un piccolo esempio di applicativo Client, il main risulterebbe come segue:

public class avvio {

    public static void main(String[] args) throws SQLException {
        ArrayList<Forma> forme = new ArrayList();
        forme.add(new Quadrato(3));
        forme.add(new FormaObjectAdapter(new Rettangolo(2,2)));
        
        for(Forma f : forme){
            System.out.println(f);
        }
    }
    
 In questo modo utilizzando FormaObjectAdapter (l'adapter) riusciamo a convertire in Forma una classe che eredita
 da FormaGeometrica senza grosse modifiche.
}
*/