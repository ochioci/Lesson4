public class SimplePackage {
    public SimplePackage() {SimplePackage.packageCount +=1;} //Please disregard this line
    public static Integer packageCount = 0; //Please disregard this line (for now)

    //When creating an object class, we must create a new file that is named accordingly within our project's directory. 
    //I.e. the SimplePackage class MUST be in a file called SimplePackage.java
    //In the SimplePackage.java file we must describe the prototype of the SimplePackage class.

    //For this example, we are going to be modeling a package in a warehouses' database.
    
    
    //Think of each instance of the SimplePackage object as a row in a SQL database.
    public Double width;
    public Double height;
    public Double length;
    public Double weight;

    //Think of these attributes of the SimplePackage object as columns within that row. 
    
    
    //Thus far, we have described the prototype of the SimplePackage class.
    //It has 4 attributes; width, height, length, and weight.

    //However, we have not described the constructor of the SimplePackage class.
    //The constructor is a component that 'mints' an instance of its class.
    //Recall that any time we use the "new" keyword, we are accessing the constructor of a class.
    //e.g. Scanner myScanner = new Scanner(System.in);

    //Even though we have not described a constructor for this class,
    //EVERY object in java has a constructor by default.
    //The default constructor takes no parameters and executes no code. It creates the most bare-bones instance possible of an object.
    //The default constructor only exists if you do not define your own!


    //Navigate back to Main.java for a demonstration





    //

    //Come back here later :)

    //



    //Below is an example of a user-defined constructor.
    //Inside the parenthesis are the parameters our constructor takes.
    public SimplePackage (Double length, Double width, Double height, Double weight) {
        //Within the constructor, we can use the "this" keyword to modify attributes of the object our constructor is returning.
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;

        //Ignore this for now :)
        SimplePackage.packageCount +=1;
    }



    //Now, navigate back to Main.java


    //

    //Come back here later :)

    //

    //Below is an example of a user-defined object method.
    //This is a function that we can call on any SimplePackage object.
    // Navigate back to Main.java for a demo.
    public Double volume () {
        return this.length * this.height * this.width;
    }

    
    
}
