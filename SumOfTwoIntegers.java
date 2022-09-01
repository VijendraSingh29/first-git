import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

import static java.lang.Integer.max;
//https://leetcode.com/problems/sum-of-two-integers/

public class SumOfTwoIntegers {


    public static void main(String[] args) {

              int a = 20 , b=3;
int sum=0;
int carry=0;
             for(int i=0;i<32;i++)
             {
                if((a&1)!=0 && (b&1)!=0)
                {
                    if(carry==1)
                        sum+=1<<i;
                    carry=1 ;

                }else if((a&1)!=0 || (b&1)!=0)
                {
                    if(carry==0)
                    {
                        sum+=1<<i;
                    }
                }else if(carry==1)
                {
                    sum+=1<<i;
                    carry=0;
                }
                a>>=1;
                b>>=1;
             }

        System.out.println(sum);
        }
    }
    

