package ec.edu.epn.paciente;

import java.util.Scanner;

public class Main {


    public static void main(String args[]) {

        /* listaMain = new ListaTratamientos();

        ListaPacientes lp = new ListaPacientes();

        lp.anadirPaciente(new Paciente("1724831597", "ALEXIS", "VIZUETE", "22", "M", "06/01/2000", "JARDIN DEL VALLE", "0960071180", "B+"));
        lp.anadirPaciente(new Paciente("1713074050", "ANAHI", "VASQUEZ", "21", "F", "19/01/2001", "QUICENTRO", "09600808081", "A+"));
        lp.anadirPaciente(new Paciente("1006425311", "LEONARDO", "SALVADOR", "22", "M", "09/07/1999", "OTAVALO", "0987654321", "O+"));
        //Nuevo Paciente anadido
        lp.anadirPaciente(new Paciente("1004637136", "Daniel", "SALVADOR", "15", "M", "09/08/2000", "OTAVALO", "0987654321", "O+"));
        System.out.println(lp.toString());


        //Tratamiento

        listaMain.diagnostico.registrarTratamiento("1724831597","hola", "hola2");
        listaMain.diagnostico.listaDiagnostico.add(new Diagnostico("1724831597", "hola", "hola2", "10/10/2022"));
        listaMain.anadirTratamiento("1724831597", "Diagnostico");

        System.out.println(listaMain.diagnostico.listaDiagnostico.toString());

        //borrador de un toString
        System.out.println(lp.toString());*/
// comentario***********************


        System.out.println("Nueva prueba");

        System.out.println("Soy su padre");
        /*
        int menu = 0;

        //Variables para Paciente
        String cedula = "";
        String nombres = "";
        String apellidos = "";
        String edad;
        String genero = "";
        String fecha = "";
        String direccion = "";
        String telefono = "";
        String tipoSangre = "";

        //Variables para Tratamiento
        String idTratamiento = "";
        String procedimientoTratamiento = "";
        String prescripcionTratamiento = "";

        //HOLAAAAA

        Scanner entrada = new Scanner(System.in);
        boolean validar, existe, validar2;

        do{
            System.out.println("--------------------------------------------------");
            System.out.println("SISTEMA CLINICA ODONTOLOGICA");
            System.out.println("--------------------------------------------------");
            System.out.println("Menu Principal");
            System.out.println("-------------------------------------------------");
            System.out.println("1. Paciente");
            System.out.println("2. Tratamiento");
            System.out.println("3. Cita");
            System.out.println("4. Historia clinica");
            System.out.println("0. Salir del sistema");
            System.out.println("--------------------------------------------------");

            System.out.print("Ingrese una opcion: ");
            menu = entrada.nextInt();
            entrada.nextLine();

            //Switch para controlar el menu principal
            switch (menu){
                case 1: //PACIENTE
                    do {
                        System.out.println("--------------------------------------------------");
                        System.out.println("SISTEMA CLINICA ODONTOLOGICA");
                        System.out.println("--------------------------------------------------");
                        System.out.println("Menu Paciente");
                        System.out.println("--------------------------------------------------");
                        System.out.println("1. Crear Paciente");
                        System.out.println("2. Consultar Paciente");
                        System.out.println("3. Actualizar Direccion");
                        System.out.println("4. Actualizar telefono");
                        System.out.println("5. Imprimir lista de pacientes");
                        System.out.println("6. Regresar al menu principal");
                        System.out.println("--------------------------------------------------");

                        System.out.print("Ingrese una opcion: ");
                        menu = entrada.nextInt();
                        entrada.nextLine();
                        //Switch para controlar el menu
                        switch(menu) {
                            case 1: //Crear paciente
                                System.out.println("Ingrese datos del paciente:");
                                // Cedula
                                do{
                                    System.out.print("Ingrese numero de cedula del paciente: ");
                                    cedula = entrada.nextLine();
                                    existe = lp.existePaciente(cedula);
                                    validar=lp.paciente.validador.validarCedula(cedula);
                                    if(validar == false){
                                        System.out.println("La cedula ingresada es incorrecta, intente de nuevo.");
                                    } else if ( existe == true) {
                                        System.out.println("El paciente ya existe dentro del sistema, intente de nuevo.");
                                    }
                                } while (validar == false || existe == true );
                                // Nombres
                                do{
                                    System.out.print("Ingrese nombres del paciente: ");
                                    nombres = entrada.nextLine();
                                    validar = lp.paciente.validador.validarNombresApellidos(nombres);
                                    if(validar == false){
                                        System.out.println("Los nombres ingresados son incorrectos, intente de nuevo.");
                                    }
                                } while (validar == false);
                                // Apellidos
                                do{
                                    System.out.print("Ingrese apellidos del paciente: ");
                                    apellidos = entrada.nextLine();
                                    validar = lp.paciente.validador.validarNombresApellidos(apellidos);
                                    if(validar == false){
                                        System.out.println("Los apellidos ingresados son incorrectos, intente de nuevo.");
                                    }
                                } while (validar == false);
                                // Edad
                                do{
                                    System.out.print("Ingrese la edad del paciente: ");
                                    edad = entrada.nextLine();
                                    validar = lp.paciente.validador.validarEdad(edad);
                                    if(validar == false){
                                        System.out.println("La edad ingresada es incorrecta, intente de nuevo.");
                                    }
                                } while (validar == false);
                                // Genero
                                do{
                                    System.out.print("Ingrese el genero del paciente (M/F): ");
                                    genero = entrada.nextLine();
                                    validar = lp.paciente.validador.validarGenero(genero);
                                    if(validar == false){
                                        System.out.println("El genero ingresado es incorrecto, intente de nuevo.");
                                    }
                                } while (validar == false);
                                // Fecha de nacimiento
                                do{
                                    System.out.print("Ingrese la fecha de nacimiento del paciente dd/mm/aaaa: ");
                                    fecha = entrada.nextLine();
                                    validar = lp.paciente.validador.validarFecha(fecha);
                                    if(validar == false){
                                        System.out.println("La fecha ingresada es incorrecta, intente de nuevo.");
                                    }
                                } while (validar == false);
                                // Direccion Domiciliaria
                                System.out.print("Ingrese la direccion domiciliaria del paciente: ");
                                direccion = entrada.nextLine();
                                // Telefono
                                do{
                                    System.out.print("Ingrese el telefono del paciente: ");
                                    telefono = entrada.nextLine();
                                    validar = lp.paciente.validador.validarTelefono(telefono);
                                    if(validar == false){
                                        System.out.println("El telefono ingresado es incorrecto, intente de nuevo.");
                                    }
                                } while (validar == false);
                                // Tipo de Sangre
                                do{
                                    System.out.print("Ingrese el tipo de sangre del paciente: ");
                                    tipoSangre = entrada.nextLine();
                                    validar = lp.paciente.validador.validarTipoSangre(tipoSangre);
                                    if(validar == false){
                                        System.out.println("El tipo de sangre ingresado es incorrecto, intente de nuevo.");
                                    }
                                } while (validar == false);

                                //Se registra el paciente
                                lp.paciente.registrarPaciente(cedula, nombres, apellidos, edad, genero, fecha, direccion, telefono, tipoSangre);
                                //Anade paciente en la lp
                                lp.anadirPaciente(new Paciente(cedula, nombres, apellidos, edad, genero, fecha, direccion, telefono, tipoSangre));
                                //imprimir la lp entera
                                System.out.println(new Paciente(cedula, nombres, apellidos, edad, genero, fecha, direccion, telefono, tipoSangre).toString());

                                break;

                            case 2: //Consultar paciente
                                //Cedula
                                do{
                                    System.out.print("Ingrese numero de cedula del paciente: ");
                                    cedula = entrada.nextLine();
                                    validar = lp.paciente.validador.validarCedula(cedula);
                                    existe = lp.existePaciente(cedula);
                                    if(validar == false){
                                        System.out.println("La cedula ingresada es incorrecta, intente de nuevo.");
                                    } else if (existe == false) {
                                        System.out.println("El paciente no existe dentro del sistema, intente de nuevo.");
                                    }
                                } while (validar == false || existe == false);

                                System.out.println(lp.consultarPaciente(cedula));
                                break;

                            case 3: //Actualizar direccion
                                // Cedula
                                do{
                                    System.out.print("Ingrese numero de cedula del paciente: ");
                                    cedula = entrada.nextLine();
                                    validar = lp.paciente.validador.validarCedula(cedula);
                                    existe = lp.existePaciente(cedula);

                                    if(validar == false){
                                        System.out.println("La cedula ingresada es incorrecta, intente de nuevo.");
                                    } else if (existe == false) {
                                        System.out.println("El paciente no existe dentro del sistema, intente de nuevo.");
                                    }
                                } while (validar == false || existe == false );

                                //Bucle para que el usuario ingrese una direccion
                                System.out.print("Ingrese nueva direccion: ");
                                direccion = entrada.nextLine();

                                //Llamamos al metodo para cambiar la direccion
                                System.out.println(lp.actualizarDireccion(cedula, direccion));
                                break;

                            case 4://Actualizar telefono
                                // Cedula
                                do{
                                    System.out.print("Ingrese numero de cedula del paciente: ");
                                    cedula = entrada.nextLine();
                                    validar = lp.paciente.validador.validarCedula(cedula);
                                    existe = lp.existePaciente(cedula);
                                    if(validar == false){
                                        System.out.println("La cedula ingresada es incorrecta, intente de nuevo.");
                                    } else if (existe == false) {
                                        System.out.println("El paciente no existe dentro del sistema, intente de nuevo.");
                                    }
                                } while (validar == false || existe == false );

                                //Bucle para que el usuario ingrese un telefono
                                do{
                                    System.out.print("Ingrese el telefono del paciente: ");
                                    telefono = entrada.nextLine();
                                    validar = lp.paciente.validador.validarTelefono(telefono);
                                    if(validar == false){
                                        System.out.println("El telefono ingresado es incorrecto, intente de nuevo.");
                                    }
                                } while (validar == false);

                                System.out.println(lp.actualizarTelefono(cedula, telefono));
                                break;
                            case 5://Imprimir lista de pacientes
                                System.out.print(lp.toString());
                                break;
                            case 6://Regresa al menu principal
                                System.out.print("Regresando menu principal \n");
                                break;
                            default:
                                System.out.println("Opcion no valida / Vuelva a intentar");
                        }
                    }while(menu != 6);
                    break;

                case 2: //Tratamiento
                    do {
                        System.out.println("--------------------------------------------------");
                        System.out.println("SISTEMA CLINICA ODONTOLOGICA");
                        System.out.println("--------------------------------------------------");
                        System.out.println("Menu Tratamiento");
                        System.out.println("-------------------------------------------------");
                        System.out.println("1. Tratamiento Diagnostico");
                        System.out.println("2. Tratamiento Periodoncia");
                        System.out.println("3. Tratamiento Ortodonia");
                        System.out.println("4. Tratamiento Endodoncia");
                        System.out.println("5. Imprimir lista tratamientos");
                        System.out.println("6. Regresar al menu principal");
                        System.out.println("--------------------------------------------------");

                        System.out.print("Ingrese una opcion: ");
                        menu = entrada.nextInt();
                        entrada.nextLine();
                        //Switch para controlar el menu tratamiento
                        switch (menu) {
                            case 1: //Diagnostico
                                do {
                                    System.out.println("--------------------------------------------------");
                                    System.out.println("SISTEMA CLINICA ODONTOLOGICA");
                                    System.out.println("--------------------------------------------------");
                                    System.out.println("Menu Tratamiento Diagnostico");
                                    System.out.println("-------------------------------------------------");
                                    System.out.println("1. Registrar Tratamiento");
                                    System.out.println("2. Actualizar Tratamiento");
                                    System.out.println("3. Actualizar Prescripcion Tratamiento");
                                    System.out.println("4. Imprimir lista de tratamientos");
                                    System.out.println("5. Regresar al menu tratamiento");
                                    System.out.println("--------------------------------------------------");
                                    System.out.print("Ingrese una opcion: ");
                                    menu = entrada.nextInt();
                                    entrada.nextLine();
                                    //Switch para controlar el menu
                                    switch (menu) {
                                        case 1:
                                            System.out.println("Ingrese datos del Tratamiento:");
                                            do {
                                                //ID
                                                System.out.print("Ingrese id del tratamiento: ");
                                                idTratamiento = entrada.nextLine();
                                                validar = listaMain.diagnostico.validador.validarCedula(idTratamiento);
                                                //FECHA
                                                System.out.print("Ingrese fecha del tratamiento: ");
                                                fecha = entrada.nextLine();
                                                validar2 = listaMain.diagnostico.validador.validarFecha(fecha);
                                                //EXISTE
                                                existe = listaMain.diagnostico.existeTratamiento(idTratamiento, fecha);

                                                if (validar == false || validar2 == false) {
                                                    System.out.println("ID o fecha incorrecta, intente de nuevo.....");
                                                } else if (existe == true) {
                                                    System.out.println("El diagnostico ya existe dentro del sistema, intente de nuevo.");
                                                }
                                            } while (validar == false || validar2 == false || existe == true);

                                            System.out.print("Ingrese procedimiento del tratamiento: ");
                                            procedimientoTratamiento = entrada.nextLine();
                                            System.out.print("Ingrese prescripcion del tratamiento: ");
                                            prescripcionTratamiento = entrada.nextLine();

                                            listaMain.diagnostico.registrarTratamiento(idTratamiento, procedimientoTratamiento, prescripcionTratamiento);
                                            listaMain.diagnostico.listaDiagnostico.add(new Diagnostico(idTratamiento, procedimientoTratamiento, prescripcionTratamiento, fecha));
                                            listaMain.anadirTratamiento(idTratamiento, "Diagnostico");

                                            System.out.println("----------------------------------------------------");
                                            System.out.println(listaMain.diagnostico.registrarTratamiento(idTratamiento, procedimientoTratamiento, prescripcionTratamiento));
                                            System.out.println(new Diagnostico(idTratamiento, procedimientoTratamiento, prescripcionTratamiento, fecha).toString());
                                            break;

                                        case 2:
                                            do {
                                                //ID
                                                System.out.print("Ingrese id del tratamiento: ");
                                                idTratamiento = entrada.nextLine();
                                                validar = listaMain.diagnostico.validador.validarCedula(idTratamiento);
                                                //FECHA
                                                System.out.print("Ingrese fecha del tratamiento: ");
                                                fecha = entrada.nextLine();
                                                validar2 = listaMain.diagnostico.validador.validarFecha(fecha);
                                                //EXISTE
                                                existe = listaMain.diagnostico.existeTratamiento(idTratamiento, fecha);

                                                if (validar == false || validar2 == false) {
                                                    System.out.println("ID o fecha incorrecta, intente de nuevo.....");
                                                } else if (existe == false) {
                                                    System.out.println("El diagnostico no existe dentro del sistema, intente de nuevo.");
                                                }
                                            } while (validar == false || validar2 == false || existe == false);

                                            System.out.print("Ingrese nuevo procedimiento del tratamiento: ");
                                            procedimientoTratamiento = entrada.nextLine();
                                            System.out.println("----------------------------------------------------");
                                            System.out.println(listaMain.diagnostico.actualizarTratamiento(idTratamiento, procedimientoTratamiento, fecha)); //,fecha
                                            break;

                                        case 3:
                                            do {
                                                //ID
                                                System.out.print("Ingrese id del tratamiento: ");
                                                idTratamiento = entrada.nextLine();
                                                validar = listaMain.diagnostico.validador.validarCedula(idTratamiento);
                                                //FECHA
                                                System.out.print("Ingrese fecha del tratamiento: ");
                                                fecha = entrada.nextLine();
                                                validar2 = listaMain.diagnostico.validador.validarFecha(fecha);
                                                //EXISTE
                                                existe = listaMain.diagnostico.existeTratamiento(idTratamiento, fecha);

                                                if (validar == false || validar2 == false) {
                                                    System.out.println("ID o fecha incorrecta, intente de nuevo.....");
                                                } else if (existe == false) {
                                                    System.out.println("El diagnostico no existe dentro del sistema, intente de nuevo.");
                                                }
                                            } while (validar == false || validar2 == false || existe == false);

                                            System.out.print("Ingrese nueva prescripcion del tratamiento: ");
                                            prescripcionTratamiento = entrada.nextLine();
                                            System.out.println("----------------------------------------------------");
                                            System.out.println(listaMain.diagnostico.actualizarPrescripcionTratamiento(idTratamiento, prescripcionTratamiento, fecha)); //,fecha
                                            break;

                                        case 4:
                                            System.out.println(listaMain.listaTratamientos[0].toString());
                                            break;
                                        case 5:
                                            System.out.print("Regresando menu tratamiento \n");
                                            break;
                                        default:
                                            System.out.println("Opcion no valida / Vuelva a intentar");
                                    }

                                } while (menu != 5);
                                break;


                            case 2: //Periodoncia

                                do {
                                    System.out.println("--------------------------------------------------");
                                    System.out.println("SISTEMA CLINICA ODONTOLOGICA");
                                    System.out.println("--------------------------------------------------");
                                    System.out.println("Menu Tratamiento Periodoncia");
                                    System.out.println("-------------------------------------------------");
                                    System.out.println("1. Registrar Tratamiento");
                                    System.out.println("2. Actualizar Tratamiento");
                                    System.out.println("3. Actualizar Prescripcion Tratamiento");
                                    System.out.println("4. Imprimir lista de tratamientos");
                                    System.out.println("5. Regresar al menu tratamiento");
                                    System.out.println("--------------------------------------------------");

                                    System.out.print("Ingrese una opcion: ");
                                    menu = entrada.nextInt();
                                    entrada.nextLine();
                                    //Switch para controlar el menu

                                    switch (menu) {
                                        case 1:
                                            System.out.println("Ingrese datos del Tratamiento:");
                                            do {
                                                //ID
                                                System.out.print("Ingrese id del tratamiento: ");
                                                idTratamiento = entrada.nextLine();
                                                validar = listaMain.periodoncia.validador.validarCedula(idTratamiento);
                                                //FECHA
                                                System.out.print("Ingrese fecha del tratamiento: ");
                                                fecha = entrada.nextLine();
                                                validar2 = listaMain.periodoncia.validador.validarFecha(fecha);
                                                //EXISTE
                                                existe = listaMain.periodoncia.existeTratamiento(idTratamiento, fecha);

                                                if (validar == false || validar2 == false) {
                                                    System.out.println("ID o fecha incorrecta, intente de nuevo.....");
                                                } else if (existe == true) {
                                                    System.out.println("La periodoncia ya existe dentro del sistema, intente de nuevo.");
                                                }
                                            } while (validar == false || validar2 == false || existe == true);

                                            System.out.print("Ingrese procedimiento del tratamiento: ");
                                            procedimientoTratamiento = entrada.nextLine();
                                            System.out.print("Ingrese prescripcion del tratamiento: ");
                                            prescripcionTratamiento = entrada.nextLine();

                                            listaMain.periodoncia.registrarTratamiento(idTratamiento, procedimientoTratamiento, prescripcionTratamiento);
                                            listaMain.periodoncia.listaPeriodoncia.add(new Periodoncia(idTratamiento, procedimientoTratamiento, prescripcionTratamiento, fecha));
                                            listaMain.anadirTratamiento(idTratamiento, "Periodoncia");

                                            System.out.println("----------------------------------------------------");
                                            System.out.println(listaMain.periodoncia.registrarTratamiento(idTratamiento, procedimientoTratamiento, prescripcionTratamiento));
                                            System.out.println(new Periodoncia(idTratamiento, procedimientoTratamiento, prescripcionTratamiento, fecha).toString());
                                            break;
                                        case 2:
                                            do {
                                                //ID
                                                System.out.print("Ingrese id del tratamiento: ");
                                                idTratamiento = entrada.nextLine();
                                                validar = listaMain.periodoncia.validador.validarCedula(idTratamiento);
                                                //FECHA
                                                System.out.print("Ingrese fecha del tratamiento: ");
                                                fecha = entrada.nextLine();
                                                validar2 = listaMain.periodoncia.validador.validarFecha(fecha);
                                                //EXISTE
                                                existe = listaMain.periodoncia.existeTratamiento(idTratamiento, fecha);

                                                if (validar == false || validar2 == false) {
                                                    System.out.println("ID o fecha incorrecta, intente de nuevo.....");
                                                } else if (existe == false) {
                                                    System.out.println("La periodoncia no existe dentro del sistema, intente de nuevo.");
                                                }
                                            } while (validar == false || validar2 == false || existe == false);

                                            System.out.print("Ingrese nuevo procedimiento del tratamiento: ");
                                            procedimientoTratamiento = entrada.nextLine();
                                            System.out.println("----------------------------------------------------");
                                            System.out.println(listaMain.periodoncia.actualizarTratamiento(idTratamiento, procedimientoTratamiento, fecha)); //,fecha
                                            break;
                                        case 3:
                                            do {
                                                //ID
                                                System.out.print("Ingrese id del tratamiento: ");
                                                idTratamiento = entrada.nextLine();
                                                validar = listaMain.periodoncia.validador.validarCedula(idTratamiento);
                                                //FECHA
                                                System.out.print("Ingrese fecha del tratamiento: ");
                                                fecha = entrada.nextLine();
                                                validar2 = listaMain.periodoncia.validador.validarFecha(fecha);
                                                //EXISTE
                                                existe = listaMain.periodoncia.existeTratamiento(idTratamiento, fecha);

                                                if (validar == false || validar2 == false) {
                                                    System.out.println("ID o fecha incorrecta, intente de nuevo.....");
                                                } else if (existe == false) {
                                                    System.out.println("La periodoncia no existe dentro del sistema, intente de nuevo.");
                                                }
                                            } while (validar == false || validar2 == false || existe == false);

                                            System.out.print("Ingrese nueva prescripcion del tratamiento: ");
                                            prescripcionTratamiento = entrada.nextLine();
                                            System.out.println("----------------------------------------------------");
                                            System.out.println(listaMain.periodoncia.actualizarPrescripcionTratamiento(idTratamiento, prescripcionTratamiento, fecha)); //,fecha
                                            break;
                                        case 4:
                                            System.out.println(listaMain.listaTratamientos[1].toString());
                                            break;
                                        case 5:
                                            System.out.print("Regresar al menu tratamiento");
                                            break;

                                        default:
                                            System.out.println("Opcion no valida / Vuelva a intentar");

                                    }

                                } while (menu != 5);
                                break;


                            case 3: //Ortodoncia
                                do {
                                    System.out.println("--------------------------------------------------");
                                    System.out.println("SISTEMA CLINICA ODONTOLOGICA");
                                    System.out.println("--------------------------------------------------");
                                    System.out.println("Menu Tratamiento Ortodoncia");
                                    System.out.println("-------------------------------------------------");
                                    System.out.println("1. Registrar Tratamiento");
                                    System.out.println("2. Actualizar Tratamiento");
                                    System.out.println("3. Actualizar Prescripcion Tratamiento");
                                    System.out.println("4. Imprimir lista de tratamientos");
                                    System.out.println("5. Regresar al menu principal");
                                    System.out.println("--------------------------------------------------");

                                    System.out.print("Ingrese una opcion: ");
                                    menu = entrada.nextInt();
                                    entrada.nextLine();
                                    //Switch para controlar el menu

                                    switch (menu) {
                                        case 1:
                                            System.out.println("Ingrese datos del Tratamiento:");
                                            do {
                                                //ID
                                                System.out.print("Ingrese id del tratamiento: ");
                                                idTratamiento = entrada.nextLine();
                                                validar = listaMain.ortodoncia.validador.validarCedula(idTratamiento);
                                                //FECHA
                                                System.out.print("Ingrese fecha del tratamiento: ");
                                                fecha = entrada.nextLine();
                                                validar2 = listaMain.ortodoncia.validador.validarFecha(fecha);
                                                //EXISTE
                                                existe = listaMain.ortodoncia.existeTratamiento(idTratamiento, fecha);

                                                if (validar == false || validar2 == false) {
                                                    System.out.println("ID o fecha incorrecta, intente de nuevo.....");
                                                } else if (existe == true) {
                                                    System.out.println("La Ortodoncia ya existe dentro del sistema, intente de nuevo.");
                                                }
                                            } while (validar == false || validar2 == false || existe == true);

                                            System.out.print("Ingrese procedimiento del tratamiento: ");
                                            procedimientoTratamiento = entrada.nextLine();
                                            System.out.print("Ingrese prescripcion del tratamiento: ");
                                            prescripcionTratamiento = entrada.nextLine();

                                            listaMain.ortodoncia.registrarTratamiento(idTratamiento, procedimientoTratamiento, prescripcionTratamiento);
                                            //listaMain.ortodoncia.listaOrtodoncias.add(listaMain.ortodoncia);
                                            listaMain.ortodoncia.listaOrtodoncias.add(new Ortodoncia(idTratamiento, procedimientoTratamiento, prescripcionTratamiento, fecha));
                                            listaMain.anadirTratamiento(idTratamiento, "Ortodoncia");

                                            System.out.println("----------------------------------------------------");
                                            System.out.println(listaMain.ortodoncia.registrarTratamiento(idTratamiento, procedimientoTratamiento, prescripcionTratamiento));
                                            System.out.println(new Ortodoncia(idTratamiento, procedimientoTratamiento, prescripcionTratamiento, fecha).toString());
                                            break;
                                        case 2:
                                            do {
                                                //ID
                                                System.out.print("Ingrese id del tratamiento: ");
                                                idTratamiento = entrada.nextLine();
                                                validar = listaMain.ortodoncia.validador.validarCedula(idTratamiento);
                                                //FECHA
                                                System.out.print("Ingrese fecha del tratamiento: ");
                                                fecha = entrada.nextLine();
                                                validar2 = listaMain.ortodoncia.validador.validarFecha(fecha);
                                                //EXISTE
                                                existe = listaMain.ortodoncia.existeTratamiento(idTratamiento, fecha);

                                                if (validar == false || validar2 == false) {
                                                    System.out.println("ID o fecha incorrecta, intente de nuevo.....");
                                                } else if (existe == false) {
                                                    System.out.println("La Ortodoncia no existe dentro del sistema, intente de nuevo.");
                                                }
                                            } while (validar == false || validar2 == false || existe == false);

                                            System.out.print("Ingrese nuevo procedimiento del tratamiento: ");
                                            procedimientoTratamiento = entrada.nextLine();
                                            System.out.println("----------------------------------------------------");
                                            System.out.println(listaMain.ortodoncia.actualizarTratamiento(idTratamiento, procedimientoTratamiento, fecha)); //,fecha
                                            break;
                                        case 3:
                                            do {
                                                //ID
                                                System.out.print("Ingrese id del tratamiento: ");
                                                idTratamiento = entrada.nextLine();
                                                validar = listaMain.ortodoncia.validador.validarCedula(idTratamiento);
                                                //FECHA
                                                System.out.print("Ingrese fecha del tratamiento: ");
                                                fecha = entrada.nextLine();
                                                validar2 = listaMain.ortodoncia.validador.validarFecha(fecha);
                                                //EXISTE
                                                existe = listaMain.ortodoncia.existeTratamiento(idTratamiento, fecha);

                                                if (validar == false || validar2 == false) {
                                                    System.out.println("ID o fecha incorrecta, intente de nuevo.....");
                                                } else if (existe == false) {
                                                    System.out.println("La Ortodoncia no existe dentro del sistema, intente de nuevo.");
                                                }
                                            } while (validar == false || validar2 == false || existe == false);

                                            System.out.print("Ingrese nueva prescripcion del tratamiento: ");
                                            prescripcionTratamiento = entrada.nextLine();
                                            System.out.println("----------------------------------------------------");
                                            System.out.println(listaMain.ortodoncia.actualizarPrescripcionTratamiento(idTratamiento, prescripcionTratamiento, fecha)); //,fecha
                                            break;
                                        case 4:
                                            System.out.println(listaMain.listaTratamientos[2].toString());
                                            break;
                                        case 5:
                                            System.out.print("Regresando menu tratamiento \n");
                                            break;

                                        default:
                                            System.out.println("Opcion no valida / Vuelva a intentar");

                                    }

                                } while (menu != 5);
                                break;


                            case 4: //Endodoncia

                                do {
                                    System.out.println("--------------------------------------------------");
                                    System.out.println("SISTEMA CLINICA ODONTOLOGICA");
                                    System.out.println("--------------------------------------------------");
                                    System.out.println("Menu Tratamiento Endodoncia");
                                    System.out.println("-------------------------------------------------");
                                    System.out.println("1. Registrar Tratamiento");
                                    System.out.println("2. Actualizar Tratamiento");
                                    System.out.println("3. Actualizar Prescripcion Tratamiento");
                                    System.out.println("4. Imprimir lista de tratamientos");
                                    System.out.println("5. Regresar al menu tratamiento");
                                    System.out.println("--------------------------------------------------");

                                    System.out.print("Ingrese una opcion: ");
                                    menu = entrada.nextInt();
                                    entrada.nextLine();
                                    //Switch para controlar el menu

                                    switch (menu) {
                                        case 1:
                                            System.out.println("Ingrese datos del Tratamiento:");
                                            do {
                                                //ID
                                                System.out.print("Ingrese id del tratamiento: ");
                                                idTratamiento = entrada.nextLine();
                                                validar = listaMain.endodoncia.validador.validarCedula(idTratamiento);
                                                //FECHA
                                                System.out.print("Ingrese fecha del tratamiento: ");
                                                fecha = entrada.nextLine();
                                                validar2 = listaMain.endodoncia.validador.validarFecha(fecha);
                                                //EXISTE
                                                existe = listaMain.endodoncia.existeTratamiento(idTratamiento, fecha);

                                                if (validar == false || validar2 == false) {
                                                    System.out.println("ID o fecha incorrecta, intente de nuevo.....");
                                                } else if (existe == true) {
                                                    System.out.println("La Endodoncia ya existe dentro del sistema, intente de nuevo.");
                                                }
                                            } while (validar == false || validar2 == false || existe == true);

                                            System.out.print("Ingrese procedimiento del tratamiento: ");
                                            procedimientoTratamiento = entrada.nextLine();
                                            System.out.print("Ingrese prescripcion del tratamiento: ");
                                            prescripcionTratamiento = entrada.nextLine();

                                            listaMain.endodoncia.registrarTratamiento(idTratamiento, procedimientoTratamiento, prescripcionTratamiento);
                                            listaMain.endodoncia.listaEndodoncias.add(new Endodoncia(idTratamiento, procedimientoTratamiento, prescripcionTratamiento, fecha));
                                            listaMain.anadirTratamiento(idTratamiento, "Endodoncia");

                                            System.out.println("----------------------------------------------------");
                                            System.out.println(listaMain.endodoncia.registrarTratamiento(idTratamiento, procedimientoTratamiento, prescripcionTratamiento));
                                            System.out.println(new Endodoncia(idTratamiento, procedimientoTratamiento, prescripcionTratamiento, fecha).toString());
                                            break;
                                        case 2:
                                            do {
                                                //ID
                                                System.out.print("Ingrese id del tratamiento: ");
                                                idTratamiento = entrada.nextLine();
                                                validar = listaMain.endodoncia.validador.validarCedula(idTratamiento);
                                                //FECHA
                                                System.out.print("Ingrese fecha del tratamiento: ");
                                                fecha = entrada.nextLine();
                                                validar2 = listaMain.endodoncia.validador.validarFecha(fecha);
                                                //EXISTE
                                                existe = listaMain.endodoncia.existeTratamiento(idTratamiento, fecha);

                                                if (validar == false || validar2 == false) {
                                                    System.out.println("ID o fecha incorrecta, intente de nuevo.....");
                                                } else if (existe == false) {
                                                    System.out.println("La Endodoncia no existe dentro del sistema, intente de nuevo.");
                                                }
                                            } while (validar == false || validar2 == false || existe == false);

                                            System.out.print("Ingrese nuevo procedimiento del tratamiento: ");
                                            procedimientoTratamiento = entrada.nextLine();
                                            System.out.println("----------------------------------------------------");
                                            System.out.println(listaMain.endodoncia.actualizarTratamiento(idTratamiento, procedimientoTratamiento, fecha)); //,fecha
                                            break;
                                        case 3:
                                            do {
                                                //ID
                                                System.out.print("Ingrese id del tratamiento: ");
                                                idTratamiento = entrada.nextLine();
                                                validar = listaMain.endodoncia.validador.validarCedula(idTratamiento);
                                                //FECHA
                                                System.out.print("Ingrese fecha del tratamiento: ");
                                                fecha = entrada.nextLine();
                                                validar2 = listaMain.endodoncia.validador.validarFecha(fecha);
                                                //EXISTE
                                                existe = listaMain.endodoncia.existeTratamiento(idTratamiento, fecha);

                                                if (validar == false || validar2 == false) {
                                                    System.out.println("ID o fecha incorrecta, intente de nuevo.....");
                                                } else if (existe == false) {
                                                    System.out.println("La Endodoncia no existe dentro del sistema, intente de nuevo.");
                                                }
                                            } while (validar == false || validar2 == false || existe == false);

                                            System.out.print("Ingrese nueva prescripcion del tratamiento: ");
                                            prescripcionTratamiento = entrada.nextLine();
                                            System.out.println("----------------------------------------------------");
                                            System.out.println(listaMain.endodoncia.actualizarPrescripcionTratamiento(idTratamiento, prescripcionTratamiento, fecha)); //,fecha
                                            break;
                                        case 4:
                                            System.out.println(listaMain.listaTratamientos[3].toString());
                                            break;
                                        case 5:
                                            System.out.print("Regresando menu tratamiento \n");
                                            break;

                                        default:
                                            System.out.println("Opcion no valida / Vuelva a intentar");
                                    }
                                } while (menu != 5);
                                break;
                            case 5:
                                System.out.println(listaMain.toString());
                                break;
                            case 6:
                                System.out.print("Regresando menu principal \n");
                                break;
                            default:
                                System.out.println("Opcion no valida / Vuelva a intentar");
                        }
                    } while (menu != 6);
                    break;

                case 3: //Cita

                    break;

                case 4: //Historia Clinica

                    break;

                case 0: //Salir
                    System.out.print("**** Gracias por ingresar al Sistema ****\n");
                    break;

            }

        }while(menu != 0);*/


    }

}
