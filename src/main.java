import java.util.ArrayList;

public class main {

    public ArrayList<Conjunto> conjuntoMinimo (int[] u, ArrayList<Conjunto> S){

        ArrayList<Conjunto> solucion=new ArrayList<>();
        Conjunto candidato;

        boolean[] incluidos = new boolean[u.length];
        for(int i=0;i<u.length;i++){
            incluidos[i]= false;
        }

        while (!S.isEmpty()){
            candidato = Conjunto.seleccionarCandidato(S, incluidos);
            S.remove(candidato);

            solucion.add(candidato);

            for(int i=0; i< candidato.longitud();i++){
                incluidos[candidato.get(i)] = true;
            }
        }
        return solucion;
    }

    public boolean todos(boolean[] incluidos){
        int i=0;
        boolean todos= true;
        while(i< incluidos.length && todos){
            todos=incluidos[i];
            i++;
        }
        return todos;
    }

}
