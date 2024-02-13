package lab4_2;
public class MyText {
    public class MyPage {
        public class MyWord {
            public String word;
            public MyWord(String word){
                this.word = word;
            }
            public void printInfo(){
                System.out.println(word);
            }
            public boolean equals(String anotherWord){
                if(word == anotherWord) return true;
                else return false;
            }
        }
        public MyWord[] words;
        public MyPage(String[] words){
            this.words = new MyWord[words.length];
            for(int i=0;i<words.length;i++) this.words[i] = new MyWord(words[i]);
        }
        public void printInfo(){
            String output = "";
            for(int i=0;i<words.length-1;i++)output += words[i].word+" ";
            if(words.length>0) output += words[words.length-1].word;
            System.out.println(output);
        }
        public int find(String anotherWord){
            for(int i=0;i<words.length;i++) if(words[i].word == anotherWord) return i;
            return -1;
        }
    }
    public MyPage[] myText;
    public MyText(String[][] words){
        this.myText = new MyPage[words.length];
        for(int i=0;i<words.length;i++) this.myText[i] = new MyPage(words[i]);
    }
    public void printInfo(){
        for(int i=0;i<myText.length;i++)myText[i].printInfo();
    }
    public int find(String anotherWord){
        int wordPos = 0;
        for(int j=0;j<myText.length;j++){
            for(int i=0;i<myText[j].words.length;i++) {
                if(myText[j].words[i].word == anotherWord) return wordPos;
                wordPos++;
            }
        }
        return -1;
    }
}