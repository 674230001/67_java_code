package W13;

public class W13_03_Array_CountOddEven {
    public static void main(String[] args) {
        //ให้นับจำนวนเลขคู่เลขคี Array ด้านล่าง
        int [] numbers = { 1 ,3, 6, 9, 10, 15, 20, 23, 99, 69, 45, 88, 77, 55, 44, 31 };

        int countOdd = 0;
        int countEven = 0;

        System.out.println("Number in the array are: ");
        for(int i = 0; i <numbers.length; i++) {
            System.out.print(numbers [i] + "  ");
            if(numbers[i] % 2 == 0){
                countEven++;
            }else{
                countOdd++;

            }           
        }

        System.out.println("\n Amount of all Number :" + numbers.length);
        System.out.println("\n Amount of all Number :" + countOdd);
        System.out.println("\n Amount of all Number :" + countEven);


    }
    
}
