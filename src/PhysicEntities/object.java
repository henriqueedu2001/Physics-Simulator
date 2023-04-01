package PhysicEntities;

import Geometry.vector;

public class object {
    vector position;
    vector velocity;
    vector aceleration;
    String name;

    public object(String object_name, vector start_position, vector start_velocity, vector start_aceleration){
        position = start_position;
        velocity = start_velocity;
        aceleration = start_aceleration;
        name = object_name;
    }

    public void showInfo() {
        System.out.println("name: " + name);
        System.out.println("position: (" + position.x + ", " +position.y + ", " + position.z + ")");
        System.out.println("velocity: (" + velocity.x + ", " +velocity.y + ", " + velocity.z + ")");
        System.out.println("aceleration: (" + aceleration.x + ", " +aceleration.y + ", " + aceleration.z + ")");
    }
}
