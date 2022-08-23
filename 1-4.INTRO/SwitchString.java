class SwitchString{
  public static void main(String[] args) {
    String opcion = "dos";
    switch (opcion) {
      case "zero":
        System.out.println("caso zero");
      break;
      case "uno":
        System.out.println("caso uno");
      break;
      case "dos":
      case "tres":
        System.out.println("caso dos y tres");
      break;
      case "default":
        System.out.println("Escolha um caso");
      break;
    }
  }
}
