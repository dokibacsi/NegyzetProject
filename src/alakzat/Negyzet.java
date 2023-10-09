package alakzat;

public class Negyzet
{
    private int oldalhossz = 5;
    private int xKoord = 1;
    private int yKoord = 2;
    
    @Override public String toString()
    {
        return String.format("Oldalhossz: %d\nKoordináták: x = %d, y = %d\nTerület: %d", oldalhossz, xKoord, yKoord, oldalhossz * oldalhossz);
    }
}
