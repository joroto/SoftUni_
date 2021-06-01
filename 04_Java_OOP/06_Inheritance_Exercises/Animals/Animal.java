package Animals;

public abstract class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public abstract String produceSound();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setAge(int age) {
        valid(age);
        this.age = age;
    }

    public void setGender(String gender) {
        valid(gender);
        this.gender = gender;
    }

    public void setName(String name) {
        valid(name);
        this.name = name;
    }

    private void valid(String str){
        if(str.trim().isEmpty()){
            throw new IllegalArgumentException("Invalid input!");
        }
    }
    private void valid(int n){
        if(n < 0){
            throw new IllegalArgumentException("Invalid input!");
        }
    }
    @Override
    public
    String toString () {
        return String.format ("%s%n%s %d %s%n%s", getClass ().getSimpleName (), getName (), getAge (), getGender (), produceSound ());
    }
}
