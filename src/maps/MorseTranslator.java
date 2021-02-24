package maps;

import java.util.HashMap;
import java.util.Map;

public class MorseTranslator {

	private final Map<String, String> morseMap;

	public String translateText(String morse) {
		String output = "";
		String[] morseWords = morse.split(" / ");

		for (String morseWord : morseWords) {
			output += this.translateWord(morseWord) + " ";
		}

		return output.trim();
	}

	public static void main(String[] args) {
		MorseTranslator morse = new MorseTranslator();
		String translated = morse.translateWord(".--- .- ...- .-");
		System.out.println(translated);

		String translatedText = morse.translateText(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-");
		System.out.println(translatedText);
	}

	public String translateWord(String morseWord) {
		String translated = "";

		String[] morseLetters = morseWord.split(" ");

		for (String morseLetter : morseLetters) {
			translated += this.morseMap.get(morseLetter);
		}

		return translated;
	}

	public MorseTranslator() {
		this.morseMap = new HashMap<>();

		morseMap.put(".-", "a");
		morseMap.put("-...", "b");
		morseMap.put("-.-.", "c");
		morseMap.put("-..", "d");
		morseMap.put(".", "e");
		morseMap.put("..-.", "f");
		morseMap.put("--.", "g");
		morseMap.put("....", "h");
		morseMap.put("..", "i");
		morseMap.put(".---", "j");
		morseMap.put("-.-", "k");
		morseMap.put(".-..", "l");
		morseMap.put("--", "m");
		morseMap.put("-.", "n");
		morseMap.put("---", "o");
		morseMap.put(".--.", "p");
		morseMap.put("--.-", "q");
		morseMap.put(".-.", "r");
		morseMap.put("...", "s");
		morseMap.put("-", "t");
		morseMap.put("..-", "u");
		morseMap.put("...-", "v");
		morseMap.put(".--", "w");
		morseMap.put("-..-", "x");
		morseMap.put("-.--", "y");
		morseMap.put("--..", "z");
	}

}
