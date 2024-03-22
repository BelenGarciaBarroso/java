package principal;

public class BloquesTexto {

	public static void main(String[] args) {
		//String tutorial="El lenguaje \"html\":\n se emplea para formatear, las etiquetas tienen la forma <etiqueta>";
		// triple " para escribir el texto tal cual sin problemas de caracteres
		String bloqueTutorial="""
				El lenguaje "html":
				se emplea para formatear,
				las etiquetas tienen la forma <etiquetas>""";
		System.out.println(bloqueTutorial);
	}

}
