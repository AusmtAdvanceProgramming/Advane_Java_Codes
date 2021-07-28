/**
 * triangle
 */
public class triangle {

    // costas of triangle
    double costa_ab = 0;
    double costa_ac = 0;
    double costa_bc = 0;
    // heights of triangle
    double height_a = 0;
    // 
    public triangle (double costa_ab, double costa_ac, double costa_bc, double height_a) {
        this.costa_ab = costa_ab;
        this.costa_ac = costa_ac;
        this.costa_bc = costa_bc;
        this.height_a = height_a;
    }
    // give the area
    public double area() {
        double triangle_area = 0;
        double area_1 = (costa_bc * height_a) / 2;
        if (area_1 > 0) {
            triangle_area = area_1;
        }
        else if (area_1 < 0){
            triangle_area = -1;
        }
        return triangle_area;
    }
    // give the perimeter
    public double perimeter() {
        double triangle_perimeter = 0;
        double _perimeter_ = costa_ab + costa_ac + costa_bc;
        if (_perimeter_ > 0) {
            triangle_perimeter = _perimeter_;
        }
        else if (_perimeter_ < 0) {
            triangle_perimeter = -1;
        }
        return triangle_perimeter;
    }
}