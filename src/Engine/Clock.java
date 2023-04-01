package Engine;

public class Clock {
    public double current_time;
    public double minimal_time_unit;
    public double start_time;
    public double end_time;
    public double interval_lenght;
    public int tick;
    public int ticks_amount;

    /**
     * Clock constructor, where we define the time interval and its subdivisions
     * @param start starting time of the Clock
     * @param end the final time of the Clock
     * @param step the smallest time unit of the Clock (tick time length)
     */
    public Clock(double start, double end, double step) {
        start_time = start;
        end_time = end;
        interval_lenght = end_time - start_time;
        current_time = start_time;
        minimal_time_unit = step;
        tick = 0;
        ticks_amount = (int) (interval_lenght/minimal_time_unit);
    }

    /**
     * Clock constructor, where we define the time interval and its subdivisions
     * @param start starting time of the Clock
     * @param end the final time of the Clock
     * @param steps the number of subdivisions of the time interval
     */
    public Clock(double start, double end, int steps) {
        start_time = start;
        end_time = end;
        interval_lenght = end_time - start_time;
        current_time = start_time;
        minimal_time_unit = interval_lenght/((double) steps);
        tick = 0;
        ticks_amount = steps;
    }

    /**
     * Shows the basic variables of the clock
     */
    public void showClockInfo() {
        System.out.println("current_time:" + current_time);
        System.out.println("minimal_time_unit:" + minimal_time_unit);
        System.out.println("start_time:" + start_time);
        System.out.println("end_time:" + end_time);
        System.out.println("interval_lenght:" + interval_lenght);
        System.out.println("tick:" + tick);
        System.out.println("ticks_amount:" + ticks_amount);
    }

    /**
     * Moves the current time of the Clock by one single tick
     */
    public void move_one_tick() {
        current_time = start_time + ((double)tick)*(interval_lenght/ticks_amount);
        tick += 1;
    }
}
