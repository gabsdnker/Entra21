// Marcar página ativa no menu
const links = document.querySelectorAll('.nav-link');
const currentPage = window.location.pathname;

links.forEach(link => {
  if (link.href.includes(currentPage)) {
    link.classList.add('active');
  } else {
    link.classList.remove('active');
  }
});
