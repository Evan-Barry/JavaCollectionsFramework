import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileHandling {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\t00202376\\Desktop\\hamlet.txt";
        //Set<String> words = new HashSet<String>();
        Map<String, Integer> lineNumbers = new TreeMap<String, Integer>();

        try {
            Scanner in = new Scanner(new File(fileName));
            int lineNumber = 1;
            while (in.hasNextLine()) {
                Scanner lineParser = new Scanner(in.nextLine());
                // Use any characters other than a-z, A-Z, 0-9 as delimiters
                lineParser.useDelimiter("[^A-Za-z0-9_]+");
                while (lineParser.hasNext()) {
                    String identifier = lineParser.next();
                    //System.out.println( identifier);
                    //words.add(identifier);
                    lineNumbers.put(identifier, lineNumber);
                }

                lineNumber++;

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Iterator<String> it = words.iterator();
//        while(it.hasNext())
//        {
//            String word = it.next();
//            System.out.println(word);
//        }
//
//        System.out.println(words.size());

        Set<String> keySet = lineNumbers.keySet();
        for(String key : keySet)
        {
            Integer line = lineNumbers.get(key);
            System.out.println(key + " : " + line);
        }

    }
}
