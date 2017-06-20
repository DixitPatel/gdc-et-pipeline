//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.20 at 07:06:08 PM IST 
//


package org.cbio.gdcpipeline.model.gdc.nci.tcga.bcr.xml.biospecimen._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.cbio.gdcpipeline.model.gdc.nci.tcga.bcr.xml.administration._2.AdditionalStudies;
import org.cbio.gdcpipeline.model.gdc.nci.tcga.bcr.xml.administration._2.AlternateIdentifiers;
import org.cbio.gdcpipeline.model.gdc.nci.tcga.bcr.xml.shared._2.BcrPatientBarcode;
import org.cbio.gdcpipeline.model.gdc.nci.tcga.bcr.xml.shared._2.BcrPatientUuid;
import org.cbio.gdcpipeline.model.gdc.nci.tcga.bcr.xml.shared._2.Gender;
import org.cbio.gdcpipeline.model.gdc.nci.tcga.bcr.xml.shared._2.Notes;
import org.cbio.gdcpipeline.model.gdc.nci.tcga.bcr.xml.shared._2.PatientId;
import org.cbio.gdcpipeline.model.gdc.nci.tcga.bcr.xml.shared._2.TissueSourceSite;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://tcga.nci/bcr/xml/shared/2.7}notes" minOccurs="0"/>
 *         &lt;element ref="{http://tcga.nci/bcr/xml/administration/2.7}additional_studies" minOccurs="0"/>
 *         &lt;element ref="{http://tcga.nci/bcr/xml/administration/2.7}alternate_identifiers" minOccurs="0"/>
 *         &lt;element ref="{http://tcga.nci/bcr/xml/shared/2.7}bcr_patient_barcode"/>
 *         &lt;element ref="{http://tcga.nci/bcr/xml/shared/2.7}bcr_patient_uuid"/>
 *         &lt;element ref="{http://tcga.nci/bcr/xml/shared/2.7}tissue_source_site"/>
 *         &lt;element ref="{http://tcga.nci/bcr/xml/shared/2.7}patient_id"/>
 *         &lt;element ref="{http://tcga.nci/bcr/xml/shared/2.7}gender" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element ref="{http://tcga.nci/bcr/xml/biospecimen/2.7}day_of_index"/>
 *             &lt;element ref="{http://tcga.nci/bcr/xml/biospecimen/2.7}month_of_index"/>
 *             &lt;element ref="{http://tcga.nci/bcr/xml/biospecimen/2.7}year_of_index"/>
 *           &lt;/sequence>
 *           &lt;element ref="{http://tcga.nci/bcr/xml/biospecimen/2.7}days_to_index"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://tcga.nci/bcr/xml/biospecimen/2.7}bcr_canonical_check"/>
 *         &lt;element ref="{http://tcga.nci/bcr/xml/biospecimen/2.7}samples"/>
 *         &lt;element ref="{http://tcga.nci/bcr/xml/biospecimen/2.7}hpv_test_results" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "notes",
    "additionalStudies",
    "alternateIdentifiers",
    "bcrPatientBarcode",
    "bcrPatientUuid",
    "tissueSourceSite",
    "patientId",
    "gender",
    "dayOfIndex",
    "monthOfIndex",
    "yearOfIndex",
    "daysToIndex",
    "bcrCanonicalCheck",
    "samples",
    "hpvTestResults"
})
@XmlRootElement(name = "patient")
public class Patient {

