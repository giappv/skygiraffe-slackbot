
package com.sg.model.slackRs.detail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "fields",
    "text",
    "fallback",
    "callback_id",
    "color",
    "attachment_type",
    "actions"
})
public class Attachment {

    @JsonProperty("fields")
    private List<Field> fields = new ArrayList<Field>();
    @JsonProperty("text")
    private String text;
    @JsonProperty("fallback")
    private String fallback;
    @JsonProperty("callback_id")
    private String callbackId;
    @JsonProperty("color")
    private String color;
    @JsonProperty("attachment_type")
    private String attachmentType;
    @JsonProperty("actions")
    private List<Action> actions = new ArrayList<Action>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The fields
     */
    @JsonProperty("fields")
    public List<Field> getFields() {
        return fields;
    }

    /**
     * 
     * @param fields
     *     The fields
     */
    @JsonProperty("fields")
    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    /**
     * 
     * @return
     *     The text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 
     * @return
     *     The fallback
     */
    @JsonProperty("fallback")
    public String getFallback() {
        return fallback;
    }

    /**
     * 
     * @param fallback
     *     The fallback
     */
    @JsonProperty("fallback")
    public void setFallback(String fallback) {
        this.fallback = fallback;
    }

    /**
     * 
     * @return
     *     The callbackId
     */
    @JsonProperty("callback_id")
    public String getCallbackId() {
        return callbackId;
    }

    /**
     * 
     * @param callbackId
     *     The callback_id
     */
    @JsonProperty("callback_id")
    public void setCallbackId(String callbackId) {
        this.callbackId = callbackId;
    }

    /**
     * 
     * @return
     *     The color
     */
    @JsonProperty("color")
    public String getColor() {
        return color;
    }

    /**
     * 
     * @param color
     *     The color
     */
    @JsonProperty("color")
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 
     * @return
     *     The attachmentType
     */
    @JsonProperty("attachment_type")
    public String getAttachmentType() {
        return attachmentType;
    }

    /**
     * 
     * @param attachmentType
     *     The attachment_type
     */
    @JsonProperty("attachment_type")
    public void setAttachmentType(String attachmentType) {
        this.attachmentType = attachmentType;
    }

    /**
     * 
     * @return
     *     The actions
     */
    @JsonProperty("actions")
    public List<Action> getActions() {
        return actions;
    }

    /**
     * 
     * @param actions
     *     The actions
     */
    @JsonProperty("actions")
    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
