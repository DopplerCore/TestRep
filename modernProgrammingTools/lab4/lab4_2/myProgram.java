package lab4_2;
public class myProgram {
    public static void main(String[] args){
        String [][] inputText = new String[3][3];
        inputText[0][0] = "First"; 
        inputText[0][1] = "First"; 
        inputText[0][2] = "First"; 
        inputText[1][0] = "Second"; 
        inputText[1][1] = "Second"; 
        inputText[1][2] = "Second"; 
        inputText[2][0] = "Third"; 
        inputText[2][1] = "Third"; 
        inputText[2][2] = "Third";
        MyText myText = new MyText(inputText);
        myText.printInfo();
        System.out.println(myText.find("Second"));
        System.out.println(myText.myText[1].find("Second"));
        System.out.println(myText.myText[1].words[0].equals("Second"));
    }
}