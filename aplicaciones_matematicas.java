import java.util.Scanner;
public class aplicaciones_matematicas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nombresEjercicios = new String[10];
        String[] tiposOperaciones = new String[10];
        String[] primerosNumeros = new String[10];
        String[] segundosNumeros = new String[10];
        String[] resultados = new String[10];
        String[] niveles = new String[10];
        String[] fechas = new String[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //------------------------------------------------//
        //--|menu_principal_de_aplicaciones_matematicas|--//
        //------------------------------------------------//
        do {
            System.out.println("menu principal de aplicaciones matematicas");
            System.out.println("1) Registrar ejercicio");
            System.out.println("2) Editar ejercicio");
            System.out.println("3) Listar ejercicios");
            System.out.println("4) Buscar ejercicio");
            System.out.println("5) Eliminar ejercicio");
            System.out.println("6) Mostrar resumen");
            System.out.println("7) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //-------------------------//
                //--|registrar_ejercicio|--//
                //-------------------------//
                case 1:
                    if (total >= nombresEjercicios.length) {
                        System.out.println("No hay espacio para registrar mas ejercicios.");
                        break;
                    }
                    int id = total + 1;
                    System.out.println("registro de ejercicio matematico");
                    System.out.println("id del ejercicio a registrar: " + id);
                    System.out.print("nombre del ejercicio: ");
                    nombresEjercicios[total] = entrada.nextLine();
                    System.out.print("tipo de operacion: ");
                    tiposOperaciones[total] = entrada.nextLine();
                    System.out.print("primer numero: ");
                    primerosNumeros[total] = entrada.nextLine();
                    System.out.print("segundo numero: ");
                    segundosNumeros[total] = entrada.nextLine();
                    System.out.print("resultado: ");
                    resultados[total] = entrada.nextLine();
                    System.out.print("nivel: ");
                    niveles[total] = entrada.nextLine();
                    System.out.print("fecha: ");
                    fechas[total] = entrada.nextLine();
                    System.out.print("estado del ejercicio: ");
                    estados[total] = entrada.nextLine();
                    System.out.println("Ejercicio registrado correctamente.");
                    total++;
                    break;
                //----------------------//
                //--|editar_ejercicio|--//
                //----------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen ejercicios registrados.");
                        break;
                    }
                    System.out.println("Datos de los ejercicios");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Ejercicio: " + nombresEjercicios[i] + " | Operacion: " + tiposOperaciones[i] + " | Primer numero: " + primerosNumeros[i] + " | Segundo numero: " + segundosNumeros[i] + " | Resultado: " + resultados[i] + " | Nivel: " + niveles[i] + " | Fecha: " + fechas[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del ejercicio: ");
                    int idEditar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEditar >= 1 && idEditar <= total) {
                        int posicion = idEditar - 1;
                        System.out.println("Editar el dato del ejercicio");
                        System.out.print("Nuevo nombre del ejercicio: ");
                        nombresEjercicios[posicion] = entrada.nextLine();
                        System.out.print("Nuevo tipo de operacion: ");
                        tiposOperaciones[posicion] = entrada.nextLine();
                        System.out.print("Nuevo primer numero: ");
                        primerosNumeros[posicion] = entrada.nextLine();
                        System.out.print("Nuevo segundo numero: ");
                        segundosNumeros[posicion] = entrada.nextLine();
                        System.out.print("Nuevo resultado: ");
                        resultados[posicion] = entrada.nextLine();
                        System.out.print("Nuevo nivel: ");
                        niveles[posicion] = entrada.nextLine();
                        System.out.print("Nueva fecha: ");
                        fechas[posicion] = entrada.nextLine();
                        System.out.print("Nuevo estado del ejercicio: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Ejercicio actualizado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //-----------------------//
                //--|listar_ejercicios|--//
                //-----------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen ejercicios registrados.");
                    } else {
                        System.out.println("Lista de ejercicios matematicos");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Ejercicio: " + nombresEjercicios[i] + " | Operacion: " + tiposOperaciones[i] + " | Primer numero: " + primerosNumeros[i] + " | Segundo numero: " + segundosNumeros[i] + " | Resultado: " + resultados[i] + " | Nivel: " + niveles[i] + " | Fecha: " + fechas[i] + " | Estado: " + estados[i]);
                        }
                    }
                    break;
                //----------------------//
                //--|buscar_ejercicio|--//
                //----------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen ejercicios registrados.");
                        break;
                    }
                    System.out.println("busqueda de ejercicio");
                    System.out.print("ingresa la id para buscar ejercicio: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos del ejercicio encontrado:");
                        System.out.println("ID: " + idBusqueda + " | Ejercicio: " + nombresEjercicios[posicion] + " | Operacion: " + tiposOperaciones[posicion] + " | Primer numero: " + primerosNumeros[posicion] + " | Segundo numero: " + segundosNumeros[posicion] + " | Resultado: " + resultados[posicion] + " | Nivel: " + niveles[posicion] + " | Fecha: " + fechas[posicion] + " | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //------------------------//
                //--|eliminar_ejercicio|--//
                //------------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen ejercicios registrados.");
                        break;
                    }
                    System.out.println("Datos de los ejercicios");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Ejercicio: " + nombresEjercicios[i] + " | Operacion: " + tiposOperaciones[i] + " | Primer numero: " + primerosNumeros[i] + " | Segundo numero: " + segundosNumeros[i] + " | Resultado: " + resultados[i] + " | Nivel: " + niveles[i] + " | Fecha: " + fechas[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del ejercicio a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            nombresEjercicios[i] = nombresEjercicios[i + 1];
                            tiposOperaciones[i] = tiposOperaciones[i + 1];
                            primerosNumeros[i] = primerosNumeros[i + 1];
                            segundosNumeros[i] = segundosNumeros[i + 1];
                            resultados[i] = resultados[i + 1];
                            niveles[i] = niveles[i + 1];
                            fechas[i] = fechas[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Ejercicio eliminado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|mostrar_resumen|--//
                //---------------------//
                case 6:
                    if (total == 0) {
                        System.out.println("No existen ejercicios registrados.");
                        break;
                    }
                    int resueltos = 0;
                    int pendientes = 0;
                    int incorrectos = 0;
                    int otrosEstados = 0;
                    double sumaResultados = 0;
                    for (int i = 0; i < total; i++) {
                        if (estados[i].equalsIgnoreCase("Resuelto")) {
                            resueltos++;
                        } else if (estados[i].equalsIgnoreCase("Pendiente")) {
                            pendientes++;
                        } else if (estados[i].equalsIgnoreCase("Incorrecto")) {
                            incorrectos++;
                        } else {
                            otrosEstados++;
                        }
                        sumaResultados += Double.parseDouble(resultados[i]);
                    }
                    String operacionMayor = tiposOperaciones[0];
                    int cantidadOperacionMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadOperacion = 0;
                        for (int j = 0; j < total; j++) {
                            if (tiposOperaciones[i].equalsIgnoreCase(tiposOperaciones[j])) {
                                cantidadOperacion++;
                            }
                        }
                        if (cantidadOperacion > cantidadOperacionMayor) {
                            cantidadOperacionMayor = cantidadOperacion;
                            operacionMayor = tiposOperaciones[i];
                        }
                    }
                    String nivelMayor = niveles[0];
                    int cantidadNivelMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadNivel = 0;
                        for (int j = 0; j < total; j++) {
                            if (niveles[i].equalsIgnoreCase(niveles[j])) {
                                cantidadNivel++;
                            }
                        }
                        if (cantidadNivel > cantidadNivelMayor) {
                            cantidadNivelMayor = cantidadNivel;
                            nivelMayor = niveles[i];
                        }
                    }
                    double promedioResultados = sumaResultados / total;
                    System.out.println("resumen de aplicaciones matematicas");
                    System.out.println("Ejercicios registrados: " + total);
                    System.out.println("Operacion mas utilizada: " + operacionMayor);
                    System.out.println("Nivel mas utilizado: " + nivelMayor);
                    System.out.println("Suma de resultados: " + sumaResultados);
                    System.out.println("Promedio de resultados: " + promedioResultados);
                    System.out.println("Resueltos: " + resueltos);
                    System.out.println("Pendientes: " + pendientes);
                    System.out.println("Incorrectos: " + incorrectos);
                    System.out.println("Otros estados: " + otrosEstados);
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 7:
                    System.out.println("Gracias por utilizar Aplicaciones Matematicas.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 7);
        entrada.close();
    }
}