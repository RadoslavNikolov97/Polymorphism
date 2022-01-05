package animals;

public class Animal {
    private String name;
    private String favoriteFood;

    public Animal(String name, String favoriteFood) {
        setName(name);
      setFavoriteFood(favoriteFood);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public String explainSelf(){

        return  String.format("I am %s and my favourite food is %s",getName(),getFavoriteFood());
    }

}
