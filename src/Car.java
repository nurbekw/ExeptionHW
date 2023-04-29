public class  Car  implements AutoCloseable {
    public void drive(){
        System.out.println("The car is charging");
    }

    @Override
    public void close() {
        System.out.println("Car close up");
    }
}
