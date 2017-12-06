package com.api.bulk.download.invoice.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.bulk.emp.dao.BulkInvoicePdfDao;
import com.resources.utility.FolderZiper;
import com.resources.utility.ResourceUtility;
import com.tayyarah.bus.dao.BusCreditNoteDao;
import com.tayyarah.bus.dao.BusOrderRowEmailDao;
import com.tayyarah.bus.entity.BusOrderRow;
import com.tayyarah.car.dao.CarCreditNoteDao;
import com.tayyarah.car.dao.CarOrderRowEmailDao;
import com.tayyarah.car.entity.CarOrderRow;
import com.tayyarah.common.dao.RmConfigDetailDAO;
import com.tayyarah.common.util.HTMLtoPDFConvertor;
import com.tayyarah.common.util.ResponseHeader;
import com.tayyarah.company.dao.CompanyDao;
import com.tayyarah.company.entity.Company;
import com.tayyarah.email.dao.AllEmailDao;
import com.tayyarah.email.dao.EmailDao;
import com.tayyarah.email.dao.EmailNotificationDao;
import com.tayyarah.email.dao.FlightOrderRowEmailDao;
import com.tayyarah.email.entity.model.Email;
import com.tayyarah.email.helper.BusEmailHelper;
import com.tayyarah.email.helper.CarEmailHelper;
import com.tayyarah.email.helper.FlightEmailHelper;
import com.tayyarah.email.helper.HotelEmailHelper;
import com.tayyarah.email.helper.InsuranceEmailHelper;
import com.tayyarah.email.helper.MiscellaneousEmailHelper;
import com.tayyarah.email.helper.TrainEmailHelper;
import com.tayyarah.email.helper.VisaEmailHelper;
import com.tayyarah.flight.dao.FlightCreditNoteDao;
import com.tayyarah.flight.entity.FlightOrderRow;
import com.tayyarah.flight.model.FlightInvoiceData;
import com.tayyarah.flight.quotation.dao.FlightTravelRequestDao;
import com.tayyarah.hotel.dao.HotelCreditNoteDao;
import com.tayyarah.hotel.dao.HotelOrderRowEmailDao;
import com.tayyarah.hotel.dao.HotelSearchRoomDetailDao;
import com.tayyarah.hotel.entity.HotelOrderRow;
import com.tayyarah.hotel.quotation.dao.HotelOfflineBookingDao;
import com.tayyarah.hotel.quotation.dao.HotelTravelRequestDao;
import com.tayyarah.insurance.dao.InsuranceCreditNoteDao;
import com.tayyarah.insurance.dao.InsuranceOrderRowEmailDao;
import com.tayyarah.insurance.entity.InsuranceOrderRow;
import com.tayyarah.misellaneous.dao.MiscellaneousCreditNoteDao;
import com.tayyarah.misellaneous.dao.MiscellaneousOrderRowEmailDao;
import com.tayyarah.misellaneous.entity.MiscellaneousOrderRow;
import com.tayyarah.services.EmailContentService;
import com.tayyarah.services.EmailService;
import com.tayyarah.services.PdfService;
import com.tayyarah.train.dao.TrainCreditNoteDao;
import com.tayyarah.train.dao.TrainOrderRowEmailDao;
import com.tayyarah.train.entity.TrainOrderRow;
import com.tayyarah.visa.dao.VisaCreditNoteDao;
import com.tayyarah.visa.dao.VisaOrderRowEmailDao;
import com.tayyarah.visa.entity.VisaOrderRow;
@RestController
@RequestMapping(value = "/BulkInvoice")
public class BulkInvoiceDownloadController {
	public static final Logger logger = Logger.getLogger(BulkInvoiceDownloadController.class);
	@Autowired
	FlightOrderRowEmailDao flightOrderRowEmailDao;
	@Autowired
	BusOrderRowEmailDao busOrderRowEmailDao;
	@Autowired
	CarOrderRowEmailDao carOrderRowEmailDao;
	@Autowired
	TrainOrderRowEmailDao trainOrderRowEmailDao;
	@Autowired
	VisaOrderRowEmailDao visaOrderRowEmailDao;
	@Autowired
	InsuranceOrderRowEmailDao insuranceOrderRowEmailDao;
	@Autowired
	AllEmailDao allEmailDao;
	@Autowired
	EmailDao emailDao;
	@Autowired
	FlightInvoiceData pricebreakup;
	@Autowired
	private PdfService pdfService;
	@Autowired
	ServletContext servletContext;
	@Autowired
	ApplicationContext applicationContext;
	@Autowired
	private EmailContentService emailContentService;
	@Autowired
	FlightInvoiceData flightInvoiceData;
	@Autowired
	HotelOrderRowEmailDao hotelOrderId;
	@Autowired
	HotelTravelRequestDao hotelTravelRequestDao;
	@Autowired
	FlightTravelRequestDao flightTravelRequestDao;
	@Autowired
	HotelOfflineBookingDao hotelOfflineBookingDao;
	@Autowired
	HotelSearchRoomDetailDao hotelSearchRoomDetailDao;
	@Autowired
	RmConfigDetailDAO rmConfigDetailDAO;
	@Autowired
	private EmailService emailService;
	@Autowired
	EmailNotificationDao emailNotificationDao;
	@Autowired
	FlightCreditNoteDao flightCreditNoteDao;
	@Autowired
	HotelCreditNoteDao hotelCreditNoteDao;
	@Autowired
	CarCreditNoteDao carCreditNoteDao;
	@Autowired
	TrainCreditNoteDao trainCreditNoteDao;
	@Autowired
	BusCreditNoteDao busCreditNoteDao;
	@Autowired
	InsuranceCreditNoteDao insuranceCreditNoteDao;
	@Autowired
	VisaCreditNoteDao visaCreditNoteDao;
	@Autowired
	CompanyDao companyDao; 
	@Autowired
	HotelOrderRowEmailDao hotelOrderRowEmailDao;
	@Autowired
	FlightEmailHelper flightEmailHelper;
	@Autowired
	HotelEmailHelper hotelEmailHelper;
	@Autowired
	CarEmailHelper carEmailHelper;
	@Autowired
	BusEmailHelper busEmailHelper;
	@Autowired
	TrainEmailHelper trainEmailHelper;
	@Autowired
	VisaEmailHelper visaEmailHelper;
	@Autowired
	InsuranceEmailHelper insuranceEmailHelper;	
	@Autowired
	MiscellaneousEmailHelper miscellaneousEmailHelper;
	@Autowired
	MiscellaneousOrderRowEmailDao miscellaneousOrderRowEmailDao;	
	@Autowired
	MiscellaneousCreditNoteDao miscellaneousCreditNoteDao;
	@Autowired
	BulkInvoicePdfDao bulkInvoicePdfDaoImpl;
	@RequestMapping(value = "/SinglePdf", method = RequestMethod.GET)
	public void downloadSingleBulkPdfFile(@RequestParam String travelType ,@RequestParam  String  fromDate,@RequestParam  String toDate,@RequestParam boolean isZipFile,@RequestParam boolean isSinglePdf,HttpServletRequest request, HttpServletResponse response){
		ResponseHeader.setPostResponse(response);
		try{
			String srcFolder =HTMLtoPDFConvertor.getLogDir();
			final Locale locale= LocaleContextHolder.getLocale();
			if(travelType!=null && !travelType.equals("")){
				List<File> pdffiles = new ArrayList<File>();
				switch (travelType) {
				case "F":
					List<FlightOrderRow> flightOrderRowList= bulkInvoicePdfDaoImpl.getFlightOrderRowList(fromDate, toDate);
					buildDeletePdfFilesByType(srcFolder, travelType, isZipFile, isSinglePdf);
					if (flightOrderRowList != null && flightOrderRowList.size() > 0) {
						for (FlightOrderRow flightOrderRow:flightOrderRowList) {
							if(flightOrderRow!=null && flightOrderRow.getOrderId()!=null){
								Company company=companyDao.getCompany(Integer.parseInt(flightOrderRow.getCompanyId()));
								if(company!=null && company.getCompanyRole()!=null && company.getCompanyRole().isCorporate()){
									Email email =  buildEmailData(flightOrderRow.getOrderId());
									String htmlContent = flightEmailHelper.sendFlightOffline_OnlineInvoice(false, email, request, response, locale,flightOrderRowEmailDao,flightInvoiceData,emailDao,emailService,emailNotificationDao,allEmailDao,applicationContext,servletContext,emailContentService,rmConfigDetailDAO);
									if(htmlContent!=null) 
										buildPdfFile(isZipFile, isSinglePdf, srcFolder, travelType, pdffiles, htmlContent);
								}
							}
						}
					}
					break;
				case "H":
					List<HotelOrderRow> hotelOrderRowList= bulkInvoicePdfDaoImpl.getHotelOrderRowList(fromDate, toDate);
					buildDeletePdfFilesByType(srcFolder, travelType, isZipFile, isSinglePdf);
					if (hotelOrderRowList != null && hotelOrderRowList.size() > 0) {
						for (HotelOrderRow hotelOrderRow:hotelOrderRowList) {
							if(hotelOrderRow!=null && hotelOrderRow.getOrderReference()!=null){
								Company company=companyDao.getCompany(Integer.parseInt(hotelOrderRow.getCompanyId()));
								if(company!=null && company.getCompanyRole()!=null && company.getCompanyRole().isCorporate()){
									Email email =  buildEmailData(hotelOrderRow.getOrderReference());
									String htmlContent = hotelEmailHelper.sendHotelOffline_OnlineInvoice(email, request, response, locale,hotelSearchRoomDetailDao,hotelTravelRequestDao,hotelOrderRowEmailDao,emailDao,emailService,emailNotificationDao,allEmailDao,applicationContext,servletContext,emailContentService,rmConfigDetailDAO);
									if(htmlContent!=null) 
										buildPdfFile(isZipFile, isSinglePdf, srcFolder, travelType, pdffiles, htmlContent);
								}
							}
						}
					}
					break;
				case "B":
					List<BusOrderRow> busOrderRowList= bulkInvoicePdfDaoImpl.getBusOrderRowList(fromDate, toDate);
					buildDeletePdfFilesByType(srcFolder, travelType, isZipFile, isSinglePdf);
					if (busOrderRowList != null && busOrderRowList.size() > 0) {
						for (BusOrderRow busOrderRow:busOrderRowList) {
							if(busOrderRow!=null && busOrderRow.getOrderId()!=null){
								Company company=companyDao.getCompany(Integer.parseInt(busOrderRow.getCompanyId()));
								if(company!=null && company.getCompanyRole()!=null && company.getCompanyRole().isCorporate()){
									Email email =  buildEmailData(busOrderRow.getOrderId());
									String htmlContent = busEmailHelper.sendBusEmail(email, request, response, locale,busOrderRowEmailDao,emailDao,emailService,emailNotificationDao,allEmailDao,applicationContext,servletContext,emailContentService,rmConfigDetailDAO);
									if(htmlContent!=null) 
										buildPdfFile(isZipFile, isSinglePdf, srcFolder, travelType, pdffiles, htmlContent);
								}
							}
						}
					}
					break;
				case "C":
					List<CarOrderRow> carOrderRowList= bulkInvoicePdfDaoImpl.getCarOrderRowList(fromDate, toDate);
					buildDeletePdfFilesByType(srcFolder, travelType, isZipFile, isSinglePdf);
					if (carOrderRowList != null && carOrderRowList.size() > 0) {
						for (CarOrderRow carOrderRow:carOrderRowList) {
							if(carOrderRow!=null && carOrderRow.getOrderId()!=null){
								Company company=companyDao.getCompany(Integer.parseInt(carOrderRow.getCompanyId()));
								if(company!=null && company.getCompanyRole()!=null && company.getCompanyRole().isCorporate()){
									Email email =  buildEmailData(carOrderRow.getOrderId());
									String 	htmlContent = carEmailHelper.sendCarInvoiceEmail(email, request, response, locale,carOrderRowEmailDao,emailDao,emailService,emailNotificationDao,allEmailDao,applicationContext,servletContext,emailContentService,rmConfigDetailDAO);
									if(htmlContent!=null) 
										buildPdfFile(isZipFile, isSinglePdf, srcFolder, travelType, pdffiles, htmlContent);
								}
							}
						}
					}
					break;
				case "T":
					List<TrainOrderRow> trainOrderRowList= bulkInvoicePdfDaoImpl.getTrainOrderRowList(fromDate, toDate);
					buildDeletePdfFilesByType(srcFolder, travelType, isZipFile, isSinglePdf);
					if (trainOrderRowList != null && trainOrderRowList.size() > 0) {
						for (TrainOrderRow trainOrderRow:trainOrderRowList) {
							if(trainOrderRow!=null && trainOrderRow.getOrderId()!=null){
								Company company=companyDao.getCompany(Integer.parseInt(trainOrderRow.getCompanyId()));
								if(company!=null && company.getCompanyRole()!=null && company.getCompanyRole().isCorporate()){
									Email email =  buildEmailData(trainOrderRow.getOrderId());
									String htmlContent = trainEmailHelper.sendTrainInvoiceEmail(email, request, response, locale,trainOrderRowEmailDao,emailDao,emailService,emailNotificationDao,allEmailDao,applicationContext,servletContext,emailContentService,rmConfigDetailDAO);
									if(htmlContent!=null) 
										buildPdfFile(isZipFile, isSinglePdf, srcFolder, travelType, pdffiles, htmlContent);
								}
							}
						}
					}
					break;
				case "V":
					List<VisaOrderRow> visaOrderRowList= bulkInvoicePdfDaoImpl.getVisaOrderRowList(fromDate, toDate);
					buildDeletePdfFilesByType(srcFolder, travelType, isZipFile, isSinglePdf);
					if (visaOrderRowList != null && visaOrderRowList.size() > 0) {
						for (VisaOrderRow visaOrderRow:visaOrderRowList) {
							if(visaOrderRow!=null && visaOrderRow.getOrderId()!=null){
								Company company=companyDao.getCompany(Integer.parseInt(visaOrderRow.getCompanyId()));
								if(company!=null && company.getCompanyRole()!=null && company.getCompanyRole().isCorporate()){
									Email email =  buildEmailData(visaOrderRow.getOrderId());
									String htmlContent = visaEmailHelper.sendVisaInvoiceEmail(email, request, response, locale,visaOrderRowEmailDao,emailDao,emailService,emailNotificationDao,allEmailDao,applicationContext,servletContext,emailContentService,rmConfigDetailDAO);
									if(htmlContent!=null) 
										buildPdfFile(isZipFile, isSinglePdf, srcFolder, travelType, pdffiles, htmlContent);
								}
							}
						}
					}
					break;
				case "I":
					List<InsuranceOrderRow> insuranceOrderRowList= bulkInvoicePdfDaoImpl.getInsuranceOrderRowList(fromDate, toDate);
					buildDeletePdfFilesByType(srcFolder, travelType, isZipFile, isSinglePdf);
					if (insuranceOrderRowList != null && insuranceOrderRowList.size()>0) {
						for (InsuranceOrderRow insuranceOrderRow:insuranceOrderRowList) {
							if(insuranceOrderRow!=null && insuranceOrderRow.getOrderId()!=null){
								Company company=companyDao.getCompany(Integer.parseInt(insuranceOrderRow.getCompanyId()));
								if(company!=null && company.getCompanyRole()!=null && company.getCompanyRole().isCorporate()){
									Email email =  buildEmailData(insuranceOrderRow.getOrderId());
									String htmlContent = insuranceEmailHelper.sendInsuranceInvoiceEmail(email, request, response, locale,insuranceOrderRowEmailDao,emailDao,emailService,emailNotificationDao,allEmailDao,applicationContext,servletContext,emailContentService,rmConfigDetailDAO);
									if(htmlContent!=null) 
										buildPdfFile(isZipFile, isSinglePdf, srcFolder, travelType, pdffiles, htmlContent);
								} 
							}
						}
					}
					break;
				case "M":
					List<MiscellaneousOrderRow> miscellaneousOrderRowList= bulkInvoicePdfDaoImpl.getMiscellaneousOrderRowList(fromDate, toDate);
					buildDeletePdfFilesByType(srcFolder, travelType, isZipFile, isSinglePdf);
					if (miscellaneousOrderRowList != null && miscellaneousOrderRowList.size() > 0) {
						for (MiscellaneousOrderRow insuranceOrderRow:miscellaneousOrderRowList) {
							if(insuranceOrderRow!=null && insuranceOrderRow.getOrderId()!=null){
								Company company=companyDao.getCompany(insuranceOrderRow.getCompanyId());
								if(company!=null && company.getCompanyRole()!=null && company.getCompanyRole().isCorporate()){
									Email email =  buildEmailData(insuranceOrderRow.getOrderId());
									String htmlContent= miscellaneousEmailHelper.sendMiscellaneousInvoiceEmail(email, request, response, locale,miscellaneousOrderRowEmailDao,emailDao,emailService,emailNotificationDao,allEmailDao,applicationContext,servletContext,emailContentService,rmConfigDetailDAO);
									if(htmlContent!=null) 
										buildPdfFile(isZipFile, isSinglePdf, srcFolder, travelType, pdffiles, htmlContent);
								}
							}
						}
					}
					break;
				default:
					break;
				}
			 buildDowmloadFileType(isZipFile, isSinglePdf, srcFolder, travelType, pdffiles, request, response);
			}
		}
		catch(Exception e){
			logger.error("Exception---"+e.getMessage());
		}
	}
	public void buildPdfFile(boolean isZipFile,boolean isSinglePdf,String srcFolder,String travelType,List<File> pdffiles,String htmlContent) throws NullPointerException, Exception{
		if(isZipFile) 
			this.pdfService.createBulkInvoiceZipFileDownload(htmlContent,srcFolder,travelType+"zip",ResourceUtility.getDataTimeFormat()) ;
		if(isSinglePdf){
			File pdfFile = this.pdfService.createBulkInvoiceSinglePDFDownload(htmlContent,srcFolder,travelType,ResourceUtility.getDataTimeFormat()) ;
			if(pdfFile!=null) 
				pdffiles.add(pdfFile);
		}
	}
	public File  buildDowmloadFileType(boolean isZipFile,boolean isSinglePdf,String srcFolder,String travelType,List<File> pdffiles,HttpServletRequest request, HttpServletResponse response){
		File downloadFile = null;
		if(isZipFile){
			downloadFile=FolderZiper.zipFolder(srcFolder+File.separator+travelType+"zip",srcFolder+File.separator+travelType+"zip.zip", "");
			if(downloadFile!=null) 
				ResourceUtility.isZipFileDownloadStream(downloadFile, request, response);	
		}

		if(isSinglePdf){
			downloadFile = ResourceUtility.getFile(pdffiles,srcFolder,travelType);
			if(downloadFile!=null) 
				ResourceUtility.isFileDownloadStream(downloadFile, request, response);	
		}
		return downloadFile; 
	}

	public boolean buildDeletePdfFilesByType(String srcFolder,String travelType,boolean isZipFile,boolean isSinglePdf) throws NullPointerException, Exception{
		boolean  isDeleted=false;
		if(isZipFile) 
			isDeleted=this.pdfService.deleteZipFilePdfFiles(srcFolder,travelType);
		if(isSinglePdf) 
			isDeleted=this.pdfService.deleteBulkInvoiceSinglePdfFiles(srcFolder,travelType);
		return isDeleted;
	}


	public Email buildEmailData(String orderId){
		Email email = new Email();
		email.setOrderId(orderId);
		email.setOnlyHtmlContent(true);	
		return email;
	}
}
