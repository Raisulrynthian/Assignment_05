package opassing;

public class Opassing {

    int x = 9;
    void ChangeOValue(Opassing p) 
    {
        p.x++;
    }
    
    public static void main(String[] args)
    {
        Opassing abc = new Opassing();
        System.out.println("x=" + abc.x);
        abc.ChangeOValue(abc);
        System.out.println("x=" + abc.x);
        
    }

}
