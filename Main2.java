package TaskJava1;

/*Para este ejercicio tendréis que crear una función que reciba un precio y
devuelva el precio con el IVA incluido.*/
public class Main2 {
    public static void main(String [] args){
        System.out.println("Programa que incluye 16% de IVA");
        float precio = 5211.6f;
        float precioFinal;
        float iva;

        iva = (16 * precio) /100;
        precioFinal = precio + iva;

        System.out.println("El precio original es " + precio);
        System.out.println("El IVA que se incluye es de 16% del costo del producto, que seria " + iva);
        System.out.println("El precio final es " + precioFinal);


    }
}
