import java.util.List;

public class StringFunifier {
    private String boringString;
    private List<Integer> start;
    private List<Integer> end;

    public StringFunifier(String boringString, List<Integer> start, List<Integer> end) {
        this.boringString = boringString;
        this.start = start;
        this.end = end;
    }

    public String getFunnyString() {
        StringBuilder result = new StringBuilder(boringString);

        for (int i = start.size() - 1; i >= 0; i--) {
            int start_ = start.get(i);
            int end_ = end.get(i);

            String substring = new StringBuilder(result.substring(start_, end_ + 1)).reverse().toString();

            result.replace(start_, end_ + 1, "(" + substring + ")");
        }

        return result.toString();
    }
}
