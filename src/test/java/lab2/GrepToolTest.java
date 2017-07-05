package lab2;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;

import org.junit.Test;

public class GrepToolTest {

	@Test
	public void testFind() {

		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(9, 12, 15, 16, 17, 20, 32, 67, 87, 114, 125, 137, 138, 139, 140, 144, 147, 157));

		GrepTool gt = new GrepTool("input/simple3.txt");
		ArrayList<Integer> actual = gt.find("us");
	
		assertEquals("find failing for input/simple3.txt and pattern us", expected, actual);	
	
	}
	
	@Test
	public void testFindToFile() {

		GrepTool gt = new GrepTool("input/simple3.txt");
		gt.find("us", "output/result.txt");
		try {
			int count = checkFiles(Paths.get("expected/result.txt"), Paths.get("output/result.txt"));
			if(count <= 0) {
				fail(String.format("find failing for input/simple3.txt and pattern us saved to output/result.txt" +
						" Mismatched Line: %d", -count));
			}
			
		} catch (IOException e) {
			fail(e.getMessage());
		}
	}

	//@author sjengle
	public static int checkFiles(Path path1, Path path2) throws IOException {
		Charset charset = java.nio.charset.StandardCharsets.UTF_8;

		// used to output line mismatch
		int count = 0;

		try (
				BufferedReader reader1 =
				Files.newBufferedReader(path1, charset);
				BufferedReader reader2 =
						Files.newBufferedReader(path2, charset);
				) {
			String line1 = reader1.readLine();
			String line2 = reader2.readLine();

			while (true) {
				count++;

				// compare lines until we hit a null (i.e. end of file)
				if ((line1 != null) && (line2 != null)) {
					// use consistent path separators
					line1 = line1.replaceAll(Matcher.quoteReplacement(File.separator), "/");
					line2 = line2.replaceAll(Matcher.quoteReplacement(File.separator), "/");

					// remove trailing spaces
					line1 = line1.trim();
					line2 = line2.trim();

					// check if lines are equal
					if (!line1.equals(line2)) {
						return -count;
					}

					// read next lines if we get this far
					line1 = reader1.readLine();
					line2 = reader2.readLine();
				}
				else {
					// discard extra blank lines at end of reader1
					while ((line1 != null) && line1.trim().isEmpty()) {
						line1 = reader1.readLine();
					}

					// discard extra blank lines at end of reader2
					while ((line2 != null) && line2.trim().isEmpty()) {
						line2 = reader2.readLine();
					}

					if (line1 == line2) {
						// only true if both are null, otherwise one file had
						// extra non-empty lines
						return count;
					}
					else {
						// extra blank lines found in one file
						return -count;
					}
				}
			}
		}
	}
	
	
}
