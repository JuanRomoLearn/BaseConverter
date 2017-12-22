package io.romo.baseconverter.util;

import java.math.BigInteger;

import io.romo.baseconverter.model.NumeralSystem;

public class BaseConverterUtils {

    public static String convertDecimalStringToBinaryString(String decimalString) {
        if (decimalString.isEmpty()) {
            return "";
        }

        BigInteger number = new BigInteger(decimalString, NumeralSystem.Decimal.getRadix());
        return number.toString(NumeralSystem.Binary.getRadix());
    }

    public static String convertDecimalStringToHexadecimalString(String decimalString) {
        if (decimalString.isEmpty()) {
            return "";
        }

        BigInteger number = new BigInteger(decimalString, NumeralSystem.Decimal.getRadix());
        return number.toString(NumeralSystem.Hexadecimal.getRadix());
    }

    public static String convertDecimalStringToOctalString(String decimalString) {
        if (decimalString.isEmpty()) {
            return "";
        }

        BigInteger number = new BigInteger(decimalString, NumeralSystem.Decimal.getRadix());
        return number.toString(NumeralSystem.Ocatal.getRadix());
    }

    public static String convertBinaryStringToDecimalString(String binaryString) {
        if (binaryString.isEmpty()) {
            return "";
        }

        BigInteger number = new BigInteger(binaryString, NumeralSystem.Binary.getRadix());
        return number.toString(NumeralSystem.Decimal.getRadix());
    }

    public static String convertBinaryStringToHexadecimalString(String binaryString) {
        if (binaryString.isEmpty()) {
            return "";
        }

        BigInteger number = new BigInteger(binaryString, NumeralSystem.Binary.getRadix());
        return number.toString(NumeralSystem.Hexadecimal.getRadix());
    }

    public static String convertBinaryStringToOctalString(String binaryString) {
        if (binaryString.isEmpty()) {
            return "";
        }

        BigInteger number = new BigInteger(binaryString, NumeralSystem.Binary.getRadix());
        return number.toString(NumeralSystem.Ocatal.getRadix());
    }

    public static String convertHexadecimalStringToDecimalString(String hexadecimalString) {
        if (hexadecimalString.isEmpty()) {
            return "";
        }

        BigInteger number = new BigInteger(hexadecimalString, NumeralSystem.Hexadecimal.getRadix());
        return number.toString(NumeralSystem.Decimal.getRadix());
    }

    public static String convertHexadecimalStringToBinaryString(String hexadecimalString) {
        if (hexadecimalString.isEmpty()) {
            return "";
        }

        BigInteger number = new BigInteger(hexadecimalString, NumeralSystem.Hexadecimal.getRadix());
        return number.toString(NumeralSystem.Binary.getRadix());
    }

    public static String convertHexadecimalStringToOctalString(String hexadecimalString) {
        if (hexadecimalString.isEmpty()) {
            return "";
        }

        BigInteger number = new BigInteger(hexadecimalString, NumeralSystem.Hexadecimal.getRadix());
        return number.toString(NumeralSystem.Ocatal.getRadix());
    }

    public static String convertOctalStringToDecimalString(String octalString) {
        if (octalString.isEmpty()) {
            return "";
        }

        BigInteger number = new BigInteger(octalString, NumeralSystem.Ocatal.getRadix());
        return number.toString(NumeralSystem.Decimal.getRadix());
    }

    public static String convertOctalStringToBinaryString(String octalString) {
        if (octalString.isEmpty()) {
            return "";
        }

        BigInteger number = new BigInteger(octalString, NumeralSystem.Ocatal.getRadix());
        return number.toString(NumeralSystem.Binary.getRadix());
    }

    public static String convertOctalStringToHexadecimalString(String octalString) {
        if (octalString.isEmpty()) {
            return "";
        }

        BigInteger number = new BigInteger(octalString, NumeralSystem.Ocatal.getRadix());
        return number.toString(NumeralSystem.Hexadecimal.getRadix());
    }
}
