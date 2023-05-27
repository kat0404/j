package usuario;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);
        
        // Pedir nombre de usuario y contraseña
        
       
        System.out.print("Ingrese su nombre de usuario: ");
        String username = input.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String password = input.nextLine();
          
        
        // Verificar credenciales
        if (username.equals("Kathy") && password.equals("NenaK")) {
            System.out.println("Inicio de sesión exitoso");
        } else {
            System.out.println("Credenciales incorrectas");
        }
        
        input.close();	
		
		
		
	}

}
