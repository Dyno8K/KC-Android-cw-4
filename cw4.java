import java.util.Scanner;

public class cw4 {


    //task 1
    public static int totalGrade(int num1, int num2){         
        return (num1 + num2);
    }

    //task 2
    public static void temperature(int num1){
        if (num1 >22){
            System.out.println("Hot");

        }
        else{
            System.out.println("Cold");
        }


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // task 1
        System.out.println("Enter grade 1");

        String test1 = sc.nextLine();

        System.out.println("Enter grade 2");
        String test2 = sc.nextLine();

        int int1 = Integer.parseInt(test1);
        int int2 = Integer.parseInt(test2);
        
        System.out.println(totalGrade(int1,int2));

        // task 2
        System.out.println("Enter temparature:");
        String tempStr = sc.nextLine();
        int temp = Integer.parseInt(tempStr);
        temperature(temp);

        // bonus

        for(int i=1; i<11 ; i++){
            System.out.println(i);
        }

        sc.close();



    }
  }