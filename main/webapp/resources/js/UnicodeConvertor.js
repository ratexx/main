var debug1 = true;
var debug2 = true;


function dec2hex ( textString ) {
    return (textString+0).toString(16).toUpperCase();
}

function  dec2hex2 ( textString ) {
    var hexequiv = new Array ("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F");
    return hexequiv[(textString >> 4) & 0xF] + hexequiv[textString & 0xF];
}

function  dec2hex4 ( textString ) {
    var hexequiv = new Array ("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F");
    return hexequiv[(textString >> 12) & 0xF] + hexequiv[(textString >> 8) & 0xF] + hexequiv[(textString >> 4) & 0xF] + hexequiv[textString & 0xF];
}


function convertCP2Char ( textString ) {
    var outputString = '';
    textString = textString.replace(/^\s+/, '');
    if (textString.length == 0) { return ""; }
    textString = textString.replace(/\s+/g, ' ');
    var listArray = textString.split(' ');
    for ( var i = 0; i < listArray.length; i++ ) {
        var n = parseInt(listArray[i], 16);
        if (n <= 0xFFFF) {
            outputString += String.fromCharCode(n);
        } else if (n <= 0x10FFFF) {
            n -= 0x10000
                outputString += String.fromCharCode(0xD800 | (n >> 10)) + String.fromCharCode(0xDC00 | (n & 0x3FF));
        } else {
            outputString += '!erreur ' + dec2hex(n) +'!';
        }
    }
    return( outputString );
}


function convertCP2UTF8 ( textString ) {
    var outputString = "";
    textString = textString.replace(/^\s+/, '');
    if (textString.length == 0) { return ""; }
    textString = textString.replace(/\s+/g, ' ');
    var listArray = textString.split(' ');
    for ( var i = 0; i < listArray.length; i++ ) {
        var n = parseInt(listArray[i], 16);
        if (i > 0) { outputString += ' ';}
        if (n <= 0x7F) {
            outputString += dec2hex2(n);
        } else if (n <= 0x7FF) {
            outputString += dec2hex2(0xC0 | ((n>>6) & 0x1F)) + ' ' + dec2hex2(0x80 | (n & 0x3F));
        } else if (n <= 0xFFFF) {
            outputString += dec2hex2(0xE0 | ((n>>12) & 0x0F)) + ' ' + dec2hex2(0x80 | ((n>>6) & 0x3F)) + ' ' + dec2hex2(0x80 | (n & 0x3F));
        } else if (n <= 0x10FFFF) {
            outputString += dec2hex2(0xF0 | ((n>>18) & 0x07)) + ' ' + dec2hex2(0x80 | ((n>>12) & 0x3F)) + ' ' + dec2hex2(0x80 | ((n>>6) & 0x3F)) + ' ' + dec2hex2(0x80 | (n & 0x3F));
        } else {
            outputString += '!erreur ' + dec2hex(n) +'!';
        }
    }
    return( outputString );
}


function convertCP2pEsc ( textString ) {
    // textstring: sequence of Unicode code points, derived from convertChar2CP()
    var outputString = "";
    // remove initial spaces
    textString = textString.replace(/^\s+/, '');
    if (textString.length == 0) { return ""; }
    // make all multiple spaces a single space
    textString = textString.replace(/\s+/g, ' ');
    var listArray = textString.split(' ');
    // process each codepoint
    for ( var i = 0; i < listArray.length; i++ ) {
        var n = parseInt(listArray[i], 16);
        //if (i > 0) { outputString += ' ';}
        if (n == 0x20) { outputString += '%20'; }
        else if (n <= 0x7F) { outputString += String.fromCharCode(n); }
        else if (n <= 0x7FF) { outputString += '%'+dec2hex2(0xC0 | ((n>>6) & 0x1F)) + '%' + dec2hex2(0x80 | (n & 0x3F)); } 
        else if (n <= 0xFFFF) { outputString += '%'+dec2hex2(0xE0 | ((n>>12) & 0x0F)) + '%' + dec2hex2(0x80 | ((n>>6) & 0x3F)) + '%' + dec2hex2(0x80 | (n & 0x3F)); } 
        else if (n <= 0x10FFFF) {outputString += '%'+dec2hex2(0xF0 | ((n>>18) & 0x07)) + '%' + dec2hex2(0x80 | ((n>>12) & 0x3F)) + '%' + dec2hex2(0x80 | ((n>>6) & 0x3F)) + '%' + dec2hex2(0x80 | (n & 0x3F)); } 
        else { outputString += '!Error ' + dec2hex(n) +'!'; }
    }
    return( outputString );
}


