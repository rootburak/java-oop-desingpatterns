class User {

    private final String name;
    private final int age;
    private final String email;
    private final String address;

    private User(UserBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.address = builder.address;
    }

    @Override
    public String toString() {
        return (
            "User{" +
            "username='" +
            name +
            '\'' +
            ", email='" +
            email +
            '\'' +
            ", age=" +
            age +
            ", address='" +
            address +
            '\'' +
            '}'
        );
    }

    public static class UserBuilder {

        private final String name;
        private final int age;
        private String email;
        private String address;

        public UserBuilder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}

public class Builder {

    public static void main(String[] args) {
        User newuser = new User.UserBuilder("Burak", 20)
            .email("burak1@outlook.com")
            .address("unkown")
            .build();
        System.out.println(newuser);
    }
}
