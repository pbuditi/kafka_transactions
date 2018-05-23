/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package schema;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class OrderItem extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"OrderItem\",\"namespace\":\"schema\",\"fields\":[{\"name\":\"productId\",\"type\":\"int\",\"doc\":\"The product\"},{\"name\":\"orderId\",\"type\":\"int\",\"doc\":\"The order\"},{\"name\":\"count\",\"type\":\"int\",\"doc\":\"Number of Units\"},{\"name\":\"price\",\"type\":\"float\",\"doc\":\"Price per Unit (at sales time)\"}],\"doc:\":\"Individual order item (N-M table order/product)\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** The product */
  @Deprecated public int productId;
  /** The order */
  @Deprecated public int orderId;
  /** Number of Units */
  @Deprecated public int count;
  /** Price per Unit (at sales time) */
  @Deprecated public float price;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public OrderItem() {}

  /**
   * All-args constructor.
   */
  public OrderItem(java.lang.Integer productId, java.lang.Integer orderId, java.lang.Integer count, java.lang.Float price) {
    this.productId = productId;
    this.orderId = orderId;
    this.count = count;
    this.price = price;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return productId;
    case 1: return orderId;
    case 2: return count;
    case 3: return price;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: productId = (java.lang.Integer)value$; break;
    case 1: orderId = (java.lang.Integer)value$; break;
    case 2: count = (java.lang.Integer)value$; break;
    case 3: price = (java.lang.Float)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'productId' field.
   * The product   */
  public java.lang.Integer getProductId() {
    return productId;
  }

  /**
   * Sets the value of the 'productId' field.
   * The product   * @param value the value to set.
   */
  public void setProductId(java.lang.Integer value) {
    this.productId = value;
  }

  /**
   * Gets the value of the 'orderId' field.
   * The order   */
  public java.lang.Integer getOrderId() {
    return orderId;
  }

  /**
   * Sets the value of the 'orderId' field.
   * The order   * @param value the value to set.
   */
  public void setOrderId(java.lang.Integer value) {
    this.orderId = value;
  }

  /**
   * Gets the value of the 'count' field.
   * Number of Units   */
  public java.lang.Integer getCount() {
    return count;
  }

  /**
   * Sets the value of the 'count' field.
   * Number of Units   * @param value the value to set.
   */
  public void setCount(java.lang.Integer value) {
    this.count = value;
  }

  /**
   * Gets the value of the 'price' field.
   * Price per Unit (at sales time)   */
  public java.lang.Float getPrice() {
    return price;
  }

  /**
   * Sets the value of the 'price' field.
   * Price per Unit (at sales time)   * @param value the value to set.
   */
  public void setPrice(java.lang.Float value) {
    this.price = value;
  }

  /** Creates a new OrderItem RecordBuilder */
  public static schema.OrderItem.Builder newBuilder() {
    return new schema.OrderItem.Builder();
  }
  
  /** Creates a new OrderItem RecordBuilder by copying an existing Builder */
  public static schema.OrderItem.Builder newBuilder(schema.OrderItem.Builder other) {
    return new schema.OrderItem.Builder(other);
  }
  
  /** Creates a new OrderItem RecordBuilder by copying an existing OrderItem instance */
  public static schema.OrderItem.Builder newBuilder(schema.OrderItem other) {
    return new schema.OrderItem.Builder(other);
  }
  
  /**
   * RecordBuilder for OrderItem instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<OrderItem>
    implements org.apache.avro.data.RecordBuilder<OrderItem> {

    private int productId;
    private int orderId;
    private int count;
    private float price;

    /** Creates a new Builder */
    private Builder() {
      super(schema.OrderItem.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(schema.OrderItem.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.productId)) {
        this.productId = data().deepCopy(fields()[0].schema(), other.productId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.orderId)) {
        this.orderId = data().deepCopy(fields()[1].schema(), other.orderId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.count)) {
        this.count = data().deepCopy(fields()[2].schema(), other.count);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.price)) {
        this.price = data().deepCopy(fields()[3].schema(), other.price);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing OrderItem instance */
    private Builder(schema.OrderItem other) {
            super(schema.OrderItem.SCHEMA$);
      if (isValidValue(fields()[0], other.productId)) {
        this.productId = data().deepCopy(fields()[0].schema(), other.productId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.orderId)) {
        this.orderId = data().deepCopy(fields()[1].schema(), other.orderId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.count)) {
        this.count = data().deepCopy(fields()[2].schema(), other.count);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.price)) {
        this.price = data().deepCopy(fields()[3].schema(), other.price);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'productId' field */
    public java.lang.Integer getProductId() {
      return productId;
    }
    
    /** Sets the value of the 'productId' field */
    public schema.OrderItem.Builder setProductId(int value) {
      validate(fields()[0], value);
      this.productId = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'productId' field has been set */
    public boolean hasProductId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'productId' field */
    public schema.OrderItem.Builder clearProductId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'orderId' field */
    public java.lang.Integer getOrderId() {
      return orderId;
    }
    
    /** Sets the value of the 'orderId' field */
    public schema.OrderItem.Builder setOrderId(int value) {
      validate(fields()[1], value);
      this.orderId = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'orderId' field has been set */
    public boolean hasOrderId() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'orderId' field */
    public schema.OrderItem.Builder clearOrderId() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'count' field */
    public java.lang.Integer getCount() {
      return count;
    }
    
    /** Sets the value of the 'count' field */
    public schema.OrderItem.Builder setCount(int value) {
      validate(fields()[2], value);
      this.count = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'count' field has been set */
    public boolean hasCount() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'count' field */
    public schema.OrderItem.Builder clearCount() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'price' field */
    public java.lang.Float getPrice() {
      return price;
    }
    
    /** Sets the value of the 'price' field */
    public schema.OrderItem.Builder setPrice(float value) {
      validate(fields()[3], value);
      this.price = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'price' field has been set */
    public boolean hasPrice() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'price' field */
    public schema.OrderItem.Builder clearPrice() {
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public OrderItem build() {
      try {
        OrderItem record = new OrderItem();
        record.productId = fieldSetFlags()[0] ? this.productId : (java.lang.Integer) defaultValue(fields()[0]);
        record.orderId = fieldSetFlags()[1] ? this.orderId : (java.lang.Integer) defaultValue(fields()[1]);
        record.count = fieldSetFlags()[2] ? this.count : (java.lang.Integer) defaultValue(fields()[2]);
        record.price = fieldSetFlags()[3] ? this.price : (java.lang.Float) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}