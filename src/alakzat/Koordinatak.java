package alakzat;

public class Koordinatak
{
    private int x;
    private int y;
    
    public Koordinatak(int x, int y)
    {
        setX(x);
        setY(y);
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }
    
    @Override public String toString()
    {
        return String.format("x = %d, y = %d", x, y);
    }
}
