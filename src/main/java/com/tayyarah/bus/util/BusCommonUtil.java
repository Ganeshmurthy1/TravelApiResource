package com.tayyarah.bus.util;

import java.math.BigDecimal;
import java.util.Map;
import org.apache.log4j.Logger;

import com.tayyarah.common.dao.MoneyExchangeDao;
import com.tayyarah.common.model.CurrencyConversionMap;
import com.tayyarah.esmart.bus.util.EsmartBusConfig;




public class BusCommonUtil {
	public static final Logger logger = Logger.getLogger(BusCommonUtil.class);

	public static CurrencyConversionMap buildCurrencyConversionMap(String currency,
			MoneyExchangeDao moneydao) {

		/// Get Default API Currency
		CurrencyConversionMap currencyConversionMap = new CurrencyConversionMap();
		String apiCurrency = EsmartBusConfig.DEFAULT_CURRENCY;
		currencyConversionMap.setApiCurrency(apiCurrency);
		Map<String, Double> currencyrate = null;
		try {			
			currencyrate = moneydao.getCurrencyRate(currency, apiCurrency);
		} catch (Exception e) {
			e.printStackTrace();
			throw new BusException(ErrorCodeCustomerEnum.Exception,BusErrorMessages.NO_BUSAVAILABLE.getErrorMessage());
		}
		currencyConversionMap.setCurrencyrate(currencyrate);
		Double currencyValue =   currencyrate.get("value");
		BigDecimal curValue = new BigDecimal(currencyValue);
		currencyConversionMap.setCurrencyValue(currencyValue);
		currencyConversionMap.setCurValue(curValue);
		Map<String, Double> currencyrateNow = null;
		try {			
			currencyrateNow =  moneydao.getCurrencyRate(currency, apiCurrency);
		} catch (Exception e) {
			logger.error(e);
			throw new BusException(ErrorCodeCustomerEnum.Exception,BusErrorMessages.NO_BUSAVAILABLE.getErrorMessage());
		}
		currencyConversionMap.setCurrencyrate1(currencyrateNow);
		Double currencyValueNow = currencyrateNow.get("value");
		currencyConversionMap.setCurrencyValue1(currencyValueNow);
		return currencyConversionMap;
	}

	
}
