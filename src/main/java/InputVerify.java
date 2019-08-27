import java.util.regex.Pattern;

public class InputVerify {
    //This is the method to verify the user input
    //There are some pre-set methods check the validation

    //This method is to ensure user can only input a number
    public int checkWhetherInputNumber(String input)
    {
        int num = -1;
        Pattern pattern = Pattern.compile("[0-9]*");
        if(pattern.matcher(input).matches())
        {
            num = Integer.parseInt(input);
            return 0;
        }
        else
        {
            return 1;
        }
    }
}
