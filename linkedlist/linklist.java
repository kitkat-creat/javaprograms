public class linklist {
    private link first;

   // public linklist() // constructor
    //{
     //   first = null;
   // }


    public void insertFirst(int id)
    {
        link newLink = new link(id);
        newLink.next = first;
        first = newLink;
    }

    public link deleteFirst()
    {

        link current = first;


            link nextnum = first.next;

        while (nextnum != null && current != null) {
                if (current.iData == nextnum.iData) {

                    current.next = nextnum.next;
                    nextnum = current.next;

                } else {

                    //nextnum = nextnum.next;
                    current = current.next;


                }

            }


        return current;


    }

    public void displayList()
    {

        link current = first;
        while(current != null)
        {
            current.displayLink();
            current = current.next;
        }
System.out.println("");
    }
    }

