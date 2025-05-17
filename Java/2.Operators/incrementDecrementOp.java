//2. Write a method for increment and decrement operators(++, --)
public class incrementDecrementOp {
    public static void main(String [] args){
        int a=10;
        int b=a++;//post increment, here first the value of "a" will be  used then it  will increment
        System.out.println(a);//So the value is first assigned to b i.e 10, Then it is incremented
        System.out.println(b);
        //let's see pre decrement
        int c=--a;//First the value will be decrement, the it will assigned
        System.out.println(c);
    }
}
