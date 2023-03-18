package AbstractInterface;

public class AccessControl {
    // public: 모두 접근 가능
    public String name1 = "public_name";
    // protected :  패키지내 + 상속시 모두 접근 가능
    protected String name2 = "protected_name";
    // default : 패키지내에서만 접근 가능
    String name3 = "default_name";
    // private : 클래스 내에서만 접근 가능
    private String name4 = "private_name";
}
