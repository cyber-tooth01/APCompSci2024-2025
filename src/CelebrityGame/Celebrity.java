package CelebrityGame;

public class Celebrity {
    private String name;
    private String hint;

    public Celebrity(String n, String h){
        name = n;
        hint = h;
    }

    public String getName() {
        return name;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public void setName(String name) {
        this.name = name;
    }


}
