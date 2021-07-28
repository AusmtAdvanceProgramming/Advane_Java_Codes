/**
 * parallelogram
 */
public class parallelogram {

    // costas of parallelogram -- tipe : ab = cd = costa_1 , ac = bd = costa_2
    double costa_1 = 0;
    double costa_2 = 0;
    // height of parallelogram
    double height = 0;
    // 
    public parallelogram(double costa_1, double costa_2,double height) {
        this.costa_1 = costa_1;
        this.costa_2 = costa_2;
        this.height = height;
    }
    // give the area
    public double area() {
        double parallelogram_area = 0;
        double area_1 = costa_1 * height;
        if (area_1 > 0) {
            parallelogram_area = area_1;
        }
        else if (area_1 < 0) {
            parallelogram_area = -1;
        }
        return parallelogram_area;
    }
    // give the perimeter
    public double perimeter() {
        double parallelogram_perimeter = 0;
        double _perimeter_ = 2 * (costa_1 + costa_2);
        if (_perimeter_ > 0) {
            parallelogram_perimeter = _perimeter_;
        }
        else if (_perimeter_ < 0) {
            parallelogram_perimeter = -1;
        }
        return parallelogram_perimeter;
    }
}