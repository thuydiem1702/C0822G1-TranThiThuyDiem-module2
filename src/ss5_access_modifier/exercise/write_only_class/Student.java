package ss5_access_modifier.exercise.write_only_class;

public class Student {
    private  String name="John";
    private String classes = "CO2";
    public Student(){

    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    public void display (){
        System.out.println("name : "+ getName()+"\n class : " + getClasses() );
    }
}
