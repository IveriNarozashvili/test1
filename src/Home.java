public class Home {



    private String age;
    private  String value;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "Home{" +
                "age='" + age + '\'' +
                ", value='" + value + '\'' +
                '}';
    }




}
