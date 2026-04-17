package POO;

 class Main {
    public static void main(String[] args) {


        Persona p = new Persona("Pedro", "56759F", 50);
        Persona p1 = new Persona("Manuel", "44556U", 45);
        System.out.println(p1.nombre);
        System.out.println(p.nombre);

        MiembroComunidadEscolar m1 = new MiembroComunidadEscolar("Manuel", "44556U", 45, 3250, "Daniel Castelao");
        System.out.println(m1.nombre);
        System.out.println(m1.dni);
        System.out.println(m1.getCodigocentro());

    }
}