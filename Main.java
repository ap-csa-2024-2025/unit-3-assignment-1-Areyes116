class Rectangle
{
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength()
    {
        return length;
    }

    public int getWidth()
    {
        return width;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        Rectangle rectangle = (Rectangle) obj;
        return length == rectangle.length && width == rectangle.width;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle(2, 4);
        Rectangle r2 = new Rectangle(4, 2);

        // isRotated: true if one rectangle's length equals the other's width and vice versa
        boolean isRotated = (r1.getLength() == r2.getWidth()) && (r1.getWidth() == r2.getLength());

        // isCongruent: true if the rectangles are either rotated or exactly equal
        boolean isCongruent = isRotated || r1.equals(r2);

        // isSimilar: true if the rectangles are congruent or their length-to-width ratios are the same
        boolean isSimilar = isCongruent || ((double) r1.getLength() / r2.getLength() == (double) r1.getWidth() / r2.getWidth());

        // Print the results
        System.out.println("isRotated: " + isRotated);
        System.out.println("isCongruent: " + isCongruent);
        System.out.println("isSimilar: " + isSimilar);
    }
}

public boolean cigarParty(int cigars, boolean isWeekend)
{
    return (cigars >= 40 && (cigars <= 60 || isWeekend));
}

public boolean squirrelPlay(int temp, boolean isSummer)
{
    return temp >= 60 && (temp <= 90 || (isSummer && temp <= 100));
}

public boolean love6(int a, int b)
{
    return a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6;
}

public boolean in1To10(int n, boolean outsideMode)
{
    return outsideMode ? n <= 1 || n >= 10 : n >= 1 && n <= 10;
}
