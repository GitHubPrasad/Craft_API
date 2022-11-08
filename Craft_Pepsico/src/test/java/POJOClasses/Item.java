package src.test.java.POJOClasses;

import java.util.ArrayList;
import java.util.List;

public class Item
{
    private String sourceOrderLineId;
    private String orderLineSequenceNo;
    private String productTypeCode;
    private String materialId;
    private Integer requestedQty;
    private String requestedQtyUom;
    private Double unitPriceAmount;
    private Double totalGrossAmount;
    private Double totalDiscountAmount;
    private Double totalTaxAmount;
    private Boolean isBundleFlag;
    private String lineItemShippingStatus;
    private String sourceProductId;
    private String createDateTime;
    private String marketPlaceSiteOrderItemId;
    private String marketPlaceSiteOrderListingId;
    private String requestedMaterialName;
    private Integer confirmedQty;
    private Double totalPromotionAmount;
    private Integer totalShippingAmount;
    private Integer totalShippingTaxAmount;
    private Double totalNetAmount;
    private Integer giftPriceAmount;
    private Integer giftTaxPriceAmount;
    private String pepMaterialId;
    private String materialCategoryCode;
    private String bundleSku;
    private String productClass;
    private List<TaxDetail> taxDetails = new ArrayList<TaxDetail>();
    private List<Object> discountDetails = new ArrayList<Object>();
    private List<Fullfillment> fullfillments = new ArrayList<Fullfillment>();
    private List<Object> bundleComponents = new ArrayList<Object>();
    private List<Object> adjustments = new ArrayList<Object>();
    private ExtendedItemAttributesMap extendedItemAttributesMap;
    private Integer unallocatedQty;












}
