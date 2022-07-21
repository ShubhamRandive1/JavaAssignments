package VowelsOrConsonant;

public class VowelsOrConsonant {

    void CheckVowelOrConsonant(char c)
    {
        if(c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U')
        {
            System.out.println("The Character Entered "+" "+ c+" "+"Is A Vowel");
        }
        else if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
        {
            System.out.println("The Character Entered "+" "+ c+" "+"Is A Consonant");
        }
        else
        {
            System.out.println("Not A Valid Characted");
        }
    }

    public static void main(String[] args) {
        VowelsOrConsonant VoC = new VowelsOrConsonant();
        VoC.CheckVowelOrConsonant('A');
        VoC.CheckVowelOrConsonant('I');
        VoC.CheckVowelOrConsonant('$');
    }
}
