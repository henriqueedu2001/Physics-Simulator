package Geometry;

public class vector {
    public double x;
    public double y;
    public double z;

    public double radius;
    public double theta;
    public double phi;

    /**
     * Explicit constructor, with given cartesian coordinates
     * @param x_value x coordinate in cartesian coordinates
     * @param y_value y coordinate in cartesian coordinates
     * @param z_value z coordinate in cartesian coordinates
     */
    public vector(double x_value, double y_value, double z_value) {
        x = x_value; y = y_value; z = z_value;
        compute_polar_coordinates();
    }

    /**
     * Default constructor, that creates a null vector (0, 0, 0)
     */
    public vector() {
        x = 0.0; y = 0.0; z = 0.0;
        radius = 0.0; theta = 0.0; phi = 0.0; 
    }

    /**
     * Shows the basic variables of the vector
     */
    public void showInfo() {
        System.out.println("cartesian coordinates: (" + x + ", " + y + " " + z + ")");
        System.out.println("polar coordinates: (" + radius + ", " + theta + " " + phi + ")");
        System.out.println("norm: " + radius);
    }

    /**
     * Evaluates the polar coordinates, with the alredy registered cartesian coordinates
     */
    private void compute_polar_coordinates() {
        radius = Math.sqrt(x*x + y*y + z*z);

        if(z == 0)
            phi = Math.PI/2;
        else
            phi = Math.atan((x*x + y*y)/z);

        if(x == 0)
            theta = Math.PI/2;
        else
            theta = Math.atan(y/x);
    }

    /**
     * Makes the sum of two vectors A and B
     * @param A first vector
     * @param B second vector
     * @return the vector sum S = A + B
     */
    public static vector sum(vector A, vector B) {
        vector result = new vector();

        result.x = A.x + B.x;
        result.y = A.y + B.y;
        result.z = A.z + B.z;

        result.compute_polar_coordinates();

        return result;
    }

    /**
     * Multiplies the vector by a scalar
     * @param scalar the scalar factor
     * @return the vector multiplied by the scalar
     */
    public vector multiply_by_scalar(double scalar) {
        x *= scalar; y *= scalar; z *= scalar; 
        compute_polar_coordinates();

        return this;
    }

    /**
     * Normalizes the vector
     * @return the vector normalized
     */
    public vector normalize() {
        multiply_by_scalar(1.0/radius);
        return this;
    }

    /**
     * Evaluates the dot product of the vectors A and B
     * @param A first vector of the product
     * @param B second vector of the product
     * @return the dot product of A and B <A,B>
     */
    public static double dot_product(vector A, vector B) {
        return (A.x * B.x) + (A.y * B.y) + (A.z * B.z);
    }

    /**
     * Evaluates the cross product of the vectors A and B
     * @param A first vector of the product
     * @param B second vector of the product
     * @return the cross product of A and B AxB
     */
    public static vector cross_product(vector A, vector B) {

        double x_value = A.y*B.z - A.z*B.y;
        double y_value = A.z*B.x - B.x*B.z;
        double z_value = A.x*B.y - A.y*B.x;

        return new vector(x_value, y_value, z_value);
    }
}