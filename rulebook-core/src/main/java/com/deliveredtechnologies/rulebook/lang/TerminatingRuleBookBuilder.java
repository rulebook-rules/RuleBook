package com.deliveredtechnologies.rulebook.lang;

import com.deliveredtechnologies.rulebook.model.RuleBook;

/**
 * Created by clong on 3/29/17.
 */
public interface TerminatingRuleBookBuilder<T> {
  RuleBook<T> build();
}