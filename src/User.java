import java.util.Arrays;

public class User {
    private int id;
    private String name;
    private int age;
    private double footSize;
    private String[] skills;
    private Wallet wallet;

    public User() {
    }

    public User(int id, String name, int age, double footSize, String[] skills) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.footSize = footSize;
        this.skills = skills;
    }

    public User(int id, String name, int age, Wallet wallet) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.wallet = wallet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getFootSize() {
        return footSize;
    }

    public void setFootSize(double footSize) {
        this.footSize = footSize;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", footSize=" + footSize +
                ", skills=" + Arrays.toString(skills) +
                ", wallet=" + wallet +
                '}';
    }
}
