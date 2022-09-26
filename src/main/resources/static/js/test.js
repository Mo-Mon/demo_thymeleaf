$(document).ready(function (){
   $('.buttonEdit').on('click',function(event){
       event.preventDefault()
       var href = $(this).attr('href')
       $.get(href, function (nationality, status) {
            $('#id').val(nationality.id)
            $('#nameEdit').val(nationality.name)
            $('#capitalEdit').val(nationality.capital)
            $('#updatedByEdit').val(nationality.updatedBy)
       })
        $('#editmodal').modal('show');
    });

   $('.buttonDelete').on('click',function(event){
       event.preventDefault()
       var href = $(this).attr('href')
       $.get(href, function (nationality, status) {
           $('#idDelete').val(nationality.id.toString())
           $('#idText').text(nationality.id)
       })
       $('#modaldelete').modal('show');
   })
});