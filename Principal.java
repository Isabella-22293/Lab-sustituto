import java.util.ArrayList;
import java.util.Scanner;
public class Principal {
    public static void Principal(String[] args) {
        Scanner Nuevo = new Scanner(System.in);
        ArrayList<Personal> Elegido = new ArrayList<Personal>();
        Personal Practicante1 = new Personal("Alejandro", true, false, "1", false, true, false, true);
        Personal Practicante2 = new Personal("Renato", true, false, "1", false, true, false, true);
        Personal Practicante3 = new Personal("Pablo", true, false, "1", false, true, false, true);
        Personal Ingeniero1 = new Personal("Luis ", false, true, "2", true, false, true, false);
        Personal Ingeniero2 = new Personal("Julio", false, true, "2", true, false, true, false);
        Personal Ingeniero3 = new Personal("Andres", false, true, "2", true, false, true, false);
        Personal Administrador1 = new Personal("Joaquin", false, true, "3", true, false, true, true);
        Personal Administrador2 = new Personal("Esteban", false, true, "3", true, false, true, true);
        Personal Administrador3 = new Personal("Jacob", false, true, "3", true, false, true, true);
        String Opcion, Name;
        System.out.println("1. Investigativo ");
        System.out.println("2. Nuevo cliente ");
        System.out.println("3. Mantenimiento ");
        System.out.println("4. Interno ");
        System.out.println("Ingrese la opcion");
        Opcion = Nuevo.next();
        System.out.println("Ingrese el Nombre del proyecto");
        Name = Nuevo.next();
        Proyecto proyecto = new Proyecto(Name, Opcion);
        String Combinar = "";
        Combinar = proyecto.averiguar();
        String x = "";
        Personal utilizar = new Personal("Name", false, false, x, false, false, false, false);
        Personal utilizar2 = new Personal("Name", false, false, x, false, false, false, false);
        String respuesta="";
        if (Combinar.equalsIgnoreCase("Ingeniero-Practicante")) {
            System.out.println("Se requiere de un ingeniero y de un practicante");
            System.out.println("Ingenieros");
            System.out.println("1. " + Ingeniero1.getName());
            System.out.println("2. " + Ingeniero2.getName());
            System.out.println("3. " + Ingeniero3.getName());
            x = Nuevo.next();
            if (x.equalsIgnoreCase("1")) {
                utilizar = Ingeniero1;
            } else if (x.equalsIgnoreCase("2")) {
                utilizar = Ingeniero2;
            } else if (x.equalsIgnoreCase("3")) {
                utilizar = Ingeniero3;
            }
            System.out.println("Practicantes");
            System.out.println("1. " + Practicante1.getName());
            System.out.println("2. " + Practicante2.getName());
            System.out.println("3. " + Practicante3.getName());
            x = Nuevo.next();
            if (x.equalsIgnoreCase("1")) {
                utilizar2 = Practicante1;
            } else if (x.equalsIgnoreCase("2")) {
                utilizar2 = Practicante2;
            } else if (x.equalsIgnoreCase("3")) {
                utilizar2 = Practicante3;
            }
            proyecto.personal(utilizar, utilizar2);
            System.out.println("Su proyecto: " + Name + "sera realizado por: ");
            System.out.println(utilizar.getName() + "(Ingeniero) y " + utilizar2.getName() + "(Practicante)");
        } else if (Combinar.equalsIgnoreCase("Practicante-Administrador")) {
            System.out.println("Se requiere de un practicante y de un administrador");
            System.out.println("Practicante");
            System.out.println("1. " + Practicante1.getName());
            System.out.println("2. " + Practicante2.getName());
            System.out.println("3. " + Practicante3.getName());
            x = Nuevo.next();
            if (x.equalsIgnoreCase("1")) {
                utilizar = Practicante1;
            } else if (x.equalsIgnoreCase("2")) {
                utilizar = Practicante2;
            } else if (x.equalsIgnoreCase("3")) {
                utilizar = Practicante3;
            }
            System.out.println("Administradores ");
            System.out.println("1. " + Administrador1.getName());
            System.out.println("2. " + Administrador2.getName());
            System.out.println("3. " + Administrador3.getName());
            x = Nuevo.next();
            if (x.equalsIgnoreCase("1")) {
                utilizar2 = Administrador1;
            } else if (x.equalsIgnoreCase("2")) {
                utilizar2 = Administrador2;
            } else if (x.equalsIgnoreCase("3")) {
                utilizar2 = Administrador3;
            }
            proyecto.personal(utilizar, utilizar2);
            System.out.println("Su proyecto: " + Name + "sera realizado por: ");
            System.out.println(utilizar.getName() + "(Practicantes) y " + utilizar2.getName() + "(Administradores)");
        }
        else if (Combinar.equalsIgnoreCase("Ingeniero-Administrador")) {
            System.out.println("Se requiere de un ingeniero y de un administrador");
            System.out.println("Ingenieros");
            System.out.println("1. " + Ingeniero1.getName());
            System.out.println("2. " + Ingeniero2.getName());
            System.out.println("3. " + Ingeniero3.getName());
            x = Nuevo.next();
            if (x.equalsIgnoreCase("1")) {
                utilizar = Ingeniero1;
            } else if (x.equalsIgnoreCase("2")) {
                utilizar = Ingeniero2;
            } else if (x.equalsIgnoreCase("3")) {
                utilizar = Ingeniero3;
            }
            System.out.println("Administradores ");
            System.out.println("1. " + Administrador1.getName());
            System.out.println("2. " + Administrador2.getName());
            System.out.println("3. " + Administrador3.getName());
            x = Nuevo.next();
            if (x.equalsIgnoreCase("1")) {
                utilizar2 = Administrador1;
            } else if (x.equalsIgnoreCase("2")) {
                utilizar2 = Administrador2;
            } else if (x.equalsIgnoreCase("3")) {
                utilizar2 = Administrador3;
            }
            proyecto.personal(utilizar, utilizar2);
            System.out.println("Su proyecto: " + Name + "sera realizado por: ");
            System.out.println(utilizar.getName() + "(Ingeniero) y " + utilizar2.getName() + "(Administradores)");
        }
        else if (Combinar.equalsIgnoreCase("Practicante-Administrador")) {
            System.out.println("Se requiere de un practicante y de un administrador");
            System.out.println("Practicante");
            System.out.println("1. " + Practicante1.getName());
            System.out.println("2. " + Practicante2.getName());
            System.out.println("3. " + Practicante3.getName());
            x = Nuevo.next();
            if (x.equalsIgnoreCase("1")) {
                utilizar = Practicante1;
            } else if (x.equalsIgnoreCase("2")) {
                utilizar = Practicante2;
            } else if (x.equalsIgnoreCase("3")) {
                utilizar = Practicante3;
            }
            System.out.println("Administradores ");
            System.out.println("1. " + Administrador1.getName());
            System.out.println("2. " + Administrador2.getName());
            System.out.println("3. " + Administrador3.getName());
            x = Nuevo.next();
            if (x.equalsIgnoreCase("1")) {
                utilizar2 = Administrador1;
            } else if (x.equalsIgnoreCase("2")) {
                utilizar2 = Administrador2;
            } else if (x.equalsIgnoreCase("3")) {
                utilizar2 = Administrador3;
            }
            proyecto.personal(utilizar, utilizar2);
            System.out.println("Su proyecto: " + Name + "sera realizado por: ");
            System.out.println(utilizar.getName() + "(Practicantes) y " + utilizar2.getName() + "(Administradores)");
        }
    }
}