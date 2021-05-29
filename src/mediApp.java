import java.util.Scanner;
public class mediApp {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        static int option;

        do{
        System.out.print("Bienvenido a MediApp\n");
        System.out.print("1.- Registrarse");
        System.out.print("2.- Iniciar sesión");
        option = sc.nextInt();
        switch(option){
            case(1): System.out.print("Farmaceutico (1) o cliente(2)\n");
            option = sc.nextInt();
            if(option == 1){
                
                }
            }
        }
        }while (option>2);
    }
    static void regUsr(){

    }
    static void logUsr(){

    }
}
