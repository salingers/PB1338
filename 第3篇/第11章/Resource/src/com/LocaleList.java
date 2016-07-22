package com;

import java.util.Locale;

public class LocaleList {
	public static void main(String[] args) {
		Locale[] localeList = Locale.getAvailableLocales();
		for (int i = 0; i < localeList.length; i++)
			// �C�L�X�Ҥ䴩����a�M�y�t
			System.out.println(localeList[i].getDisplayCountry() + "="
					+ localeList[i].getCountry() + " "
					+ localeList[i].getDisplayLanguage() + "="
					+ localeList[i].getLanguage());
	}
}
