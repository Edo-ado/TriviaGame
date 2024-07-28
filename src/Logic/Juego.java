package Logic;

public class Juego {

    Categoria[] categoria = new Categoria[8];
    Pregunta[][] preguntas = new Pregunta[8][5];

    Jugador[] jugador = new Jugador[10];

    Categoria cat1 = new Categoria("SYP", "Series y Películas");
    Categoria cat2 = new Categoria("EH", "Eventos Históricos");
    Categoria cat3 = new Categoria("TEC", "Tecnología");
    Categoria cat4 = new Categoria("DP", "Deporte");
    Categoria cat5 = new Categoria("CI", "Ciencia");
    Categoria cat6 = new Categoria("AR", "Arte");
    Categoria cat7 = new Categoria("GEO", "Geografía");
    Categoria cat8 = new Categoria("VJ", "VideoJuegos");

// Series Y peliculas //
    String SYPpr1Respuesta = "Will Smith";
    String SYPpr1Respuesta1 = "Leonardo DiCaprio";
    String SYPpr1Respuesta2 = "Madonna";

    String[] SYPpr1Respuestas = new String[3];

    String SYPpr2Respuesta = "Gus";
    String SYPpr2Respuesta1 = "Willy Wonka";
    String SYPpr2Respuesta2 = "Heisenberg";

    String[] SYPpr2Respuestas = new String[3];

    String SYPpr3Respuesta = "Azul y rojo";
    String SYPpr3Respuesta1 = "Azul y blanco";
    String SYPpr3Respuesta2 = "Naranja y negro";

    String[] SYPpr3Respuestas = new String[3];

    String SYPpr4Respuesta = "Tanjiro Kamado";
    String SYPpr4Respuesta1 = "Luffy";
    String SYPpr4Respuesta2 = " Jotaro Kujo";

    String[] SYPpr4Respuestas = new String[3];

    String SYPpr5Respuesta = "Medicina";
    String SYPpr5Respuesta1 = "Derecho";
    String SYPpr5Respuesta2 = "Diseño gráfico";

    String[] SYPpr5Respuestas = new String[3];

    //Eventos Historicos
    String EHpr1Respuesta = "1939";
    String EHpr1Respuesta1 = "1984";
    String EHpr1Respuesta2 = "1914";

    String[] EHpr1Respuestas = new String[3];

    String EHpr2Respuesta = "Montreal Protocol";
    String EHpr2Respuesta1 = "Versalles";
    String EHpr2Respuesta2 = "Basel ";

    String[] EHpr2Respuestas = new String[3];

    String EHpr3Respuesta = "China";
    String EHpr3Respuesta1 = "Estados Unidos";
    String EHpr3Respuesta2 = "Union Soviética";

    String[] EHpr3Respuestas = new String[3];

    String EHpr4Respuesta = "Union Soviética";
    String EHpr4Respuesta1 = " República popular Rusa";
    String EHpr4Respuesta2 = "Nacion comunista de Rusia";

    String[] EHpr4Respuestas = new String[3];

    String EHpr5Respuesta = "1890";
    String EHpr5Respuesta1 = "1492";
    String EHpr5Respuesta2 = "278";

    String[] EHpr5Respuestas = new String[3];

    //tecnologia
    String TECpr1Respuesta = "Random Access Memory";
    String TECpr1Respuesta1 = "Random Adress Memory";
    String TECpr1Respuesta2 = "Reliable Memory Access";

    String[] TECpr1Respuestas = new String[3];

    String TECpr2Respuesta = "Compiler";
    String TECpr2Respuesta1 = "Debugging ";
    String TECpr2Respuesta2 = "Test";

    String[] TECpr2Respuestas = new String[3];

    String TECpr3Respuesta = "Mac OS";
    String TECpr3Respuesta1 = "Linux";
    String TECpr3Respuesta2 = "Windows";

    String[] TECpr3Respuestas = new String[3];

    String TECpr4Respuesta = "Deshacer";
    String TECpr4Respuesta1 = "Eliminar";
    String TECpr4Respuesta2 = "Pegar";

    String[] TECpr4Respuestas = new String[3];

    String TECpr5Respuesta = "World Wailer Web";
    String TECpr5Respuesta1 = "Wrold Wide Web";
    String TECpr5Respuesta2 = "Wireless World Web";

    String[] TECpr5Respuestas = new String[3];

    //deporte
    String DPpr1Respuesta = "Inglaterra";
    String DPpr1Respuesta1 = "España";
    String DPpr1Respuesta2 = "Costa Rica";

