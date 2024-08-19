package W10;
import java.util.Scanner;
public class W10_03_login{
    public static void main(String [] args){
        String Username = "Tong";
        String Password = "1234";
        
        Scanner kb = new Scanner(System.in);
        //สร้างตัวแปรเก็บ username และ password ผู้ใช้ป้อนเข้ามา
        System.out.print("ป้อนชื่อผู้ใช้");
        String inputUsername = kb.nextLine();

        System.out.print("ป้อนรหัสผ่าน");
        String inputPassword = kb.nextLine();
        
        if(Username.equals(inputUsername) && Password.equals(inputPassword)){
           System.out.println("เข้าสู่ระบบสำเร็จ");
        }else{
            if(!Username.equals(inputUsername)){
               System.out.println("ชื่อผู้ใช้ไม่ถุกต้อง");
            }else if(!Password.equals(inputPassword)){
               System.out.println("รหัสผ่านไม่ถูกต้อง");
            }else{
                System.out.println("ชื่อผู้ใช้และรหัสผ่านไม่ถุกต้อง");
            }
           
           //System.out.println("ชื่อผู้ใช้หรือรหัสผ่านไม่ถูกต้อง");
        }
    }
}