class test{
    public static void main(String args[]) {
        /*ClassF z = new ClassF();
        z.print(9);
        z.print(2,"cx2002");
        z.print("object");
        z.print("OODP","Java");
        //z.print("OODP",2002) compile error;*/

        /*ClassC c = new ClassD();
        c.print("hello", " there");*/

        // cannot be instanciated Abstract VS none abstract
        /*ClassA a = new ClassC();
        a.print(1,"There");*/

        // cannot jump to sub->sub class
       /* ClassA e = new ClassF();
        e.print("Hello","There");*/

        /*ClassC c = new ClassD();
        ClassE e = c; mis match conversion*/
        /*ClassB b = new ClassE(); mismatch conversion
        b.print("hello");*/
        /*ClassA a = new ClassF(); 
        a.print(12,"there"); */
        //a.print(88); input error 
       /* ClassA a = new ClassC(); 
        ClassG g = (ClassG)a; 
        g.print("hello"); cannot cast*/
        /*ClassA a = new ClassC(); 
        ClassG g = (ClassG)a; 
        g.print("hello","there");*/
        ClassA a = new ClassF();
        ClassC f = (ClassC)a; 
        f.print(88,"there");

    }    
}