package pl.kodu.akademia.test;

public class TShirt {
    String brand;
    Size size;

    public enum Size {
        S(50, 50) {
            @Override
            public void printInfo() {
                System.out.println("Jestem mały !!");
            }
        },
        M(60, 60) {
            @Override
            public void printInfo() {

            }
        },
        L(70, 70) {
            @Override
            public void printInfo() {
                System.out.println("Jestem duży !!");
            }
        },
        XL(80, 80) {
            @Override
            public void printInfo() {
                System.out.println("Jestem bardzo duży !!");
            }
        };

        int width;
        int height;

        Size(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public abstract void printInfo();
    }
}
