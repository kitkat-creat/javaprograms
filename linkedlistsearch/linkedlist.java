import org.w3c.dom.Node;

class Student{  //the node is student
    int id;
    String first;
    String last;
    String email;
    Student next;

    Student(int id,String first,String last,String email){
        this.id = id;
        this.first = first;
        this.last = last;
        this.email = email;

    }
}

public class linkedlist {

    Student head;
   public boolean insertstudent(Student s)  //parameter is the student class
   {
        if(head == null)
        {
            head = s; //pass the s to the head of the list
            return true;
        }
        else
        {
            Student last = head;
            while(last.next != null)
            {
                if(last.id == s.id)  //if students have same id, then not inserting it
                {
                    return false;
                }
                last = last.next;
            }
            last.next = s;
        }
        return true;
    }
    public boolean deletestudent(int id)
    {
        Student current = head;
        Student previous = null; //nothing on previous element
        if(current != null && current.id == id) //check the first
        {
            head = current.next;

            return true;
        }
         else {
            while (current != null && current.id != id) { //the id does not match
                previous = current;                   //pass the current to previous
                current = current.next;             //make the list move
            }
            if(current != null) //if id was found somewhere on the list
            {
                previous.next = current.next;
                return true;
            }
        }

        return false;
    }

    public Student search(String info) //always make sure there is no empty list
    {
       if(head == null)
           return null;

       else
       {
           Student current = head;
           while(current.next != null) //always going through whole list
           {
               if(current.first.equals(info) || current.last.equals(info) || current.email.equals(info))
               {
                   return current;  //if found, return what they have found
               }
               current = current.next; //move on to the next element
           }
       }
       return null;
    }
public void display()
{
    Student current = head;
    System.out.println("List: ");

    while(current != null)
    {
        System.out.print(current.first + " " + current.last +"\n");
        System.out.print(current.email + " \n\n");
        current = current.next;
    }
}

}
