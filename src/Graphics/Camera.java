package Graphics;

import java.util.Vector;

import Geometry.vector;

public class Camera {
    vector position;
    vector direction;
    double projection_plane_dist;
    vector projection_center;

    public Camera(vector initial_position, vector initial_direction, double projection_plane_distance) {
        position = initial_position;
        direction = initial_direction.normalize();
        projection_center = new vector();
        projection_plane_dist = projection_plane_distance;
        projection_center = vector.sum(initial_direction.multiply_by_scalar(-1.0*projection_plane_dist), position);
    }

    public void showInfo() {
        position.showInfo();
        direction.showInfo();
        projection_center.showInfo();
        System.out.println(projection_center);
    }

    public Point_2D projection(vector point) {
        Point_2D projected_point = new Point_2D(0.0, 0.0);
        
        return projected_point;
    }
}

class Point_2D {
    double x;
    double y;

    public Point_2D(double x_coordinate, double y_coordinate) {
        x = x_coordinate;
        y = y_coordinate;
    }
}
