package database.pack;

import database.pack.ItemHolderTempates.NormTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class NormDAOImpl implements StandartDAOtestAPI<NormTemplate> {
    private List<NormTemplate> norms = new ArrayList<>();

    @Override
    public Optional get(int id) {
        return Optional.ofNullable(norms.get(id));
    }

    @Override
    public List getAll() {
        return norms;
    }

    @Override
    public void save(NormTemplate norm) {
        norms.add(norm);
    }

    @Override
    public void update(NormTemplate norm, String[] params) {
        norm.setNormItemId(Objects.requireNonNull(
               Integer.getInteger(params[0]), "Name cannot be null"));
        norms.add(norm);
    }

    @Override
    public void delete(NormTemplate user) {
        norms.remove(user);
    }
}
