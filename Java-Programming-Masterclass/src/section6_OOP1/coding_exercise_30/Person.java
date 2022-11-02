package section6_OOP1.coding_exercise_30;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public void setFirstName(String name){
        this.firstName = name;
    }

    public void setLastName(String name){
        this.lastName = name;
    }

    public void setAge(int age){
        if(age < 0 || age > 100){
            age = 0;
        }

        this.age = age;
    }

    public boolean isTeen(){
        if(this.age > 12 && this.age < 20){
            return true;
        }

        return false;
    }

    public String getFullName(){
        if(this.firstName.isEmpty() && this.lastName.isEmpty()){
            return "";
        } else if(this.lastName.isEmpty()){
            return this.firstName;
        } else if(this.firstName.isEmpty()){
            return this.lastName;
        }

        return this.firstName + " " + this.lastName;
    }
}
