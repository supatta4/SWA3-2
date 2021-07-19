// Java program to demonstrate one object to
// initialize another
class Box
{
    double width, height, depth;
  
    // Notice this constructor. It takes an
    // object of type Box. This constructor use
    // one object to initialize another
    Box(Box ob)
    {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
  
    // constructor used when all dimensions
    // specified
    Box(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }
  
    // compute and return volume
    double volume()
    {
        return width * height * depth;
    }
}
  