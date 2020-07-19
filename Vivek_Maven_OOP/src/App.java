public class App
{
    public static void main( String[] args )
    {
        Student student1 = new Student();
        Chocolate c = new Chocolate();
        c.weight = 10;
        OtherSweets o = new OtherSweets();
        o.weight = 600;
        student1.name = "Anand";
        System.out.println(student1.name);
        System.out.println("Total weight");
        System.out.println(c.weight + o.weight + " grams");
        System.out.println("\n");


        Student student2 = new Student();
        Chocolate a = new Chocolate();
        OtherSweets ob = new OtherSweets();
        a.weight = 52;
        ob.weight = 900;
        student2.name = "Bhanu";
        System.out.println(student2.name);
        System.out.println("Total weight");
        System.out.println(a.weight + ob.weight + " grams");
        System.out.println("\n");


        Student student3 = new Student();
        student3.name = "Chandu";
        Chocolate q = new Chocolate();
        OtherSweets z = new OtherSweets();
        Chocolate g = new Chocolate();
        q.weight = 15;
        g.weight = 32;
        z.weight = 500;
        System.out.println(student3.name);
        System.out.println("Total weight");
        System.out.println(q.weight + g.weight + z.weight + " grams");
        System.out.println("\n");
        
        
        Student student4 = new Student();
        student4.name = "Ramesh";
        Chocolate x = new Chocolate();
        OtherSweets y = new OtherSweets();
        Chocolate l = new Chocolate();
        x.setWeight(15);
        y.setWeight(32);
        l.setWeight(500);
        System.out.println(student4.name);
        System.out.println("Total weight");
        System.out.println(x.getWeight() + y.weight + l.weight + " grams");


    }
}
