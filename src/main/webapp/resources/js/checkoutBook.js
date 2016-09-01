"use strict"


//functional object creation
//entity2D
var book = book || {};

book.getId = function () {
    return $('#checkout-button').val();
}

book.checkout = function(bookId){
    $.ajax({
        url: '/books/' + bookId,
        type: 'PUT',
        contentType: 'application/json',
        data: JSON.stringify(book.getId()),
        success: function () {
            var succesMessage = 'Book has been successfully checked out';
            $('#success-message').text(succesMessage);
        }
    });
}

$('#checkout-button').click(function() {
    var bookId = $('#checkout-button').val();

    book.checkout(bookId);
});

$(document).ready(function () {

    if($('#checkout-button').click(function() {
        book.checkout();
    }));
});

