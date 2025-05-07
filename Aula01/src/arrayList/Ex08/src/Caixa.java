import java.util.ArrayList;
import java.util.List;

public class Caixa {

    private List<Retangulo> listaRetangulos;

    public Caixa() {
        setListaRetangulos();
    }

    public List<Retangulo> getListaRetangulos() {
        return listaRetangulos;
    }

    public void setListaRetangulos() {
        this.listaRetangulos = new ArrayList<>();
    }

    public void adicionarRetangulo(Retangulo retangulo) throws Exception {
        if (!listaRetangulos.contains(retangulo)) {
            listaRetangulos.add(retangulo);
        } else {
            throw new Exception("O retangulo já está na lista");
        }
    }

    public void removerRetangulo(Retangulo retangulo) throws Exception {
        if (listaRetangulos.contains(retangulo)) {
            listaRetangulos.remove(retangulo);
        } else {
            throw new Exception("O retangulo não está na lista");
        }
    }

    public int calcularRetanguloComMaiorArea() {
        Double area = Double.MIN_VALUE;
        int indiceRetangulo = -1;

        for (Retangulo r : listaRetangulos) {
            if (r.calcularArea() > area) {
                area = r.calcularArea();
                indiceRetangulo = listaRetangulos.indexOf(r);
            }
        }

        return indiceRetangulo;
    }

    public int calcularRetanguloComMaiorPerimetro() {
        Double perimetro = Double.MIN_VALUE;
        int indiceRetangulo = -1;

        for (Retangulo r : listaRetangulos) {
            if (r.calcularPerimentro() > perimetro) {
                perimetro = r.calcularPerimentro();
                indiceRetangulo = listaRetangulos.indexOf(r);
            }
        }

        return indiceRetangulo;
    }

    public void imprimirRetanguloMaiorArea() {
        System.out.println("Retangulo com maior area:");
        System.out.println(listaRetangulos.get(calcularRetanguloComMaiorArea()).toString());
    }

    public void imprimirRetanguloMaiorPerimetro() {
        System.out.println("Retangulo com maior perimetro:");
        System.out.println(listaRetangulos.get(calcularRetanguloComMaiorPerimetro()).toString());
    }

    public void imiprirTodosOsRetangulos() {
        System.out.println("Todos os retangulos:");
        for (Retangulo r : listaRetangulos) {
            System.out.println(r.toString());
        }
    }

}
