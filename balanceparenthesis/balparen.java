public class balparen {
    private char[] stackarr;
    private int top;

    public balparen(int maxsize)
    {
        stackarr = new char[maxsize];
        top = -1;
    }
    public void push(char c)
    {
        stackarr[++top] = c;

    }
    public char pop()
    {
        return stackarr[top--];
    }
    public void check()
    {

        int counter =0;
        int closecounter =0;
        for(int i=0;i<top+1;i++)
        {
            if(stackarr[i] == '(')
                counter++;
            if(stackarr[i] == ')')
                closecounter++;

        }
        if(counter == closecounter)
            System.out.println("Balanced Parenthesis");
        else
            System.out.println("Unbalanced Parenthesis");
    }


    public boolean empty()
    {
        return top == -1;
    }
}
