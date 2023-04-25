// Write a Java program which implements interface.

    interface quadrilateral {
        void test();
    }

    class rectangle implements quadrilateral {
        public void test() {
            System.out.println("Interface method implemented");
        }
    }

    public class exp11 {
        public static void main(String[] args) {
            quadrilateral s = new rectangle();
            s.test();
        }
    }

