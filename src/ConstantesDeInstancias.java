import java.util.UUID;

public class ConstantesDeInstancias {

    static final String STRING_DEFAULT = "Default";
    static final int INT_DEFAULT = 0;

    final String uuid;
    // Isso aqui também funcionaria:
    // final String uuid = UUID.randomUUID().toString();

    String stringType;
    int intType;

    ConstantesDeInstancias() {
        this(STRING_DEFAULT);
    }

    ConstantesDeInstancias(String stringType) {
        this(stringType, INT_DEFAULT);
    }

    ConstantesDeInstancias(String stringType, int intType) {
        /*
         * A constante só pode ser inicializada na declaração ou no construtor
         * Caso haja construtores encadeados a inicialização ocorre apenas no último chamado.
         */

        this.uuid = UUID.randomUUID().toString();
        this.stringType = stringType;
        this.intType = intType;
    }
}
