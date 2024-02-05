package lab1_3;
public class myProgram {
    public static void main(String[] args){
        int lenght = Integer.parseInt(args[0]);
        boolean asciiOnly = false;
        if(args[1].equals("true")) asciiOnly = true;
        String result = randomString(lenght, asciiOnly);
        System.out.println(result);
    }
    static String randomString(int lenght,boolean asciiOnly){
        int temp = 57343;
        String result = "";
        if(asciiOnly) temp = 128;
        for(int i = 0;i<lenght;i++){
            char[] t = Character.toChars((int)(Math.random()*temp));
            for(int j = 0;j<t.length;j++){
                result+= "'"+t[j]+"'";
            }
        }
        return result;
    }
}