package alakzat;

public class Negyzet
{
    private int oldalhossz;
    
    private Koordinatak koordinatak;
    
    public Negyzet(int oldalhossz, Koordinatak koordinatak)
    {
        setOldalhossz(oldalhossz);
        setKoordinatak(koordinatak);
    }
    
    public int getOldalhossz()
    {
        return oldalhossz;
    }

    public void setOldalhossz(int oldalhossz)
    {
        if (oldalhossz <= 0)
        {
            oldalhossz = 1;
        }
        this.oldalhossz = oldalhossz;
    }

    public Koordinatak getKoordinatak()
    {
        return koordinatak;
    }

    public void setKoordinatak(Koordinatak koordinatak)
    {
        this.koordinatak = koordinatak;
    }
    
    public boolean osszehasonlit(Negyzet masik)
    {
        return oldalhossz == masik.getOldalhossz();
    }
    
    @Override public String toString()
    {
        return String.format("Oldalhossz: %d\nKoordináták: x = %d, y = %d\nTerület: %d", oldalhossz, koordinatak.getX(), koordinatak.getY(), oldalhossz * oldalhossz);
    }
}
