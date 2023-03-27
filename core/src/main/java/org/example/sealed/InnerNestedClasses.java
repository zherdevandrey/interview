package org.example.sealed;

public class InnerNestedClasses {

    private static Object NestedClass;
    private int a = 5;

    private int fieldWithSameName = 5;

    public class InnerClass {
        int b = 3;

        private int fieldWithSameName = 5;

        void test() {
            System.out.println(InnerNestedClasses.this.fieldWithSameName);
            System.out.println(a);
            System.out.println(b);
        }
    }

    public void testLocalClass() {
        class LocalClass{

        }
    }

    public static class NestedClass {
        static int b = 3;

        public static void test() {
            //compilation error
            //System.out.println(a);
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        InnerClass innerClass = new InnerNestedClasses().new InnerClass();
        innerClass.test();
        InnerNestedClasses.NestedClass nestedClass = new InnerNestedClasses.NestedClass();
        nestedClass.test();
    }

}