    String[] DPpr1Respuestas = new String[3];

    String DPpr2Respuesta = "Argentina";
    String DPpr2Respuesta1 = "España";
    String DPpr2Respuesta2 = "Alemania";

    String[] DPpr2Respuestas = new String[3];

    String DPpr3Respuesta = "Tiro con arco";
    String DPpr3Respuesta1 = "Fútbol";
    String DPpr3Respuesta2 = "Boxeo";

    String[] DPpr3Respuestas = new String[3];

    String DPpr4Respuesta = "Cuatro";
    String DPpr4Respuesta1 = "Ninguno";
    String DPpr4Respuesta2 = "Diez";

    String[] DPpr4Respuestas = new String[3];

    String DPpr5Respuesta = "1950";
    String DPpr5Respuesta1 = "1902";
    String DPpr5Respuesta2 = "2017";

    String[] DPpr5Respuestas = new String[3];

    //ciencia 
    String CIpr1Respuesta = "PI";
    String CIpr1Respuesta1 = "Numero de Oro";
    String CIpr1Respuesta2 = "Numero de Euler";

    String[] CIpr1Respuestas = new String[3];

    String CIpr2Respuesta = "La novia del Sol";
    String CIpr2Respuesta1 = "Satelite";
    String CIpr2Respuesta2 = "Una estrella";

    String[] CIpr2Respuestas = new String[3];

    String CIpr3Respuesta = "FE";
    String CIpr3Respuesta1 = "Hg";
    String CIpr3Respuesta2 = "Ag";

    String[] CIpr3Respuestas = new String[3];

    String CIpr4Respuesta = "El Gato";
    String CIpr4Respuesta1 = "El Elefante";
    String CIpr4Respuesta2 = "La foca";

    String[] CIpr4Respuestas = new String[3];

    String CIpr5Respuesta = "Un hongo";
    String CIpr5Respuesta1 = "Un quimico";
    String CIpr5Respuesta2 = "U";

    String[] CIpr5Respuestas = new String[3];

    //arte 
    String ARpr1Respuesta = "La Oreja";
    String ARpr1Respuesta1 = "El brazo";
    String ARpr1Respuesta2 = "El ojo derecho";

    String[] ARpr1Respuestas = new String[3];

    String ARpr2Respuesta = "JK Rowling";
    String ARpr2Respuesta1 = "Edgan Allan Poe";
    String ARpr2Respuesta2 = "Kafka";

    String[] ARpr2Respuestas = new String[3];

    String ARpr3Respuesta = "1800";
    String ARpr3Respuesta1 = "1980";
    String ARpr3Respuesta2 = "1890";

    String[] ARpr3Respuestas = new String[3];

    String ARpr4Respuesta = "Cien años de soledad";
    String ARpr4Respuesta1 = "El Alquimista";
    String ARpr4Respuesta2 = "Methamorphosis";

    String[] ARpr4Respuestas = new String[3];

    String ARpr5Respuesta = "Kafka";
    String ARpr5Respuesta1 = "JK Rowling";
    String ARpr5Respuesta2 = "J.R.R Tolkien";

    String[] ARpr5Respuestas = new String[3];

    //geografia
    String GEOpr1Respuesta = "America Central";
    String GEOpr1Respuesta1 = "Europa";
    String GEOpr1Respuesta2 = "America del sur ";

    String[] GEOpr1Respuestas = new String[3];

    String GEOpr2Respuesta = "Francia";
    String GEOpr2Respuesta1 = "España";
    String GEOpr2Respuesta2 = "Mexico";

    String[] GEOpr2Respuestas = new String[3];

    String GEOpr3Respuesta = "90%";
    String GEOpr3Respuesta1 = "40%";
    String GEOpr3Respuesta2 = "70%";

    String[] GEOpr3Respuestas = new String[3];

    String GEOpr4Respuesta = "Cartago";
    String GEOpr4Respuesta1 = "Alajuela";
    String GEOpr4Respuesta2 = "San Jose";

    String[] GEOpr4Respuestas = new String[3];

    String GEOpr5Respuesta = "En Suecia";
    String GEOpr5Respuesta1 = "En Paris";
    String GEOpr5Respuesta2 = "En Escocia";

    String[] GEOpr5Respuestas = new String[3];

    //videojuegos
    String VJpr1Respuesta = "Link";
    String VJpr1Respuesta1 = "Zelda";
    String VJpr1Respuesta2 = "Ganon";

    String[] VJpr1Respuestas = new String[3];

