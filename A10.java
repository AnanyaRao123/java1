import java.util.List;
import java.util.ArrayList;
class TTable{
    String dayOfWeek="Mon";
    String branch;
    String classSection;
    int period;
    String roomNo;
    boolean isLab=false;
    String faculty1;
    String faculty2;
    String subject1;
    String subject2;
    TTable(String b1,String c,String r){
        this.branch=b1;
        this.classSection=c;
        this.roomNo=r;
    }
    public void printTimeTable(){
        System.out.println("This is time table for "+branch+" Section "+classSection+" at "+roomNo);
    }
}
public class A10 {
    public static void main(String[] args){
        System.out.println("TimeTable");
        TTable ttA=new TTable("CSE","A","A203");
        TTable ttB=new TTable("CSE","B","A204");
        ttA.printTimeTable();
        ttB.printTimeTable();
        ttA.faculty1="Kuthyar";
        ttB.faculty2="Savitha";
        ttA.subject1="OOPJ";
        ttB.subject2="OS";
        System.out.println(ttA.faculty1+"-"+ttA.subject1);
        System.out.println(ttB.faculty2+"-"+ttB.subject2);
    }
}
