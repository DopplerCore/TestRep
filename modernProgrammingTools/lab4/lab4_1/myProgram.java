package lab4_1;
public class myProgram {
    public static void main(String[] args){
        String[] avenue = new String[3];
        avenue[0] = "First";
        avenue[1] ="Second";
        avenue[2] ="Third";
        String[] street = new String[3];
        street[0] = "First";
        street[1] ="Second";
        street[2] ="Third";
        String[] square = new String[3];
        square[0] = "First";
        square[1] ="Second";
        square[2] ="Third";
        City myCity = new City(avenue, street, square);
        myCity.printInfo();
    }
}