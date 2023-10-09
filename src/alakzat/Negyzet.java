package alakzat;

public class Negyzet
{
    int oldalhossz = 5;
    int xKoord = 1;
    int yKoord = 2;
    
    @Override public String toString()
    {
        return String.format("Oldalhossz: %d\nKoordináták: x = %d, y = %d\nTerület: %d", oldalhossz, xKoord, yKoord, oldalhossz * oldalhossz);
    }
}
