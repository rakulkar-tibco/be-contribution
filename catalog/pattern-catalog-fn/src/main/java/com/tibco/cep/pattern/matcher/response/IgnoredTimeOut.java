package com.tibco.cep.pattern.matcher.response;

import java.util.Collection;

import com.tibco.cep.pattern.matcher.master.Input;
import com.tibco.cep.pattern.matcher.model.ExpectedInput;
import com.tibco.cep.pattern.matcher.model.Node;

/*
* Author: Ashwin Jayaprakash Date: Jul 27, 2009 Time: 3:12:37 PM
*/
public class IgnoredTimeOut extends UnexpectedOccurrence {
    public IgnoredTimeOut(Input trigger, Node occurredAt, Exception trace,
                          Collection<? extends ExpectedInput> expectations) {
        super(trigger, occurredAt, trace, expectations);
    }

    public IgnoredTimeOut(Input trigger, Node occurredAt, Exception trace,
                          ExpectedInput... expectations) {
        super(trigger, occurredAt, trace, expectations);
    }
}
