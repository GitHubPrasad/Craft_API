package src.test.java.POJOClasses;

public class ExtendedItemAttributesMap
{
    private Boolean isSapComplete;
    private String sellerFulfillmentId;

    public Boolean getSapComplete() {
        return isSapComplete;
    }

    public void setSapComplete(Boolean sapComplete) {
        isSapComplete = sapComplete;
    }

    public String getSellerFulfillmentId() {
        return sellerFulfillmentId;
    }

    public void setSellerFulfillmentId(String sellerFulfillmentId) {
        this.sellerFulfillmentId = sellerFulfillmentId;
    }
}
