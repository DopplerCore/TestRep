package lab1_2;
public class myProgram {
    public static void main(String[] args){
        long element = Long.parseLong(args[args.length-1]);
        long[] array = new long[args.length-1]; 
        for(int i = 0;i<args.length-1;i++){
            array[i] = Long.parseLong(args[i]);
        }
        long[] result = removeElement(array,element);
        System.out.print("Исходный массив: ");
        for(int i=0;i<array.length;i++)System.out.print(array[i]+" ");
        System.out.println("\nУдаляемый элемент: "+element);
        System.out.print("Массив после обработки: ");
        for(int i=0;i<result.length;i++)System.out.print(result[i]+" ");
        System.out.println();
    }
    public static long[] removeElement(long[] array, long element){
        int j = 0;
        for(int i = 0; i<array.length;i++){
            if(array[i]==element)j++;
        }
        if(j == 0) return array;
        long[] result = new long[array.length-j];
        int iter2 = 0;
        for(int i = 0;i<array.length;i++){
            if(array[i] != element){
                result[iter2] = array[i];
                iter2++;
            }
            else j--;
        }
        return result;
    }
}