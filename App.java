import java.util.Scanner;
public class App{
    public static void main(String[] args) {
     
int decimal;
int binary;

Scanner scanner = new Scanner(System.in);

System.out.println("If you want to convert from decimal to binary input 1 and enter.");
System.out.println("If you want to convert from binary to decimal input 0 and enter");
int input = scanner.nextInt();

if(input ==1){
    decimal = scanner.nextInt();
    int ans = dectobin(decimal);
    System.out.println(ans);}
else if (input == 0){ 
    binary = scanner.nextInt();
    int ans = bintodec(binary);
    System.out.println(ans);
}
else{
    System.out.println("You need a different input");
}




    
}


public static int dectobin(int dec){
    int binarr[]= new int[8];

int index = 7;
while(dec>=1){
    binarr[index] = dec % 2;
    index--;
    dec /=2;
}
return dec;
}

public static int bintodec(int bin){
int i = 7;
int dec = 0;

while(i>-1){
    if(bin >= (Math.pow(10,i))){
        bin -= Math.pow(10,i);
        dec += Math.pow(2, i);
        i--;
    }
    else{i--;}
    
     
}



    return dec;
}
}
