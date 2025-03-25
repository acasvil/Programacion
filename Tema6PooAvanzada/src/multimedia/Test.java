package multimedia;

public class Test {

	public static void main(String[] args) {
		
		ListaMultimedia playlist = new ListaMultimedia(10);
		
		Multimedia Saturno = new Multimedia("Saturno", "Alejandro Sanz", "MP3", "3:23");
		Pelicula IronMan = new Pelicula ("Iron man: El hombre de acero", "John Russo", "MP4", "1:38:23", "Robert Downey JR");
		Pelicula IronMan2 = new Pelicula ("Iron man 2", "Jon Favreau", "VLC", "1:42:53", "Robert Downey JR", "Gwyneth Paltrow");
		Pelicula IronMan3 = new Pelicula ("Iron man 3", "John Russo", "MP4", "2:04:31", "Robert Downey JR", "Gwyneth Paltrow");
		
		playlist.add(IronMan);
		playlist.add(IronMan2);
		playlist.add(IronMan3);
		playlist.add(Saturno);
		
		System.out.println(playlist);
		
		

	}

}
