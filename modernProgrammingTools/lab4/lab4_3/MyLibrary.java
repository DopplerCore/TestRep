package lab4_3;
public class MyLibrary {
    public class Book {
        String name;
        public Book(String name){
            this.name = name;
        }
    }
    public class Catalog {
        Book[] catalog = new Book[0];
        public Catalog(){}
        public void addBook(String bookName){
            Book[] tmpCatalog = new Book[catalog.length+1];
            for(int i=0;i<catalog.length;i++)tmpCatalog[i]=catalog[i];
            tmpCatalog[tmpCatalog.length-1]=new Book(bookName);
            catalog = tmpCatalog;
        }
        public boolean deleteBook(String bookName){
            boolean haveBook = false;
            for(int i=0;i<catalog.length;i++)if(catalog[i].name==bookName) haveBook=true;
            if(haveBook){
                Book[] tmpCatalog = new Book[catalog.length-1];
                int iterator = 0;
                for(int i=0;i<catalog.length;i++){
                    if(catalog[i].name!=bookName){
                        tmpCatalog[iterator]=catalog[i];
                        iterator++;
                    }
                }
                catalog = tmpCatalog;
                return true;
            }
            return false;
        }
        public void printInfo(){
            String output = "Каталог: ";
            for(int i=0;i<catalog.length-1;i++)output += catalog[i].name+" ";
            System.out.println(output);
        }
    }
    public class Order {
        String readerName;
        String bookName;
        String returnDate;
        boolean onHome;
        public Order(String readerName,String bookName,String returnDate,boolean onHome){
            this.readerName = readerName;
            this.bookName = bookName;
            this.returnDate = returnDate;
            this.onHome = onHome;
        }
        public void printInfo(){
            String output = String.format("Заказ: читатель: %s; книга: %s; взята до %s;",this.readerName,this.bookName,this.returnDate);
            if(onHome) output += " взята надом";
            else output += " взята в читательный зал";
            System.out.println(output);
        }
    }
    public class BlackList {
        public String[] readers=new String[0];
        public BlackList(){}
        public void addReader(String readerName){
            String[] tmpReaders = new String[readers.length+1];
            for(int i=0;i<readers.length;i++)tmpReaders[i]=readers[i];
            tmpReaders[tmpReaders.length-1]=readerName;
            readers=tmpReaders;
        }
    }
    public Catalog catalog = new Catalog();
    public Order[] orders = new Order[0];
    public BlackList blackList = new BlackList();
    public boolean takeBook(String readerName,String bookName,String returnDate,boolean onHome){
        for(int i=0;i<catalog.catalog.length;i++){
            if(catalog.catalog[i].name == bookName){ 
            if(catalog.deleteBook(bookName)){
                Order[] tmpOrders = new Order[orders.length+1];
                for(int j=0;j<orders.length;j++) tmpOrders[j]=orders[j];
                tmpOrders[tmpOrders.length-1] = new Order(readerName, bookName, returnDate, onHome);
                orders = tmpOrders; 
                return true;
            }
        }
        }
        return false;
    }
    public boolean returnBook(String bookName){
        for(int i=0;i<orders.length;i++)if(orders[i].bookName == bookName){
            catalog.addBook(bookName);
            Order[] tmpOrders = new Order[orders.length-1];
            int iterator=0;
            for(int j=0;j<orders.length;j++)if(j!=i){
                tmpOrders[iterator]=orders[j];
                iterator++;
            }
            orders = tmpOrders; 
            return true;
        }
        return false;
    }
    public void addBook(String bookName){
        catalog.addBook(bookName);
    }
}
