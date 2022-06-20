$(document).ready(function(){

    function checkWidth(){
        var windowSize =  $(window).width();
        console.log(windowSize);
        if (windowSize >= 768){
            $('#header').text("John Paolo Hernandez");
            $('#header2').text("Future Software Engineer");
        }
        else{
            $('#header').text("Jolo");
            $('#header2').text("Software Engineer");
        }
    }

    checkWidth()
    $(window).resize(checkWidth);
});

var toggleDarkMode = function(ele){
    if($('#flexSwitchCheckChecked').prop("checked") == true){
        $('#global_body').attr('class', 'bg-dark text-light');
        $('#global_nav').attr('class', 'navbar navbar-expand-lg bg-dark text-light');
    }
    else{
        $('#global_body').attr('class', 'bg-light text-dark');
        $('#global_nav').attr('class', 'navbar navbar-expand-lg bg-light text-dark');
    }
};