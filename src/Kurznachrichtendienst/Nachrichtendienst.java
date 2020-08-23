package Kurznachrichtendienst;

import java.util.Observable;

public class Nachrichtendienst extends Observable
{
    private Kategorie kat;
    private String msg;
    public Kategorie getKat()
    {
        return kat;
    }
    public String getMsg()
    {
        return msg;
    }
    public enum Kategorie
    {
        Politik, Wirtschaft, Sport;
    }
    public void send(Kategorie kat, String msg)
    {
        this.kat = kat;
        this.msg = msg;
        setChanged();
        notifyObservers(this);
    }
}
