public class Main {
    public static void main(String[] args) {

        NumberClass myNumber = new NumberClass();
        StringClass myString = new StringClass();

        myString.text = "hello... ";
        String unmodified = "I'm Staying unmodified";

        multiply(myNumber, 2, 3);
        modifyString(myString, "WRLD!");
        modifyStringNot(unmodified, " Adding Stuff!");

        System.out.println("Result: " + myNumber.number);
        System.out.println("modified text: " + myString.text);
        System.out.println("unmodified text: " + unmodified);
    }

    public static void multiply(NumberClass result, int first, int second){
        result.number = first * second;
    }

    public static void modifyString(StringClass result, String input) {
        result.text = result.text + input;
    }

    public static void modifyStringNot(String result, String input) {
        result = result + input;
    }
}

class NumberClass {
    public int number;
}

class StringClass {
    public String text;
}