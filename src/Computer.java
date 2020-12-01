public class Computer {

    private String privateName;//We have this set as "private", therefore only this class can view privateName
    public String publicName;//We have this set as "public", that means any class can view and change this field

    public Computer(String name) {
        this.privateName = name;
        this.publicName = name;
    }

    /**
     * Since only this class can access privateName, the only way to get access to it is by calling a method that returns that value.
     * This method returns the value of privateName. It prevents users from accessing the field directly (and perhaps changing it), but still allowing them viewing access
     */
    public String getPrivateName() {
        return privateName;
    }
}
