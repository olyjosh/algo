// Introduced in Chapter 9
/** Fibonacci numbers. */
public class Fibo {

  /** Return the nth Fibonacci number. */
  public static int fibo(int n) {
    int[] f = new int[n + 1];
    f[0] = 1;
    f[1] = 1;
    for (int i = 2; i <= n; i++) {
      f[i] = f[i - 1] + f[i - 2];
    }
    return f[n];
  }
  
static int fib(int n) {
    int a=1,b=1,i,c;
    for (i=3; i<=n; i++) {
        c = a+b;
        a = b;
        b = c;
    }
    return a;
}
  
  public static void main(String[] args) {
    System.out.println(fibo(4));
  }

}