    @XmlElement(namespace = "http://tcga.nci/bcr/xml/shared/2.7")
    protected Notes notes;
    @XmlElement(name = "additional_studies", namespace = "http://tcga.nci/bcr/xml/administration/2.7")
    protected AdditionalStudies additionalStudies;
    @XmlElement(name = "alternate_identifiers", namespace = "http://tcga.nci/bcr/xml/administration/2.7")
    protected AlternateIdentifiers alternateIdentifiers;
    @XmlElement(name = "bcr_patient_barcode", namespace = "http://tcga.nci/bcr/xml/shared/2.7", required = true)
    protected BcrPatientBarcode bcrPatientBarcode;
    @XmlElement(name = "bcr_patient_uuid", namespace = "http://tcga.nci/bcr/xml/shared/2.7", required = true)
    protected BcrPatientUuid bcrPatientUuid;
    @XmlElement(name = "tissue_source_site", namespace = "http://tcga.nci/bcr/xml/shared/2.7", required = true)
    protected TissueSourceSite tissueSourceSite;
    @XmlElement(name = "patient_id", namespace = "http://tcga.nci/bcr/xml/shared/2.7", required = true)
    protected PatientId patientId;
    @XmlElement(namespace = "http://tcga.nci/bcr/xml/shared/2.7")
    protected Gender gender;
    @XmlElement(name = "day_of_index", nillable = true)
    protected DayOfIndex dayOfIndex;
    @XmlElement(name = "month_of_index", nillable = true)
    protected MonthOfIndex monthOfIndex;
    @XmlElement(name = "year_of_index", nillable = true)
    protected YearOfIndex yearOfIndex;
    @XmlElement(name = "days_to_index")
    protected DaysToIndex daysToIndex;
    @XmlElement(name = "bcr_canonical_check", required = true)
    protected BcrCanonicalCheck bcrCanonicalCheck;
    @XmlElement(required = true)
    protected Samples samples;
    @XmlElement(name = "hpv_test_results")
    protected HpvTestResults hpvTestResults;

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link Notes }
     *     
     */
    public Notes getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Notes }
     *     
     */
    public void setNotes(Notes value) {
        this.notes = value;
    }

    /**
     * Gets the value of the additionalStudies property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalStudies }
     *     
     */
    public AdditionalStudies getAdditionalStudies() {
        return additionalStudies;
    }

    /**
     * Sets the value of the additionalStudies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalStudies }
     *     
     */
    public void setAdditionalStudies(AdditionalStudies value) {
        this.additionalStudies = value;
    }

    /**
     * Gets the value of the alternateIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link AlternateIdentifiers }
     *     
     */
    public AlternateIdentifiers getAlternateIdentifiers() {
        return alternateIdentifiers;
    }

    /**
     * Sets the value of the alternateIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateIdentifiers }
     *     
     */
    public void setAlternateIdentifiers(AlternateIdentifiers value) {
        this.alternateIdentifiers = value;
    }

    /**
     * Gets the value of the bcrPatientBarcode property.
     * 
     * @return
     *     possible object is
     *     {@link BcrPatientBarcode }
     *     
     */
    public BcrPatientBarcode getBcrPatientBarcode() {
        return bcrPatientBarcode;
    }

    /**
     * Sets the value of the bcrPatientBarcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BcrPatientBarcode }
     *     
     */
    public void setBcrPatientBarcode(BcrPatientBarcode value) {
        this.bcrPatientBarcode = value;
    }

    /**
     * Gets the value of the bcrPatientUuid property.
     * 
     * @return
     *     possible object is
     *     {@link BcrPatientUuid }
     *     
     */
    public BcrPatientUuid getBcrPatientUuid() {
        return bcrPatientUuid;
    }

    /**
     * Sets the value of the bcrPatientUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BcrPatientUuid }
     *     
     */
    public void setBcrPatientUuid(BcrPatientUuid value) {
        this.bcrPatientUuid = value;
    }

    /**
     * Gets the value of the tissueSourceSite property.
     * 
     * @return
     *     possible object is
     *     {@link TissueSourceSite }
     *     
     */
    public TissueSourceSite getTissueSourceSite() {
        return tissueSourceSite;
    }

    /**
     * Sets the value of the tissueSourceSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link TissueSourceSite }
     *     
     */
    public void setTissueSourceSite(TissueSourceSite value) {
        this.tissueSourceSite = value;
    }

    /**
     * Gets the value of the patientId property.
     * 
     * @return
     *     possible object is
     *     {@link PatientId }
     *     
     */
    public PatientId getPatientId() {
        return patientId;
    }

    /**
     * Sets the value of the patientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatientId }
     *     
     */
    public void setPatientId(PatientId value) {
        this.patientId = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link Gender }
     *     
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gender }
     *     
     */
    public void setGender(Gender value) {
        this.gender = value;
    }

    /**
     * Gets the value of the dayOfIndex property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfIndex }
     *     
     */
    public DayOfIndex getDayOfIndex() {
        return dayOfIndex;
    }

    /**
     * Sets the value of the dayOfIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfIndex }
     *     
     */
    public void setDayOfIndex(DayOfIndex value) {
        this.dayOfIndex = value;
    }

    /**
     * Gets the value of the monthOfIndex property.
     * 
     * @return
     *     possible object is
     *     {@link MonthOfIndex }
     *     
     */
    public MonthOfIndex getMonthOfIndex() {
        return monthOfIndex;
    }

    /**
     * Sets the value of the monthOfIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthOfIndex }
     *     
     */
    public void setMonthOfIndex(MonthOfIndex value) {
        this.monthOfIndex = value;
    }

    /**
     * Gets the value of the yearOfIndex property.
     * 
     * @return
     *     possible object is
     *     {@link YearOfIndex }
     *     
     */
    public YearOfIndex getYearOfIndex() {
        return yearOfIndex;
    }

    /**
     * Sets the value of the yearOfIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link YearOfIndex }
     *     
     */
    public void setYearOfIndex(YearOfIndex value) {
        this.yearOfIndex = value;
    }

    /**
     * Gets the value of the daysToIndex property.
     * 
     * @return
     *     possible object is
     *     {@link DaysToIndex }
     *     
     */
    public DaysToIndex getDaysToIndex() {
        return daysToIndex;
    }

    /**
     * Sets the value of the daysToIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link DaysToIndex }
     *     
     */
    public void setDaysToIndex(DaysToIndex value) {
        this.daysToIndex = value;
    }

    /**
     * Gets the value of the bcrCanonicalCheck property.
     * 
     * @return
     *     possible object is
     *     {@link BcrCanonicalCheck }
     *     
     */
    public BcrCanonicalCheck getBcrCanonicalCheck() {
        return bcrCanonicalCheck;
    }

    /**
     * Sets the value of the bcrCanonicalCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link BcrCanonicalCheck }
     *     
     */
    public void setBcrCanonicalCheck(BcrCanonicalCheck value) {
        this.bcrCanonicalCheck = value;
    }

    /**
     * Gets the value of the samples property.
     * 
     * @return
     *     possible object is
     *     {@link Samples }
     *     
     */
    public Samples getSamples() {
        return samples;
    }

    /**
     * Sets the value of the samples property.
     * 
     * @param value
     *     allowed object is
     *     {@link Samples }
     *     
     */
    public void setSamples(Samples value) {
        this.samples = value;
    }

    /**
     * Gets the value of the hpvTestResults property.
     * 
     * @return
     *     possible object is
     *     {@link HpvTestResults }
     *     
     */
    public HpvTestResults getHpvTestResults() {
        return hpvTestResults;
    }

    /**
     * Sets the value of the hpvTestResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link HpvTestResults }
     *     
     */
    public void setHpvTestResults(HpvTestResults value) {
        this.hpvTestResults = value;
    }

}
