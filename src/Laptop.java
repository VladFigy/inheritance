public class Laptop extends Computer{

    public Laptop() {
        //We always have to call the superclass no matter what
        super("Vlad");//Notice that the super constructor (Computer's constructor) wants a String parameter. In here, we hardcode a String value of "Vlad"

        String superClassPublicName = publicName;//Since publicName is public, we can access that field in this class
        //String superClassPrivateName = privateName;//Since privateName is private, we cannot access that field in this class (or any other class besides Computer!)
        String superClassPrivateName = getPrivateName();//We can can call the super class' method of getPrivateName() to get a value.
    }

    /**
     * Simply returns a string of "Lenovo"
     */
    public String getBrand(){
        return "Lenovo";
    }
}
