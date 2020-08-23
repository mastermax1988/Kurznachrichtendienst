package Kurznachrichtendienst;

import java.util.Observable;
import java.util.Observer;

public class Abonennt implements Observer
{
    Nachrichtendienst.Kategorie kat;
    Nachrichtendienst nd;
    public Abonennt(Nachrichtendienst.Kategorie kat, Nachrichtendienst nd)
    {
        this.nd = nd;
        this.kat = kat;
    }

    @Override
    public void update(Observable observable, Object o)
    {
        if(nd.getKat() == kat)
            System.out.println(kat + ": " + nd.getMsg());
    }
}