function convertCP2UTF16 ( textString ) {
    var outputString = "";
    textString = textString.replace(/^\s+/, '');
    if (textString.length == 0) { return ""; }
    textString = textString.replace(/\s+/g, ' ');
    var listArray = textString.split(' ');
    for ( var i = 0; i < listArray.length; i++ ) {
        var n = parseInt(listArray[i], 16);
        if (i > 0) { outputString += ' ';}
        if (n <= 0xFFFF) {
            outputString += dec2hex4(n);
        } else if (n <= 0x10FFFF) {
            n -= 0x10000
                outputString += dec2hex4(0xD800 | (n >> 10)) + ' ' + dec2hex4(0xDC00 | (n & 0x3FF));
        } else {
            outputString += '!erreur ' + dec2hex(n) +'!';
        }
    }
    return( outputString );
}


function convertCP2HexNCR ( textString ) {
    var outputString = "";
    textString = textString.replace(/^\s+/, '');
    if (textString.length == 0) { return ""; }
    textString = textString.replace(/\s+/g, ' ');
    var listArray = textString.split(' ');
    for ( var i = 0; i < listArray.length; i++ ) {
        var n = parseInt(listArray[i], 16);
        outputString += '&#x' + dec2hex(n) + ';';
    }
    return( outputString );
}


function convertCP2DecNCR ( textString ) {
    var outputString = "";
    textString = textString.replace(/^\s+/, '');
    if (textString.length == 0) { return ""; }
    textString = textString.replace(/\s+/g, ' ');
    var listArray = textString.split(' ');
    for ( var i = 0; i < listArray.length; i++ ) {
        var n = parseInt(listArray[i], 16);
        outputString += ('&#' + n + ';');
    }
    return( outputString );
}


function convertCP2Dec ( textString ) {
    var outputString = "";
    textString = textString.replace(/^\s+/, '');
    if (textString.length == 0) { return ""; }
    textString = textString.replace(/\s+/g, ' ');
    var listArray = textString.split(' ');
    for ( var i = 0; i < listArray.length; i++ ) {
        if (i > 0) { outputString += ' ';}
        var n = parseInt(listArray[i], 16);
        outputString += (n);
    }
    return( outputString );
}


function convertChar2CP ( textString ) {
    var outputString = "";
    var haut = 0;
    var n = 0;
    for (var i = 0; i < textString.length; i++) {
        var b = textString.charCodeAt(i);  // alert('b:'+dec2hex(b));
        if (b < 0 || b > 0xFFFF) {
            outputString += '!erreur ' + dec2hex(b) + '!';
        }
        if (haut != 0) {
            if (0xDC00 <= b && b <= 0xDFFF) {
                outputString += dec2hex(0x10000 + ((haut - 0xD800) << 10) + (b - 0xDC00)) + ' ';
                haut = 0;
                continue;
            } else {
                outputString += '!erreur ' + dec2hex(haut) + '!';
                haut = 0;
            }
        }
        if (0xD800 <= b && b <= 0xDBFF) {
            haut = b;
        } else {
            outputString += dec2hex(b) + ' ';
        }
    }
    return( outputString.replace(/ $/, '') );
}


function convertUTF82CP ( textString ) {
    var outputString = "";
    var compte = 0;
    var n = 0;
    textString = textString.replace(/^\s+/, '');
    if (textString.length == 0) { return ""; }
    textString = textString.replace(/\s+/g, ' ');
    var listArray = textString.split(' ');
    for ( var i = 0; i < listArray.length; i++ ) {
        var b = parseInt(listArray[i], 16);  // alert('b:'+dec2hex(b));
        switch (compte) {
            case 0:
                if (0 <= b && b <= 0x7F) {  // 0xxxxxxx
                    outputString += dec2hex(b) + ' ';
                } else if (0xC0 <= b && b <= 0xDF) {  // 110xxxxx
                    compte = 1;
                    n = b & 0x1F;
                } else if (0xE0 <= b && b <= 0xEF) {  // 1110xxxx
                    compte = 2;
                    n = b & 0xF;
                } else if (0xF0 <= b && b <= 0xF7) {  // 11110xxx
                    compte = 3;
                    n = b & 0x7;
                } else {
                    outputString += '!erreur ' + dec2hex(b) + '! ';
                }
                break;
            case 1:
                if (b < 0x80 || b > 0xBF) {
                    outputString += '!erreur ' + dec2hex(b) + '! ';
                }
                compte--;
                outputString += dec2hex((n << 6) | (b-0x80)) + ' ';
                n = 0;
                break;
            case 2: case 3:
                if (b < 0x80 || b > 0xBF) {
                    outputString += '!erreur ' + dec2hex(b) + '! ';
                }
                n = (n << 6) | (b-0x80);
                compte--;
                break;
        }
    }
    return( outputString.replace(/ $/, '') );
}


