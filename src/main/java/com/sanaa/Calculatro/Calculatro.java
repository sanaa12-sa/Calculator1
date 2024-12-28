package com.sanaa.Calculatro;
import java.util.HashSet;
import java.util.Set;
public class Calculatro {
        public int add (int a, int b){
            long nb = (long) a + (long) b;
            if (nb>Integer.MAX_VALUE || nb<Integer.MIN_VALUE){
                throw new ArithmeticException("addition dépasse les limites des entiers");
            }
            return (int)nb;
        }

        public int divide (int a, int b){
            if (b==0){
                throw new ArithmeticException ("division par zero");
            }
            return a/b;
    }
}

