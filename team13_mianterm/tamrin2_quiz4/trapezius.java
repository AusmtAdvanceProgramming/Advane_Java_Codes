/**
 * trapezius
 */
public class trapezius {

    // costas of trapezius -- tipe : ab  parallel cd
    double costa_ab = 0;
    double costa_bc = 0;
    double costa_cd = 0;
    double costa_ad = 0;
    // height of trapezius
    public double height_ab_cd = 0;
    // 
    public trapezius(double costa_ab, double costa_bc, double costa_cd, double costa_ad, double height_ab_cd) {
        this.costa_ab = costa_ab;
        this.costa_bc = costa_bc;
        this.costa_cd = costa_cd;
        this.costa_ad = costa_ad;
        this.height_ab_cd = height_ab_cd;
    }
    
    // give the area
    public double area() {
        double trapezius_area = 0;
        double _area_ = (costa_ab + costa_cd) * height_ab_cd / 2;
        if (_area_ > 0) {
            trapezius_area = _area_;
        }
        else if (_area_ < 0) {
            trapezius_area = -1;
        }
        return trapezius_area;
    }
    // give the perimeter
    public double perimeter() {
        double trapezius_perimeter = 0;
        double _perimeter_ = costa_ab + costa_ad + costa_bc + costa_cd;
        if (_perimeter_ > 0) {
            trapezius_perimeter = _perimeter_;
        }
        else if (_perimeter_ < 0) {
            trapezius_perimeter = -1;
        }
        return trapezius_perimeter;
    }
}