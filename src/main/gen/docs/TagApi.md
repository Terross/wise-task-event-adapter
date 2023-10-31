# TagApi

All URIs are relative to *http://localhost:8085*

Method | HTTP request | Description
------------- | ------------- | -------------
[**handleConstructorSolutionEvent**](TagApi.md#handleConstructorSolutionEvent) | **POST** /event/graph/constructor/solution | Getting a graph editing event when solving a problem


<a name="handleConstructorSolutionEvent"></a>
# **handleConstructorSolutionEvent**
> handleConstructorSolutionEvent(body)

Getting a graph editing event when solving a problem

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TagApi()
val body : kotlin.Any =  // kotlin.Any | 
try {
    apiInstance.handleConstructorSolutionEvent(body)
} catch (e: ClientException) {
    println("4xx response calling TagApi#handleConstructorSolutionEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagApi#handleConstructorSolutionEvent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **kotlin.Any**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

