package mage.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import mage.constants.SubType;

public class SubTypeList extends ArrayList<SubType> {

    @Deprecated
    public boolean addAll(List<String> subtypes) {
        return addAll(subtypes.stream()
                              .map(SubType::byDescription)
                              .collect(Collectors.toList()));
    }

    @Deprecated
    public boolean removeAll(List<String> subtypes){
        return removeAll(subtypes.stream()
                                 .map(SubType::byDescription)
                                 .collect(Collectors.toList()));
    }


    public boolean add(SubType... subTypes) {
        return Collections.addAll(this, subTypes);
    }

    public boolean removeAll(SubType... subTypes) {
        return super.removeAll(Arrays.stream(subTypes)
                                     .collect(Collectors.toList()));
    }

    @Deprecated
    public boolean add(String s) {
        return add(SubType.byDescription(s));
    }

    @Deprecated
    public boolean contains(String s) {
        return contains(SubType.byDescription(s));
    }
}
