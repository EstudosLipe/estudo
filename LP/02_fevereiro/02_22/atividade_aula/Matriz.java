import java.util.Scanner;
public class Matriz{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int i=0,j=0;
		for(i=0; i<9; i++){
			for(j=0; j<9; j++){
				if(i<j){
					System.out.print("0");
				}else{
					System.out.print("1");
				}
			}
			System.out.println();
		}
	}
}