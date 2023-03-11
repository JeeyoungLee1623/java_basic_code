package instance_class;

    // 생성자(constructor) 는 메서드 인데, 클래스의 이름을 가진 메서드이다.
    // 생성자의 역할은 인스턴스 변수를 초기화하는데 있다.
    // 생성자 메서드는 객체가 생성됨과 동시에 실행되는 메서드이다.
public class ConstructorTest {
        private String name;
        private String email;
        private String password;
        private int age;

        // 생성자가 선언되어 있지 않으면, 매개변수가 없는 기본 생성자가 생성
        // 예) InstanceUerSample user1 = new InstanceUerSample();

        // 별도의 생성자를 추가하게 되면, 반드시 기본 생성자를 따로 추가해줘야 한다.
        // 초기화를 강제로 시키는 것
        public ConstructorTest(String password, int age){
            this.password = password;
            this.age = age;
        }

        public String getPassword() {
            return password;
        }

        public int getAge() {
            return age;
        }







    }
