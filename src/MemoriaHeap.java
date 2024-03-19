public class MemoriaHeap {

    /*
        Comandos para alterar valor da memória Heap, exemplos:
        Memória máxima:
            java -Xmx900M ClassName
            java -Xmx2G ClassName

        Memória inicial reservada:
            java -Xms400MB

        Quanto estoura a memória Heap gera a Exception OutOfMemoryError

        Sugerindo execução do Garbage Collector:
            System.gc();
    */

    public static void main(String[] args) {
        printMemoryUsage();

        byte[] x = new byte[500 * 1024 * 1024];

        printMemoryUsage();
    }

    static void printMemoryUsage() {
        System.out.printf("Máxima: %s%n",
            parseToMegabytes(Runtime.getRuntime().maxMemory()));

        System.out.printf("Total empenhada: %s%n",
            parseToMegabytes(Runtime.getRuntime().totalMemory()));

        System.out.printf("Disponível: %s%n",
            parseToMegabytes(Runtime.getRuntime().freeMemory()));

        long memoryUsed = Runtime.getRuntime().totalMemory()
            - Runtime.getRuntime().freeMemory();
        System.out.printf("Usada: %s%n", parseToMegabytes(memoryUsed));

        System.out.println("---");
    }

    static String parseToMegabytes(long bytes) {
        return String.format("%.2fMB", bytes / 1024d / 1024d);
    }
}
