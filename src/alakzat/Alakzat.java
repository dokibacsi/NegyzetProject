package alakzat;

public class Alakzat
{
    public static void main(String[] args)
    {
        new Alakzat().feladat();
    }
    
    private void feladat()
    {
        Negyzet n = new Negyzet();
        n.setOldalhossz(5);
        Koordinatak k = new Koordinatak();
        k.setX(1);
        k.setY(2);
        n.setKoordinatak(k);
        System.out.println(n);
    }
}
