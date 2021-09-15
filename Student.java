public class Student{
    String  name=new String("本少还未命名");
    double achievement,student number;
    public Student(String string,double achievement,student number){
        this.name=string;
        this.achievement=achievement;
        this.student number=student number;
    }
    public void set(String str,double achievement,student number){
        this.name=str;
        this.achievement=achievement;
        this.student number=student number;
    }
    public void get(){
        System.out.println("该学生姓名为："+name);
        System.out.println("该学生成绩为："+achievement);
        System.out.println("该学生的学号为："+student number);
    }
}
