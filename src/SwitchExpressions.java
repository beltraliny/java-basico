public class SwitchExpressions {

    public static void main(String[] args) {
        String option = "OptionA";
        boolean flag = true;

        String result = switch (option) {
            case "OptionA" -> {
                if (flag) {
                    yield "Option A with flag true"; // yield é tipo um return usado apenas no switch
                }
                yield "Option A with flag false";
            }
            case "OptionB", "OptionC", "OptionD" -> "Option B, C or D";
            case "OptionE" -> "OptionE";
            default -> "Invalid";
        };

        System.out.printf("Result: %s", result);
    }
}
