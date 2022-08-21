public class FormasTeste {
    public static void main(String[] args){
        int quant = (int)(Math.random() * 10) + 1;
        Formas formas = new Formas(quant);
        for (int i=0; i<formas.getCirculos().length; i++){
            if (formas.getCirculos()[i] == null)
                formas.getCirculos()[i] = new Circulo(Math.random(), Math.random(), (Math.random() * 10));
        }
        for (int i=0; i<formas.getCirculos().length; i++){
            System.out.println(formas.getCirculos()[i]);
        }

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        Formas formas2 = new Formas(quant);
        formas2 = formas;
        for (int i=0; i<formas.getCirculos().length; i++){
            System.out.println(formas.getCirculos()[i]);
            System.out.println(formas2.getCirculos()[i]);
        }

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        Formas formas3 = new Formas(quant);
        formas3.setCirculos(formas.getCirculos().clone());

        for (int i=0; i<formas.getCirculos().length; i++){
            formas.getCirculos()[i].setRaio((Math.random() * 10) + 1);
        }
        System.out.println("Formas");
        for (int i=0; i<formas.getCirculos().length; i++){
            System.out.println(formas.getCirculos()[i]);
        }
        System.out.println("Formas 2");
        for (int i=0; i<formas.getCirculos().length; i++){
            System.out.println(formas2.getCirculos()[i]);
        }
        System.out.println("Formas 3");
        for (int i=0; i<formas.getCirculos().length; i++){
            System.out.println(formas3.getCirculos()[i]);
        }
    }
}
