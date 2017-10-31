package strings;

public class CustomPrinter {
    private String formatString;
    
    public CustomPrinter(String format)
    {
        formatString = format;
    }
    
    public void println(String input)
    {
        String formatted = String.format(formatString, input);
        System.out.println(formatted);
    }
}
