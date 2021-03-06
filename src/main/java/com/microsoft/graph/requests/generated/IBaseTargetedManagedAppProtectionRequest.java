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
 * The interface for the Base Targeted Managed App Protection Request.
 */
public interface IBaseTargetedManagedAppProtectionRequest extends IHttpRequest {

    /**
     * Gets the TargetedManagedAppProtection from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<TargetedManagedAppProtection> callback);

    /**
     * Gets the TargetedManagedAppProtection from the service
     *
     * @return the TargetedManagedAppProtection from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TargetedManagedAppProtection get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this TargetedManagedAppProtection with a source
     *
     * @param sourceTargetedManagedAppProtection the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final TargetedManagedAppProtection sourceTargetedManagedAppProtection, final ICallback<TargetedManagedAppProtection> callback);

    /**
     * Patches this TargetedManagedAppProtection with a source
     *
     * @param sourceTargetedManagedAppProtection the source object with updates
     * @return the updated TargetedManagedAppProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TargetedManagedAppProtection patch(final TargetedManagedAppProtection sourceTargetedManagedAppProtection) throws ClientException;

    /**
     * Posts a TargetedManagedAppProtection with a new object
     *
     * @param newTargetedManagedAppProtection the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final TargetedManagedAppProtection newTargetedManagedAppProtection, final ICallback<TargetedManagedAppProtection> callback);

    /**
     * Posts a TargetedManagedAppProtection with a new object
     *
     * @param newTargetedManagedAppProtection the new object to create
     * @return the created TargetedManagedAppProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TargetedManagedAppProtection post(final TargetedManagedAppProtection newTargetedManagedAppProtection) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseTargetedManagedAppProtectionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseTargetedManagedAppProtectionRequest expand(final String value);

}

