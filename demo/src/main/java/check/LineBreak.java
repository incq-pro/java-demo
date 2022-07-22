package check;

import java.util.ArrayList;
import java.util.List;

public class LineBreak {
    public List<String> lineBreak(String text, int lineSize) {
        List<String> result = new ArrayList<>();
        text = text.trim();
        int size = text.length();
        int start = 0;
        while (start < size) {
            int i = start + lineSize - 1;
            if (i >= size) {
                i = size - 1;
            }
            char c = text.charAt(i);
            while (c != ' ' && (i != size - 1)) {
                i--;
                c = text.charAt(i);
            }
            result.add(text.substring(start, i + 1));
            start = i + 1;
        }
        return result;
    }
    public static void main(String[] args) {
        LineBreak lb = new LineBreak();
        List<String> lines = lb.lineBreak("Four score and seven years ago our fathers brought forth upon this continent a new nation, conceived in liberty and dedicated to the proposition that all men are created equal", 13);
        System.out.println(String.join("\n", lines));
    }
}
