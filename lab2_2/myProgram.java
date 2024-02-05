import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class myProgram {
    public static void main(String[] args){
        boolean haveC = false;
        boolean haveD = false;
        boolean haveU = false;
        boolean haveI = false;
        boolean haveIFile = false; 
        String iFile = "";       
        boolean haveOFile = false;
        String oFile = "";       
        if(args.length>0){
            if(args[0].equals("-c"))haveC = true;
            else if(args[0].equals("-d"))haveD = true;
            else if(args[0].equals("-u"))haveU = true;
            else {haveIFile = true; iFile = args[0];}
        }
        if(args.length>1){
            if(args[1].equals("-i")){
                haveI = true;
                if(args.length>3) {haveOFile = true; oFile = args[3];}
                if(args.length>2) {haveIFile = true; iFile = args[2];}
            }
            else{
                if((args.length>2)||(haveIFile)) {haveOFile = true; oFile = args[2];}
                haveIFile = true;
                iFile = args[1];
            }
        }
        List<String> allLines = new ArrayList<String>();
        try{
        if(haveIFile)  allLines = Files.readAllLines(Paths.get(iFile));
        else allLines = Files.readAllLines(Paths.get("file.txt"));
        } catch(IOException e){ e.printStackTrace();}
        String[] tempLines = new String[allLines.size()];
        if(haveI){
            for(int i = 0;i<allLines.size();i++) tempLines[i] = allLines.get(i).toLowerCase();
        } else for(int i = 0;i<allLines.size();i++) tempLines[i] = allLines.get(i);
        int[] linesNum = new int[allLines.size()];
        for(int i = 0; i<tempLines.length-1;i++){
            for(int j = i+1; j<tempLines.length;j++){
                if(linesNum[i]>=0){
                    if(tempLines[i].equals(tempLines[j])){
                        linesNum[i]++;
                        linesNum[j]--;
                    }
                }
            }
        }
        String result = "";
        if(haveC){
            for(int i = 0;i<linesNum.length;i++) if(linesNum[i] >-1) result += Integer.toString(linesNum[i]+1)+" "+tempLines[i]+"\n";
        } else if(haveD){
            for(int i = 0;i<linesNum.length;i++) if(linesNum[i] > 0) result += tempLines[i]+"\n";
        }else if(haveU){
            for(int i = 0;i<linesNum.length;i++) if(linesNum[i] == 0) result += tempLines[i]+"\n";
        }
        try{
        if(haveOFile) Files.write(Paths.get(oFile),result.toString().getBytes());
        Files.write(Paths.get("file2.txt"),result.toString().getBytes());
        } catch(IOException e){ e.printStackTrace();}
    }   
}
