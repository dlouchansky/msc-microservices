var webApi = 'http://192.168.50.4:30777';

function disableForm() {
    var $invoiceForm = $('.invoiceForm');
    $invoiceForm.find('.pause').show();
    $invoiceForm.find('option').prop('disabled', true);
    $invoiceForm.find('input').prop('disabled', true);
    $('.save').prop('disabled', true);
}

function trySave(invoiceFormJson, count, timeout) {
    if (count >= 10) {
        var $serverError = $('.invoiceForm').find('.serverError');
        if (!$serverError.is(':visible')) {
            $serverError.show();
        }
        trySave(invoiceFormJson, 0, 60000);
        return;
    }

    $.jsonp({
        url: webApi + '/invoice?callback=?',
        data: invoiceFormJson,
        success: function (json, textStatus, xOptions) {
            console.log("reponse ok");
            console.log(json);
            window.location = webApi + '/invoices/' + json.id;
        },
        error: function (xOptions, textStatus) {
            console.log(xOptions);
            setTimeout(function () {
                trySave(invoiceFormJson, count + 1, timeout);
            }, timeout);
        }
    });
}

$(function () {
    $('.save').click(function () {
        var invoiceFormJson = $('.invoiceForm').serialize();
        console.log(invoiceFormJson);
        disableForm();
        trySave(invoiceFormJson, 0, 5000);
    })
});
