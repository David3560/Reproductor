/**
 * Especificación (contrato) de una lista de reproducción actual.
 * 
 * <p>Este archivo define únicamente la interfaz y los tipos necesarios para
 * describir el comportamiento lógico, sin implementar cómo se almacena o gestiona
 * la información internamente.</p>
 */
public interface IPlaylist {

    /**
     * Agrega una canción a la lista de reproducción.
     *
     * @param c canción a agregar.
     *          Precondición: c no debe ser null.
     *          Precondición: el título de la canción debe ser válido (no vacío).
     * @throws IllegalArgumentException si c es null o si su título no es válido.
     */
    void agregarCancion(Cancion Cancion);

    /**
     * Elimina una canción de la lista de reproducción a partir de su título.
     *
     * @param titulo título de la canción a eliminar.
     *               Precondición: titulo no debe ser null ni vacío.
     * @throws IllegalArgumentException si titulo es null o vacío.
     */
    void eliminarCancion(String titulo);

    /**
     * Retorna la siguiente canción a reproducir.
     *
     * <p>La forma exacta de determinar cuál es la "siguiente" canción depende de la
     * implementación concreta, pero este método define el contrato de uso.</p>
     *
     * @return la siguiente canción a reproducir, o null si no hay canciones disponibles.
     */
    Cancion reproducirSiguiente();

    /**
     * Elimina todas las canciones de la lista de reproducción.
     *
     * <p>Postcondición: la cantidad de canciones en la lista debe quedar en 0.</p>
     */
    void vaciarLista();

    /**
     * Obtiene la cantidad total de canciones disponibles en la lista de reproducción.
     *
     * @return número de canciones registradas en la lista. Debe ser un valor mayor o igual a 0.
     */
    int obtenerCantidadCanciones();
}

/**
 * Representa una canción con información básica.
 *
 * <p>Esta clase se utiliza como tipo de dato dentro del contrato de la interfaz.</p>
 */
class Cancion {

    private String titulo;
    private int duracion; // duración en segundos (criterio simple)

    /**
     * Crea una canción con título y duración.
     *
     * @param titulo título de la canción.
     * @param duracion duración de la canción en segundos.
     */
    public Cancion(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    /**
     * Obtiene el título de la canción.
     *
     * @return título de la canción.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el título de la canción.
     *
     * @param titulo nuevo título.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene la duración de la canción.
     *
     * @return duración en segundos.
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * Establece la duración de la canción.
     *
     * @param duracion nueva duración en segundos.
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}

