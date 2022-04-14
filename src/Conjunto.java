import java.util.ArrayList;

public class Conjunto {

    private	int[] contenido;

    public Conjunto(int[] contenido){
        this.contenido = new int[contenido.length];
        for	(int i=0; i<contenido.length; i++)
            this.contenido[i]=contenido[i];
    }

    public	int	longitud(){
        return	this.contenido.length;
    }

    public	int	get(int	posicion){
        return	contenido[posicion];
    }

    public int getDistintos(Conjunto c, boolean[] incluidos){
        int cont=0;
        for(int i=0;i< c.longitud();i++){
            if(incluidos[i] == false)
                cont++;
        }
        return cont;
    }

    public static Conjunto seleccionarCandidato(ArrayList<Conjunto> S, boolean[] incluidos){

        Conjunto candidato = S.get(0);

        for(int i=0; i< S.size();i++){
            if((S.get(i).getDistintos(S.get(i),incluidos)) < candidato.getDistintos(candidato,incluidos)){
                candidato = S.get(i);
            }
        }
        return candidato;
    }
}
