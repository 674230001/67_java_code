// ให้แสดงผลลัพธ์ดังนี้
// ===============
// รอบที่ 1 
// รอบที่ 2 
// รอบที่ 3 
// รอบที่ 4 
// รอบที่ 5 

package W12;

public class  W12_00_exLoopWhile{
    public static void main(String[] args) {
        
        System.out.println("ToDo 1 for loop");
        for(int i=1 ; i<=5 ; i++ ){
          //คำาสั่งที่ต้องทำ
          System.out.println("รอบที่"+i);  
        }
         System.out.println("................");
// โครงสร้างคำสั่งลูป for/while แบ่งออกเป็น 3 ส่วน
// 1. ส่วนตัวแปรเริ่มต้น
// 2. เงื่อนไข
// 3. การเพิ่มค่า / การลดค่า

// TODO 1 
// ======================================================================
System.out.println("ToDo 1 While loop ");
int n1=1 ;
while (n1<=5 ) { 
    System.out.println("รอบที่"+n1);
    n1++;    
}
System.out.println("................");
  



// ======================================================================
// TODO2
//คำสั่ง 1 ให้แสดงผลลัพธ์ดังนี้
// ===============
// รอบที่ 1 Hello World
// รอบที่ 2 Hello World
// รอบที่ 3 Hello World
// รอบที่ 4 Hello World
// รอบที่ 5 Hello World

System.out.println("ToDo 2 While loop ");
       for(int i=1 ; i<=5; i++ ){
          //คำาสั่งที่ต้องทำ
          System.out.println(" รอบที่ "+i+ " Hello World ");  
        }

System.out.println("................"); 


      

System.out.println("ToDo 2 While loop ");
      int n2=1;
      while (n2<=5) {
        System.out.println(" รอบที่ "+n2+ " Hello World ");  
        n2++;
          
      }


// ======================================================================
// TODO 3
//คำสั่ง 2 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 2 3 4 5 6 7 8 9 10


      for(int j=1; j<=10;j++){
          System.out.print(j+" ");
      }



      System.out.println("\nToDo 3 While loop ");
      int n3=1;
      while (n3<=10) {
        System.out.print(n3+" "); 
        n3++;
      }

// ======================================================================

// TODO 4
//คำสั่ง 2.1 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 2 3 4 5 6 7 8 9 10 = 55

   System.out.println();
    int sum = 0;
        for(int j=1; j<=10;j++){
          System.out.print(j+" ");
          sum = sum+j;              // sum +=j;
      }
System.out.println("= "+sum);

System.out.println("\nToDo 4 While loop ");

      

// ======================================================================

//คำสั่ง 2.2 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1+2+3+4+5+6+7+8+9+10 = 55

// TODO 5
     System.out.println();
     sum = 0;
        for(int j=1; j<=10;j++){
          System.out.print(j+" ");
          if(j<10){
            System.out.println("+");
          }
          sum = sum+j;              // sum +=j;
      }
System.out.println("= "+sum);
System.out.println("................"); 
// ======================================================================

// TODO 6
//คำสั่ง 3 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 10 9 8 7 6 5 4 3 2 1

int num =10;
for (int j =1; j<=10; j++){
    System.out.print(num+" ");
     num--;

} 
System.out.println("\n................"); 

System.out.println("\nToDo 6 While loop ");
int n6 =1;
while (n6>=10) { 
    System.out.print(num+" ");
     num--;
     n6++;
}
System.out.println("\n................"); 
// ======================================================================
// TODO 7
//คำสั่ง 4 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 3 5 7 9 11 13 15 17 19


       System.out.println("\n");
       num = 1;
       for (int j =1; j<=10; j++) {
           System.out.print(num +"");
           num +=2;
       }
       

       System.out.println("\nToDo 7 While loop ");
        int n7=1;
        num = 1;
        n7<=10;
        System.out.print(num +"");

// ======================================================================
// TODO 8
//คำสั่ง 5 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 2 4 6 8 10 12 14 16 18 20


System.out.println("\n");
sum =2;
for (int j = 1; j<10; j++) {
    System.out.print("sum + ");
    sum +=2;

}
   System.out.println("\nToDo 8 While loop ");
   int n8 = 2;
   sum = 20;
   while (n8<sum) { 
     System.out.print("n8 + ");
     n8 = n8 +2;
   }
      

// ======================================================================
// TODO 9
//คำสั่ง 6 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 4 9 16 25 36 49 64 81 100


       System.out.println("\n");
       for (int j = 1; j < 10; j++) {
           sum =j*j;
           System.out.print(sum+" ");
       }
       
       System.out.println("\nToDo 9 While loop ");
       int n9 =2;
       while (n9 <=10) { 
       System.out.print(n9*n9+" ");
       n9++;
           
       }

// ======================================================================
// TODO 10
//คำสั่ง 7 ให้แสดงผลลัพธ์ดังนี้
// ===============
// รอบที่ 1 เลขคี่
// รอบที่ 2 เลขคู่
// รอบที่ 3 เลขคี่
// รอบที่ 4 เลขคู่
// รอบที่ 5 เลขคี่


   for (int i = 0; i < 10; i++) {
       if(i%2==0){
          System.out.println(" รอบที่ "+ i+"เลขคี่ ");
       }else{
          System.out.println(" รอบที่ "+ i+"เลขคู่ ");
       }

       
   }

// ======================================================================
    }
}