function convertpEsc2CP ( textString ) {
    // textstring: sequence of percent-escaped text
    var outputString = "";
    var compte = 0;
    var n = 0;
    // remove all leading spaces
    textString = textString.replace(/^\s+/, '');
    if (textString.length == 0) { return ""; }
    // normalize all multiple spaces to a single space - note: there shouldn't be any spaces!
    textString = textString.replace(/\s+/g, ' ');
    // convert the whole string to percent escaped forms (to reduce work in coding)
    for ( var j = 0; j < textString.length; j++ ) {
        if (textString.charAt(j) == '%') { outputString += textString.slice(j, j+3); j += 2; }
        else { outputString += '%'+dec2hex(textString.charCodeAt(j)); }
    }
    textString = outputString; outputString = '';
    var listArray = textString.split('%');
    for ( var i = 1; i < listArray.length; i++ ) { // runs from 1 to eliminate first % (produces null array item)
        var b = parseInt(listArray[i], 16);   // alert('b:'+dec2hex(b));
        switch (compte) {
            case 0:
                if (0 <= b && b <= 0x7F) {  // 0xxxxxxx
                    outputString += dec2hex(b) + ' '; } 
                else if (0xC0 <= b && b <= 0xDF) {  // 110xxxxx
                    compte = 1;
                    n = b & 0x1F; }
                else if (0xE0 <= b && b <= 0xEF) {  // 1110xxxx
                    compte = 2;
                    n = b & 0xF; } 
                else if (0xF0 <= b && b <= 0xF7) {  // 11110xxx
                    compte = 3;
                    n = b & 0x7; } 
                else {
                    outputString += '!erreur ' + dec2hex(b) + '! ';
                }
                break;
            case 1:
                if (b < 0x80 || b > 0xBF) {
                    outputString += '!erreur ' + dec2hex(b) + '! ';
                }
                compte--;
                outputString += dec2hex((n << 6) | (b-0x80)) + ' ';
                n = 0;
                break;
            case 2: case 3:
                if (b < 0x80 || b > 0xBF) {
                    outputString += '!erreur ' + dec2hex(b) + '! ';
                }
                n = (n << 6) | (b-0x80);
                compte--;
                break;
        }
    }
    return( outputString.replace(/ $/, '') );
}


function convertUTF162CP ( textString ) {
    var outputString = "";
    var haut = 0;
    var n = 0;
    textString = textString.replace(/^\s+/, '');
    if (textString.length == 0) { return ""; }
    textString = textString.replace(/\s+/g, ' ');
    var listArray = textString.split(' ');
    for ( var i = 0; i < listArray.length; i++ ) {
        var b = parseInt(listArray[i], 16);  // alert('b:'+dec2hex(b));
        if (b < 0 || b > 0xFFFF) {
            outputString += '!erreur ' + dec2hex(b) + '!';
        }
        if (haut != 0) {
            if (0xDC00 <= b && b <= 0xDFFF) {
                outputString += dec2hex(0x10000 + ((haut - 0xD800) << 10) + (b - 0xDC00)) + ' ';
                haut = 0;
                continue;
            } else {
                outputString += '!erreur ' + dec2hex(haut) + '!';
                haut = 0;
            }
        }
        if (0xD800 <= b && b <= 0xDBFF) {
            haut = b;
        } else {
            outputString += dec2hex(b) + ' ';
        }
    }
    return( outputString.replace(/ $/, '') );
}


function convertHexNCR2CP ( textString ) {
    var outputString = '';
    textString = textString.replace(/\s/g, '');
    var listArray = textString.split(';');
    for (var i = 0; i < listArray.length-1; i++) {
        if (i > 0) { outputString += ' ';}
        var n = parseInt(listArray[i].substring(3, listArray[i].length), 16);
        outputString += dec2hex(n);
    }
    return( outputString );
}


function convertDecNCR2CP ( textString ) {
    var outputString = '';
    textString = textString.replace(/\s/g, '');
    var listArray = textString.split(';');
    for (var i = 0; i < listArray.length-1; i++) {
        if (i > 0) { outputString += ' ';}
        var n = parseInt(listArray[i].substring(2, listArray[i].length), 10);
        outputString += dec2hex(n);
    }
    return( outputString );
}


function convertDec2CP ( textString ) {
    var outputString = '';
    textString = textString.replace(/^\s+/, '');
    if (textString.length == 0) { return ""; }
    textString = textString.replace(/\s+/g, ' ');
    var listArray = textString.split(' ');
    for (var i = 0; i < listArray.length; i++) {
        if (i > 0) { outputString += ' ';}
        var n = parseInt(listArray[i], 10);
        outputString += dec2hex(n);
    }
    return( outputString );
}
