class ClasseFuori{
     int x=10;
         class InnerClass{
            public int myInnerMethod(){
                return x;
            }
        }
    }

    public class Inner{
        public static void main(String[] args) {
            ClasseFuori myOuter = new ClasseFuori();
            ClasseFuori.InnerClass myInner = myOuter.new InnerClass();
            System.out.println(myInner.myInnerMethod() + myOuter.x);
        }
    }
