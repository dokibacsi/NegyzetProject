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

    @Override public boolean equals(Object obj)
    {
        return obj instanceof Negyzet masik ? oldalhossz == masik.getOldalhossz() : false;
    }
    
    @Override public String toString()
    {
        return String.format("Oldalhossz: %d\nKoordináták: %s\nTerület: %d", oldalhossz, koordinatak, oldalhossz * oldalhossz);
    }
}
