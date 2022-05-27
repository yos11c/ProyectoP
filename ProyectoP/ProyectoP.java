public class ProyectoP {
    static Scanner scanner=new Scanner (System.in);
    public static void main (String[] args){
        NewClass yos=new NewClass();
        int opcion = 0;
        do{
            System.out.print("\n Bienvenido al panel de registro");
            System.out.println();
            System.out.println("1" + " Registro de alumnos: ");
            System.out.println("2" + "TABLA");
                opcion= scanner.nextInt();
            switch(opcion)    {

                case 1 -> {
                    System.out.println("Por favor, Ingrese el codigo");
                    String codigo=scanner.next();
                    System.out.println("*****************");
                    System.out.println("Por favor, Ingrese el nombre");
                    String nombre=scanner.next();
                    System.out.println("******************");
                    System.out.println("Ingrese el alias");
                    String alias=scanner.next();
                    System.out.println("***************");
                    System.out.println("Ingrese el correo");
                    String correo=scanner.next();
                    System.out.println("******************");
                    System.out.println("Ingrese el numero de telefono");
                    int telefono=scanner.next();
                    System.out.println("***********************");
                    System.out.println("Ingrese el nombre del curso");
                    String curso=scanner.next();
                    System.out.println("*********************");
                    System.out.println("Ingrese el codigo del curso");
                    String codigoCurso=scanner.next();
                    System.out.println("**********************");
                    System.out.println("Ingrese el codigo del grado");
                    String codigoGrado=scanner.next();
                    System.out.println("***********************");
                    System.our.println("describir grado cursante ");
                    String grado=scanner.next();
                    System.out.println("**************************");
                    yos.registrocodigo(codigo);
                    yos.registronombre(nombre);
                    yos.registroalias(alias);
                    yos.registrocorreo(correo);
                    yos.registrotelefono(telefono);
                    yos.registroCurso(curso);
                    yos.registroCodigoCurso(codigoCurso);
                    yos.registrogrado(codigoGrado);
                    yos.registrogrado(grado);

                }
                case 2 > {
                    System.out.println("Lista de los alumnos ");
                    yos.mostrarcodigo();
                    yos.mostrarnombre();
                    yos.mostraralias();
                    yos.mostrarcorreo();
                    yos.mostrarTransacciones();
                    yos.mostrarcurso();
                    yos.mostrarcursocodigo();
                    yos.mostrarCodigoGrado();
                    yos.mostrarDes();

                }

            }
        }while (opcion !=2); q
    }
}

