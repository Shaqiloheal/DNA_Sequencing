// Author: Warren Spalding
// Date 01/08/2022
// DNA Sequencing
public class DNA {
 
    public static void main(String[] args) {
   
      //  -. .-.   .-. .-.   .
      //    \   \ /   \   \ / 
      //   / \   \   / \   \  
      //  ~   `-~ `-`   `-~ `-
  
      String dna1 = "ATGCGATACGCTTGA";
      String dna2 = "ATGCGATACGTGA";
      String dna3 = "ATTAATATGTACTGA";
      String dna = dna3;
  
      // Find the length:
      int length = dna.length();
      System.out.println(length);
  
      // Find the start codon:
      int start = dna.indexOf("ATG");
      System.out.println(start);
  
      // Find the end codon:
      int end = dna.indexOf("TGA");
      System.out.println(end);
  
      // Find out whether or not there is a protien:
      if (start != -1 && end != -1 && (end - start) % 3 == 0) {
        System.out.println("Condition 1 and 2 and 3 are satisfied.");
        String protein = dna.substring(start, end+3);
        System.out.println("Protien: " + protein);
      } else {
        System.out.println("No Protien.");
      }
   
    }
   
  }
  