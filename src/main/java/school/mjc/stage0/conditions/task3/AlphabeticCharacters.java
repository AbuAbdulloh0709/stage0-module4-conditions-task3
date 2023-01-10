package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if ((int) character >= 65 && (int) character <= 90 || (int) character >= 97 && (int) character <= 122) {
            if (character == 'a' || character == 'i' || character == 'o' || character == 'u' || character == 'A' || character == 'I' || character == 'O' || character == 'U') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
