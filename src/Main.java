import java.util.ArrayList;

public class Main {


    public static void main(String[] args){

        //POLYMORPHISM
        //This allows us to save different types of data into other data types even though they are "different" data types. It all depends on the inheritance

        Computer computer = new Computer("Bob");//This is the typical way you would expect a new Computer instance/object to be created

        Computer computer_laptop = new Laptop();//But now notice that we save the variable "computer_laptop" as data type "Computer" in the program. This is allowed
        //because Laptop has all the methods and fields that is required by Computer since it inherited all the components from Computer
        //to make a new instance -- the program ignores everything else, including the getBrand() method
        //However, even though the program sees "computer_laptop" as a variable as type "Computer", physically in memory the variable is stored as type "Laptop". So while it might
        //behave as a "Computer," its true type is "Laptop"

        Computer computer_chromeBook = new ChromeBook();//The same thing applies here. We set the data type "computer_chromeBook" to "Computer", but in the physical memory
        //it is stored as a "ChromeBook"


        //ACCESSING DIFFERENT METHODS

        Computer computer_two = new ChromeBook();
        Laptop laptop = new Laptop();
        ChromeBook chromeBook = new ChromeBook();

        String str = computer_two.publicName;//We can directly access "publicName" because its access modifer is set to "public"
        computer_two.getPrivateName();//Just a method call

        str = laptop.publicName;//Since "Laptop" has inherited "Computer", that meanss we have access to everything computer had
        laptop.getPrivateName();//This was also in "Computer", thus we have access to it
        laptop.getBrand();//This is "Laptop's" specific method, thus it only exists for Laptop and not for Computer

        str = chromeBook.publicName;//We inherit "Laptop" in "ChromeBook", this means that we have everything that "Laptop" has. But since "Laptop" inherit's everything from
        //"Computer", that means all of the components from "Computer" are brought up to "ChromeBook"
        chromeBook.getPrivateName();
        chromeBook.getBrand();//We do have access to getBrand() because we inherited it, however in our "ChromeBook" class we override getBrand(). This means that when this is
        //called, it will use the overriden implementation instead of "Laptop's" getBrand()





        //CASTING
        //Sometimes, when we know the true datatype of a variable, we can convert that variable into different data types that the program can see

        //In this case, we are casting "computer_chromeBook" into "ChromeBook", and this is allowed because the true data type of "computer_chromeBook"
        //is "ChromeBook". We allow the program to once again see all the method specific stuff that is in ChromeBook and in Laptop
        ((ChromeBook) computer_chromeBook).getBrand();//Returns "Google: Lenovo"

        ((Laptop) computer_laptop).getBrand();//Returns "Leovo"
        //In this case we are casting "computer_laptop" into Laptop, since the true data type of "computer_laptop" is Laptop.

        ((Laptop)computer_chromeBook).getBrand();//Returns "Google: Lenovo
        //Although we are casting "computer_chromeBook" into Laptop, when we call getBrand() we get "Google: Lenovo". This is because
        //"ChromeBook" overrides getBrand(). Even though we do not cast this into "ChromeBook", when we call getBrand(), the program sees that the true data type is "ChromeBook"
        //and it sees that "ChromeBook" indeed does have a method getBrand(), and so it executes "ChromeBook's" method instead of "Laptop's" method

        //USE CASE
        ArrayList<Laptop> laptopArrayList = new ArrayList<>();//We create a new arraylist that accepts any value that has "Laptop" somewhere in its inheritance

        laptopArrayList.add(new Laptop());
        laptopArrayList.add(new Laptop());
        laptopArrayList.add(new ChromeBook());//We are able to add "ChromeBook" since it inherits "Laptop" somewhere in its inheritance line
        laptopArrayList.add(new ChromeBook());

        for(Laptop laptopFromList : laptopArrayList){
            System.out.println(laptop.getBrand());//When we print this out, it will print our all the results from the elements of the list.
            //But remember that "ChromeBook" and "Laptop" both have the methods of getBrand(), which means that this line is legal. "laptopFromList" will always have a getBrand() method
        }




    }

}
