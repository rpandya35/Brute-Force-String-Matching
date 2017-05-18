/**
 * Created by rahul on 5/17/2017.
 */
public class Brute {

    public static void main(String args[]){

        Brute b = new Brute();
       if( b.oneEditAway("pale" , "bae")){
           System.out.println("Character is one space away");
       }  else {

           System.out.println("Character isn't one space away");
       }


    }

    public boolean oneEditAway(String first, String second){

        if(first.length() == second.length()){
            return oneEditReplace(first,second);
        } else if(first.length()+1 == second.length()){
            return oneEditInsert(first,second);
        }else if (first.length()-1 == second.length()){
            return oneEditInsert(second,first);
        }

        return false ;
    }

    public boolean oneEditInsert(String s1, String s2) {

        int index1 = 0;
        int index2 = 0;

        while (index2 < s2.length() && index1 <s1.length()){
            if (s2.charAt(index2)!= s1.charAt(index1)){
                if (index1!=index2){

                    return false;
                } else
                    index2++;

            } else {

                index1++;
                index2++;
            }


        }
        return true ;



    }

    public boolean oneEditReplace(String s1, String s2) {

        boolean foundDifference = false;
        for(int i = 0; i <s1.length();i++){
            if (s1.charAt(i) != s2.charAt(i)){
                if(foundDifference){
                    return false;
                }

                foundDifference = true ;

            }
        }

        return true ;
    }
}
