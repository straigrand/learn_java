package monster.limpid.oop;

/**
 * @author zhenghaochen
 * @date 2021-06-20 15:00
 */
class Student8{
    int id;
    String name;

    Student8(int i,String n){
        id = i;
        name = n;
    }

    Student8(Student8 s){
        id = s.id;
        name = s.name;
    }
    void display(){
        System.out.println(id+""+name);
    }

    public static void main(String[] args) {
        Student8 student8 = new Student8(233,"jake");
        Student8 s2 = new Student8(student8);
        student8.display();
        s2.display();
    }
}