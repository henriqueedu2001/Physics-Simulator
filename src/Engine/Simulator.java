package Engine;
import Engine.Clock;

public class Simulator {
    Clock GlobalClock;

    /**
     * Constructor for the Simulator, where we define the GlobalClock
     * @param start_time initial time of the simulation
     * @param end_time final time of the simulation
     * @param time_step the smallest time unit
     */
    public Simulator(double start_time, double end_time, double time_step) {
        GlobalClock = new Clock(start_time, end_time, time_step);
    }

    /**
     * Constructor for the Simulator, where we define the GlobalClock
     * @param start_time initial time of the simulation
     * @param end_time final time of the simulation
     * @param steps_amount the amount os steps (time subdivisions) in the simulation
     */
    public Simulator(double start_time, double end_time, int steps_amount) {
        GlobalClock = new Clock(start_time, end_time, steps_amount);
    }

    /**
     * Runs the simulation
     */
    public void run() {
        GlobalClock.showClockInfo();
        while(GlobalClock.current_time < GlobalClock.end_time) {
            compute(GlobalClock.tick, GlobalClock.current_time);
            GlobalClock.move_one_tick();
        }
    }

    /**
     * For every tick, computes the current state of the sistem
     * @param tick the current tick of the simulation
     * @param time the current tick of the simulation
     */
    private void compute(int tick, double time) {
        System.out.println("tick: " + tick + " | time: " + time);
    }
}

