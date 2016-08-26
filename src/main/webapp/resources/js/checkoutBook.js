"use strict"

var book = book || {};

book.getId = function () {
    return $('#checkout-button').val();
}

book.checkout = function(){
    $.ajax({
        url: "/checkout",
        type: "POST",
        contentType: "application/json",
        data: JSON.stringify(book.getId()),
        success: function () {
            var succesMessage = "Book has been successfully checked out";
            $('#success-message').text(succesMessage);
        }
    });
}

$(document).ready(function () {

    if($('#checkout-button').click(function() {
        book.checkout();
    }));
});

