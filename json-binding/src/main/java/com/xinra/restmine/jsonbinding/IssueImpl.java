package com.xinra.restmine.jsonbinding;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.xinra.restmine.api.Issue;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IssueImpl implements Issue {

}
