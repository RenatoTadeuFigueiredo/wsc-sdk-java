/*
 * This code and all components © 2015 - 2019 Wowza Media Systems, LLC. All rights reserved.
 * This code is licensed pursuant to the BSD 3-Clause License.
 * 
 * Wowza Streaming Cloud REST API Reference Documentation
 *
 * OpenAPI spec version: v1.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.wowza.cloudsdk.client.api;

import com.wowza.cloudsdk.client.ApiCallback;
import com.wowza.cloudsdk.client.ApiClient;
import com.wowza.cloudsdk.client.ApiException;
import com.wowza.cloudsdk.client.ApiResponse;
import com.wowza.cloudsdk.client.Configuration;
import com.wowza.cloudsdk.client.Pair;
import com.wowza.cloudsdk.client.ProgressRequestBody;
import com.wowza.cloudsdk.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import com.wowza.cloudsdk.client.model.Recording;
import com.wowza.cloudsdk.client.model.Recordings;
import com.wowza.cloudsdk.client.model.RecordingCreateState;
import com.wowza.cloudsdk.client.model.RecordingCreateInput;
import com.wowza.cloudsdk.client.model.RecordingState;
import com.wowza.cloudsdk.client.model.IndexRecordings;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecordingsApi {
    private ApiClient apiClient;

    public RecordingsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RecordingsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteRecording
     * @param id The unique alphanumeric string that identifies the recording. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call deleteRecordingCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/recordings/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "wsc-access-key", "wsc-api-key", "wsc-signature", "wsc-timestamp" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private Call deleteRecordingValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteRecording(Async)");
        }
        

        Call call = deleteRecordingCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete a recording
     * This operation deletes a recording.
     * @param id The unique alphanumeric string that identifies the recording. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteRecording(String id) throws ApiException {
        deleteRecordingWithHttpInfo(id);
    }

    /**
     * Delete a recording
     * This operation deletes a recording.
     * @param id The unique alphanumeric string that identifies the recording. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteRecordingWithHttpInfo(String id) throws ApiException {
        Call call = deleteRecordingValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete a recording (asynchronously)
     * This operation deletes a recording.
     * @param id The unique alphanumeric string that identifies the recording. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call deleteRecordingAsync(String id, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        Call call = deleteRecordingValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for listRecordings
     * @param page Returns a paginated view of results from the HTTP request. Specify a positive integer to indicate which page of the results should be displayed. The default is &lt;strong&gt;1&lt;/strong&gt;.&lt;br /&gt;&lt;br /&gt;For more information and examples, see &lt;a href&#x3D;&#39;https://www.wowza.com/docs/how-to-get-paginated-query-results-with-the-wowza-streaming-cloud-rest-api&#39; target&#x3D;&#39;_blank&#39;&gt;Get paginated query results with the Wowza Streaming Cloud REST API&lt;/a&gt;. (optional)
     * @param perPage For use with the &lt;em&gt;page&lt;/em&gt; parameter. Indicates how many records should be included in a page of results. A valid value is any positive integer. The default and maximum value is &lt;strong&gt;1000&lt;/strong&gt;. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call listRecordingsCall(Integer page, Integer perPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/recordings";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (perPage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("per_page", perPage));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "wsc-access-key", "wsc-api-key", "wsc-signature", "wsc-timestamp" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private Call listRecordingsValidateBeforeCall(Integer page, Integer perPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        Call call = listRecordingsCall(page, perPage, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Fetch all recordings
     * This operation shows limited details for all of your recordings. For detailed information, fetch a single recording.
     * @param page Returns a paginated view of results from the HTTP request. Specify a positive integer to indicate which page of the results should be displayed. The default is &lt;strong&gt;1&lt;/strong&gt;.&lt;br /&gt;&lt;br /&gt;For more information and examples, see &lt;a href&#x3D;&#39;https://www.wowza.com/docs/how-to-get-paginated-query-results-with-the-wowza-streaming-cloud-rest-api&#39; target&#x3D;&#39;_blank&#39;&gt;Get paginated query results with the Wowza Streaming Cloud REST API&lt;/a&gt;. (optional)
     * @param perPage For use with the &lt;em&gt;page&lt;/em&gt; parameter. Indicates how many records should be included in a page of results. A valid value is any positive integer. The default and maximum value is &lt;strong&gt;1000&lt;/strong&gt;. (optional)
     * @return List
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<IndexRecordings> listRecordings(Integer page, Integer perPage) throws ApiException {
        Recordings resp = listRecordingsTransport(page, perPage);
        return resp.getRecordings();
    }

    /**
     * Fetch all recordings - Transport Wrapped
     * This operation shows limited details for all of your recordings. For detailed information, fetch a single recording.
     * @param page Returns a paginated view of results from the HTTP request. Specify a positive integer to indicate which page of the results should be displayed. The default is &lt;strong&gt;1&lt;/strong&gt;.&lt;br /&gt;&lt;br /&gt;For more information and examples, see &lt;a href&#x3D;&#39;https://www.wowza.com/docs/how-to-get-paginated-query-results-with-the-wowza-streaming-cloud-rest-api&#39; target&#x3D;&#39;_blank&#39;&gt;Get paginated query results with the Wowza Streaming Cloud REST API&lt;/a&gt;. (optional)
     * @param perPage For use with the &lt;em&gt;page&lt;/em&gt; parameter. Indicates how many records should be included in a page of results. A valid value is any positive integer. The default and maximum value is &lt;strong&gt;1000&lt;/strong&gt;. (optional)
     * @return Recordings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Recordings listRecordingsTransport(Integer page, Integer perPage) throws ApiException {
        ApiResponse<Recordings> resp = listRecordingsWithHttpInfo(page, perPage);
        return resp.getData();
    }

    /**
     * Fetch all recordings
     * This operation shows limited details for all of your recordings. For detailed information, fetch a single recording.
     * @param page Returns a paginated view of results from the HTTP request. Specify a positive integer to indicate which page of the results should be displayed. The default is &lt;strong&gt;1&lt;/strong&gt;.&lt;br /&gt;&lt;br /&gt;For more information and examples, see &lt;a href&#x3D;&#39;https://www.wowza.com/docs/how-to-get-paginated-query-results-with-the-wowza-streaming-cloud-rest-api&#39; target&#x3D;&#39;_blank&#39;&gt;Get paginated query results with the Wowza Streaming Cloud REST API&lt;/a&gt;. (optional)
     * @param perPage For use with the &lt;em&gt;page&lt;/em&gt; parameter. Indicates how many records should be included in a page of results. A valid value is any positive integer. The default and maximum value is &lt;strong&gt;1000&lt;/strong&gt;. (optional)
     * @return ApiResponse&lt;Recordings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Recordings> listRecordingsWithHttpInfo(Integer page, Integer perPage) throws ApiException {
        Call call = listRecordingsValidateBeforeCall(page, perPage, null, null);
        Type localVarReturnType = new TypeToken<Recordings>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Fetch all recordings (asynchronously)
     * This operation shows limited details for all of your recordings. For detailed information, fetch a single recording.
     * @param page Returns a paginated view of results from the HTTP request. Specify a positive integer to indicate which page of the results should be displayed. The default is &lt;strong&gt;1&lt;/strong&gt;.&lt;br /&gt;&lt;br /&gt;For more information and examples, see &lt;a href&#x3D;&#39;https://www.wowza.com/docs/how-to-get-paginated-query-results-with-the-wowza-streaming-cloud-rest-api&#39; target&#x3D;&#39;_blank&#39;&gt;Get paginated query results with the Wowza Streaming Cloud REST API&lt;/a&gt;. (optional)
     * @param perPage For use with the &lt;em&gt;page&lt;/em&gt; parameter. Indicates how many records should be included in a page of results. A valid value is any positive integer. The default and maximum value is &lt;strong&gt;1000&lt;/strong&gt;. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call listRecordingsAsync(Integer page, Integer perPage, final ApiCallback<Recordings> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        Call call = listRecordingsValidateBeforeCall(page, perPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Recordings>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for showRecording
     * @param id The unique alphanumeric string that identifies the recording. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call showRecordingCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/recordings/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "wsc-access-key", "wsc-api-key", "wsc-signature", "wsc-timestamp" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private Call showRecordingValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling showRecording(Async)");
        }
        

        Call call = showRecordingCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Fetch a recording
     * This operation shows the details of a specific recording.
     * @param id The unique alphanumeric string that identifies the recording. (required)
     * @return Recording
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Recording showRecording(String id) throws ApiException {
        RecordingCreateInput output = showRecordingTransport(id);
        return output.getRecording();
    }

    /**
     * Fetch a recording - Transport Wrapped
     * This operation shows the details of a specific recording.
     * @param id The unique alphanumeric string that identifies the recording. (required)
     * @return RecordingCreateInput
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RecordingCreateInput showRecordingTransport(String id) throws ApiException {
        ApiResponse<RecordingCreateInput> resp = showRecordingWithHttpInfo(id);
        return resp.getData();
    }


    /**
     * Fetch a recording
     * This operation shows the details of a specific recording.
     * @param id The unique alphanumeric string that identifies the recording. (required)
     * @return ApiResponse&lt;RecordingCreateInput&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RecordingCreateInput> showRecordingWithHttpInfo(String id) throws ApiException {
        Call call = showRecordingValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<RecordingCreateInput>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Fetch a recording (asynchronously)
     * This operation shows the details of a specific recording.
     * @param id The unique alphanumeric string that identifies the recording. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call showRecordingAsync(String id, final ApiCallback<RecordingCreateInput> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        Call call = showRecordingValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RecordingCreateInput>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for showRecordingState
     * @param id The unique alphanumeric string that identifies the recording. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public Call showRecordingStateCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/recordings/{id}/state"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "wsc-access-key", "wsc-api-key", "wsc-signature", "wsc-timestamp" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private Call showRecordingStateValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling showRecordingState(Async)");
        }
        

        Call call = showRecordingStateCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Fetch the state of a recording
     * This operation shows the current state of a recording.
     * @param id The unique alphanumeric string that identifies the recording. (required)
     * @return RecordingState
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RecordingState showRecordingState(String id) throws ApiException {
        RecordingCreateState resp = showRecordingStateTransport(id);
        return resp.getRecordingState();
    }

    /**
     * Fetch the state of a recording - Transport Wrapped 
     * This operation shows the current state of a recording.
     * @param id The unique alphanumeric string that identifies the recording. (required)
     * @return RecordingCreateState
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RecordingCreateState showRecordingStateTransport(String id) throws ApiException {
        ApiResponse<RecordingCreateState> resp = showRecordingStateWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Fetch the state of a recording
     * This operation shows the current state of a recording.
     * @param id The unique alphanumeric string that identifies the recording. (required)
     * @return ApiResponse&lt;RecordingCreateState&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RecordingCreateState> showRecordingStateWithHttpInfo(String id) throws ApiException {
        Call call = showRecordingStateValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<RecordingCreateState>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Fetch the state of a recording (asynchronously)
     * This operation shows the current state of a recording.
     * @param id The unique alphanumeric string that identifies the recording. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public Call showRecordingStateAsync(String id, final ApiCallback<RecordingCreateState> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        Call call = showRecordingStateValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RecordingCreateState>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
