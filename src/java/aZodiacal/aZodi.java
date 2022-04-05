package aZodiacal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class aZodi {
    
    String fecha;

    String[][] fechas = {{"21-03", "19-04", "Aries"},
    {"20-04", "20-05", "Tauro"},
    {"21-05", "20-06", "Geminis"},
    {"21-06", "22-07", "Cancer"},
    {"23-07", "22-08", "Leo"},
    {"23-08", "22-09", "Virgo"},
    {"23-09", "22-10", "Libra"},
    {"23-10", "22-11", "Escorpio"},
    {"23-11", "21-12", "Sagitario"},
    {"22-12", "19-01", "Capricornio"},
    {"20-01", "18-02", "Acuario"},
    {"19-02", "20-03", "Piscis"}};

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoroscopo() {
        String horoscopo = "";

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fechaInicio, fechaFin;

        for (int i = 0; i < 12; i++) {
            fechaInicio = LocalDate.parse(fechas[i][0] + "-2000", format);
            fechaFin = LocalDate.parse(fechas[i][1] + "-2000", format);

            LocalDate fechaNac = LocalDate.parse(fecha + "-2000", format);

            if ((fechaNac.isAfter(fechaInicio) || fechaNac.isEqual(fechaInicio))
                    && (fechaNac.isBefore(fechaFin) || fechaNac.isEqual(fechaFin))) 
            {
               horoscopo = fechas[i][2];
            }
        }

        return horoscopo;
    }

    public String getInfo()
    {
        String info = null;
        
        switch (getHoroscopo())
        {
            case "Tauro":
                info = "Un Tauro es una persona que tiene una gran fuerza de voluntad, es práctico y decidido en la toma de decisiones. "
                        + "Suelen ser personas estables y conservadoras y no dudan en seguir a un líder si les despierta confianza.";
                break;
            case "Aries":
                info = "Los Aries son personas llenas de energía y entusiasmo por la vida. Aventureros por naturaleza, "
                        + "les encantan los retos, la libertad y las nuevas ideas, por lo que nunca tienen miedo a los comienzos"
                        + " o nuevas etapas. Son líderes y prefieren dar órdenes a recibirlas. ";
                break;
            case "Geminis":
                info = "Carácter doble, complejo y contradictorio es lo que mejor define a un Géminis. Al contrario que los Aries, los Géminis empiezan con entusiasmo "
                        + "nuevas aventuras, pero tienden a aburrirse rápido por la falta de constancia. Son personas cariñosas, "
                        + "amables y generosas, aunque tienen algo de mentirosos si quieren obtener algo.";
                break; 
            case "Cancer":
                info = "Los Cáncer son personas complicadas de clasificar, si se atiende a su carácter. Los hay tímidos y aburridos, pero también brillantes y famosos."
                        + " De hecho, algunos presentan una alta capacidad literaria y artística, gracias a su capacidad imaginativa.";
                break; 
            case "Leo":
                info = "Es el signo más dominante del Zodiaco. Es creativo y extrovertido. Tienen ambición, fuerza, valentía y seguridad en sus capacidades."
                        + " No temen a los obstáculos y suelen ser buenos, idealistas e inteligentes. Para los Leo, el lujo y el poder están entre sus gustos.";
                break;      
            case "Virgo":
                info = "Único signo zodiacal representado por una mujer. Los Virgo son observadores, pacientes y les cuesta hacer amigos por su carácter "
                        + "frío que muestran a veces. A pesar de ello tienen encanto y suelen ayudar a los demás cuando se presenta un problema.";
                break;
            case "Libra":
                info = "El signo del Zodiaco más civilizado. Tienen encanto, elegancia, buen gusto y son amables y pacíficos, por lo que no es raro "
                        + "que ante conflictos sean imparciales y muestren su rechazo a ellos. Valoran el esfuerzo de los demás y les gusta trabajar en equipo";
                break;
            case "Escorpio":
                info = "Un Escorpio es una persona tranquila que parece alejada de la realidad, aunque nunca dejan de observar todo a su alrededor con el ojo crítico."
                        + " Tienen mucha fuerza de voluntad y muestran tenacidad, pero también les afecta al estado de ánimo las circunstancias que les rodean.";
                break; 
            case "Sagitario":
                info = "Sagitario es el signo más positivo de todo el Zodiaco. Cuando las cosas se ponen complicadas un Sagitario siempre sacará la mejor versión y se "
                        + "olvidará de la negatividad. Entre sus mejores características están las de ser buenos organizadores y abarcar nuevos proyectos y aprender cosas nuevas.";
                break;
            case "Capricornio":
                info = "Estabilidad, seguridad y tranquilidad es lo que mejor define a un Capricornio. Son personas justas y exigentes con los demás, porque también lo son con ellos mismos."
                        + " Suelen perder el control de sus emociones, por lo que es fácil que sean pesimistas y melancólicos, pero siempre tratan de buscar ayuda.";
                break;
            case "Acuario":
                info = "Los Acuario tienen una personalidad fuerte y atractiva, pero hay dos tipos: los que son tímidos, sensibles y pacientes; y los que son exuberantes, vivos y frívolos."
                        + " Eso sí, ambos son honestos y no dudarán en cambiar su opinión si estaban equivocados.";
                break;
            case "Piscis":
                info = "Son tranquilos, amables y pacientes. Los Piscis son sensibles a los sentimientos de los demás y responden con simpatía al tacto y al sufrimiento."
                        + " Son queridos por el resto de los signos, debido al carácter afable, cariñoso y amable.";
                break;                  
        }
        return info;
    }
    
    public String getUrl()
    {
        String url = "";
        
        switch (getHoroscopo())
        {
            case "Tauro":
                url = "tauro.png";
                break;
            case "Aries":
                url = "aries.png";
                break;
            case "Geminis":
                url = "geminis.png";
                break; 
            case "Cancer":
                url = "cancer.png";
                break; 
            case "Leo":
                url = "leo.png";
                break;      
            case "Virgo":
                url = "virgo.png";
                break;
            case "Libra":
                url = "libra.png";
                break;
            case "Escorpio":
                url = "escorpio.png";
                break; 
            case "Sagitario":
                url = "sagitario.png";
                break;
            case "Capricornio":
                url = "capricornio.png";
                break;
            case "Acuario":
                url = "acuario.png";
                break;
            case "Piscis":
                url = "piscis.png";
                break;                  
        }
        return url;
    }    
}