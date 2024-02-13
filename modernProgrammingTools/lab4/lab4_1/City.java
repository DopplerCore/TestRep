package lab4_1;
public class City {
    public class CityInfo {
        private String[] avenue;
        public String[] street;
        public String[] square;
        public CityInfo(String[] avenue,String[] street,String[] square){
            this.avenue = avenue;
            this.street = street;
            this.square = square;
        }
    }
    private CityInfo myCity;
    public City(String[] avenue,String[] street,String[] square){
        myCity = new CityInfo(avenue, street, square);
    }
    public void printInfo(){
        String output = "";
        output += "Проспекты: \n";
        for(int i=0;i<myCity.avenue.length;i++) output += myCity.avenue[i]+"\n";
        output += "Улицы: \n";
        for(int i=0;i<myCity.street.length;i++) output += myCity.street[i]+"\n";
        output += "Площади: \n";
        for(int i=0;i<myCity.square.length;i++) output += myCity.square[i]+"\n";
        System.out.println(output);
    }
}