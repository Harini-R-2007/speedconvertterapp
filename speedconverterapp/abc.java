import java.util.Scanner;
import converter.sp;
public class abc{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.println("Speed Converter");
System.out.println("1. m/s to km/h");
System.out.println("2. m/s to mph");
System.out.println("3. km/h to m/s");
System.out.println("4. km/h to mph");
System.out.println("5. mph to m/s");
System.out.println("6. mph to km/h");
System.out.println("Enter your choice(1-6):");
int choice=scanner.nextInt();
System.out.print("Enter the speed valuse:");
double speed=scanner.nextDouble();
sp converter=new sp(speed);
switch(choice){
case 1:
System.out.printf("%.2f m/s=%.2f km/h\n",speed,converter.mpsToKmph());
break;
case 2:
System.out.printf("%.2f m/s=%.2f mph\n",speed,converter.mpsToMph());
break;
case 3:
System.out.printf("%.2f km/h=%.2fm/m/s\n",speed,converter.KmphToMps());
break;
case 4:
System.out.printf("%.2f km/h=%.2f mph\n",speed,converter.KmphToMph());
break;
case 5:
System.out.printf("%.2f mph=%.2f m/s\n",speed,converter.mphToMps());
break;
case 6:
System.out.printf("%.2f mph=%.2f km/h\n",speed,converter.mphToKmph());
break;
default:
System.out.println("Invalid choice");
}
scanner.close();
}
}
