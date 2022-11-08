package src.test.java.POJOClasses;

public class ExtendedAttributesMap
{
    private String distributionChannel;
    private String division;
    private Double orderLocationId;
    private String purchaseOrderType;
    private String sectorName;

    public String getDistributionChannel() {
        return distributionChannel;
    }

    public void setDistributionChannel(String distributionChannel) {
        this.distributionChannel = distributionChannel;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public Double getOrderLocationId() {
        return orderLocationId;
    }

    public void setOrderLocationId(Double orderLocationId) {
        this.orderLocationId = orderLocationId;
    }

    public String getPurchaseOrderType() {
        return purchaseOrderType;
    }

    public void setPurchaseOrderType(String purchaseOrderType) {
        this.purchaseOrderType = purchaseOrderType;
    }

    public String getSectorName() {
        return sectorName;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName;
    }
}
