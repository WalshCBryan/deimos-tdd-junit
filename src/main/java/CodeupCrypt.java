public class CodeupCrypt {

    public static String hash = "";
    String[] vowels = {"a", "e", "i", "o", "u"};

    public static String checkPassword(){

        String result = "";

        for (String letter: hash.split("")) {
            // f
            if(letter.equalsIgnoreCase("e")){
                result += "3";
            } else if(letter.equalsIgnoreCase("o")){
                result += "0";
            } else if(letter.equalsIgnoreCase("u")){
                result += "9";
            } else if(letter.equalsIgnoreCase("a")){
                result += "4";
            } else if(letter.equalsIgnoreCase("i")){
                result += "1";
            } else {
                result += letter;
            }
        }
        return result;
    }

}