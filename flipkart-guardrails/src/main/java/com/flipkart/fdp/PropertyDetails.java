package com.flipkart.fdp;

/**
 * Created by pranav.agarwal on 30/11/16.
 */
public final class PropertyDetails {

  protected enum PropertyType {
    Mandatory,
    NonMandatory;
  }

  protected enum PropertyDataType {
    String,
    StringList,
    Boolean,
    Number;
  };

    public PropertyType getPropertyType() {
      return propertyType;
    }

    public PropertyDataType getPropertyDataType() {
      return propertyDataType;
    }

    PropertyType propertyType;
    PropertyDataType propertyDataType;

    private PropertyDetails(PropertyType propertyType, PropertyDataType propertyDataType) {
      this.propertyType = propertyType;
      this.propertyDataType = propertyDataType;
    }

    public static PropertyDetails createProperty(PropertyType propertyType,
                                                 PropertyDataType propertyDataType) {
      return new PropertyDetails(propertyType, propertyDataType);
    }
}
