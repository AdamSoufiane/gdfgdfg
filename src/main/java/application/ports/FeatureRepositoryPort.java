package application.ports;

import domain.entities.FeatureEntity;
import java.util.Optional;

public interface FeatureRepositoryPort {

    Optional<FeatureEntity> findById(Long id);

    FeatureEntity save(FeatureEntity featureEntity);

    void deleteById(Long id);
}