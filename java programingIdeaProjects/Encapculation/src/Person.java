public class Person {

   private String name ;

   private int  age;
   private String gender;

    public Person(String gender, int age, String name) {
        this.gender = gender;
        this.age = age;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean setAge(int age) {
        if (  age<0 || age > 100){
            this.age = age;
            return true;
        }
        else{
            return false;
        }
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
