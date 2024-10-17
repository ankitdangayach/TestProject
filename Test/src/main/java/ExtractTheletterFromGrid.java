public class ExtractTheletterFromGrid {

    public static void main(String[] args) {
        String[] grid = {
                "***a**********",
                "****b*********",
                "****c*********",
                "**************",
                "******d*******",
                "******e*******",
                "**************",
                "********f*****",
                "********g*****",
                "**************"
        };

        for (String row : grid) {
            for (int i = 0; i < grid.length; i++) {
                char ch = row.charAt(i);
                if (ch != '*' && Character.isLetter(ch)) {
                    System.out.print(ch);
                }
            }
        }

        /*System.out.println(Arrays.stream(grid).flatMap(element -> Arrays.stream(element.split("")).filter(e -> !e.equals("*"))).collect(Collectors.joining("")));*/

        /*System.out.println( Arrays.stream(grid).map(element -> Arrays.asList(element.split("")).stream().filter(e -> !"*".equalsIgnoreCase(e)).collect(Collectors.joining())).collect(Collectors.toList()));*/
    }
}
