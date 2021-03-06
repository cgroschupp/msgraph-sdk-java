// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

import com.google.gson.JsonObject;
import com.google.gson.annotations.*;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Terms And Conditions Acceptance Status Collection Page.
 */
public class BaseTermsAndConditionsAcceptanceStatusCollectionPage extends BaseCollectionPage<TermsAndConditionsAcceptanceStatus, ITermsAndConditionsAcceptanceStatusCollectionRequestBuilder> implements IBaseTermsAndConditionsAcceptanceStatusCollectionPage {

    /**
     * A collection page for TermsAndConditionsAcceptanceStatus
     *
     * @param response the serialized BaseTermsAndConditionsAcceptanceStatusCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseTermsAndConditionsAcceptanceStatusCollectionPage(final BaseTermsAndConditionsAcceptanceStatusCollectionResponse response, final ITermsAndConditionsAcceptanceStatusCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
