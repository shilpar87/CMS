var _STR_UNDEFINED 	        = "undefined";
var _STR_HIDDEN 	        = "hidden";
var _STR_NEW_LINE_CHARACTER = "\n";
var _STR_TAB_CHARACTER      = "\t";
var _STR_CORRECT_FRMT       = "Correct Format:";
var _STR_DATE_DELIMETER     = "/";
var _FRMT_MMDDYY            = "mm" + _STR_DATE_DELIMETER + "dd" + _STR_DATE_DELIMETER + "yy";
var _FRMT_MMDDYYYY          =  "mm" + _STR_DATE_DELIMETER + "dd" + _STR_DATE_DELIMETER + "yyyy";
var _FRMT_HHMM_AMPM         = "HH:MM AM/PM";
var _STR_STD_DATE           = "01" + _STR_DATE_DELIMETER + "01" + _STR_DATE_DELIMETER + "1970";

var _ERROR_INVALID_INVALID_DATE_FRMT = "Please enter a valid date format.";
var _ERROR_INVALID_INVALID_TIME_FRMT = "Invalid time format.";
var _ERROR_INVALID_INVALID_MONTH     = "Invalid month.";
var _ERROR_INVALID_INVALID_MONTH     = "Invalid month.";
var _ERROR_INVALID_INVALID_YEAR      = "Invalid year.";
var _ERROR_STDATE_GT_OR_EQL_EDDATE   = " cannot be greater than or equal to ";
var _ERROR_STDATE_GT_EDDATE          = " cannot be greater than ";
var _ERROR_SPECIFY_STDATE            = " has to be specified.";
var _ERROR_INVALID_INVALID_TIME_FRMT = "Invalid time format.";
var _ERROR_SPECIFY_MERIDIAN          = "Please specify AM or PM for the time.";
var _ERROR_HOUR_LIMIT                = "Hour must be between 1 and 12";
var _ERROR_MINUTES_LIMIT             = "Minute must be between 0 and 59";
var _ERROR_SPECIFY_STTIME            = "Start time has to be specified";
var _ERROR_INVALID_INVALID_DATE      = "Invalid date."; 

function checkDateDiffWithMyMessage(objStDate, objEndDate, blnEqual, myMessage) {
  var dtStDate = objStDate.value;
  dtStDate     = trimData(dtStDate);
  if(dtStDate.length > 0) {
    var dtEndDate = objEndDate.value;
    dtEndDate     = trimData(dtEndDate);
    if(typeof(blnEqual) == _STR_UNDEFINED) {
      blnEqual = false;
    }
    var arrDate    = dtStDate.split(_STR_DATE_DELIMETER);
    var intStMonth = arrDate[1];
    var intStDay   = arrDate[0];
    var intStYear  = arrDate[2];
    arrDate         = dtEndDate.split(_STR_DATE_DELIMETER);
    var intEndMonth = arrDate[1];
    var intEndDay   = arrDate[0];
    var intEndYear  = arrDate[2];
    dtStDate  = new Date(intStYear, parseInt(intStMonth,10)-1, intStDay);
    dtEndDate = new Date(intEndYear, parseInt(intEndMonth,10)-1, intEndDay);
    if(blnEqual) {
      if (dtStDate >= dtEndDate){
        alert(myMessage);
        return false;
      }
    } else {
      if (dtStDate > dtEndDate){
        alert(myMessage);
        return false;
      }
    }
  } else {
    alert(startDateLabel + _ERROR_SPECIFY_STDATE);
  }
  return true;
}


function trimData(strValue) {
  strValue = strValue.replace(/^\s+/,'').replace(/\s+$/,'');
  return strValue;
}



function isValidDateFormat(objDate, intYearLength) {
  var dtDate = objDate.value;
  dtDate = trimData(dtDate);
  if(dtDate.length > 0) {
    var arrDate         = dtDate.split(_STR_DATE_DELIMETER);
    var strErrorMessage = "";

	if(typeof(intYearLength) == _STR_UNDEFINED) {
		intYearLength = 4;
	}

	if(intYearLength == 2) {
	    strErrorMessage  = _ERROR_INVALID_INVALID_DATE_FRMT + _STR_NEW_LINE_CHARACTER;
	    strErrorMessage += _FRMT_MMDDYY;
	} else {
	    strErrorMessage  = _ERROR_INVALID_INVALID_DATE_FRMT + _STR_NEW_LINE_CHARACTER;
	    strErrorMessage += _FRMT_MMDDYYYY;
	}

	if(arrDate.length != 3) {
	    alert(strErrorMessage);
	    return false;
	}

	var intMonth = arrDate[0];
	var intDay   = arrDate[1];
	var intYear  = arrDate[2];
	if(intDay <= 0 || intDay > 31) {
      alert(_ERROR_INVALID_INVALID_DATE);
      return false;
    }

    if(intMonth <= 0 || intMonth > 12) {
      alert(_ERROR_INVALID_INVALID_MONTH);
      return false;
    }

	if(isNaN(intMonth)) {
	    alert(_ERROR_INVALID_INVALID_MONTH);
	    return false;
	}
	if(isNaN(intDay)) {
	    alert(_ERROR_INVALID_INVALID_DATE);
	    return false;
	}
	if(isNaN(intYear)) {
	    alert(_ERROR_INVALID_INVALID_YEAR);
	    return false;
	}
    if(intYear.length != intYearLength) {
        alert(_ERROR_INVALID_INVALID_YEAR);
	    return false;
    }
	intMonth = parseInt(intMonth, 10);
	intDay   = parseInt(intDay, 10);
	intYear  = parseInt(intYear, 10);

	if(arrDate.length == 3){
      if(intMonth.length == 1) {
        intMonth = "0" + intMonth;
      }
      if(intDay.length == 1) {
        intDay = "0" + intDay;
      }
    }

    var dtNewDate = new Date(intYear,parseInt(intMonth,10)-1, intDay);
    if ((  parseInt(dtNewDate.getMonth(),10) + 1 != parseInt(intMonth,10))
       || (parseInt(dtNewDate.getDate(),10) != parseInt(intDay,10))) {
         alert("Invalid Date");
	     return false;
    }

    if(intYearLength == 2) {
      if(dtNewDate.getYear() != intYear) {
        alert(_ERROR_INVALID_INVALID_YEAR);
	    return false;
      }
    } else {
      if(dtNewDate.getFullYear() != intYear) {
        alert(_ERROR_INVALID_INVALID_YEAR);
	    return false;
      }
    }

    if(intYear < 1900) {
      alert("Year cannot be less than 1900");
      return false;
    }
  }

  return true;
}
