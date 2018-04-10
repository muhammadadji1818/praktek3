package praktek3;

public class SepedaMotor extends sepeda{
    private String jenisMotor;
    
    void throttle(){
        System.out.println("bremmmmm.......");
    }

    public String getJenisMotor() {
        return jenisMotor;
    }

    public void setJenisMotor(String jenisMotor) {
        this.jenisMotor = jenisMotor;
    }
    
    
}