    String VJpr2Respuesta = "Rosado";
    String VJpr2Respuesta1 = "Amarillo";
    String VJpr2Respuesta2 = "Blanco";

    String[] VJpr2Respuestas = new String[3];

    String VJpr3Respuesta = "Armadillo";
    String VJpr3Respuesta1 = "Rata";
    String VJpr3Respuesta2 = "Ardilla";

    String[] VJpr3Respuestas = new String[3];

    String VJpr4Respuesta = "Minecraft";
    String VJpr4Respuesta1 = "Grand Theft Auto V";
    String VJpr4Respuesta2 = "Super Mario Bros";

    String[] VJpr4Respuestas = new String[3];

    String VJpr5Respuesta = "Notch";
    String VJpr5Respuesta1 = "C418";
    String VJpr5Respuesta2 = "Marty O'Donnell";

    String[] VJpr5Respuestas = new String[3];

    public Juego() {

        //Series y peliculas
        SYPpr1Respuestas[0] = SYPpr1Respuesta;
        SYPpr1Respuestas[1] = SYPpr1Respuesta1;
        SYPpr1Respuestas[2] = SYPpr1Respuesta2;

        SYPpr2Respuestas[0] = SYPpr2Respuesta;
        SYPpr2Respuestas[1] = SYPpr2Respuesta1;
        SYPpr2Respuestas[2] = SYPpr2Respuesta2;

        SYPpr3Respuestas[0] = SYPpr3Respuesta;
        SYPpr3Respuestas[1] = SYPpr3Respuesta1;
        SYPpr3Respuestas[2] = SYPpr3Respuesta2;

        SYPpr4Respuestas[0] = SYPpr4Respuesta;
        SYPpr4Respuestas[1] = SYPpr4Respuesta1;
        SYPpr4Respuestas[2] = SYPpr4Respuesta2;

        SYPpr5Respuestas[0] = SYPpr5Respuesta;
        SYPpr5Respuestas[1] = SYPpr5Respuesta1;
        SYPpr5Respuestas[2] = SYPpr5Respuesta2;

        Pregunta SYPpregunta1 = new Pregunta(0, "¿Quién interpreto al personaje llamado J en la película\n"
                + " “Los hombres de negro”?", SYPpr1Respuestas);

        Pregunta SYPpregunta2 = new Pregunta(2, "¿Como se llama el Alter Ego criminal de Walter White de\n"
                + " “Breaking Bad”?", SYPpr2Respuestas);

        Pregunta SYPpregunta3 = new Pregunta(2, "¿De que color es el traje de Vegeta en la saga de Majin Bu en\n"
                + " “Dragon Ball Z “?", SYPpr3Respuestas);

        Pregunta SYPpregunta4 = new Pregunta(0, "¿Nombre del protagonista de la serie\n"
                + " “Demon Slayer”?", SYPpr4Respuestas);

        Pregunta SYPpregunta5 = new Pregunta(1, "Profesión que estudia Elle en\n"
                + " “Legally Blonde", SYPpr5Respuestas);

        preguntas[0][0] = SYPpregunta1;
        preguntas[0][1] = SYPpregunta2;
        preguntas[0][2] = SYPpregunta3;
        preguntas[0][3] = SYPpregunta4;
        preguntas[0][4] = SYPpregunta5;

        // Eventos Historicos
        EHpr1Respuestas[0] = EHpr1Respuesta;
        EHpr1Respuestas[1] = EHpr1Respuesta1;
        EHpr1Respuestas[2] = EHpr1Respuesta2;

        EHpr2Respuestas[0] = EHpr2Respuesta;
        EHpr2Respuestas[1] = EHpr2Respuesta1;
        EHpr2Respuestas[2] = EHpr2Respuesta2;

        EHpr3Respuestas[0] = EHpr3Respuesta;
        EHpr3Respuestas[1] = EHpr3Respuesta1;
        EHpr3Respuestas[2] = EHpr3Respuesta2;

        EHpr4Respuestas[0] = EHpr4Respuesta;
        EHpr4Respuestas[1] = EHpr4Respuesta1;
        EHpr4Respuestas[2] = EHpr4Respuesta2;

        EHpr5Respuestas[0] = EHpr5Respuesta;
        EHpr5Respuestas[1] = EHpr5Respuesta1;
        EHpr5Respuestas[2] = EHpr5Respuesta2;

        Pregunta EHpregunta1 = new Pregunta(0, "¿En qué año dio inicio la segunda guerra mundial?", EHpr1Respuestas);

        Pregunta EHpregunta2 = new Pregunta(1, "¿Cuál  es el nombre tratado se firmó para cesar \n"
                + "la primera guerra mundial y castigar a Alemania?", EHpr2Respuestas);

        Pregunta EHpregunta3 = new Pregunta(2, "¿Cuál fue el primer país en mandar vida al espacio?", EHpr3Respuestas);

        Pregunta EHpregunta4 = new Pregunta(0, "Nombre de la nación que nació a base del Comunismo,\n"
                + " conocida hoy en día como “Rusia”", EHpr4Respuestas);

        Pregunta EHpregunta5 = new Pregunta(1, "¿Cuándo fue descubierto América por Cristóbal Colon?", EHpr5Respuestas);

        preguntas[1][0] = EHpregunta1;
        preguntas[1][1] = EHpregunta2;
        preguntas[1][2] = EHpregunta3;
        preguntas[1][3] = EHpregunta4;
        preguntas[1][4] = EHpregunta5;

        //Tecnologia
        TECpr1Respuestas[0] = TECpr1Respuesta;
        TECpr1Respuestas[1] = TECpr1Respuesta1;
        TECpr1Respuestas[2] = TECpr1Respuesta2;

        TECpr2Respuestas[0] = TECpr2Respuesta;
        TECpr2Respuestas[1] = TECpr2Respuesta1;
        TECpr2Respuestas[2] = TECpr2Respuesta2;

        TECpr3Respuestas[0] = TECpr3Respuesta;
        TECpr3Respuestas[1] = TECpr3Respuesta1;
        TECpr3Respuestas[2] = TECpr3Respuesta2;

        TECpr4Respuestas[0] = TECpr4Respuesta;
        TECpr4Respuestas[1] = TECpr4Respuesta1;
        TECpr4Respuestas[2] = TECpr4Respuesta2;

        TECpr5Respuestas[0] = TECpr5Respuesta;
        TECpr5Respuestas[1] = TECpr5Respuesta1;
        TECpr5Respuestas[2] = TECpr5Respuesta2;

        Pregunta TECpregunta1 = new Pregunta(0, "Se le conoce por sus siglas memoria “RAM”", TECpr1Respuestas);

        Pregunta TECpregunta2 = new Pregunta(1, "Método utilizado en la programación para repasar \n"
                + " un sector especifico del código.", TECpr2Respuestas);

        Pregunta TECpregunta3 = new Pregunta(2, "Sistema operativo más utilizado en computadoras.", TECpr3Respuestas);

        Pregunta TECpregunta4 = new Pregunta(0, "Qué hace el ordenador si pulsas Control + Z:", TECpr4Respuestas);

        Pregunta TECpregunta5 = new Pregunta(1, "¿Qué significa la abreviatura WWW?", TECpr5Respuestas);

        preguntas[2][0] = TECpregunta1;
        preguntas[2][1] = TECpregunta2;
        preguntas[2][2] = TECpregunta3;
        preguntas[2][3] = TECpregunta4;
        preguntas[2][4] = TECpregunta5;

        //deporte
        DPpr1Respuestas[0] = DPpr1Respuesta;
        DPpr1Respuestas[1] = DPpr1Respuesta1;
        DPpr1Respuestas[2] = DPpr1Respuesta2;

        DPpr2Respuestas[0] = DPpr2Respuesta;
        DPpr2Respuestas[1] = DPpr2Respuesta1;
        DPpr2Respuestas[2] = DPpr2Respuesta2;

        DPpr3Respuestas[0] = DPpr3Respuesta;
        DPpr3Respuestas[1] = DPpr3Respuesta1;
        DPpr3Respuestas[2] = DPpr3Respuesta2;

        DPpr4Respuestas[0] = DPpr4Respuesta;
        DPpr4Respuestas[1] = DPpr4Respuesta1;
        DPpr4Respuestas[2] = DPpr4Respuesta2;

        DPpr5Respuestas[0] = DPpr5Respuesta;
        DPpr5Respuestas[1] = DPpr5Respuesta1;
        DPpr5Respuestas[2] = DPpr5Respuesta2;

        Pregunta DPpregunta1 = new Pregunta(0, "¿A qué país pertenece el equipo europeo Arsenal? ", DPpr1Respuestas);

        Pregunta DPpregunta2 = new Pregunta(1, "¿Qué país ha ganado más Eurocopas seguidas?", DPpr2Respuestas);

        Pregunta DPpregunta3 = new Pregunta(2, "¿En qué deporte destacó Julio César Chávez?", DPpr3Respuestas);

        Pregunta DPpregunta4 = new Pregunta(0, "¿Cuántos anillos de la NBA tiene Shaquille O'Neal?", DPpr4Respuestas);

        Pregunta DPpregunta5 = new Pregunta(1, "¿En qué año se fundó el Real Madrid?", DPpr5Respuestas);

        preguntas[3][0] = DPpregunta1;
        preguntas[3][1] = DPpregunta2;
        preguntas[3][2] = DPpregunta3;
        preguntas[3][3] = DPpregunta4;
        preguntas[3][4] = DPpregunta5;
        //ciencias

        CIpr1Respuestas[0] = CIpr1Respuesta;
        CIpr1Respuestas[1] = CIpr1Respuesta1;
        CIpr1Respuestas[2] = CIpr1Respuesta2;

        CIpr2Respuestas[0] = CIpr2Respuesta;
        CIpr2Respuestas[1] = CIpr2Respuesta1;
        CIpr2Respuestas[2] = CIpr2Respuesta2;

        CIpr3Respuestas[0] = CIpr3Respuesta;
        CIpr3Respuestas[1] = CIpr3Respuesta1;
        CIpr3Respuestas[2] = CIpr3Respuesta2;

        CIpr4Respuestas[0] = CIpr4Respuesta;
        CIpr4Respuestas[1] = CIpr4Respuesta1;
        CIpr4Respuestas[2] = CIpr4Respuesta2;

        CIpr5Respuestas[0] = CIpr5Respuesta;
        CIpr5Respuestas[1] = CIpr5Respuesta1;
        CIpr5Respuestas[2] = CIpr5Respuesta2;

        Pregunta CIpregunta1 = new Pregunta(0, "¿En matemáticas, ¿qué es 3,14 ?", CIpr1Respuestas);

        Pregunta CIpregunta2 = new Pregunta(1, "¿Qué es la luna?", CIpr2Respuestas);

        Pregunta CIpregunta3 = new Pregunta(2, "¿Cuál es el símbolo químico de la plata?", CIpr3Respuestas);

        Pregunta CIpregunta4 = new Pregunta(0, "¿Qué animal siempre cae de pie?", CIpr4Respuestas);

        Pregunta CIpregunta5 = new Pregunta(1, "¿Qué es la levadura?", CIpr5Respuestas);

        preguntas[4][0] = CIpregunta1;
        preguntas[4][1] = CIpregunta2;
        preguntas[4][2] = CIpregunta3;
        preguntas[4][3] = CIpregunta4;
        preguntas[4][4] = CIpregunta5;

        //arte
        ARpr1Respuestas[0] = ARpr1Respuesta;
        ARpr1Respuestas[1] = ARpr1Respuesta1;
        ARpr1Respuestas[2] = ARpr1Respuesta2;

        ARpr2Respuestas[0] = ARpr2Respuesta;
        ARpr2Respuestas[1] = ARpr2Respuesta1;
        ARpr2Respuestas[2] = ARpr2Respuesta2;

        ARpr3Respuestas[0] = ARpr3Respuesta;
        ARpr3Respuestas[1] = ARpr3Respuesta1;
        ARpr3Respuestas[2] = ARpr3Respuesta2;

        ARpr4Respuestas[0] = ARpr4Respuesta;
        ARpr4Respuestas[1] = ARpr4Respuesta1;
        ARpr4Respuestas[2] = ARpr4Respuesta2;

        ARpr5Respuestas[0] = ARpr5Respuesta;
        ARpr5Respuestas[1] = ARpr5Respuesta1;
        ARpr5Respuestas[2] = ARpr5Respuesta2;

        Pregunta ARpregunta1 = new Pregunta(0, "¿Qué parte del cuerpo se cortó Vicent Van Gogh?", ARpr1Respuestas);

        Pregunta ARpregunta2 = new Pregunta(1, "¿Quién escribió \"El cuervo\"?", ARpr2Respuestas);

        Pregunta ARpregunta3 = new Pregunta(2, "¿En qué año se suicidó Van Gogh?", ARpr3Respuestas);

        Pregunta ARpregunta4 = new Pregunta(0, "¿Qué libro de Gabriel García Márquez es considerado \n"
                + "una de las obras más famosas de la literatura mundial?", ARpr4Respuestas);

        Pregunta ARpregunta5 = new Pregunta(1, "Harry Potter fue escrita por...", ARpr5Respuestas);

        preguntas[5][0] = ARpregunta1;
        preguntas[5][1] = ARpregunta2;
        preguntas[5][2] = ARpregunta3;
        preguntas[5][3] = ARpregunta4;
        preguntas[5][4] = ARpregunta5;

        //geografia
        GEOpr1Respuestas[0] = GEOpr1Respuesta;
        GEOpr1Respuestas[1] = GEOpr1Respuesta1;
        GEOpr1Respuestas[2] = GEOpr1Respuesta2;

        GEOpr2Respuestas[0] = GEOpr2Respuesta;
        GEOpr2Respuestas[1] = GEOpr2Respuesta1;
        GEOpr2Respuestas[2] = GEOpr2Respuesta2;

        GEOpr3Respuestas[0] = GEOpr3Respuesta;
        GEOpr3Respuestas[1] = GEOpr3Respuesta1;
        GEOpr3Respuestas[2] = GEOpr3Respuesta2;

        GEOpr4Respuestas[0] = GEOpr4Respuesta;
        GEOpr4Respuestas[1] = GEOpr4Respuesta1;
        GEOpr4Respuestas[2] = GEOpr4Respuesta2;

        GEOpr5Respuestas[0] = GEOpr5Respuesta;
        GEOpr5Respuestas[1] = GEOpr5Respuesta1;
        GEOpr5Respuestas[2] = GEOpr5Respuesta2;

        Pregunta GEOpregunta1 = new Pregunta(0, "¿Dónde se encuentra Panamá? ", GEOpr1Respuestas);

        Pregunta GEOpregunta2 = new Pregunta(1, "¿En qué país se celebra la tomatina?", GEOpr2Respuestas);

        Pregunta GEOpregunta3 = new Pregunta(2, "¿Por cuanta agua está cubierta la Tierra?", GEOpr3Respuestas);

        Pregunta GEOpregunta4 = new Pregunta(0, "¿Cuál fue la primera capital de Costa Rica? ", GEOpr4Respuestas);

        Pregunta GEOpregunta5 = new Pregunta(1, "¿Dónde está la torre Eiffel? ", GEOpr5Respuestas);

        preguntas[6][0] = GEOpregunta1;
        preguntas[6][1] = GEOpregunta2;
        preguntas[6][2] = GEOpregunta3;
        preguntas[6][3] = GEOpregunta4;
        preguntas[6][4] = GEOpregunta5;

        //videojuegos
        VJpr1Respuestas[0] = VJpr1Respuesta;
        VJpr1Respuestas[1] = VJpr1Respuesta1;
        VJpr1Respuestas[2] = VJpr1Respuesta2;

        VJpr2Respuestas[0] = VJpr2Respuesta;
        VJpr2Respuestas[1] = VJpr2Respuesta1;
        VJpr2Respuestas[2] = VJpr2Respuesta2;

        VJpr3Respuestas[0] = VJpr3Respuesta;
        VJpr3Respuestas[1] = VJpr3Respuesta1;
        VJpr3Respuestas[2] = VJpr3Respuesta2;

        VJpr4Respuestas[0] = VJpr4Respuesta;
        VJpr4Respuestas[1] = VJpr4Respuesta1;
        VJpr4Respuestas[2] = VJpr4Respuesta2;

        VJpr5Respuestas[0] = VJpr5Respuesta;
        VJpr5Respuestas[1] = VJpr5Respuesta1;
        VJpr5Respuestas[2] = VJpr5Respuesta2;

        Pregunta VJpregunta1 = new Pregunta(0, ". ¿Nombre del protagonista de la saga “The legend of Zelda”?", VJpr1Respuestas);

        Pregunta VJpregunta2 = new Pregunta(1, "¿Qué color quería Shigeru Miyamoto para el personaje Kirby?", VJpr2Respuestas);

        Pregunta VJpregunta3 = new Pregunta(2, "En que animal esta inspirado Pikachu de “Pokémon”", VJpr3Respuestas);

        Pregunta VJpregunta4 = new Pregunta(0, "¿Cuál es el juego mas vendido de la historia?", VJpr4Respuestas);

        Pregunta VJpregunta5 = new Pregunta(1, "Nombre del artista que compuso la banda sonora de Minecraft", VJpr5Respuestas);

        preguntas[7][0] = VJpregunta1;
        preguntas[7][1] = VJpregunta2;
        preguntas[7][2] = VJpregunta3;
        preguntas[7][3] = VJpregunta4;
        preguntas[7][4] = VJpregunta5;

    }
     
}
