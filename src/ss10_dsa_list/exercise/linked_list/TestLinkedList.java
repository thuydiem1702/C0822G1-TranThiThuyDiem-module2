package ss10_dsa_list.exercise.linked_list;

import java.util.Objects;

public class TestLinkedList {
    public static void main(String[] args) {
        class Student{
            private int id;
            private String name;

            public Student() {
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Student student = (Student) o;
                return id == student.id &&
                        Objects.equals(name, student.name);
            }

        }
        MyLinkedList<Student> myLinkedList=new MyLinkedList<>();
        Student student1=new Student(1,"Lan1");
        Student student2=new Student(2,"Lan2");
        Student student3=new Student(3,"Lan3");
        Student student4=new Student(4,"Lan4");
//        Student student5=new Student(5,"Lan5");

        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        myLinkedList.addLast(student3);
        myLinkedList.addLast(student4);

        //myLinkedList.remove(student4);
//        MyLinkedList<Student> cloneLinkedList= myLinkedList.clone();

//        System.out.println(myLinkedList.constrains(student1));
        System.out.println(myLinkedList.indexOf(student3));
//        for(int i=0;i<myLinkedList.size();i++){
//            Student student=(Student) myLinkedList.get(i);
//            System.out.println(student.getName());
//        }

//        for(int i=0;i<cloneLinkedList.size();i++){
//            Student student=(Student) cloneLinkedList.get(i);
//            System.out.println(student.getName());
//        }
    }
}
