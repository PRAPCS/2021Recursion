class Main {
  public static void main(String[] args) {
    System.out.println(factorial(4));
    System.out.println(fib(4));
  
  }

  public static int factorial(int n) {
    // Base Case where the recursion stops
    if (n == 0)
      return 1;
    // Recursive call getting us closer the the base case
    else
      return n * factorial(n - 1);
  }

  public static int fib(int m){
  //Base case to return where recursion stops
  if(m<=2)
  return 1;
    //Recursive call getting down to the base case
  else
    return fib(m-1) + fib(m-2);
  }

}