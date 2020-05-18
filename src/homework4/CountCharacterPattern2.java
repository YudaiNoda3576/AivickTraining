package homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountCharacterPattern2 {

	public static void main(String[] args) {
		Path filepath = Path.of(args[0]);
		try {
			List<String> characters = List.of( "a", "z","あ", "ん");
			Map<String, Integer> map = charCount(filepath, characters);
			print(map);
		} catch (IOException e) {
			System.out.println("ファイルが読み込めません");
		}

	}

	public static Map<String, Integer> charCount(Path path, List<String> characters) throws IOException {
//		ファイルの読み込み
		try (BufferedReader br = Files.newBufferedReader(path)) {
			String line;
			Map<String, Integer> map = new HashMap<String, Integer>();

			while ((line = br.readLine()) != null) {
				for (String c : characters) {
					List<String> charList = new ArrayList<>();
					if (line.equals(c)) {
						charList.add(c);
						map.put(c, charList.size());
					}
				}
			}
			return map;
		}
	}

	public static void print(Map<String, Integer> map) {
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.toString());
		}

	}
}
