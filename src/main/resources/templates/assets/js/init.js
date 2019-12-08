console.log("%cCriado por Nerau | Digital Studio | Web Design","color: white; background: black; padding: 5px 20px");

var main = {

	init: function() {


    }
}


var contato = {

	init: function() {
		// Forms
		var PhoneMaskBehavior = function (val) {
			return val.replace(/\D/g, '').length === 11 ? '(00) 00000-0000' : '(00) 0000-00009';
		}, phoneOptions = {
			onKeyPress: function (val, e, field, options) {
				field.mask(PhoneMaskBehavior.apply({}, arguments), options);
			}
		};

		$('.mask-phone').mask(PhoneMaskBehavior, phoneOptions);

		
		$('.form').on('submit', function(e) {

            e.preventDefault();
            let $form = $(this);
            $form.addClass('was-validated');

            if ($form[0].checkValidity() === false) {
                e.stopPropagation();
            } else {
                $form[0].submit();
            }
        });

    }
}

var faq = {

	init: function() {

		// Accordion
        $('.accordion-content').hide();

	    $('.accordion-title').click(function() {

			$('.accordion-title').removeClass('is-active');
	        const accordion_content = $(this).closest('.accordion-item').find('.accordion-content');

	        if(accordion_content.is(':visible')) {

				$(this).removeClass('is-active');
	            accordion_content.slideUp(400);            
	        } else {

				$(this).addClass('is-active');
	            $('.accordion-content').slideUp(400);
	            accordion_content.slideDown(400);            
	        }

	        return false;
		});
		
    }
}

$(function() {

	main.init();
	contato.init();
	faq.init();
});