// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsXirrRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Xirr Request Builder.
 */
public class WorkbookFunctionsXirrRequestBuilder extends BaseWorkbookFunctionsXirrRequestBuilder implements IWorkbookFunctionsXirrRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsXirr
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param values the values
     * @param dates the dates
     * @param guess the guess
     */
    public WorkbookFunctionsXirrRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement values, final com.google.gson.JsonElement dates, final com.google.gson.JsonElement guess) {
        super(requestUrl, client, requestOptions, values, dates, guess);
    }
}
