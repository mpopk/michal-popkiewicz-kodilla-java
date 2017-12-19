package foodDoor2Door;

public class User {

    private String name;

    private String nickName;

    public User(String name, String nickName) {
        this.name = name;
        this.nickName = nickName;
    }

    public String getName() {
        return name;
    }

    public String getNickName() {
        return nickName;
    }
}
