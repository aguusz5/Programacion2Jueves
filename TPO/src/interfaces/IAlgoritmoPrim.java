package interfaces;

import java.util.Set;

public interface IAlgoritmoPrim {
	
    Set<IArista> ejecutar(IGrafo grafo, INodo inicio);

}
