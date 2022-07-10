public class binarysearchtree {
    class Student {  //student class
        String firstname;
        String lastname;
        String emailid;

        public Student(String f, String l, String e) {
            firstname = f;
            lastname = l;
            emailid = e;
        }
    }

    class node
    {
        int id;
        Student s;  //student in data field
        node left, right;

        public node(int id,String f,String l,String e)
        {
            s=new Student(f,l,e);
            this.id = id;
            left = right = null;
        }

    }

    node root;
Student s;
    public void insertinfo(int id,String f,String l,String e) //this method receives the info
    {

        root = insert(id,f,l,e,root); //calling the body of inserting
    }

    public node insert(int id,String f,String l,String e, node root) {




        if (root == null) {
            root = new node(id,f,l,e);
            return root;

        }

        if (id < root.id)

            root.left = insert(id,f,l,e,root.left);



        else if (id > root.id)


            root.right = insert(id,f,l,e,root.right);



        return root;
    }

    public Student find(int id) //build another method so it can receive integer from main
    {
        return  findRec(id,root);
    }
    public Student findRec(int id,node root) { //the body of finding information. if cannot find, return null


       while (root.id != id) {

           if (id < root.id) {
               root = root.left;

           } else {
               root = root.right;

           }
if(root == null)
    return null;
       }
        return root.s;

    }

}
