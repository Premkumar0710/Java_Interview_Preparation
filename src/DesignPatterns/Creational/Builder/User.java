package DesignPatterns.Creational.Builder;

public class User {
    // mandatory fields
    private final String name;
    private final int age;

    // optional fields
    private final String city;
    private final String phone;
    private final String email;

        private User(Builder builder) {
            this.name = builder.name;
            this.age = builder.age;
            this.city = builder.city;
            this.phone = builder.phone;
            this.email = builder.email;
        }

    public static class Builder {
        // mandatory fields
        private final String name;
        private final int age;

        // optional fields
        private String city;
        private String phone;
        private String email;

        public Builder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

        @Override
        public String toString() {
            return "Builder{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", city='" + city + '\'' +
                    ", phone='" + phone + '\'' +
                    ", email='" + email + '\'' +
                    '}';
        }
    }

