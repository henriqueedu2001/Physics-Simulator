import Geometry.*;
import PhysicEntities.object;
import Engine.*;

class Program {
    public static void main(String[] args) {
        Simulator s = new Simulator(0.0, 2.0, 10);
        s.run();
    }
}

