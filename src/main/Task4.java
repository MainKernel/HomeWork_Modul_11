import java.util.stream.Stream;

public class Task4 {
    private int x;
    private long a;
    private int c;
    private int m;


    public Task4(int x, long a, int c, int m) {
        this.x = Math.abs(x);
        this.a = a;
        this.c = c;
        this.m = m;
    }

    public Task4(int x) {
        this.x = x;
        this.a = 25214903917L;
        this.c = 11;
        this.m = (int) Math.pow(2, 48);
    }

    public long rand() {
        x = (int) ((a * x + c) % m);
        return x;
    }

    public static void main(String[] args) {
        //Infinity PRNG
        Stream.iterate(1, x -> x < x+1 , x -> x+1).forEach(x -> new Task4(x).rand());

        //Uncomment to see output
        //Stream.iterate(1, x -> x < x+1 , x -> x+1).forEach(x -> System.out.println(new Task4(x).rand()));
    }
}
