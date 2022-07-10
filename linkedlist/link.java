public class link {
    public int iData; // data item (key)
    //public int dData;
    public link next;


    public link(int id) // constructor
    {
        iData = id;

    }

    public void displayLink()
    {
        System.out.print("{" + iData + "}");
    }
}
