$(document).ready(function() {
    $('.menuControl .icon').on('click', function() {
        $('.menu').toggleClass('open');
        $('.menuControl .icon').toggleClass('close');
    });

    $('.menu').on('click', function(e) {
        e.stopPropagation();
    });

    const mainContainer = $('.content');

    // mainContainer.on('click', function(e) {
    //     $('.menu').removeClass('open');
    //     $('.menuControl .icon').removeClass('close');
    // });

    const swipeArea = mainContainer.get(0);
    const hammer = new Hammer(swipeArea);

    hammer.on("swiperight", function(e) {
        $('.menu').addClass('open');
        $('.menuControl .icon').addClass('close');
        console.log('swipeleft');
        console.log('swiperight');
    });

    hammer.on("swipeleft tap", function(e) {
        $('.menu').removeClass('open');
        $('.menuControl .icon').removeClass('close');
        console.log('swipeleft');
    });
});