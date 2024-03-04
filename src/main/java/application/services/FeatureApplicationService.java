package application.services;

import domain.services.FeatureDomainService;
import application.ports.FeatureRepositoryPort;

public class FeatureApplicationService {

    private final FeatureDomainService featureDomainService;
    private final FeatureRepositoryPort featureRepositoryPort;

    public FeatureApplicationService(FeatureDomainService featureDomainService, FeatureRepositoryPort featureRepositoryPort) {
        this.featureDomainService = featureDomainService;
        this.featureRepositoryPort = featureRepositoryPort;
    }

    // Method implementations should be provided based on the actual application logic
}
