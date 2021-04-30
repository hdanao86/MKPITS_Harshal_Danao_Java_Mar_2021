//Java Member inner class
//
//A non-static class that is created inside a class but outside a method is called member inner class.

//In this example, we are creating msg() method in member inner class that is accessing the private data member of outer class.

 class Memberinnerclassex1 {
     private int data=30;
     class Inner{
         void msg(){System.out.println("data is "+data);}
     }
     public static void main(String args[]){
         Memberinnerclassex1 obj=new Memberinnerclassex1();
         Memberinnerclassex1.Inner in=obj.new Inner();
         in.msg();
     }

 }
