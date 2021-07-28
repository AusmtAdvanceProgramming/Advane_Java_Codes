/**
 * circle
 */
public class circle {

    // radius
    double radius = 0;
    // 
    public circle(double radius) {
        this.radius = radius;
    }
    // give the area
    public double area() {
        double circle_area = 0;
        double _area_ = radius * radius * 3.1415926535;
        if (_area_ > 0) {
            circle_area = _area_;
        }
        else if (_area_ < 0) {
            circle_area = -1;
        }
        return circle_area;
    }
    // give the perimeter
    public double perimeter() {
        double circle_perimeter = 0;
        double _perimeter_ = 2 * radius * 3.1415926535;
        if (_perimeter_ > 0) {
            circle_perimeter = _perimeter_;
        }
        else if (_perimeter_ < 0) {
            circle_perimeter = -1;
        }
        return circle_perimeter;
    }
}