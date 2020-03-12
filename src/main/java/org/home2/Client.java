package org.home2;

public class Client {

        String name;
        int age;
        int numberOfMoney;

        public Client(String name, int age, int numberOfMoney) {
            this.name = name;
            this.age = age;
            this.numberOfMoney = numberOfMoney;
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


        public int getNumberOfMoney() {
            return numberOfMoney;
        }

        public void setNumberOfMoney(int numberOfMoney) {
            this.numberOfMoney = numberOfMoney;
        }

        @Override
        public String toString() {
            return "Client{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", numberOfMoney=" + numberOfMoney +
                    '}';
        }
    }