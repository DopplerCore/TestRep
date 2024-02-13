package lab3_1;
public class MyClass {
    private double[] array;
    final int maxSize = 20;
    public boolean find(double element){
        for(int i = 0; i < array.length; i++) if(array[i] == element) return true;
    return false;
    }
    public void unite(MyClass object2){
        if(array.length<20){
            int len = 20;
            if(array.length+object2.array.length<20) len = array.length+object2.array.length;
            double[] tmpArray = new double[len];
            for(int i = 0; i<array.length;i++) tmpArray[i] = array[i];
            for(int i = 0; i<len-array.length;i++) tmpArray[i+array.length] = object2.array[i];
            this.array = tmpArray;
        }
    }
    public void printMyClass(){
        String output = "";
        for(int i = 0; i<array.length-1;i++) output += array[i] + " ";
        output += array[array.length-1];
        System.out.println(output);
    }
    public void addElement(double element){
        if(array.length<20){
            double[] tmpArray = new double[array.length+1];
            for(int i = 0; i<array.length;i++) tmpArray[i] = array[i];
            tmpArray[tmpArray.length-1] = element;
            this.array = tmpArray;
        }
    }
    public void deleteElement(double element){
        int elNum = 0;
        for(int i = 0; i<array.length;i++) if(array[i] == element) elNum++;
        double[] tmpArray = new double[array.length - elNum];
        int iterator = 0;
        for(int i = 0; i < array.length;i++) if(array[i] != element){
            tmpArray[iterator] = array[i];
            iterator++;
        }
        array = tmpArray;
    }
    public boolean equals(MyClass object2){
        if(array.length!=object2.array.length) return false;
        for(int i = 0; i < array.length; i++) if(array[i] != object2.array[i]) return false;
        return true;
    }
    public String toString(){
        String result = "";
        for(int i = 0; i<array.length-1;i++) result += array[i] + " ";
        if(array.length>0)result += array[array.length-1];
        return result;
    }
    public MyClass(double[] inputArray){
        int len = maxSize;
        if(inputArray.length<maxSize) len = inputArray.length;
        this.array =new double[len];
        for(int i = 0;i<len;i++) this.array[i] = inputArray[i];
    }
    public MyClass(){
        this.array =new double[20];
        for(int i = 0;i<20;i++) this.array[i] = 0;
    }
}