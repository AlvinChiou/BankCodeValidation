package com.account.validation;

/**
 * Created by Alvin on 2014/8/12.
 * 本程式功能為根據收到的辨識參數(saveCode)並回傳對應的銀行代碼
 */
public class BankConstant {
    private static String HEAD_BANK_A = "008";//華南銀行
    private static String HEAD_BANK_C = "004";//台灣銀行
    private static String HEAD_BANK_D = "050";//台灣中小企業銀行
    private static String HEAD_BANK_E = "006";//合作金庫
    private static String HEAD_BANK_F = "016";//高雄銀行
    private static String HEAD_BANK_H = "009";//彰化銀行
    private static String HEAD_BANK_K = "012";//台北富邦
    private static String HEAD_BANK_J = "017";//兆豐國際商業銀行
    private static String HEAD_BANK_L = "812";//台新銀行
    private static String HEAD_BANK_T = "822";//中國信託
    private static String HEAD_BANK_U = "808";//玉山銀行
    private static String HEAD_BANK_P = "700";//郵局

    public static String getHeadBank(String saveCode){
        char charCode = saveCode.toCharArray()[0];
        switch (charCode){
            case 'A':
                return HEAD_BANK_A;
            case 'C':
                return HEAD_BANK_C;
            case 'D':
                return HEAD_BANK_D;
            case 'E':
                return HEAD_BANK_E;
            case 'F':
                return HEAD_BANK_F;
            case 'H':
                return HEAD_BANK_H;
            case 'J':
                return HEAD_BANK_J;
            case 'K':
                return HEAD_BANK_K;
            case 'L':
                return HEAD_BANK_L;
            case 'T':
                return HEAD_BANK_T;
            case 'U':
                return HEAD_BANK_U;
            case 'P':
                return HEAD_BANK_P;
            default:
                return "";
        }
    }

    public static void main(String[] args) throws Exception{
        BankConstant.getHeadBank("A");
        BankConstant.getHeadBank("C");
        BankConstant.getHeadBank("D");
        BankConstant.getHeadBank("E");
        BankConstant.getHeadBank("F");
    }
}
