package praktek3;

public class SepedaMotor extends sepeda{
    private string jenisMotor;
    
    void throttle(){
        System.out.println("bremmmmm.......");
    }

    public string getJenisMotor() {
        return jenisMotor;
    }

    public void setJenisMotor(string jenisMotor) {
        this.jenisMotor = jenisMotor;
    }
    
    
}
