package com.packages.arrays;

public class Vector 
{
    private final int T = 100;
    private int n;
    private int vec[] = new int[T];

    public Vector()
    {
        n = 0;
        
    }

    public int getT() 
    {
        return T;
    }

    public int getN() 
    {
        return n;
    }

    public void setN(int n) 
    {
        this.n = n;
    }

    public int[] getVec() 
    {
        return vec;
    }

    public void setVec(int[] vec) 
    {
        this.vec = vec;
    }

    public void addVector(int datum)
    {
        vec[n] = datum;
        n++;
    }

    public void showVector()
    {
        for (int i = 0; i < n; i++) {
            System.out.print(vec[i] + " | ");
        }
    }

    public int findVector(int datum) 
    {
        int i, pos;
        i = 0;
        pos = -1;
        while (i < n && pos == -1) {
            if (vec[i] == datum) {
                pos = i;
            } else {
                i++;
            }
        }
        return pos;
    }
    
    public int sumVector(){
        int s = 0;
        for (int i = 0; i < n; i++){
            s += vec[i];
        }
        return s;
    }

    public double avgVector(){
        return sumVector() / n;
    }

    public  int maxVector(){
        int m = vec[0];
        for (int i = 1; i < n; i++){
            if (vec[i] > m){
                m = vec[i];
            }
        }
        return m;
    }

    public  int minVector(){
        int m = vec[0];
        for (int i = 1; i < n; i++){
            if (vec[i] < m){
                m = vec[i];
            }
        }
        return m;
    }

    public int totalOddPositionEven(){
        int c = 0;          //1
        for (int i = 0; i < n; i += 2){         //1 + (n/2 + 1) + n/2 
            if (vec[i] % 2 == 0){           // n/2
                c++;               // n/2
            }           //n/2
        }           // n/2
        return c;           //1
    }

    public double sumSquare(){
        double s = 0;           //1
        int i = 3;        //1
        while (i < n ){     //1 + log(n) + log(n)
            s = s + Math.pow(vec[i], 2);          // log(n) + log(n) + 1
            i = i * 3;             // log(n)
        }       
        return s;       //1
    }

    public void funcionX(){
        for (int i = 0; i < n; i++){        //1 + n + (n + 1)
            int p = 1;      //n        
            for (int j = 0; j < n; j*=2){       //n + nlg(n) + (nlg(n) + n)   
                p = p * vec[i] * vec[j];        // nlg(n)    
            }              //nlg(n)
            System.out.println("Valor de p " + i + ": " + p);       // n
        }       //n      
    }

    // cf = 7n + 4nlg(n) +2
    // O(nlg(n)) (semilogaritmica)

    public void funcionY(){
        for (int i = 0; i < n; i++){        //1 + n + (n + 1)    
            for (int j = n - 1; j >= 0; j--){       //n^2 + (n^2 + n) + n^2                        
            System.out.println("Operacion " + (vec[i] + vec[j]));       // n^2
            }             //n^2
        }       //n             
    }  // cf = 5n^2 + 4n + 2

    public void funcionZ(){
        int i, j, aux;        //1
        for (i = 0; i < n - 1; i++){
            for (j = i + 1; j < n; j++){
                if (vec[i] > vec[j]){
                    aux = vec[i];
                    vec[i] = vec[j];
                    vec[j] = aux;
                }
            }
        }
    }
}
