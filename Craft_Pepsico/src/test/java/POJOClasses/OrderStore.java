package src.test.java.POJOClasses;

import java.util.ArrayList;
import java.util.List;

public class OrderStore
{
    // All the below fields are on present Upper layer in JSON order payload
    private String id;
    private String type;
    private String typeVersion;
    private String orderUniqueId;
    private String receivedDateTime;
    private String modifiedById;
    private String updatedDateTime;
    private String createdDateTime;
    private String sourceOrderId;
    private String reasonDescription;
    private String statusCode;
    private String orderProcessingStatus;
    private String orderProcessingStatusReason;
    private String orderPaymentStatus;
    private String countryIsoCode;
    private String sourceSystemId;
    private String orderChannelMethodCode;
    private String shipToCustomerId;
    private String billToCustomerId;
    private String soldToCustomerId;
    private String orderTypeCode;
    private String orderSubTypeCode;
    private String privateRemarksText;
    private Integer totalRequestedQty;
    private Integer totalItemCount;
    private String orderShippingStatus;
    private Double totalGrossAmount;
    private Integer totalDiscountAmount;
    private Double totalTaxAmount;
    private Double netTotalAmount;
    private Integer consumerPaidShippingAmount;
    private Integer ConsumerPaidShippingTaxAmount;
    private String currencyCode;
    private String orderTagsText;
    private String requestedShippingMethod;
    private String requestedShippingCarrier;
    private String marketPlaceAccountId;
    private String sourceProfileId;
    private String marketPlaceSiteId;
    private String marketPlaceSiteName;
    private String marketPlaceOrderId;
    private String customerPoId;
    private String orderLocationId;
    private String estimatedShipmentDateTime;
    private String flagCode;
    private Integer headerTotalDiscountAmount;
    private Integer consumerPaidGiftTaxAmount;
    private Integer consumerPaidGiftOptionAmount;
    private Integer consumerPaidInsuranceAmount;
    private String giftTaxTypeCode;
    private String checkOutStatusCode;
    private String customerRemarksText;
    private Integer createdById;
    private String totalPromotionAmount;
    private String orderType;
    private String costCenter;
    private String orderSubStatus;
    private ExtendedAttributesMap extendedAttributesMap;
    // All the below Arrays and Objects are present on Upper layer in JSON order payload
    private List<ExtendedAttributesList> extendedAttributesList = new ArrayList<ExtendedAttributesList>();
    private ConsumerProfile consumerProfile;
    private List<Address> addresses = new ArrayList<Address>();
    private List<ConsumerPayment> consumerPayments = new ArrayList<ConsumerPayment>();
    private List<Item> items = new ArrayList<Item>();
    private List<Validation> validations = new ArrayList<Validation>();
    private List<Discount> discounts = new ArrayList<Discount>();
    private List<Adjustment> adjustments = new ArrayList<Adjustment>();




}
