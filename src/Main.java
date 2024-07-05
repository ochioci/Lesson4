public class Main {
    public static void main(String[] args) {

        //Lesson 4 - Object-Oriented Programming

        //At long last! It is time to create our own object classes.

        //To create an object class - we must first create another java file.
        //Please navigate to SimplePackage.java

        // ---

        //SimplePackage demo

        SimplePackage myPackage = new SimplePackage(); //Invoking the default constructor

        //Since the default constructor does not initialize any of our attributes, they will be equal to null until modified.


//        System.out.println("\nDefault myPackage attribute values: ");
//        System.out.println(myPackage.height);
//        System.out.println(myPackage.length);
//        System.out.println(myPackage.width);
//        System.out.println(myPackage.weight);

        //But an object that holds only null values wouldn't be useful, so let's modify them...

        myPackage.height = 10.0;
        myPackage.width = 15.0;
        myPackage.length = 7.5;
        myPackage.weight = 3.0;

        //And print again...

//        System.out.println("\nUpdated myPackage attribute values: ");
//        System.out.println(myPackage.height);
//        System.out.println(myPackage.length);
//        System.out.println(myPackage.width);
//        System.out.println(myPackage.weight);


        //This is a great way of structuring data, but it is very tedious to manually set every attribute to a value.
        //That's why we are going to make our own constructor!
        //Please navigate to SimplePackage.java before proceeding


        SimplePackage myPackage2 = new SimplePackage(10.0, 15.0, 7.5, 3.0);
        //This code creates an object that is identical to our original package object after we modified its attributes
        //All in a single line! That is the power of constructors.

        //Suppose we really were developers for a warehouse.
        // We'd need to not just store information about packages, but do things with the data as well.
        // For example, computing the volume of the package. We could always do it manually with something like
        Double manuallyComputedVolume = myPackage2.width * myPackage2.height * myPackage2.length;

        //This works perfectly fine, but there is a better way to do this!
        //Head back to SimplePackage.java
        //let's make sure our object method works!

//        System.out.println("\nVolume Comparison:");
//        System.out.println(manuallyComputedVolume);
//        System.out.println(myPackage2.volume());


        //What if we wanted to keep track of how many package objects were created?
        //We could just manually increment a counter every time we create a new package,
        //But that would be inconvenient and bad practice. It'd be easy to forget to increment it.
        //Java has a better way to do it!

        //Recall the idea of a static.
        //Just as our "volume()" method belongs to every instance of the SimplePackage class,
        //a static would belong to the prototype of the SimplePackage class.
        //In other words, statics belong to the prototype, not the instance.

        //So, what if we created a counter that belongs to the prototype of the SimplePackage class?
        //This counter would retain memory across different SimplePackage instances
        //If we programmed our constructor to increment this counter every time we minted a new SimplePackage instance.
        //Since I must make these lessons in advance, I've already sneakily included this functionality.
        //It's been counting the packages we've already minted.

//        System.out.println("\nPackages minted so far: ");
//        System.out.println(SimplePackage.packageCount);

        SimplePackage myPackage3 = new SimplePackage();
        SimplePackage myPackage4 = new SimplePackage();

        System.out.println("\nPackages minted so far: ");
        System.out.println(SimplePackage.packageCount);


        //Now, you've seen all the things a user-defined class can do on its own!
        //We can use a class to structure data, attach methods to the class to modify that data or compute things with it
        //We can also use statics to keep track of data that is relevant to all instances of the class.

        //However, there is one more crucial building block of OOP to learn: Inheritance.
        //Please navigate to the Delivery.java file.

        Delivery myFirstDelivery = new Delivery("New York", "Syracuse", 8.0, 9.0, 4.5, 3.2);

                System.out.println("\nPackages minted so far: ");
        System.out.println(SimplePackage.packageCount);


    }
}