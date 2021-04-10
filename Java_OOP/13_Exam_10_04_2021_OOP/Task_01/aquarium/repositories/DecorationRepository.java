package aquarium.repositories;

import aquarium.entities.decorations.Decoration;

import java.util.Collection;

public class DecorationRepository implements Repository{
    private Collection<Decoration> decorations;

    @Override
    public void add(Decoration decoration) {

    }

    @Override
    public boolean remove(Decoration decoration) {
        return false;
    }

    @Override
    public Decoration findByType(String type) {
        return null;
    }
}
