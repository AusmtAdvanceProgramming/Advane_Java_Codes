/**
 * square
 */
public class square {

    // a costa of square
    double _costa_ = 0;
    // 
    public square(double _costa_) {
        this._costa_ = _costa_;
    }
    // give the area
    public double area() {
        double square_area = 0;
        double _area_ = _costa_ * _costa_;
        if (_area_ > 0) {
            square_area = _area_;
        }
        else if (_area_ < 0) {
            square_area = -1;
        }
        return square_area;
    }
    // give the perimeter
    public double perimeter() {
        double square_perimeter = 0;
        double _perimeter_ = 4 * _costa_;
        if (_perimeter_ > 0) {
            square_perimeter = _perimeter_;
        }
        else if (_perimeter_ < 0) {
            square_perimeter = -1;
        } 
        return square_perimeter;
    }


}