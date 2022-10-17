package ss10_dsa_list.exercise.array_list;

public class TestMyArrayList {
    public static class Student {
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
    }

    public static void main(String[] args) {
        Student a = new Student(1, "Lan1");
        Student b = new Student(2, "Lan2");
        Student c = new Student(3, "Lan3");
        Student d = new Student(4, "Lan4");
        Student e = new Student(5, "Lan5");
        Student f = new Student(6, "Lan6");

        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        MyArrayList<Student> newMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(e);
        //       studentMyArrayList.add(f,2);
        studentMyArrayList.size();
//
//        System.out.println(studentMyArrayList.size());
//        System.out.println(studentMyArrayList.get(2).getName());
//        System.out.println(studentMyArrayList.indexOf(f));
//        System.out.println(studentMyArrayList.contains(f));
        newMyArrayList = studentMyArrayList.clone();
        newMyArrayList.remove(0);
        for (int i = 0; i < newMyArrayList.size(); i++) {
            System.out.println(newMyArrayList.get(i).getName());
        }
    }
}
