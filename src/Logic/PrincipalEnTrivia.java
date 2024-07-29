package Logic;

public class PrincipalEnTrivia {

    public static void main(String[] args) {
        ApartadoGrafico.PrincipalJForm ap = new ApartadoGrafico.PrincipalJForm();
        ApartadoGrafico.TablaPosiciones tp = new ApartadoGrafico.TablaPosiciones();
        
        



        //ventana calificacion
        tp.setVisible(true);
        
        tp.setLocationRelativeTo(null);

        //Ventana de bienvenida
        ap.setVisible(true);
        ap.setSize(909, 780);
        ap.setLocationRelativeTo(null);
        

    }

}
