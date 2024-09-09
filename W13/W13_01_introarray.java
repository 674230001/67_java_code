package W13;

public class W13_01_introarray {
    public static void main(String[] args) {
        //ประกาสชนิด Array แบบที่1 - รุ้จำนวนข้อมูลล่วงหน้า
        String [] colors = {"Purple","Cyan","Blue" ,"Green","Vellow","Orange","Red"};
        int[] bank = {20, 50, 100, 500, 1000};
        char [] alphabet = {'A','B','C','D','E'};
        //แสดงผลลับโดยใช้ index ของ Array
        System.out.println("The first color is" + colors[0]); 
        System.out.println("The Third alphabet is" + alphabet[2]);

        //แสดงผลลัพโดยใช้ Loop
        System.out.println("Colors in array are: ");
        System.out.println("========================================================");
        for (int i = 0; i < 7; i++) {
            System.out.print(colors[i] + " ");  
        }
        System.out.println("");
        System.out.println("========================================================");
        for (int i = 6; i > 0; i--) {
            System.out.print(colors[i] + " ");           
        }
        System.out.println("Banks in the array are:");
        System.out.println("========================================================");
        for (int i = 0; i < bank.length; i++) {
            System.out.print(bank[i] + " ");           
        }



    }
}