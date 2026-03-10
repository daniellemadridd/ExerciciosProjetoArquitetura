public class Professor {
    private String name;
    private int anosExperiencia;

    public Professor(String name, int anosExperiencia) {
        this.name = name;
        this.anosExperiencia = anosExperiencia;
    }

    public String getName() {
        return name;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public String classifica() {
        return switch (anosExperiencia) {
            case 0, 1, 2, 3, 4, 5 -> "Assistente";
            case 6, 7, 8, 9, 10 -> "Adjunto";
            default -> "Titular";
        };
    }

@Override
public String toString() {
return "Professor: " + nome + ", anos de experiencia: " + anosExperiencia;

}