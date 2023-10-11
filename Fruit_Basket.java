import java.util.Stack;
import java.util.Scanner;

public class Fruit_Basket{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Stack <String> fruits = new Stack<>();
        
        String [] fruit = {"Apple","Orange","Mango","Guava"};
        char [] f = {'A','O','M','G'};

        System.out.println("Catch and eat any of these fruits: ('Apple','Orange','Mango','Guava')");
        System.out.println("How many fruits would you like to catch: ");
        int choice = sc.nextInt();

        sc.nextLine();
        for(int i = 0;i<choice;i++){
            System.out.println("Choose a fruit to catch. Press A,O,M, or G: ");
                char ch = sc.next().toUpperCase().charAt(0);
                System.out.println("Fruit of " +(i + 1) + " of " + choice);   
                    if(ch == f[0]){fruits.push(fruit[0]);}
                        else if(ch == f[1]){fruits.push(fruit[1]);}
                            else if(ch == f[2]){fruits.push(fruit[2]);}
                                else if(ch == f[3]){fruits.push(fruit[3]);}
                                    else if(ch == f[4]){fruits.push(fruit[4]);}
                else{
                    System.out.println("Invalid Input.Please choose one of the choices that has been given.");
                }
        }
        System.out.println("Your basket has: " + fruits);

        for(int j = 0;j < choice;j++){
            System.out.println("Press 'E' to eat a fruit: ");
                char e = sc.next().toUpperCase().charAt(0);
                    if(e == 'E'){
                        fruits.pop();
                            if(fruits.isEmpty()){
                                System.out.println("No more Fruits.");
                         }else{
                        System.out.println("Fruit(s) in the basket: " + fruits);       
                        }
            }else{
                System.out.println("Invalid Input.Please try again.");
            }
    }
        sc.close();
    }
}