package lab2_1;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class myProgram {
    public static void main(String[] args){
            String result = "";
            List<String> lines;
            try {
                lines = Files.readAllLines(Paths.get("file.txt"));
                for(int i = 0;i<lines.size();i++){
                    String newLine ="";
                    String[] words = lines.get(i).split(" ");
                    for(int j = words.length-1;j>=0;j--){
                        newLine +=words[j]+" ";
                    }
                    result += newLine + "\n";
                }
            } catch (IOException e) { e.printStackTrace();}
            try { Files.write(Paths.get("file2.txt"),result.getBytes());}
            catch (IOException e) { e.printStackTrace();}
    }
}
