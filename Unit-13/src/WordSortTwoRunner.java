//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Egorov

import static java.lang.System.*;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class WordSortTwoRunner {

  public static void main(String args[]) throws IOException {
    Scanner file = new Scanner(new File("wordsorttwo.dat"));
    int size = file.nextInt();
    file.nextLine();
    for (int i = 0; i < size; i++) {
      String sentence = file.nextLine();
      //instantiate a new WordSort
    }
  }
}
