let currentTheme = getTheme();
setThemeOnPage(currentTheme);

document.querySelector("#change_theme_button").addEventListener("click", switchTheme);

function setThemeOnPage(theme) {
    document.documentElement.className = theme;
    document.querySelector("#change_theme_button span").textContent = 
    theme === "light" ? "dark" : "light";
}

function switchTheme() {
    currentTheme = currentTheme === "dark" ? "light" : "dark";
    setTheme(currentTheme);
    setThemeOnPage(currentTheme);
    console.log("Theme switched to:", currentTheme);
}

function setTheme(theme) {
    localStorage.setItem("theme", theme);
}

function getTheme() {
    return localStorage.getItem("theme") || "light";
}
