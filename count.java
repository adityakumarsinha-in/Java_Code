
class count{
    public static void main(String[] args){
        // System.out.print("Enter your number: ");
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        int num = 232203;
        int count  = 0;
        while ( num > 0){
            int rem  = num % 10;
            if(rem == 2){
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);
    }

    
}