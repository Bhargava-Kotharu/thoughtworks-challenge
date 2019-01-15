package com.thoughtworks.challenge.merchant.dto;

import java.util.List; 

public class MerchantGuide {

    List<IntergalacticInput> inputs;
    List<Answer> answers;

    public List<IntergalacticInput> getInputs() {
	return inputs;
    }

    public void setInputs(List<IntergalacticInput> inputs) {
	this.inputs = inputs;
    }

    @Override
    public String toString() {
	return "MerchantGuide [inputs=" + inputs + "]";
    }

}
