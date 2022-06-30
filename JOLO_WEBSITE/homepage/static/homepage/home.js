$(document).ready(function(){

    function checkWidth(){
        var windowSize =  $(window).width();
        console.log(windowSize);
        if (windowSize > 991){
            $('#navbar_container').attr('class','navbar-nav position-absolute top-50 start-50 translate-middle');
        }
        else{
            $('#navbar_container').attr('class','navbar-nav');
        }
    }

    checkWidth()
    $(window).resize(checkWidth);
});
