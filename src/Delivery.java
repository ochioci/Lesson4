//This class, Delivery, is an extension of SimplePackage.
//This means that Delivery is guaranteed to have *every* property, method, etc, of the SimplePackage class.
//That is to say that Delivery *inherits* SimplePackage.
//That is also to say that Delivery is a *derived class*

public class Delivery extends SimplePackage{

    //Our attributes
    public String origin;
    public String destination;

    //Our constructor
    public Delivery (String origin, String destination, Double length, Double width, Double height, Double weight) {
        super(length, width, height, weight);
        //Within the constructor of a derived class, we must use the "super" keyword.
        //Don't get too caught up in it, java handles all the heavy-lifting behind the scenes, but
        //super(params) is a reference to the SimplePackage constructor. It guarantees that our Delivery class will
        //inherit all the properties of the SimplePackage class.


        this.origin = origin;
        this.destination = destination;
    }

    //Here is another constructor that takes a SimplePackage as a parameter.
    public Delivery (SimplePackage myPackage, String origin, String destination) {
        super(myPackage.length, myPackage.width, myPackage.height, myPackage.weight);
        this.origin = origin;
        this.destination = destination;
    }
}
