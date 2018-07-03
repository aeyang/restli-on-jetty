
package com.example.salary;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * A salary object for a particular title, company, region
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from /Users/alyang/My_Projects/restli-on-jetty/api/src/main/pegasus/com/example/salary/Salary.pdsc.", date = "Mon Jul 02 17:51:33 PDT 2018")
public class Salary
    extends RecordTemplate
{

    private final static Salary.Fields _fields = new Salary.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("{\"type\":\"record\",\"name\":\"Salary\",\"namespace\":\"com.example.salary\",\"doc\":\"A salary object for a particular title, company, region\",\"fields\":[{\"name\":\"title\",\"type\":\"string\",\"doc\":\"title of the salary submission\"},{\"name\":\"company\",\"type\":\"string\",\"doc\":\"company of the salary submission\"},{\"name\":\"region\",\"type\":\"string\",\"doc\":\"region of the salary submission\"},{\"name\":\"low\",\"type\":\"double\",\"doc\":\"title of the salary submission\"},{\"name\":\"high\",\"type\":\"double\",\"doc\":\"title of the salary submission\"}]}"));
    private final static RecordDataSchema.Field FIELD_Title = SCHEMA.getField("title");
    private final static RecordDataSchema.Field FIELD_Company = SCHEMA.getField("company");
    private final static RecordDataSchema.Field FIELD_Region = SCHEMA.getField("region");
    private final static RecordDataSchema.Field FIELD_Low = SCHEMA.getField("low");
    private final static RecordDataSchema.Field FIELD_High = SCHEMA.getField("high");

    public Salary() {
        super(new DataMap(), SCHEMA);
    }

    public Salary(DataMap data) {
        super(data, SCHEMA);
    }

    public static Salary.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for title
     * 
     * @see Salary.Fields#title
     */
    public boolean hasTitle() {
        return contains(FIELD_Title);
    }

    /**
     * Remover for title
     * 
     * @see Salary.Fields#title
     */
    public void removeTitle() {
        remove(FIELD_Title);
    }

    /**
     * Getter for title
     * 
     * @see Salary.Fields#title
     */
    public String getTitle(GetMode mode) {
        return obtainDirect(FIELD_Title, String.class, mode);
    }

    /**
     * Getter for title
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Salary.Fields#title
     */
    @Nonnull
    public String getTitle() {
        return obtainDirect(FIELD_Title, String.class, GetMode.STRICT);
    }

    /**
     * Setter for title
     * 
     * @see Salary.Fields#title
     */
    public Salary setTitle(String value, SetMode mode) {
        putDirect(FIELD_Title, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for title
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Salary.Fields#title
     */
    public Salary setTitle(
        @Nonnull
        String value) {
        putDirect(FIELD_Title, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for company
     * 
     * @see Salary.Fields#company
     */
    public boolean hasCompany() {
        return contains(FIELD_Company);
    }

    /**
     * Remover for company
     * 
     * @see Salary.Fields#company
     */
    public void removeCompany() {
        remove(FIELD_Company);
    }

    /**
     * Getter for company
     * 
     * @see Salary.Fields#company
     */
    public String getCompany(GetMode mode) {
        return obtainDirect(FIELD_Company, String.class, mode);
    }

    /**
     * Getter for company
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Salary.Fields#company
     */
    @Nonnull
    public String getCompany() {
        return obtainDirect(FIELD_Company, String.class, GetMode.STRICT);
    }

    /**
     * Setter for company
     * 
     * @see Salary.Fields#company
     */
    public Salary setCompany(String value, SetMode mode) {
        putDirect(FIELD_Company, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for company
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Salary.Fields#company
     */
    public Salary setCompany(
        @Nonnull
        String value) {
        putDirect(FIELD_Company, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for region
     * 
     * @see Salary.Fields#region
     */
    public boolean hasRegion() {
        return contains(FIELD_Region);
    }

    /**
     * Remover for region
     * 
     * @see Salary.Fields#region
     */
    public void removeRegion() {
        remove(FIELD_Region);
    }

    /**
     * Getter for region
     * 
     * @see Salary.Fields#region
     */
    public String getRegion(GetMode mode) {
        return obtainDirect(FIELD_Region, String.class, mode);
    }

    /**
     * Getter for region
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Salary.Fields#region
     */
    @Nonnull
    public String getRegion() {
        return obtainDirect(FIELD_Region, String.class, GetMode.STRICT);
    }

    /**
     * Setter for region
     * 
     * @see Salary.Fields#region
     */
    public Salary setRegion(String value, SetMode mode) {
        putDirect(FIELD_Region, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for region
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Salary.Fields#region
     */
    public Salary setRegion(
        @Nonnull
        String value) {
        putDirect(FIELD_Region, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for low
     * 
     * @see Salary.Fields#low
     */
    public boolean hasLow() {
        return contains(FIELD_Low);
    }

    /**
     * Remover for low
     * 
     * @see Salary.Fields#low
     */
    public void removeLow() {
        remove(FIELD_Low);
    }

    /**
     * Getter for low
     * 
     * @see Salary.Fields#low
     */
    public Double getLow(GetMode mode) {
        return obtainDirect(FIELD_Low, Double.class, mode);
    }

    /**
     * Getter for low
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Salary.Fields#low
     */
    @Nonnull
    public Double getLow() {
        return obtainDirect(FIELD_Low, Double.class, GetMode.STRICT);
    }

    /**
     * Setter for low
     * 
     * @see Salary.Fields#low
     */
    public Salary setLow(Double value, SetMode mode) {
        putDirect(FIELD_Low, Double.class, Double.class, value, mode);
        return this;
    }

    /**
     * Setter for low
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Salary.Fields#low
     */
    public Salary setLow(
        @Nonnull
        Double value) {
        putDirect(FIELD_Low, Double.class, Double.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for low
     * 
     * @see Salary.Fields#low
     */
    public Salary setLow(double value) {
        putDirect(FIELD_Low, Double.class, Double.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for high
     * 
     * @see Salary.Fields#high
     */
    public boolean hasHigh() {
        return contains(FIELD_High);
    }

    /**
     * Remover for high
     * 
     * @see Salary.Fields#high
     */
    public void removeHigh() {
        remove(FIELD_High);
    }

    /**
     * Getter for high
     * 
     * @see Salary.Fields#high
     */
    public Double getHigh(GetMode mode) {
        return obtainDirect(FIELD_High, Double.class, mode);
    }

    /**
     * Getter for high
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Salary.Fields#high
     */
    @Nonnull
    public Double getHigh() {
        return obtainDirect(FIELD_High, Double.class, GetMode.STRICT);
    }

    /**
     * Setter for high
     * 
     * @see Salary.Fields#high
     */
    public Salary setHigh(Double value, SetMode mode) {
        putDirect(FIELD_High, Double.class, Double.class, value, mode);
        return this;
    }

    /**
     * Setter for high
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Salary.Fields#high
     */
    public Salary setHigh(
        @Nonnull
        Double value) {
        putDirect(FIELD_High, Double.class, Double.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for high
     * 
     * @see Salary.Fields#high
     */
    public Salary setHigh(double value) {
        putDirect(FIELD_High, Double.class, Double.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public Salary clone()
        throws CloneNotSupportedException
    {
        return ((Salary) super.clone());
    }

    @Override
    public Salary copy()
        throws CloneNotSupportedException
    {
        return ((Salary) super.copy());
    }

    public static class Fields
        extends PathSpec
    {


        public Fields(List<String> path, String name) {
            super(path, name);
        }

        public Fields() {
            super();
        }

        /**
         * title of the salary submission
         * 
         */
        public PathSpec title() {
            return new PathSpec(getPathComponents(), "title");
        }

        /**
         * company of the salary submission
         * 
         */
        public PathSpec company() {
            return new PathSpec(getPathComponents(), "company");
        }

        /**
         * region of the salary submission
         * 
         */
        public PathSpec region() {
            return new PathSpec(getPathComponents(), "region");
        }

        /**
         * title of the salary submission
         * 
         */
        public PathSpec low() {
            return new PathSpec(getPathComponents(), "low");
        }

        /**
         * title of the salary submission
         * 
         */
        public PathSpec high() {
            return new PathSpec(getPathComponents(), "high");
        }

    }

}
