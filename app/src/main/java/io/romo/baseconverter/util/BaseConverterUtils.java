package io.romo.baseconverter.util;

import java.math.BigInteger;

import io.romo.baseconverter.model.NumeralSystem;

public class BaseConverterUtils {

    public static String convertNumberBase(String numberString, NumeralSystem currentBase, NumeralSystem desiredBase) {
        /*
        BigInteger does not accept empty strings and will throw an exception
        so its necessary to check the number's status before instantiating a BigInteger instance.
        */
        if (numberString.isEmpty()) {
            return "";
        }

        BigInteger number = new BigInteger(numberString, currentBase.getRadix());

        return number.toString(desiredBase.getRadix());
    }
}
