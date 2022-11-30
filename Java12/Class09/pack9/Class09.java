package chap12.Class09.pack9;

import chap12.Class09.pack9.sub1.CSphere;
import chap12.Class09.pack9.sub2.CTrapezoid;

public class Class09 {
    public static void main(String[] args) {
        CSphere nn = new CSphere(5);
        nn.show();
        CTrapezoid rr = new CTrapezoid(3, 4, 2);
        rr.show();
    }
}
