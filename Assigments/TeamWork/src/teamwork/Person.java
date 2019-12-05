
package teamwork;


public class Person {
    private String name;
    private String yearOfBirth;
    private String age ;

    public Person(String name, String yearOfBirth, String age) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.age = age;
    }

    public Person() {
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the yearOfBirth
     */
    public String getYearOfBirth() {
        return yearOfBirth;
    }

    /**
     * @param yearOfBirth the yearOfBirth to set
     */
    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    /**
     * @return the age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.age = age;
    }

    

    


}
