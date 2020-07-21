
package desarrollo;

import utils.Leer;


public class ejercicio {

    
          public static String[] nombre= new String[1000];
    public static String[] dni= new String[1000];
    public static String[] fnacimiento= new String[1000];
    public static String[] sexo= new String[1000];
    public static String[] nacionalidad= new String[1000];
    public static String[] estadocivil= new String[1000];
   
     public static int posicion= -1;  
   
    public static void agregarpersona(){
        String continuar;
        do{
     posicion++;
        System.out.println("Agregar Persona");
        System.out.print("Nombre: ");
        nombre[posicion]=Leer.cadena();
        System.out.print("DNI: ");
        dni[posicion]=Leer.cadena();
        System.out.print("Fecha de Nacimiento: ");
        fnacimiento[posicion]=Leer.cadena();
         System.out.print("Sexo: ");
        sexo[posicion]=Leer.cadena();
         System.out.print("Nacionalidad: ");
        nacionalidad[posicion]=Leer.cadena();
         System.out.print("Estado Civil: ");
        estadocivil[posicion]=Leer.cadena();
        
            System.out.print("¿Deseas agregar otro [S/N] ?: ");
            continuar=Leer.cadena();
        }while(continuar.equalsIgnoreCase("S"));
    }
     public static void eliminarpersona(){
         String continuar;
         do{
        listarpersona();
         System.out.println("Ingresar el numero de la persona a eliminar: ");
         int numero=Leer.entero();
         numero--;
         for(int i=numero;i<posicion;i++){
             nombre[i]=nombre[i+1];
             dni[i]=dni[i+1];
             fnacimiento[i]=fnacimiento[i+1];
             sexo[i]=sexo[i+1];
             nacionalidad[i]=nacionalidad[i+1];
             estadocivil[i]=estadocivil[i+1];
             
         }
             nombre[posicion]="";
             dni[posicion]="";
             fnacimiento[posicion]="";
             sexo[posicion]="";
             nacionalidad[posicion]="";
             estadocivil[posicion]="";
            
             
             posicion--;
             System.out.print("¿Deseas eliminar otro [S/N] ?: ");
            continuar=Leer.cadena();
    }while(continuar.equalsIgnoreCase("S"));
         }
     public static void editarpersona(){
         String continuar;
         do{
        listarpersona();
         System.out.println("Ingrese el numero de la persona a editar: ");
         int numero=Leer.entero();
         numero--;
         System.out.println("Resultado: "+nombre[numero]+"-"+ dni[numero] + " - " + fnacimiento[numero]+"-"+sexo[numero]+"-"+nacionalidad[numero]+"-"+estadocivil[numero]);
         System.out.print("Nuevo Nombre: ");
         nombre[numero]=Leer.cadena();
         System.out.print("Nuevo DNI: ");
         dni[numero]=Leer.cadena();
         System.out.print("Nueva Fecha de Nacimiento: ");
         fnacimiento[numero]=Leer.cadena();
         System.out.print("Nuevo Sexo: ");
         sexo[numero]=Leer.cadena();
         System.out.print("Nueva Nacionalidad: ");
         nacionalidad[numero]=Leer.cadena();
         System.out.print("Nuevo Estado Civil: ");
         estadocivil[numero]=Leer.cadena();
         
         System.out.print("¿Deseas editar otro [S/N] ?: ");
            continuar=Leer.cadena();
    }while(continuar.equalsIgnoreCase("S"));
         }
     public static void listarpersona(){
         System.out.println("Listado");
         System.out.println("N°\tDNI\t\tF. Nac.\t\tSexo\t\tNacionalidad\t\tEstado Civil\t\tNombre Completo");
         for(int i=0;i<=posicion;i++){
            System.out.println((i + 1) + "\t" + dni[i] + "\t" + fnacimiento[i] + "\t" + sexo[i]+"\t"+nacionalidad[i]+"\t\t\t"+estadocivil[i]+"\t\t\t"+nombre[i]);


             
         }
    }
     public static void salir(){
         System.out.println("Gracias por su visita");
    }
     public static void error(){
         System.out.println("Error, Opcion Incorrecta....");
    }
     public static void menu(){
         
         System.out.println("MENU PRINCIPAL");
         System.out.println("1. Agregar Persona");
         System.out.println("2. Eliminar Persona");
         System.out.println("2. Editar Persona");
         System.out.println("4. Listar Persona");
         System.out.println("5. Salir");
         System.out.print("Escoja una de las opciopnes: ");
    }
     public static void inicio(){
        int opcion;
        do{
            menu();
            opcion=Leer.entero();
            switch(opcion){
                case 1: agregarpersona();break; 
                case 2: eliminarpersona();break;
                case 3: editarpersona();break;
                case 4: listarpersona();break;
                case 5: salir();break;
                default : error();
            }
        }while(opcion!=5);
    }
            
    public static void main(String[] args) {
        inicio();
    }
}
