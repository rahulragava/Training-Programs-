import java.util.ArrayList;

public class ques1 {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("This");
        str.add("is");
        str.add("an");
        str.add("example");
        str.add("of");
        str.add("text");
        str.add("justification.");
        System.out.println(str);
        int l = 2;
        if (l < str.get(0).length()){
            System.out.println("invalid length");
        }
        else {
            System.out.println(getJustified(str,l));
        }
    }

    private static ArrayList<String> getJustified(ArrayList<String> str, int length) {
         ArrayList<String> result = new ArrayList<>();
          int i = 0, n = str.size();
          while(i  < n){
              int j = i + 1;
              int lineLength = str.get(i).length();
              while(j < n && (lineLength + str.get(j).length() + (j-i-1)) < length){
                  lineLength+=str.get(j).length();
                  j++;
              }
              int wordWithoutSpaces = length - lineLength;
              int numberOfWords = j - i;
              if (numberOfWords == 1 || j >= n){
                  result.add(leftJustification(str,wordWithoutSpaces,i ,j));
              }
              else{
                  result.add(middleJustification(str,wordWithoutSpaces,i,j));
              }
              i = j;
          }
         return result;
    }

    public static String leftJustification(ArrayList<String> str, int wordsWithoutSpaces, int i , int j){
        StringBuilder newLine = new StringBuilder(str.get(i));
        int spacesOnRight = wordsWithoutSpaces - (j-i-1);
        for(int k = i+1; k < j ;k++){
            newLine.append(" ").append(str.get(k));
        }
        newLine.append(" ".repeat(spacesOnRight));
//        for(int addSpace = 0; addSpace < spacesOnRight; i++){
//            newLine.append(" ");
//        }
        return newLine.toString();
    }

    public static String middleJustification(ArrayList<String> str, int wordsWithoutSpaces, int i , int j){
         int spacesNeeded = j-i-1;
         int spaces = wordsWithoutSpaces / spacesNeeded;
         int extraSpaces = wordsWithoutSpaces % spacesNeeded;
        StringBuilder newLine = new StringBuilder(str.get(i));
        for(int k = i+1; k < j; k++){
            int spacesToApply = spaces + (extraSpaces-- > 0 ? 1 : 0 );
            newLine.append(" ".repeat(spacesToApply) + str.get(k));
        }


        return newLine.toString();
    }
}