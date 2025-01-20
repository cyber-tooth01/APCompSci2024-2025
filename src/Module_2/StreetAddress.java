package Module_2;

// Create the class here
public class StreetAddress {
    private String street = "";
    private String city = "";
    private String state = "";
    private String zip = "";

    public StreetAddress(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZIP() {
        return zip;
    }

    public void setZIP(String zip) {
        this.zip = zip;
    }

    public String mailingLabel(){
        return this.getStreet() + "\n" + this.getCity() + ", " + this.getState() + " " + this.getZIP();
    }

}