package task8;

//task 8
public class GetAndSet {
    private String name;
    private int age;
    private String sex;
    private double weight;
    private boolean isMarried;

    public GetAndSet (String name, int age, String sex, double weight, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
        this.isMarried = isMarried;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public double getWeight() {
        return weight;
    }

    public boolean IsMarried() {
        return isMarried;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age > 0 & age < 150) {
        this.age = age;
        } else {
            throw new IllegalArgumentException("The value " + age + " is incorrect. Please, provide a value between 0 and 150");
        }
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void IsMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    public static void main(String[] args) {
        GetAndSet women = new GetAndSet("Jane", 26, "female", 52, true);
        String name1 = women.getName();
        System.out.println(name1);

        women.setAge(27);
        int age1 = women.getAge();
        System.out.println(age1);
    }
}
