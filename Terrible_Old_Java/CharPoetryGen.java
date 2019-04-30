// Charlie Ann Fornaca
// CharPoetryGen: An Adventure In OO Programming

import java.io*;
import java.util.scanner;

public int rhymeNumber; //The number of the rhyme group.
public int numOfRhymeTypes 

public class CharPoetryGen {
    public static void main (String[] args) {

        // Enter poetry form: 1) Couplet 2) Quatrain 3) Haiku 4)Sonnet
        poetryForm();

    }


    public static void poetryForm(){
        Scanner keyboard new Scanner(System.in);
        int form = Keyboard.nextint();
        
        if (lines < 2){
            // The poem must be at least two lines long.
            System.out.println("Please enter a number greater than 1.")
            
        } else if (lines > 50){
            // This poem is too big. Don't be a dork.
                    System.out.println("You're not going to read a poem that large.
                                        Please enter a smaller number.");
        } else {
            switch (lines) {
                
                case lines == 14 || 28:
                    // This poem will be a Shakespearian sonnet (ABAB CDCD EFEF GG).
                    makeSonnet(lines);
                    break;

                    
                case lines % 4 == 0:
                    // The poem will be a quatrain (ABAB). 
                    makeQuatrain(lines);
                    break;
                
                case lines % 2 == 0:
                    // The poem will be a/comprised of couplet(s) (AA/BB/...)
                    makeCoup(lines);
                    break;
                
                case lines % 5 == 0;
                    // The poem will be a limerick (AABBA).
                    makeLim(lines);
                    break;
                    
                case lines % 3 == 0;
                    // The poem will be a haiku (575).
                    makeHai(lines);
                    break;
                    
                default:
                    System.out.println("I'm sorry -- Please enter a different number.");
                    break;
                
            }
        }
    } 

    public void makeQuat(int lines){
        
    }
    
    public void makeCoup(int lines){
        getRhymeNumber();
        getLine(rhymeNumber);
    }
    
    public void makeLim(int lines){
        
    }
    
    public void makeHai(int lines){
        
    }

}


}    