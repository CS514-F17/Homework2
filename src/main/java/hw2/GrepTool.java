package hw2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GrepTool {

	//TODO: Declare private data members.
	
	/**
	 * Construct a GrepTool object with the 
	 * given fileName.
	 * @param fileName
	 */
	public GrepTool(String fileName) {
		//TODO: Replace with your code.
	}

	/**
	 * Find all instances of the pattern specified in the file
	 * passed as input to the constructor.
	 * Return an ArrayList containing the line numbers of all
	 * lines containing the pattern.
	 * 
	 * Example: 
	 * The dog ran
	 * and the 
	 * other dog jumped.
	 * 
	 * find("og") -> [1, 3]
	 * 
	 * 
	 * @param pattern
	 * @return
	 */
	public ArrayList<Integer> find(String pattern) {
		//TODO: Replace with your code.
		return null;
	}

	/**
	 * Find all instances of the pattern specified in the file
	 * and save the result to the file specified by outFile.
	 * 
	 * Create the directory structure required for outFile if it 
	 * does not already exist.
	 * 
	 * The output format should be as follows:
	 * <line number>: <full line>
	 * 
	 * Example:
	 * 
	 * The dog ran
	 * and the 
	 * other dog jumped.
	 * 
	 * find("og", "output/file.txt") 
	 * Result in output/file.txt"
	 * 
	 * 1: The dog ran
	 * 3: other dog jumped.
	 * 
	 * 
	 * @param pattern
	 * @param outFile
	 */
	public void find(String pattern, String outFile) {
		//TODO: Replace with your code.		
	}
}
