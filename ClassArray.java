public class ClassArray {

private String a, b, c;
String[] names ;

ClassArray(String a, String b, String c){
this.a = a;
this.b = b;
this.c = c;
}

public String[] archiveNames() {

names = new String [3];
names [0] = a;
names [1] = b;
names [2] = c;

return names; 
}

}