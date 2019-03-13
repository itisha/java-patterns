package patterns.flyweight.text.format;

import java.util.ArrayList;
import java.util.List;

class BetterFormattedText {
    private String plainText;
    private List<TextRange> formatting;

    BetterFormattedText(String plainText) {
        this.plainText = plainText;
        formatting = new ArrayList<>();
    }

    TextRange getRange(int start, int end) {
        TextRange range = new TextRange(start, end);
        formatting.add(range);
        return range;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < plainText.length(); ++i) {
            char c = plainText.charAt(i);
            for (TextRange range : formatting) {
                if (range.covers(i) && range.capitalize)
                    c = Character.toUpperCase(c);
                //if (range.covers(i) && range.italic)
                //c = Character.toUpperCase(c);
                //if (range.covers(i) && range.bold)
                //c = Character.toUpperCase(c);
            }

            sb.append(c);
        }
        return sb.toString();
    }

    public class TextRange {
        int start, end;
        boolean capitalize, bold, italic;

        TextRange(int start, int end) {
            this.start = start;
            this.end = end;
        }

        boolean covers(int position) {
            return position >= start && position <= end;
        }
    }
}
