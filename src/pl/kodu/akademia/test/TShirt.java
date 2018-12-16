package pl.kodu.akademia.test;

public class TShirt {
    String brand;
    Size size;

    public enum Size {
        S(50, 50) {
            @Override
            public void printInfo() {
                System.out.println("jestem mały");

            }
        },
        M(60, 60) {
            @Override
            public void printInfo() {
                System.out.println("jestem sredni");

            }
        },
        L(70, 70) {
            @Override
            public void printInfo() {
                System.out.println("jestem duzy");

            }
        },
        XL(80, 80) {
            @Override
            public void printInfo() {
                System.out.println("jestem bardzo duzy");

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
