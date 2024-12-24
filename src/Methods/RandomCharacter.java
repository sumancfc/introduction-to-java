package Methods;

public class RandomCharacter {
    public static void main(String[] args) {
        final int NUMBER_OF_CHARACTERS = 175;
        final int CHARS_PER_LINE = 25;

        for (int i = 0; i < NUMBER_OF_CHARACTERS; i++) {
            char ch = getRandomUpperCaseLetter();
            if ( (i +1) % CHARS_PER_LINE == 0 )
                System.out.println(ch);
            else
                System.out.print(ch);
        }
    }
    // Generate a random character between ch1 and ch2
    public static char getRandomCharacter(char ch1, char ch2){
        return (char) ( ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    // Generate a random lowercase letter
    public static char getRandomLowerCaseLetter(){
        return getRandomCharacter('a', 'z');
    }

    // Generate a random uppercase letter
    public static char getRandomUpperCaseLetter(){
        return getRandomCharacter('A', 'Z');
    }

    // Generate a random digit character
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }
}
