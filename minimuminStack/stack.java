public class stack {
    private int[] stackarray;
    private int top;

    public stack(int max)
    {
        stackarray = new int[max];
        top = -1;   //indicator that the array is empty
    }
    public void push(int value)
    {
        stackarray[++top] = value;

    }

    public int pop()
    {
        return stackarray[top--];
    }
    public int getmin()
    {

        int min = stackarray[0];
        for(int i=1;i<top+1;i++)
        {
            if(stackarray[i] < min){
                min = stackarray[i];

            }
        }
        return min;
    }
    public boolean empty()
    {
        return top == -1;
    }




}
