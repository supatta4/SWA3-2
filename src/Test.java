// driver class
public class Test
{
    public static void main(String args[])
    {
        // creating a box with all dimensions specified
        Box mybox = new Box(10, 20, 15);
  
        //  creating a copy of mybox
        Box myclone = new Box(mybox);
  
        double vol;
  
        // get volume of mybox
        vol = mybox.volume();
        System.out.println("Volume of mybox is " + vol);
  
        // get volume of myclone
        vol = myclone.volume();
        System.out.println("Volume of myclone is " + vol);
    }
}