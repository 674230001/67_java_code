import java.util.Scanner;//นำเข้าคลาส Scanner จาก backage java.util
public class W04_AreaCircle{

     public static void main(String[]args){
        Scanner sc = new Scanner(System.in);//สร้างอ็ฮบเจ็กต์ของคลาส Scanner
        System.out.print("ป้อนค่ารัศมีวงกลม: "); //แสดงข้อความให้ใช้ป้อนค่ารัศมี
        double radius = sc.nextDouble();//รับค่ารัศมีจากผู้ใช้และเก็บในตัวแปร radius

        // double  radius; // ประกาศตัวแปรเก็บค่ารัศมี
        // radius = 34;    // กำหนดค่ารัศมี 10
        double area;    // ประกาศตัวแปำรเก็บพื้นที่
        double PI = 3.1459; // ประกาศค่าคงที่ PI
        
        area= PI*radius*radius; // คำนวณพื้นที่ของวงกลม
        System.out.println("พื้นที่ของวงกลมที่มีรัศมีเท่ากัน"+radius+"คือ"+area);
     }
    
}