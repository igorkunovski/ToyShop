/* Abstract class Toy with possible properties*/

package toy;

public abstract class Toy {

    private static int counter = 0;

    private final int id;
    private final String name;
    private int winRate;
    private int qty;

    protected Toy(String name, int winRate, int qty){
        this.id = ++counter;
        this.name = name;
        this.winRate = winRate;
        this.qty = qty;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWinRate() {
        return winRate;
    }

    public void setWinRate(int winRate) {
        this.winRate = winRate;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }


    @Override
    public String toString() {
        return "Toy ID=" + this.getId() +
                "; Name: " + this.getName() +
                "; WinRate: " + this.getWinRate() + "%" +
                "; Qty left: " + this.getQty() + "pcs";
    }
}
