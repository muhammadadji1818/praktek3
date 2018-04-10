package praktek3;
public class sepedaAksi {
    public static void main(String[] args) {
        sepeda s = new sepeda();
       
        s.setMerk("butterfly");
        s.setWarna("merah");
        s.setHarga(1000);
        //gak bisa s.setJenisMotor();
        
        s.cetakInfo();
        
        System.out.print("Merknya \t: ");
        System.out.println(s.getMerk());
        System.out.print("warnanya \t: ");
        System.out.println(s.getWarna());
        System.out.print("Harganya \t: ");
        System.out.println(s.getHarga());
        
        SepedaMotor sm = new SepedaMotor();
        sm.setMerk("yamaha");
        sm.setWarna("hitam");
        sm.setHarga(1000);
        sm.setJenisMotor("mesin");
        sm.cetakInfo();
        System.out.println("jenis \t:"+sm.getJenisMotor());
        sm.throttle();
        
        
    }
    
}
