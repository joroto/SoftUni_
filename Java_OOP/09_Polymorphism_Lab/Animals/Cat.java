package Animals;

public class Cat extends Animal{
    public Cat(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    protected String explainSelf() {
        return "I am "+ getName() +" and my favourite food is "+ getFavouriteFood() +"\nMEEOW";
    }
}
