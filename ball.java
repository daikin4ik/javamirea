# javamirea
package damn1;

public class ball
{
    private String name;
    private int size;

    public ball(String n, int s)
    {
        name = n;
        size = s;
    }
    public ball(String n)
    {
        name = n;
        size = 0;
    }
    public ball()
    {
        name = "sheeesh";
        size = 0;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setSize(int size)
    {
        this.size = size;
    }
    public String getName()
    {
        return name;
    }
    public int getSize()
    {
        return size;
    }
    public String toString()
    {
        return this.name+", size - "+this.size;
    }
    public void vivod()
    {
        System.out.println(name);
        System.out.println(size);
    }
}
