// script.js

$(document).ready(function(){

  $('.harvester > ul > li:has(ul)').addClass("has-sub");

  $('.harvester > ul > li > a').click(function() {
    var checking = $(this).next();
    
    $('.harvester li').removeClass('active');
    $(this).closest('li').addClass('active');	
    
    
    if((checking.is('ul')) && (checking.is(':visible'))) {
      $(this).closest('li').removeClass('active');
      checking.slideUp('normal');
    }
    
    if((checking.is('ul')) && (!checking.is(':visible'))) {
      $('.harvester ul ul:visible').slideUp('normal');
      checking.slideDown('normal');
    }
    else {
      return true;	
    }		
  });

});