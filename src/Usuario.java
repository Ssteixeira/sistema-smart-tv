public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual TV -> " + smartTv.volume);

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume TV Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.print("Novo status -> TV Ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.print(" Novo staus -> TV Ligada ? " + smartTv.ligada);
    }
}