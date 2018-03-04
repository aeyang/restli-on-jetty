
package com.example.fortune;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.GetRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder", date = "Sun Mar 04 14:30:21 PST 2018")
public class FortunesGetRequestBuilder
    extends GetRequestBuilderBase<Long, Fortune, FortunesGetRequestBuilder>
{


    public FortunesGetRequestBuilder(String baseUriTemplate, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, Fortune.class, resourceSpec, requestOptions);
    }

}
