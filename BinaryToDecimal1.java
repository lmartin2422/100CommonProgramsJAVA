public class BinaryToDecimal1 {  // class name

    public static int getDecimal(int binary) {  // method name
        int decimal = 0;  // initializing the variable
        int n = 0; // initializing the variable

        while (true) {
            if (binary == 0) {
                break;
            }
            else {
                int temp = binary%10;
                decimal += temp*Math.pow(2, n);
                binary = binary/10;
                n++;
            }

        }
        return decimal;
    }
}


// Script below goes in the main class

public class Main {

    public static void main(String[] args) {

        System.out.println("Binary :1010 | Decimal : " + BinaryToDecimal1.getDecimal(1010) + "\n");
        System.out.println("Binary :1010 | Decimal : " + BinaryToDecimal1.getDecimal(11111));


    }
}
