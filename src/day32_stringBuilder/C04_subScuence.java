package day32_stringBuilder;

public class C04_subScuence {
    public static void main(String[] args) {
    StringBuilder sb= new StringBuilder("Kayra");
    sb.substring(0,3);
    // Bu method String dondurdugu icin StringBuilder'in eski halini degistiremez
    System.out.println(sb); // Kayra
    sb.subSequence(0,3);
    System.out.println(sb); // Kayra
}
}