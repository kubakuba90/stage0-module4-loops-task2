package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        char[] array = chars;

        for (Character ch : array) {
            System.out.print(ch);
        }
    }
}
