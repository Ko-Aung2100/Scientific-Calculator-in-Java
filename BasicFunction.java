public class BasicFunction implements CalculatorInterface{
    private double[] arr;
    private double result = 0.0f;
    public BasicFunction() {
       
      
    }
    public BasicFunction(double[] arr) {
        this.arr = arr;
      
    }
    public double[] getArr() {
        return arr;
    }
    public void setArr(double[] arr) {
        this.arr = arr;
    }
  
    public double addition(double[] arr){
        result = 0.0f;
        for(int i = 0; i < arr.length; i++){
            result += arr[i];
        }
        return result;
    }
    public double subtraction(double[] arr){
        result = arr[0];
        for(int i = 0; i < arr.length; i++){
            result -= arr[i];
        }
        return result;
    }
    public double multiplication(double[] arr){
        result = 1;
        for(int i = 0; i < arr.length; i++){
            result *= arr[i];
        }
        return result;
    }
    public double division(double[] arr){
        result = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == 0){ // very important
                throw new ArithmeticException("Division by zero not allowed");
            }
            result /= arr[i];

        }
        return result;
    }
    
}
