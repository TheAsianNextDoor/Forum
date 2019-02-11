  $(document).ready(function() {
    $("#JobSelector").click(function() {
      var html = "<table border='1|1' style:'width: 300px;'>";
      var i = $("#JobSelector").val();
      html += "<tr>" + "<th>" + "Job Title:" + "</th>" + "<td>" + data[i].Title + "</td>" + "</tr>";
      html += "<tr>" + "<th>" + "Job Description:" + "</th>" + "<td>" + data[i].ShortDescription + "</td>" + "</tr>";
      html += "<tr>" + "<th>" + "Company Name:" + "</th>" + "<td>" + data[i].RecruiterName + "</td>" + "</tr>";
      html += "<tr>" + "<th>" + "Location:" + "</th>" + "<td>" + data[i].LocationDescription + "</td>" + "</tr>";
      html += "<tr>" + "<th>" + "Job Website:" + "</th>" + "<td>" + data[i].DetailsUrl + "</td>" + "</tr>";
      html += "</table>";
      $("#table").html(html);
    });
  });
