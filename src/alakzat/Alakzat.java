package alakzat;

public class Alakzat
{
    public static void main(String[] args)
    {
        new Alakzat().feladat();
    }
    
    private void feladat()
    {
        Negyzet n = new Negyzet(5, new Koordinatak(1, 2));
        System.out.println(n);
    }
}
