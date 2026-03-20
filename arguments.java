// Test class
    class Test {
        public int sum(int num1, int num2) {
            // Return the sum
            return num1 + num2;
        }
    }
    
    class Basics {
        public static void main(String[] args) {
            // Creating an object of class Test
            Test test = new Test();
            
            // Sum two numbers using test object
            int sum = test.sum(10, 15);
            
            // Display the result
            System.out.println(sum);
        }
    }