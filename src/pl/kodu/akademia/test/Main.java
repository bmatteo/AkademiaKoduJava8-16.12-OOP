package pl.kodu.akademia.test;

public class Main {
    public static void main(String[] args) {
        ExampleClass exampleClass = new ExampleClass();
        exampleClass.a=3;
        System.out.println(exampleClass.a);
        ExampleClass.change(exampleClass);
        System.out.println(exampleClass.a);

        int a = 5;
        System.out.println(a);
        ExampleClass.change(a);
        System.out.println(a);

        Reaktor r = new Reaktor() {
            @Override
            public void zareaguj() {
                System.out.println("Reaguję !!");
            }

            @Override
            public void a() {

            }
        };

        Reaktor r2 = new Reaktor() {
            @Override
            public void zareaguj() {
                System.out.println("Reaguję 2!!");
            }

            @Override
            public void a() {

            }
        };

        Reaktor r3 = new Reaktor() {
            @Override
            public void zareaguj() {
                System.out.println("Reaguję 3!!");
            }

            @Override
            public void a() {

            }
        };
        ExampleClass e = new ExampleClass();
        ExampleClass.A b = e.new A();

        TShirt tShirt = new TShirt();
        tShirt.brand = "Nike";
        tShirt.size = TShirt.Size.M;

        System.out.println(tShirt.size.height);
        tShirt.size.printInfo();
    }
}
