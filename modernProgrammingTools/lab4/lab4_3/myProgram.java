package lab4_3;
public class myProgram {
    public static void main(String[] args){
        MyLibrary library = new MyLibrary();
        library.addBook("MyFavouriteBook");
        System.out.println(library.catalog.catalog[0].name);
        library.takeBook("Maksim", "MyFavouriteBook", "23.06.2004", true);
        library.orders[0].printInfo();
        library.blackList.addReader("Maksim");
        System.out.println(library.blackList.readers[0]);
    }
}