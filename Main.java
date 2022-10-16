class Main {
    
    public static void main(String[] args) {
    
        int[] numbers = new int[5];
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Console.getInt("Enter number " + (i+1));
        }

        System.out.println ("The numbers in reverse order:"); 
        
        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.print (numbers[i] + "  ");
        }
    }
}