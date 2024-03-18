public class MemoriaHeap {

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
