public class Main_Macchina {

    public void fullThrottle(){
        System.out.println("La macchina sta già andando alla massima velocità! \n");}

    public void speed(int maxSpeed){
        System.out.println("La velocità massima vale: " + maxSpeed + "\n");
    }

    public static void main(String[] args) {
        Main_Macchina macchina = new Main_Macchina();
        macchina.fullThrottle();
        macchina.speed(200);
        macchina.speed(350);
        macchina.fullThrottle();
    }
}
