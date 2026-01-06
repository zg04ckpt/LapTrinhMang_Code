package RMI;

import java.io.Serializable;

public class ProductX implements Serializable {
    private static final long serialVersionUID = 20171107;
    public int discount;
    public String id, code, discountCode;

    public ProductX(int discount, String id, String code, String discountCode) {
        this.discount = discount;
        this.id = id;
        this.code = code;
        this.discountCode = discountCode;
    }
}
