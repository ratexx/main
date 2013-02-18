function skip_space(str)
{
    var skip_str="";
    var i=0,j=0;

    for (i=0; i< str.length; i++)
    {
        if(str.charAt(i)==" ")
            continue;
            skip_str += str.charAt(i);
            j++;
    }
    return ( skip_str ) ;
}
function stringToUnicode(string)
{
    var str1 ;
    var str2 ;
    var str3 ;
    str1=convertChar2CP ( string ) ;
    str2=convertCP2UTF16 ( str1 ) ;
    str3=skip_space(str2);
    //document.forms[0].messageType.value="SMS_MSGTYPE_UNICODE";
    document.forms[0].textMessageData.value = str3;
    return ( str3 );
}
function resetMessageIfUnicode()
{
	var form = document.forms[0];

//	if( (form.messageType.value == "SMS_MSGTYPE_UTF82UTF16") || (form.messageType.value == "SMS_MSGTYPE_UTF322UTF16"))
//    	form.textMessageData.value = '';

	//Clearing message if the message type is not Plain Text (English)
	if(!(form.messageType.value == "SMS_MSGTYPE_TEXT"))
    	form.textMessageData.value = '';
}
function convertToUnicode(form)
{ 
	//if( (form.messageType.value == "SMS_MSGTYPE_UTF82UTF16") || (form.messageType.value == "SMS_MSGTYPE_UTF322UTF16"))
    //{
    //    stringToUnicode(form.textMessageData.value)
    //}
}
function validateForm(form)
{
	if(this.validationCancelled!=1)
	{
		if(dynaValidation(form))
			if(customValidation(form))
				return true;
	}
	else
		return true;
	return false;
	
}
function customValidation(form)
{
	var length = form.textMessageData.value.length;
	//alert("Message :" + form.textMessageData.value);
	//alert("Length :" + length);
	
	if( (length > 210) && ((form.messageType.value == "SMS_MSGTYPE_UTF82UTF16") || (form.messageType.value == "SMS_MSGTYPE_UTF322UTF16")))
    {
    	alert(unicodeMessageLengthExceeded);
    	return false;
    }
    else if(length >450)
    {
    	alert(messageLengthExceeded);
    	return false;
    }
	
	convertToUnicode(form);
	return true;
}
