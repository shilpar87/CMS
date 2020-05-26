var rec_from_cal1 = new CalendarPopup();
   rec_from_cal1.showYearNavigation();
   var rec_from_cal2 = new CalendarPopup();
   rec_from_cal2.showYearNavigation();
    var rec_from_cal3 = new CalendarPopup();
   rec_from_cal3.showYearNavigation();

   var rec_from_cal4 = new CalendarPopup();
   rec_from_cal4.showYearNavigation();
   
   var rec_from_cal5 = new CalendarPopup();
   rec_from_cal5.showYearNavigation();
   
   var rec_from_cal6 = new CalendarPopup();
   rec_from_cal6.showYearNavigation();
   

   
   rec_from_cal1.setReturnFunction("rec_from_setCalendarValues1");
   function rec_from_setCalendarValues1(y, m, d) {
   	document.all.needDateStr.value=m+"/"+d+"/"+y;
}
   
   
  rec_from_cal3.setReturnFunction("rec_from_setCalendarValues3");
   function rec_from_setCalendarValues3(y, m, d) {
   		document.all.dateOfJoining.value=d+"/"+m+"/"+y;
   }
   
    rec_from_cal4.setReturnFunction("rec_from_setCalendarValues4");
   function rec_from_setCalendarValues4(y, m, d) {
   		document.all.offerDate.value=d+"/"+m+"/"+y;
   }
   
   
   
   
   rec_from_cal2.setReturnFunction("rec_from_setCalendarValues2");
   function rec_from_setCalendarValues2(y, m, d) {
   	document.all.needDateStr.value=m+"/"+d+"/"+y;
}

  rec_from_cal5.setReturnFunction("rec_from_setCalendarValues5");
   function rec_from_setCalendarValues5(y, m, d) {
   	document.all.startdate.value=d+"/"+m+"/"+y;
}

 rec_from_cal6.setReturnFunction("rec_from_setCalendarValues6");
   function rec_from_setCalendarValues6(y, m, d) {
   	document.all.enddate.value=d+"/"+m+"/"+y;
}
