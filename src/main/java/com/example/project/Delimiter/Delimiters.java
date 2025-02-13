package com.example.project.Delimiter;
import java.util.ArrayList;

public class Delimiters {
    /** The open and close delimiters **/
    private String openDel;
    private String closeDel;

    /** Constructs a Delimiters object where open is the open delimiter and close is the
     *  close delimiter.
     *  Precondition: open and close are non-empty strings.
     */
    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    /** Returns an ArrayList of delimiters from the array tokens, as described in part (a). */
    public ArrayList<String> getDelimitersList(String[] tokens) {
        ArrayList<String> delimiterList = new ArrayList<>();
        for (int i = 0 ; i < tokens.length; i++){
            if(tokens[i].equals(openDel) || tokens[i].equals(closeDel)){
                delimiterList.add(tokens[i]);
            }
        }

        return delimiterList;
    }
    

    /** Returns true if the delimiters are balanced and false otherwise, as described in part (b).
     *  Precondition: delimiters contains only valid open and close delimiters.
     */
    /** Returns true if the delimiters are balanced and false otherwise. */
public boolean isBalanced(ArrayList<String> delimiters) {
    int balance = 0; 

    for (String delimiter : delimiters) {
        if (delimiter.equals(openDel)) {
            balance++;
        } else if (delimiter.equals(closeDel)) {
            balance--; 
        }

        if (balance < 0) {
            return false; 
            }
        }
        return balance == 0; 
    }
}