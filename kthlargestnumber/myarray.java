public class myarray {
    private int[] a;
    int numelem;

    public myarray(int max)
    {
        a = new int[max];
        numelem = 0;
    }
    public void insert(int value)
    {
        a[numelem++] = value;
    }

    public void selectionSort() {               //sort in descending order
        for(int i=0;i< numelem;i++)
        {
            for(int j=i+1;j<numelem;j++)
            {
                if(a[i]< a[j])
                {
                    int temp    =a[i];
                    a[i]  =a[j];
                    a[j]  =temp;
                }
            }


        }


    }
public int largestkth(int k)
{

    int largest=0;
    k = k-1;
    for(int i=0;i< numelem;i++)
    {


        largest = a[k];

    }
    return largest;
}

}
