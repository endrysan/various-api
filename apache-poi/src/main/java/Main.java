public class Main {

    private static String pathToExcel = SomeConstants.path + "apache-poi\\src\\main\\resources\\hierarchy.xls";

    public static void main(String... args){
        System.out.println(ParserOriflameExcel.parse(pathToExcel));
    }
}
