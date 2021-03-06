// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

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

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Chart Axis Title Request.
 */
public class BaseWorkbookChartAxisTitleRequest extends BaseRequest implements IBaseWorkbookChartAxisTitleRequest {

    /**
     * The request for the WorkbookChartAxisTitle
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseWorkbookChartAxisTitleRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<WorkbookChartAxisTitle> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the WorkbookChartAxisTitle from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WorkbookChartAxisTitle> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookChartAxisTitle from the service
     *
     * @return the WorkbookChartAxisTitle from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartAxisTitle get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this WorkbookChartAxisTitle with a source
     *
     * @param sourceWorkbookChartAxisTitle the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookChartAxisTitle sourceWorkbookChartAxisTitle, final ICallback<WorkbookChartAxisTitle> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookChartAxisTitle);
    }

    /**
     * Patches this WorkbookChartAxisTitle with a source
     *
     * @param sourceWorkbookChartAxisTitle the source object with updates
     * @return the updated WorkbookChartAxisTitle
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartAxisTitle patch(final WorkbookChartAxisTitle sourceWorkbookChartAxisTitle) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookChartAxisTitle);
    }

    /**
     * Creates a WorkbookChartAxisTitle with a new object
     *
     * @param newWorkbookChartAxisTitle the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookChartAxisTitle newWorkbookChartAxisTitle, final ICallback<WorkbookChartAxisTitle> callback) {
        send(HttpMethod.POST, callback, newWorkbookChartAxisTitle);
    }

    /**
     * Creates a WorkbookChartAxisTitle with a new object
     *
     * @param newWorkbookChartAxisTitle the new object to create
     * @return the created WorkbookChartAxisTitle
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartAxisTitle post(final WorkbookChartAxisTitle newWorkbookChartAxisTitle) throws ClientException {
        return send(HttpMethod.POST, newWorkbookChartAxisTitle);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWorkbookChartAxisTitleRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (WorkbookChartAxisTitleRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWorkbookChartAxisTitleRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (WorkbookChartAxisTitleRequest)this;
     }

}

