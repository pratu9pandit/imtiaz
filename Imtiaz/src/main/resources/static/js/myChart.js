/**
 * 
 */



new Chart(document.getElementById("myPieChart"), {
    type: 'pie',
    data: {
        labels: ['January', 'February', 'March'],
        datasets: [{
            label: 'My First dataset',
            backgroundColor:["#808080", "#C0C0C0", "#00FFFF"],
            borderColor: 'rgb(255, 99, 132)',
            data: [5,10,5]
        }]
    },
    options: {}
});