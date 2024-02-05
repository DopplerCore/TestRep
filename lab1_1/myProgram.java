package lab1_1;

public class myProgram {

    public static void main(String[] args){
        Integer[] arr = new Integer[args.length];
        for(int i = 0; i<args.length;i++){
        arr[i] = Integer.parseInt(args[i]);
        }
        Integer maxInteger  = arr[0];
        Integer minInteger  = arr[0];
        Integer sumInteger  = arr[0];
        Integer multInteger  = arr[0];
        for(int i = 1;i<arr.length;i++){
            maxInteger = Integer.max(maxInteger,arr[i]);
            minInteger = Integer.min(minInteger,arr[i]);
            sumInteger += arr[i];
            multInteger *= arr[i];
        }
        System.out.println("Максимальное значение: "+maxInteger+
        "\nМинимальное значение: "+minInteger+
        "\nСумма элементов: "+sumInteger+
        "\nПроизведение элементов: "+multInteger);
    }
}