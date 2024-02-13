package lab3_2;

public class myProgram {
    public static void main(String[] args){
    int[] inputRoomNum =new int[]{5,8,4};
    int[] inputSpace = new int[]{5,8,4};
    int[] inputFloor = new int[]{5,8,4};
    String[] inputAdress = new String[]{"5","8","4"};
    int[] inputRentPrice = new int[]{5,8,4};
    boolean[] inputIsRent = new boolean[]{false,true,false};
    Apartment myApartment = new Apartment(inputRoomNum, inputSpace, inputFloor, inputAdress, inputRentPrice, inputIsRent);
    myApartment.printApartment();
    myApartment.ApartmentFinder().floor(8).adress("8").find();
    }
}