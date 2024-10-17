package Questions.ExamQuestionsAgility;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CSVProblem {

    public static void main(String[] args) {
        String org = "header,header\nANNUL,ANNULLED\nnull,NILL\nNULL,NULL";
        /* String org = "id,name,age,score\n1,Jack,NULL,12\n17,Betty,28,11";*/
        String s = solution(org);
        System.out.println(s);
    }

    /*public static String solution(String S) {
        // Implement your solution here

        String[] rows = S.split("\n");
        StringBuilder result = new StringBuilder();
        for(String row: rows){
            if (!containsNullOrAnnulled(row)) {
                result.append(row).append("\n");
            }
            if (!result.isEmpty()) {
                result.setLength(result.length() - 1);
            }

        }
        return result.toString();
    }

    private static boolean containsNullOrAnnulled(String row) {
        String[] columns = row.split(",");
        for (String column : columns) {
            if (column.equals("NULL")) {
                return true;
            }
        }
        return false;
    }*/

    public static String solution(String S) {
        // Split the input string into rows, filter out rows containing "NULL", and join the remaining rows
        return Arrays.stream(S.split("\n"))
                .filter(row -> !containsNullOrAnnulled(row))
                .collect(Collectors.joining("\n"));
    }

    private static boolean containsNullOrAnnulled(String row) {
        // Check if any column in the row is "NULL"
        return Arrays.stream(row.split(","))
                .anyMatch(column -> column.equals("NULL"));
    }



    /*public static String solution(String S) {
        // Implement your solution here

        String[] rows = S.split("\n");
        StringBuilder result = new StringBuilder();
        for(String row: rows){
            if(!row.contains("NULL")) {
                if(result.length()>0){
                    result.append("\n");
                }
                result.append(row);
            }
        }
        return result.toString();
    }*/


   /* public String removeNull(String S) {
        // Split the input string into rows and filter out those containing "NULL"
        return Arrays.stream(S.split("\n"))
                .filter(row -> !row.contains("NULL"))
                .collect(Collectors.joining("\n"));
    }*/
}
