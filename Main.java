public class Main{
    int id;
    String nama;
    double IPK;

 public Main(int id, String nama, double IPK){
    this.id = id;
    this.nama = nama;
    this.IPK = IPK;
  }
 public void uraikan(){
    System.out.println("idnya:" +id);
    System.out.println("nama:" +nama);
    System.out.println("IPK:" +IPK);
  }
}