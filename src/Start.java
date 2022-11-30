import java.util.Arrays;

public class Start {
    public static void main(String[] args) {

        User user = new User();
        user.setId(1);
        user.setName("Vasyl");
        user.setAge(25);

        int userId = user.getId();
        System.out.println(userId);
        String userName = user.getName();
        System.out.println(userName);

        String[] skills = new String[2];
        skills[0] = "java";
        skills[1] = "js";
        System.out.println(Arrays.toString(skills));

        Wallet wallet = new Wallet("shkira", 10000);

        User user1 = new User(2, "Ihor", 22, wallet);

        System.out.println(user);
        System.out.println(user1);
    }
}
