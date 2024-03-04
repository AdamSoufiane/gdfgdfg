package domain.services;

import domain.entities.FeatureEntity;
import domain.exceptions.BusinessRuleValidationException;
import domain.valueobjects.BusinessResult;

public class FeatureDomainService {

    public BusinessResult performBusinessOperation(FeatureEntity featureEntity) {
        validateBusinessRules(featureEntity);
        // Business logic to perform the operation
        return new BusinessResult();
    }

    private void validateBusinessRules(FeatureEntity featureEntity) {
        // Validation logic to ensure the entity complies with business rules
        if (!featureEntity.isValid()) {
            throw new BusinessRuleValidationException("Business rules validation failed for the feature.");
        }
    }

}