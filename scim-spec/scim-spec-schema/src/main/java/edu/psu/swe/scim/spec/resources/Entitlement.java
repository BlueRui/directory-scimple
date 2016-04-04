package edu.psu.swe.scim.spec.resources;

import javax.xml.bind.annotation.XmlElement;

import edu.psu.swe.scim.spec.annotation.ScimAttribute;
import edu.psu.swe.scim.spec.schema.SimpleMultiValuedAttribute;

/**
 * Scim core schema, <a href="https://tools.ietf.org/html/rfc7643#section-4.1.2>section 4.1.2</a>
 *
 */
public class Entitlement {
  
  @XmlElement(nillable=true)
  @ScimAttribute(description="A label indicating the attribute's function.")
  String type;
  
  @XmlElement
  @ScimAttribute(description="The value of an entitlement.")
  String value;
  
  @XmlElement
  @ScimAttribute(description="A human readable name, primarily used for display purposes. READ-ONLY.")
  String display;
  
  @XmlElement
  @ScimAttribute(description="A Boolean value indicating the 'primary' or preferred attribute value for this attribute, e.g. the preferred mailing address or primary e-mail address. The primary attribute value 'true' MUST appear no more than once.")
  boolean primary = false;
}
