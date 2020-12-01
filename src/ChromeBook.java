public class ChromeBook extends Laptop{


    public ChromeBook() {
        //We always have to call the superclass no matter what
        super();//Notice that the super constructor (Laptop's constructor) does not require any parameters, thus we dont pass any values

        String superClassPublicName = publicName;//Notice that we still have access to Computer's fields, even though we are a few inheritances away
        String superClassPrivateName = getPrivateName();//The same applies with methods. Even though we have Laptop between Computer and ChromeBook, ChromeBook still has
        //access to its methods
    }


    /**
     * We override this getBrand() method. This means that we ignore any implementation from Laptop's getBrand() method and do our own thing. In this case we return
     * String "Google" as ChromeBook's overridden implementation
     */
//    @Override
//    public String getBrand() {
//        return "Google";
//    }

    /**
     * We also override this method, however we are able to call Laptop's getBrand() method, essentially combining Laptop's implementation with our own additional
     *
     */
    @Override
    public String getBrand() {
        String laptopsGetBrand = super.getBrand();//Whenever we write "super" we are referring to the superclass (in this case Laptop). By doing super.getBrand(), we are saying
        //to call Laptop's getBrand() method. It will return the String "Lenovo"
        return "Google: " + laptopsGetBrand;//Now that we have Laptop's getBrand() value, we combine it with our own by concatenating "Google: " with laptopsGetBrand
    }



}
