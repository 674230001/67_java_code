package W12;

import java.util.Scanner;

public class W12_02_WhileTrue_KB {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter Number :");   // แสดงข้อความ Enter Number :
            int Number = kb.nextInt();           // รับค่าจากคีย์บอร์ดเก็บไว้ในตัวแปร number
            if (Number == 0) break;          // ตรวจสอบเงื่อนไข ถ้า number เท่ากับ 0 ให้ออกจากลูป
        }

    // วนลูปไปเรื่อยๆ ใช้ while (true) 
        
            // ออกจากลูป

        
    }
}