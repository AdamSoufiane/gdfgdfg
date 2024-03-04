package infrastructure.adapters;

import application.ports.FeatureRepositoryPort;
import domain.entities.FeatureEntity;
import javax.persistence.EntityManager;
import java.util.Optional;

public class FeatureRepositoryAdapter implements FeatureRepositoryPort {

    private final EntityManager entityManager;

    public FeatureRepositoryAdapter(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Optional<FeatureEntity> findById(Long id) {
        FeatureEntity feature = entityManager.find(FeatureEntity.class, id);
        return Optional.ofNullable(feature);
    }

    @Override
    public FeatureEntity save(FeatureEntity featureEntity) {
        if (featureEntity.getId() == null) {
            entityManager.persist(featureEntity);
        } else {
            featureEntity = entityManager.merge(featureEntity);
        }
        return featureEntity;
    }

    @Override
    public void deleteById(Long id) {
        FeatureEntity featureEntity = entityManager.find(FeatureEntity.class, id);
        if (featureEntity != null) {
            entityManager.remove(featureEntity);
        }
    }
}
