
package com.example.fortune;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.GetRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder", date = "Mon May 14 13:19:02 PDT 2018")
public class FortunesGetRequestBuilder
    extends GetRequestBuilderBase<Long, Fortune, FortunesGetRequestBuilder>
{


    public FortunesGetRequestBuilder(String baseUriTemplate, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, Fortune.class, resourceSpec, requestOptions);
    }

}
