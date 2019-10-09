public class StringManipulationTest {
    public static void main(String[] args) {
        StringManipulation finalstring = new StringManipulation();
        String result = finalstring.trimAndConcat("         Good     ", "   Dog          ");
        System.out.println(result);

        StringManipulation testindex = new StringManipulation();
        Integer finalvalue = testindex.getIndexOrNull("The quick brown fox ran fast.", "you");
        System.out.println(finalvalue);

        StringManipulation findSubString = new StringManipulation();
        Integer finalValue = findSubString.getIndexOrNull("The quick brown fox ran fast.", "ken");
        System.out.println(finalValue);

        StringManipulation combineString = new StringManipulation();
        String endResult = combineString.concatSubstring("The quick brown fox ran fast.", 10, 13, "cheese");
        System.out.println(endResult);
    }
}