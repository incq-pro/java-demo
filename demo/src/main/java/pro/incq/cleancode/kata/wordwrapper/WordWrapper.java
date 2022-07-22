package pro.incq.cleancode.kata.wordwrapper;

public class WordWrapper {

    private int length;

    public WordWrapper(int length) {
        this.length = length;
    }

    public String wrap(String s) throws Exception {
        if (length < 1) {
            throw new InvalidArgument();
        }
        if (s == null) {
            return "";
        }
        if (s.length() <= length) {
            return s;
        } else {
            int space = s.indexOf(" ");
            if (space >= 0) {
                return breakBetween(s, space, space + 1);
            } else {
                return breakBetween(s, length, length);
            }
        }

    }
    public static String wrap(String s, int length) throws Exception {
        return new WordWrapper(length).wrap(s);
    }

    private String breakBetween(String s, int start, int end) throws Exception{
        return s.substring(0, start) +
                "\n" +
                wrap(s.substring(end));
    }

    public static class InvalidArgument extends Exception {

    }
}
