package BASIC_JAVA_PROBLEM;

 class productsum {
    public static void main(String[] args) {
        int num = 234;
        int sum = 0;
        int product = 1;
        while(num != 0){
            int temp = num % 10;
            product = product * temp;
            sum = sum +temp;
            num = num/10;
        }
        System.out.println(product - sum);
    }
}
