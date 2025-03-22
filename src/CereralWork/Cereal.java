package CereralWork;

public class Cereal {
    private float rating;
    private int weight;
    private int sugar;
    private int fat;
    private int calories;
    private String name;

    public Cereal(float rate, int weigh, int sugars, int fats, int cals, String nameOfCereal){
        rating = rate;
        weight = weigh;
        sugar = sugars;
        calories = cals;
        fat = fats;
        name = nameOfCereal;
    }

    public float getRating() {
        return rating;
    }
    public int getCalories() {
        return calories;
    }

    public int getFat() {
        return fat;
    }

    public int getSugar() {
        return sugar;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
