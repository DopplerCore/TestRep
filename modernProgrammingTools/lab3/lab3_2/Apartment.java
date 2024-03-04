package lab3_2;
public class Apartment {
    public class Room {
    private int roomNum;
    private int space;
    private int floor;
    private String adress;
    private int rentPrice;
    private boolean isRent;
    public Room(int inputRoomNum,
    int inputSpace,
    int inputFloor,
    String inputAdress,
    int inputRentPrice,
    boolean inputIsRent){
    this.roomNum =inputRoomNum;
    this.space = inputSpace;
    this.floor = inputFloor;
    this.adress = inputAdress;
    this.rentPrice = inputRentPrice;
    this.isRent = inputIsRent;
    }
    public Room(Room inputRoom){
    this.roomNum =inputRoom.roomNum;
    this.space = inputRoom.space;
    this.floor = inputRoom.floor;
    this.adress = inputRoom.adress;
    this.rentPrice = inputRoom.rentPrice;
    this.isRent = inputRoom.isRent;
    }
    public void printRoom(){
        String output ="Кол-во комнат "+this.roomNum+"; площадь "+this.space+"; этаж "+this.floor+"; адрес "+this.adress+"; стоимость аренды "+this.rentPrice+"; сдаётся "+this.isRent+"\n";
        System.out.print(output);
    } 
}
public Room[] apartment;
public Apartment(int[] inputRoomNum,
int[] inputSpace,
int[] inputFloor,
String[] inputAdress,
int[] inputRentPrice,
boolean[] inputIsRent){
    Room[] inputApartments = new Room[inputRoomNum.length];
    for(int i = 0;i<inputApartments.length;i++)inputApartments[i] = new Room(inputRoomNum[i], inputSpace[i], inputFloor[i], inputAdress[i], inputRentPrice[i], inputIsRent[i]);
    this.apartment = inputApartments;
}
public Apartment(Room[] inputApartment){
    this.apartment = inputApartment;
}
public void takeApartments(int takedRoomId){
    apartment[takedRoomId].isRent = true;
}
public void printApartment(){
    for(int i = 0;i<apartment.length;i++) apartment[i].printRoom();
}
public ApartmentFinder ApartmentFinder(){
    return new ApartmentFinder(apartment);
}
public static class ApartmentFinder{
    private Room[] apartment;
    private int roomNumNeeded = 0;
    private int spaceNeeded = 0;
    private int floorNeeded = 0;
    private String adressNeeded = "";
    private int rentPriceNeeded = 0;
    private int minFloorNeeded = 0;
    private int maxFloorNeeded = 0;
    
    public ApartmentFinder(Room[] apartment){
        this.apartment = apartment;
    }
    
    public ApartmentFinder roomNum(int roomNumNeeded){
        this.roomNumNeeded = roomNumNeeded;
        return this;
    }
    public ApartmentFinder space(int spaceNeeded){
        this.spaceNeeded = spaceNeeded;
        return this;
    }
    public ApartmentFinder floor(int floorNeeded){
        this.floorNeeded = floorNeeded;
        return this;
    }
    public ApartmentFinder adress(String adressNeeded){
        this.adressNeeded = adressNeeded;
        return this;
    }
    public ApartmentFinder rentPrice(int rentPriceNeeded){
        this.rentPriceNeeded = rentPriceNeeded;
        return this;
    }
    public ApartmentFinder minFloor(int minFloorNeeded){
        this.minFloorNeeded = minFloorNeeded;
        return this;
    }
    public ApartmentFinder maxFloor(int maxFloorNeeded){
        this.maxFloorNeeded = maxFloorNeeded;
        return this;
    }
    public Apartment find(){
        int roomsIdsNum = 0;
        for(int i=0;i<apartment.length;i++){
            if(((roomNumNeeded==0)||(apartment[i].roomNum == roomNumNeeded))&&
            ((spaceNeeded==0)||(apartment[i].space == spaceNeeded))&&
            ((floorNeeded==0)||(apartment[i].floor == floorNeeded))&&
            ((adressNeeded=="")||(apartment[i].adress == adressNeeded))&&
            ((rentPriceNeeded==0)||(apartment[i].rentPrice == rentPriceNeeded))&&
            ((minFloorNeeded==0)||(apartment[i].floor >= minFloorNeeded))&&
            ((maxFloorNeeded==0)||(apartment[i].floor == maxFloorNeeded)))roomsIdsNum++;
        }

        int iterator = 0;
        Room[] tmpRooms = new Room[roomsIdsNum];
        for(int i=0;i<apartment.length;i++){
            if(((roomNumNeeded==0)||(apartment[i].roomNum == roomNumNeeded))&&
            ((spaceNeeded==0)||(apartment[i].space == spaceNeeded))&&
            ((floorNeeded==0)||(apartment[i].floor == floorNeeded))&&
            ((adressNeeded=="")||(apartment[i].adress == adressNeeded))&&
            ((rentPriceNeeded==0)||(apartment[i].rentPrice == rentPriceNeeded))&&
            ((minFloorNeeded==0)||(apartment[i].floor >= minFloorNeeded))&&
            ((maxFloorNeeded==0)||(apartment[i].floor == maxFloorNeeded))){
            tmpRooms[iterator] = apartment[i];
            iterator++;
            }
        }
        Apartment tmpApartment = new Apartment(tmpRooms);
        tmpApartment.printApartment();
        return tmpApartment;
    }
    }
}