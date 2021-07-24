/**
 * rectangle
 */
public class rectangle {

    // costas of rectangle -- tipe : ab = cd = costa_1 , ac = bd = costa_2
    double costa_1 = 0;
    double costa_2 = 0;
    // 
    public rectangle(double costa_1, double costa_2) {
        this.costa_1 = costa_1;
        this.costa_2 = costa_2;
    }
    // give the area
    public double area() {
        double rectangle_area = 0;
        double _area_ = costa_1 * costa_2;
        if (_area_ > 0) {
            rectangle_area = _area_;
        }
        else if (_area_ < 0) {
            rectangle_area = -1;
        }
        return rectangle_area;
    }
    // give the perimeter
    public double perimeter() {
        double rectangle_perimeter = 0;
        double _perimeter_ = 2 * (costa_1 + costa_2);
        if (_perimeter_ > 0) {
            rectangle_perimeter = _perimeter_;
        }
        else if (_perimeter_ < 0) {
            rectangle_perimeter = -1;
        }
        return rectangle_perimeter;
    }
}