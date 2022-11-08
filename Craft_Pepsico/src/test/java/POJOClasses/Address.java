package src.test.java.POJOClasses;

public class Address
{
    private String addressType;
    private String firstName;
    private String lastName;
    private String suffixName;
    private String addressLine1;
    private String addressLine2;
    private String cityName;
    private String stateOrProvinceCode;
    private String getStateOrProvinceName;
    private String postalArea;
    private String countryIsoName;
    private String daytimeTelephoneNumber;
    private String deliveryInstructions;

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuffixName() {
        return suffixName;
    }

    public void setSuffixName(String suffixName) {
        this.suffixName = suffixName;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateOrProvinceCode() {
        return stateOrProvinceCode;
    }

    public void setStateOrProvinceCode(String stateOrProvinceCode) {
        this.stateOrProvinceCode = stateOrProvinceCode;
    }

    public String getGetStateOrProvinceName() {
        return getStateOrProvinceName;
    }

    public void setGetStateOrProvinceName(String getStateOrProvinceName) {
        this.getStateOrProvinceName = getStateOrProvinceName;
    }

    public String getPostalArea() {
        return postalArea;
    }

    public void setPostalArea(String postalArea) {
        this.postalArea = postalArea;
    }

    public String getCountryIsoName() {
        return countryIsoName;
    }

    public void setCountryIsoName(String countryIsoName) {
        this.countryIsoName = countryIsoName;
    }

    public String getDaytimeTelephoneNumber() {
        return daytimeTelephoneNumber;
    }

    public void setDaytimeTelephoneNumber(String daytimeTelephoneNumber) {
        this.daytimeTelephoneNumber = daytimeTelephoneNumber;
    }

    public String getDeliveryInstructions() {
        return deliveryInstructions;
    }

    public void setDeliveryInstructions(String deliveryInstructions) {
        this.deliveryInstructions = deliveryInstructions;
    }
}
