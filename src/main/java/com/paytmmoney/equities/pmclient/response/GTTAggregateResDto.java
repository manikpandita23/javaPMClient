package com.paytmmoney.equities.pmclient.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.paytmmoney.equities.pmclient.constant.ApiConstants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class GTTAggregateResDto {

    @JsonProperty(ApiConstants.DATA)
    private GTTOrderDataResDto data;

    @JsonProperty(ApiConstants.META)
    private GTTMetaResDto meta;

}
