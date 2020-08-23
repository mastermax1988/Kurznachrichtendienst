package Kurznachrichtendienst;

public class MainClass
{

    public static void main(String[] args)
    {
        Nachrichtendienst nd = new Nachrichtendienst();
        Abonennt sport1 = new Abonennt(Nachrichtendienst.Kategorie.Sport, nd);
        Abonennt sport2 = new Abonennt(Nachrichtendienst.Kategorie.Sport, nd);
        Abonennt wirtschaft = new Abonennt(Nachrichtendienst.Kategorie.Wirtschaft, nd);
        Abonennt politik = new Abonennt(Nachrichtendienst.Kategorie.Politik, nd);
        nd.addObserver(politik);
        nd.addObserver(sport1);
        nd.send(Nachrichtendienst.Kategorie.Sport, "1860 erstklassig");
        nd.send(Nachrichtendienst.Kategorie.Politik, "Trump ist dumm");
        nd.deleteObserver(sport1);
        nd.addObserver(sport2);
        nd.addObserver(wirtschaft);
        nd.send(Nachrichtendienst.Kategorie.Sport, "Karate ist toll");
        nd.send(Nachrichtendienst.Kategorie.Wirtschaft, "dax steigt");
    }
}
