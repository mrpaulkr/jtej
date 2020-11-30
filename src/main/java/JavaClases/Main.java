package JavaClases;

public class Main {
    public static void main(String[] args) {
        Student st1=new Student(1,"Iva","Petrov","Ivanowich","25.01.1986","Krakow","534534","Math","3","4M");
        Student st2=new Student(2,"Alex","Ivanow","Petrovna","21.05.1984","Kyiv","453456","History","3","1H");
        Student st3=new Student(3,"Sasha","Komarska","Ivanowna","06.08.1945","Lviv","6757567","Math","3","3M");
        Student st4=new Student(4,"Eva","Haitska","Hryhoriivna","17.12.1956","London","575656","History","3","4H");
        Student st5=new Student(5,"Max","Helvison","Sergeevich","18.11.1985","Oslo","98768767","Physics","3","1F");
        Student st6=new Student(6,"Sergei","Morten","Petrovich","10.09.1946","Dnipro","87686786","Physics","3","2F");
        Student st7=new Student(7,"Yevhenii","Petrichon","Vasylewich","07.03.1934","Berlin","78656","Math","3","4M");
        Student st8=new Student(8,"Daria","Ivanowich","Pawlowich","17.06.1993","madrid","5456767","Physics","3","2F");

        StudentsList sList = new StudentsList();
        sList.addStudent(st1);
        sList.addStudent(st2);
        sList.addStudent(st3);
        sList.addStudent(st4);
        sList.addStudent(st5);
        sList.addStudent(st6);
        sList.addStudent(st7);
        sList.addStudent(st8);
        sList.facultyPrint("Math");

    }
}
