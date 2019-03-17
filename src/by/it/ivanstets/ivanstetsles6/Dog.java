package by.it.ivanstets.ivanstetsles6;

public class Dog {
    private String name;
    private int age;
    private int weight;
    private double power;

    public Dog() {

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    boolean win(Dog otherDog){
        double chancesToWin1=0.2* this.getAge()+0.3*this.getWeight()+0.5*this.getPower();
        double chancesToWin2=0.2* otherDog.getAge()+0.3*otherDog.getWeight()+0.5*otherDog.getPower();
        if (chancesToWin1>chancesToWin2)
            return true;
        else return false;

    }

    public Dog(int i, int nextInt, double v, int anInt, String s) {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0)
            this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Кличка: " + name + ". Возраст: " + age;

    }
}
