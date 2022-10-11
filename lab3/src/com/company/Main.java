package com.company;
//2
/*public class Main {

    public static void main(String[] args) {


        System.out.println(factor1(2));
        System.out.println(Math.exp(1));
    }

    public static int getFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

        public static double factor1(int n) {
            double sum = 1;
            for (int i = 1; i <= n; i++) {
                sum=sum+ 1.0 / getFactorial(i);
            }
            return sum;
        }
    }



    //2

public class Main {


    public static void main(String[] args) {


        System.out.println(factor2(2,3));
        System.out.println(Math.exp(1));}

    public static int getFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
    public static double factor2(double x, double n) {
            double sum = 1;
            for (int i = 1; i <= n; i++) {
                sum=sum+ Math.pow(x, i) / getFactorial(i);
            }
            return sum;
        }
    }

//3
public class Main {


    public static void main(String[] args) {


        System.out.println(factor3(4, 6));
        System.out.println(Math.sin(6));
    }

    public static int getFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
    public static double factor3(double x, int n) {
            double sum = x;
            for (int i = 1; i <= n; i++) {
                sum= sum+ (Math.pow(-1, i) * Math.pow(x, (2 * i + 1))) / getFactorial(2 * i + 1);
            }
            return sum;
        }
    }

//4
public class Main {


    public static void main(String[] args) {


        System.out.println(factor4(0.2,5));
        System.out.println(Math.cos(0.2));
    }

    public static int getFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
        public static  double factor4(double x, int n){
            double sum = 1;
            for (int i = 1; i <= n; i++) {
                sum=sum+ Math.pow(-1, i) * Math.pow(x, 2 * i) / getFactorial(2 * i);
            }
            return sum;
        }
    }

//5
public class Main {


    public static void main(String[] args) {
        System.out.println(factor5(0.1, 8));
        System.out.println(Math.log(1.1));
}

        public static  double factor5(double x, int n){
            double sum = 0;
            for (int i = 1; i <= n; i++) {
                int sign = (int) Math.pow(-1, (i - 1));
                sum=sum+(sign * Math.pow(x, i)) / i;
            }
            return sum;
        }
    }

//6
public class Main {


    public static void main(String[] args) {
        System.out.println((factor6(0.01, 1)));
         System.out.println(Math.atan(0.01));
}
    public static  double factor6(double x, int n){
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum=sum+ Math.pow(-1, i) * Math.pow(x, (2*i+1)) / (2*i+1);
        }
        return sum;
    }
        }

//7
public class Main {


    public static void main(String[] args) {
        System.out.println((factor7(1,1)));
        System.out.println(Math.asin(1));
    }

    public static  double factor7(double x, int n){
        double sum = 0;
        for (int i = 1; i <= n; i++) {
sum=sum+((2 * i - 1) * Math.pow(x, 2 * i + 1)) / ((2 * i) * (2 * i + 1));
        }
        return sum;
}
}

//8
public class Main {


    public static void main(String[] args) {
        System.out.println((factor8(0.01, 5)));
         System.out.println(Math.sqrt(1.01));
    }

    public static  double factor8(double x, int n){
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum=sum-Math.pow(-1, i-1) *(2*i - 3 )* (Math.pow(x, i) )/ (2 * i);
        }
        return sum;
    }
}

//11
public class Main {


    public static void main(String[] args) {
        System.out.println((factor11(4)));

    }

        public static  char factor11(int n) {
            double[] A = new double[n+1];
            A[0]=2;
            for (int i =1; i < n+1; i++) {
                A[i]=2+1/A[i-1];
                System.out.println(A[i]);
            }
            return 0;
        }
    }

//12
public class Main {


    public static void main(String[] args) {
        System.out.println((factor12(3)));

    }

        public static  char factor12(int n) {
            double[] A = new double[n+1];
            A[0]=1;
            for (int i =1; i < n+1; i++) {
                A[i]=(A[i-1]+1)/i;
                System.out.println(A[i]);
            }
            return 0;
        }
    }

//13
public class Main {


    public static void main(String[] args) {
        System.out.println((factor13(34)));
}

        public static  char factor13(int n) {
            int[] F = new int[n+1];
            F[1]=1;
            F[2]=1;
            System.out.println(F[1]);
            System.out.println(F[2]);
            for (int i =3; i < n+1; i++) {
                F[i]=F[i-2]+F[i-1];
                System.out.println(F[i]);
            }
            return 0;
        }
    }
 //14
public class Main {


    public static void main(String[] args) {
        System.out.println((factor14(4)));
    }

        public static  char factor14(int n) {
            int[] A = new int[n];
            A[0]=1;
            A[1]=2;
            System.out.println(A[0]);
            System.out.println(A[1]);
            for (int i =2; i < n; i++) {
                A[i]=(A[i-2]+2*A[i-1])/3;
                System.out.println(A[i]);
            }
            return 0;
        }
    }

//15
public class Main {


    public static void main(String[] args) {
        System.out.println((factor15(4)));
    }


        public static  char factor15(int n) {
            double[] A = new double[n+1];
            A[1]=1;
            A[2]=2;
            A[3]=3;
            System.out.println(A[1]);
            System.out.println(A[2]);
            System.out.println(A[3]);
            for (int i =4; i < n+1; i++) {
                A[i]=A[i-1]+A[i-2]-2*A[i-3];
                System.out.println(A[i]);
            }
            return 0;
        }
    }


//16
public class Main {


    public static void main(String[] args) {
        System.out.println((factor16(2, 3)));
    }
    public static  double factor16(int n, int k) {
        double temp = 0;
        for (int i =1; i <= n; i++) {
            temp += Math.pow(i, k);
        }
        return temp;
    }
}
 */
//17
public class Main {


    public static void main(String[] args) {
        System.out.println((factor17(3)));
    }
    public static  double factor17(double n) {
        double temp = 0;
        for (int i =1; i <= n; i++) {
            temp += Math.pow(i, i);
        }
        return temp;
    }
}
