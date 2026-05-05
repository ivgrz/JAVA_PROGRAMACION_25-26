package POO;

 class Main {
    public static void main(String[] args) {


        Persona p = new Persona("Pedro", "56759F", 50, 1.80);
        Persona p1 = new Persona("Manuel", "44556U", 45, 1.76);
        Persona p2 = new Persona();
        System.out.println(p1.nombre);
        System.out.println(p2.nombre);

        MiembroComunidadEscolar m1 = new MiembroComunidadEscolar("Manuel", "44556U", 45, 3250, 1.90,"Daniel Castelao");
        System.out.println(m1.nombre);
        System.out.println(m1.dni);
        System.out.println(m1.getCodigocentro());

    }
}