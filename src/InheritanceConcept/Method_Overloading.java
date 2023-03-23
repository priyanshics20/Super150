package InheritanceConcept;

public class Method_Overloading {
    public static void main(String[] args) {
        //override ka concept parent or child class mai aata hai jese hum same method jo parent
        //class mai hai usko modify krte hai child class mai

        //overload ka concept same/ within class mai hota hai
        //method ka name same hota hai
        //return type same hota hai
        //overloading mai
        //overloading mai sirf arguments mai difference hota hai
        System.out.println(add(2, 4));
        System.out.println(add(2, 4, 9));
        System.out.println(add(2, 4, 9.7));
        System.out.println(add(-2, 3, 4, 5, 5, 6, 7, 7, 8, 11, 8, 8, 11, 8, 8, 8, 1));
    }
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static int add(int a, int b, double c) {
        return (int) (a + b + c);
    }

//is method ko bolte hai variable no. of arguments ..
//    	public static int add(int... a) {
//		int sum = 0;
//		for (int i = 0; i < a.length; i++) {
//			sum = sum + a[i];
//
//		}
//		return sum;
//	}

    //is method ko bolte hai variable no. of arguments ..
    // ye humesha left side mai hi rahega or sirf ek hi possible hai bhut sare nahi bna skte
    // method bhi or variable bhi jese
    //public static int add(int b,int c,int... a, long ...d) ye nahi possible
    //or last mai hi method bnayenge sabse neeche
    public static int add(int b, int c,int... a) {
        System.out.println(b);
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];

        }
        return sum;
    }
}
