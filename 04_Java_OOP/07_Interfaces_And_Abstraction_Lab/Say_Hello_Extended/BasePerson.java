package Say_Hello_Extended;

public abstract class BasePerson implements Person {
    private String name;
    protected BasePerson(String name){
        this.setName(name);
    }

    @Override
    public String sayHello(){
        return "Hello";
    }

    public String getName(){
        return this.name;
    }

    private void setName(String name){
        this.name = name;
    }
}
