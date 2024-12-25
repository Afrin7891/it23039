import java.util.Scanner;

public class RandomNumber{

private static double angle = Math.PI/4;

public static int random(int min, int max)
{
	angle+=Math.PI/7;
	double value = Math.sin(angle)*10000;
	return min + (int) (Math.abs(value)%(max-min+1));
}
public static double random(double min, double max){

	angle=angle+Math.PI/7;
	double value=Math.sin(angle)*10000;
	return min+(Math.abs(value)%(max-min));
}

public static float random(float min,float max){

	angle=angle+Math.PI/7;
	double value = Math.sin(angle)*10000;
	return min+(float)(Math.abs(value)%(max-min));
}

public static void main(String[] args){

Scanner sc=new Scanner(System.in);

System.out.println("Enter the range for integer number(min and max):");

int intMin=sc.nextInt();
int intMax=sc.nextInt();

System.out.println("Random Integer: " + random(intMin, intMax));

System.out.println("Enter the range for double random number(min and max):");

double doubleMin =sc.nextDouble();
double doubleMax= sc.nextDouble();

System.out.println("Random Double: " + random(doubleMin, doubleMax));

System.out.println("Enter the range for float random number(min and max):");


 float floatMin = sc.nextFloat();
float floatMax= sc.nextFloat();

System.out.println("Random Float: " + random(floatMin, floatMax));

sc.close();
}
}