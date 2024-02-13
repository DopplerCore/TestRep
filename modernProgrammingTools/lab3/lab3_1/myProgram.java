package lab3_1;
public class myProgram {
    public static void main(String[] args){
        MyClass a = new MyClass();
        MyClass b = new MyClass(new double[]{0.12,0.22,0.44,0.55});
        a.printMyClass();
        System.out.println(a.toString());
        System.out.println(a.equals(a));
        a.deleteElement(0.0);
        System.out.println(a);
        a.addElement(0.16);
        a.addElement(0.17);
        a.addElement(0.18);
        System.out.println(a);
        System.out.println(b);
        a.unite(b);
        System.out.println(a);
        System.out.println(a.find(0.55));
    }
}