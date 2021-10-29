import java.util.Scanner;
import java.io.*;
import java.security.AllPermission;

public class Principal {
    public static BufferedReader entrada = 
    new BufferedReader (new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception {
    
    Scanner sn= new Scanner(System.in);

    int opcion;
    String nombre, apellido, direccion;
    int telefono,edad;
    int ID=0;
    int IDcedula=0;
    int cantidad=1;
    int rango=999;
    doctor d[]= new doctor[1];
    int arreglo[]= new int[cantidad];


//Menu principal para añadir paciente o doctor
    System.out.println("Seleecione la opcion que deseas: ");
    System.out.println("1.-Dar alta paciente");
    System.out.println("2.-Dar alta doctor.");
    System.out.println("3.-Ingresar como doctor");
    System.out.println("4.-Salir.");

    opcion=sn.nextInt();


    switch (opcion){
            case 1:         
                System.out.println("Ingrese Nombre del paciente: ");
                nombre = System.console().readLine();

                System.out.println("Ingrese Apellido del paciente: ");
                apellido = System.console().readLine();

                System.out.println("Ingrese Edad  del paciente: ");
                edad= Integer.parseInt(entrada.readLine());

                System.out.println("Ingrese Direccion del paciente: ");
                direccion = System.console().readLine();

                System.out.println("Ingrese Telefono  del paciente: ");
                telefono= Integer.parseInt(entrada.readLine());

                //Generar ID random
                arreglo[ID]=(int)(Math.random()*rango);
                for(ID=1; ID<cantidad; ID++){
                    arreglo[ID]=(int)(Math.random()*rango);
                    for (int x=0; x<ID; x++){
                        if(arreglo [ID]==arreglo[x]){
                            ID--;
                        }
                    }
                }
                for (int y=0; y<cantidad; y++){
                System.out.println("El ID del paciente es: "+(y+1)+arreglo[y]);   
                
                }
                break;

                case 2:
               
                        System.out.println("Ingrese Nombre del doctor: ");
                        nombre = System.console().readLine();

                        System.out.println("Ingrese Apellido del doctor: ");
                        apellido = System.console().readLine();

                        System.out.println("Ingrese Edad  del doctor: ");
                        edad= Integer.parseInt(entrada.readLine());

                        System.out.println("Ingrese Direccion del doctor: ");
                        direccion = System.console().readLine();

                        System.out.println("Ingrese Telefono  del doctor: ");
                        telefono= Integer.parseInt(entrada.readLine());

                        //Generar IDcedula random
                        arreglo[IDcedula]=(int)(Math.random()*rango);
                        for(IDcedula=1; IDcedula<cantidad; ID++){
                            arreglo[IDcedula]=(int)(Math.random()*rango);
                            for (int x=0; x<IDcedula; x++){
                                if(arreglo [IDcedula]==arreglo[x]){
                                    IDcedula--;
                                }
                            }
                        }
                        for (int y=0; y<cantidad; y++){
                        System.out.println("El ID del doctor es: "+(y+1)+arreglo[y]);   

                       
                    
                }
                break;
                case 3: 

                    }
                    

}
    }