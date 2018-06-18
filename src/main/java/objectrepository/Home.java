package objectrepository;

import genericlib.CommonSeleniumMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends CommonSeleniumMethod {
    @FindBy(xpath = "//li[@class='dropdown']/a[contains(text(),'Input Forms')]")
    private WebElement inputForms;

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Simple Form Demo']")
    private WebElement simpleFormDemo;

    /**
     * This method is used to go to simple form demo page
     */
    public void gotoSimpleFormDemo() {
        inputForms.click();
        waitForElement(simpleFormDemo);
        simpleFormDemo.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Checkbox Demo']")
    private WebElement checkboxDemo;

    /**
     * This method is used to go to checkbox demo page
     */
    public void gotoCheckboxDemo() {
        inputForms.click();
        waitForElement(checkboxDemo);
        checkboxDemo.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Radio Buttons Demo']")
    private WebElement radioButtonsDemo;

    /**
     * This method is used to go to Radio button demo page
     */
    public void gotoRadioButtonsDemo() {
        inputForms.click();
        waitForElement(radioButtonsDemo);
        radioButtonsDemo.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Select Dropdown List']")
    private WebElement selectDropdownList;

    /**
     * This method is used to go to select dropdown demo page
     */
    public void gotoSelectDropdownList() {
        inputForms.click();
        waitForElement(selectDropdownList);
        selectDropdownList.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Input Form Submit']")
    private WebElement inputFormSumit;

    /**
     * This method is used to go to input form submit demo page
     */
    public void gotoInputFormSumit() {
        inputForms.click();
        waitForElement(inputFormSumit);
        inputFormSumit.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Ajax Form Submit']")
    private WebElement ajaxFormSubmit;

    /**
     * This method is used to go to Ajax form submit demo page
     */
    public void gotoAjaxFormSubmit() {
        inputForms.click();
        waitForElement(ajaxFormSubmit);
        ajaxFormSubmit.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='JQuery Select dropdown']")
    private WebElement jQuerySelectDropdown;

    /**
     * This method is used to go to jQuery select Dropdown page
     */
    public void gotoJQuerySelectDropdown() {
        inputForms.click();
        waitForElement(jQuerySelectDropdown);
        jQuerySelectDropdown.click();
    }


    @FindBy(xpath = "//li[@class='dropdown']/a[contains(text(),'Date pickers')]")
    private WebElement datePickers;

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Bootstrap Date Picker']")
    private WebElement bootStrapDatePicker;

    /**
     * This method is used to go to BootStrap Date picker page
     */
    public void gotoBootStrapDatePicker() {
        datePickers.click();
        waitForElement(bootStrapDatePicker);
        bootStrapDatePicker.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='JQuery Date Picker']")
    private WebElement jQueryDatePicker;

    /**
     * This method is used to go to JQuery Date picker page
     */
    public void gotojQueryDatePicker() {
        datePickers.click();
        waitForElement(jQueryDatePicker);
        jQueryDatePicker.click();
    }


    @FindBy(xpath = "//li[@class='dropdown']/a[contains(text(),'Table')]")
    private WebElement table;

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Table Pagination']")
    private WebElement tablePagination;

    /**
     * This method is used to go to Table pagination page
     */
    public void gotoTablePagination() {
        table.click();
        waitForElement(tablePagination);
        tablePagination.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Table Data Search']")
    private WebElement tableDataSearch;

    /**
     * This method is used to go to table data search page
     */
    public void gotoTableDateSearch() {
        table.click();
        waitForElement(tableDataSearch);
        tableDataSearch.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Table Filter ']")
    private WebElement tableFilter;

    /**
     * This method is used to go to table Filter  page
     */
    public void gotoTableFilter() {
        table.click();
        waitForElement(tableFilter);
        tableFilter.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Table Sort & Search']")
    private WebElement tableSortSearch;

    /**
     * This method is used to go to Table Sort and search page
     */
    public void gotoTableSortSearch() {
        table.click();
        waitForElement(tableSortSearch);
        tableSortSearch.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Table Data Download']")
    private WebElement tableDataDownloads;

    /**
     * This method is used to go to Table Data Downloads page
     */
    public void gotoTableDataDownloads() {
        table.click();
        waitForElement(tableDataDownloads);
        tableDataDownloads.click();
    }


    @FindBy(xpath = "//li[@class='dropdown']/a[contains(text(),'Progress Bars')]")
    private WebElement progressBars;

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='JQuery Download Progress bars']")
    private WebElement jQueryDownloadProgressBars;

    /**
     * This method is used to go to JQuery Download Progress bar page
     */
    public void gotoJQqueryDownloadProgressBars() {
        progressBars.click();
        waitForElement(jQueryDownloadProgressBars);
        jQueryDownloadProgressBars.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Bootstrap Progress bar']")
    private WebElement bootStrapProgressbar;

    /**
     * This method is used to go to BootStrap Progress Bar page
     */
    public void gotoBootStrapProgressbar() {
        progressBars.click();
        waitForElement(bootStrapProgressbar);
        bootStrapProgressbar.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Drag & Drop Sliders']")
    private WebElement dragNDropSlider;

    /**
     * This method is used to go to Drag and drop Slider page
     */
    public void gotoDragNDropSlider() {
        progressBars.click();
        waitForElement(dragNDropSlider);
        dragNDropSlider.click();
    }


    @FindBy(xpath = "//li[@class='dropdown']/a[contains(text(),'Alerts')]")
    private WebElement alert;

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Bootstrap Alerts']")
    private WebElement bootStrapAlerts;

    /**
     * This method is used to go to BootStrap Alert page
     */
    public void gotoBootStrapAlerts() {
        alert.click();
        waitForElement(bootStrapAlerts);
        bootStrapAlerts.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Bootstrap Modals']")
    private WebElement bootStrapModels;

    /**
     * This method is used to go to BootStrap Model page
     */
    public void gotoBootStrapModels() {
        alert.click();
        waitForElement(bootStrapModels);
        bootStrapModels.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Window Popup Modal']")
    private WebElement windowPopupModal;

    /**
     * This method is used to go to Window popup Model page
     */
    public void gotoWindowPopupModal() {
        alert.click();
        waitForElement(windowPopupModal);
        windowPopupModal.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Progress Bar Modal']")
    private WebElement progressBarModal;

    /**
     * This method is used to go to Progress Bar Model page
     */
    public void gotoProgressBarModal() {
        alert.click();
        waitForElement(progressBarModal);
        progressBarModal.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Javascript Alerts']")
    private WebElement javaScriptAlerts;

    /**
     * This method is used to go to JavaScript Alert page
     */
    public void gotoJavaScriptAlerts() {
        alert.click();
        waitForElement(javaScriptAlerts);
        javaScriptAlerts.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='File Download']")
    private WebElement fileDownload;

    /**
     * This method is used to go to File Download page
     */
    public void gotoFileDownload() {
        alert.click();
        waitForElement(fileDownload);
        fileDownload.click();
    }


    @FindBy(xpath = "//li[@class='dropdown']/a[contains(text(),'List')]")
    private WebElement listBox;

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Bootstrap List Box']")
    private WebElement bootStrapListBox;

    /**
     * This method is used to go to BootStrap List Box page
     */
    public void gotoBootStrapListBox() {
        listBox.click();
        waitForElement(bootStrapListBox);
        bootStrapListBox.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='JQuery List Box']")
    private WebElement jQueryListBox;

    /**
     * This method is used to go to JQuery List Box page
     */
    public void gotoJQueryListBox() {
        listBox.click();
        waitForElement(jQueryListBox);
        jQueryListBox.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Data List Filter']")
    private WebElement dataListFilter;

    /**
     * This method is used to go to Data List Filter page
     */
    public void gotoDataListFilter() {
        listBox.click();
        waitForElement(dataListFilter);
        dataListFilter.click();
    }


    @FindBy(xpath = "//li[@class='dropdown']/a[contains(text(),'Others')]")
    private WebElement others;

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Drag and Drop']")
    private WebElement dragNDrop;

    /**
     * This method is used to go to Drag and drop page
     */
    public void gotoDragNDrop() {
        others.click();
        waitForElement(dragNDrop);
        dragNDrop.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Dynamic Data Loading']")
    private WebElement dynamicDataLoading;

    /**
     * This method is used to go to Dynamic data Loading page
     */
    public void gotoDynamicDataLoading() {
        others.click();
        waitForElement(dynamicDataLoading);
        dynamicDataLoading.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Charts Demo']")
    private WebElement chartDemo;

    /**
     * This method is used to go to Chart demo page
     */
    public void gotoChartDemo() {
        others.click();
        waitForElement(chartDemo);
        chartDemo.click();
    }

    @FindBy(linkText = "Demo Home")
    private WebElement demoHome;

    public void backHome() {
        waitForElement(demoHome);
        demoHome.click();
    }


}
