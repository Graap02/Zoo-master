package money;

public class Wallet {
    private double wallet;
    private double totalWallet;
    private double cost;

    public Wallet(){
        this.wallet = wallet;
        totalWallet =  wallet - totalWallet;
    }

    public Wallet(double wallet){
        this.wallet = wallet;
        totalWallet =  wallet;
    }
    public void setWallet(double w) {
        wallet = w;
        totalWallet =  totalWallet - wallet;
    }
    public void setTotalWallet(double w){
        totalWallet = w;
        totalWallet =  wallet - totalWallet;
    }

    public double getWallet() {

        return totalWallet;
    }
}
