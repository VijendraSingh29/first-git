import java.util.HashSet;

public class allPermutations {

    public static void main(String [] args)
    {

        System.out.println("hello permu");
        String s = "AAB" ;
        HashSet<String > set = new HashSet<>() ;
        set.add("ABC") ;
        //     ArrayList<Character> list = new ArrayList<>() ;

        StringBuilder sb = new StringBuilder() ;
        allPermutations p =new allPermutations();

        for(int k=1;k<=s.length() ;k++)
            p.allpermu(s,0,k,sb,set);

    }
    public static void allpermu(String s, int start,int k,StringBuilder sb,HashSet<String> set)
    {
        if(sb.length() == k)
        {
            if(!set.contains(sb.toString())) {
                System.out.println(sb.toString());
                // String ss= temp.toString() ;
                //  System.out.println(ss);
                set.add(sb.toString());
            }
            return;
        }
        for(int i=start ;i<3;i++)
        {  s= swap(s,i,start);
            sb.append(s.charAt(start));
            if(!set.contains(s)) {
                allpermu(s, start + 1, k, sb, set);
            }
            sb.deleteCharAt(sb.length()-1);

            s= swap(s,i,start) ;
        }


    }

    private static  String  swap(String s, int i, int j) {
        char temp;
        char[] charArray = s.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp ;
        return  String.valueOf(charArray) ;
    }

}
