public class ClassArrayMain {

public static void main(String[] args) {

ClassArray classArray1 = new ClassArray(args[0], args[1], args[2]);
classArray1.archiveNames();
System.out.println("The following names are stored in the names array: ");
System.out.println(classArray1.names[0]);
System.out.println(classArray1.names[1]);
System.out.println(classArray1.names[2]);
}}
