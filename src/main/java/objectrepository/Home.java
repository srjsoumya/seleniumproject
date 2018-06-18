package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {
    @FindBy(xpath = "//li[@class='dropdown']/a[contains(text(),'Input Forms')]")
    private WebElement inputForms;

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Simple Form Demo']")
    private WebElement simpleFormDemo;

    /**
     * This method is used to go to simple form demo page
     *
     * @throws InterruptedException
     */
    public void gotoSimpleFormDemo() throws InterruptedException {
        inputForms.click();
        Thread.sleep(2000);
        simpleFormDemo.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Checkbox Demo']")
    private WebElement checkboxDemo;

    /**
     * This method is used to go to checkbox demo page
     *
     * @throws InterruptedException
     */
    public void gotoCheckboxDemo() throws InterruptedException {
        inputForms.click();
        Thread.sleep(2000);
        checkboxDemo.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Radio Buttons Demo']")
    private WebElement radioButtonsDemo;

    /**
     * This method is used to go to Radio button demo page
     *
     * @throws InterruptedException
     */
    public void gotoRadioButtonsDemo() throws InterruptedException {
        inputForms.click();
        Thread.sleep(2000);
        radioButtonsDemo.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Select Dropdown List']")
    private WebElement selectDropdownList;

    /**
     * This method is used to go to select dropdown demo page
     *
     * @throws InterruptedException
     */
    public void gotoSelectDropdownList() throws InterruptedException {
        inputForms.click();
        Thread.sleep(2000);
        selectDropdownList.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Input Form Submit']")
    private WebElement inputFormSumit;

    /**
     * This method is used to go to input form submit demo page
     *
     * @throws InterruptedException
     */
    public void gotoInputFormSumit() throws InterruptedException {
        inputForms.click();
        Thread.sleep(2000);
        inputFormSumit.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Ajax Form Submit']")
    private WebElement ajaxFormSubmit;

    /**
     * This method is used to go to Ajax form submit demo page
     *
     * @throws InterruptedException
     */
    public void gotoAjaxFormSubmit() throws InterruptedException {
        inputForms.click();
        Thread.sleep(2000);
        ajaxFormSubmit.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='JQuery Select dropdown']")
    private WebElement jQuerySelectDropdown;

    /**
     * This method is used to go to jQuery select Dropdown page
     *
     * @throws InterruptedException
     */
    public void gotoJQuerySelectDropdown() throws InterruptedException {
        inputForms.click();
        Thread.sleep(2000);
        jQuerySelectDropdown.click();
    }


    @FindBy(xpath = "//li[@class='dropdown']/a[contains(text(),'Date pickers')]")
    private WebElement datePickers;

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Bootstrap Date Picker']")
    private WebElement bootStrapDatePicker;

    /**
     * This method is used to go to BootStrap Date picker page
     *
     * @throws InterruptedException
     */
    public void gotoBootStrapDatePicker() throws InterruptedException {
        datePickers.click();
        Thread.sleep(2000);
        bootStrapDatePicker.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='JQuery Date Picker']")
    private WebElement jQueryDatePicker;

    /**
     * This method is used to go to JQuery Date picker page
     *
     * @throws InterruptedException
     */
    public void gotojQueryDatePicker() throws InterruptedException {
        datePickers.click();
        Thread.sleep(2000);
        jQueryDatePicker.click();
    }


    @FindBy(xpath = "//li[@class='dropdown']/a[contains(text(),'Table')]")
    private WebElement table;

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Table Pagination']")
    private WebElement tablePagination;

    /**
     * This method is used to go to Table pagination page
     *
     * @throws InterruptedException
     */
    public void gotoTablePagination() throws InterruptedException {
        table.click();
        Thread.sleep(2000);
        tablePagination.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Table Data Search']")
    private WebElement tableDataSearch;

    /**
     * This method is used to go to table data search page
     *
     * @throws InterruptedException
     */
    public void gotoTableDateSearch() throws InterruptedException {
        table.click();
        Thread.sleep(2000);
        tableDataSearch.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Table Filter ']")
    private WebElement tableFilter;

    /**
     * This method is used to go to table Filter  page
     *
     * @throws InterruptedException
     */
    public void gotoTableFilter() throws InterruptedException {
        table.click();
        Thread.sleep(2000);
        tableFilter.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Table Sort & Search']")
    private WebElement tableSortSearch;

    /**
     * This method is used to go to Table Sort and search page
     *
     * @throws InterruptedException
     */
    public void gotoTableSortSearch() throws InterruptedException {
        table.click();
        Thread.sleep(2000);
        tableSortSearch.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Table Data Download']")
    private WebElement tableDataDownloads;

    /**
     * This method is used to go to Table Data Downloads page
     *
     * @throws InterruptedException
     */
    public void gotoTableDataDownloads() throws InterruptedException {
        table.click();
        Thread.sleep(2000);
        tableDataDownloads.click();
    }


    @FindBy(xpath = "//li[@class='dropdown']/a[contains(text(),'Progress Bars')]")
    private WebElement progressBars;

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='JQuery Download Progress bars']")
    private WebElement jQueryDownloadProgressBars;

    /**
     * This method is used to go to JQuery Download Progress bar page
     *
     * @throws InterruptedException
     */
    public void gotoJQqueryDownloadProgressBars() throws InterruptedException {
        progressBars.click();
        Thread.sleep(2000);
        jQueryDownloadProgressBars.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Bootstrap Progress bar']")
    private WebElement bootStrapProgressbar;

    /**
     * This method is used to go to BootStrap Progress Bar page
     *
     * @throws InterruptedException
     */
    public void gotoBootStrapProgressbar() throws InterruptedException {
        progressBars.click();
        Thread.sleep(2000);
        bootStrapProgressbar.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Drag & Drop Sliders']")
    private WebElement dragNDropSlider;

    /**
     * This method is used to go to Drag and drop Slider page
     *
     * @throws InterruptedException
     */
    public void gotoDragNDropSlider() throws InterruptedException {
        progressBars.click();
        Thread.sleep(2000);
        dragNDropSlider.click();
    }


    @FindBy(xpath = "//li[@class='dropdown']/a[contains(text(),'Alerts')]")
    private WebElement alert;

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Bootstrap Alerts']")
    private WebElement bootStrapAlerts;

    /**
     * This method is used to go to BootStrap Alert page
     *
     * @throws InterruptedException
     */
    public void gotoBootStrapAlerts() throws InterruptedException {
        alert.click();
        Thread.sleep(2000);
        bootStrapAlerts.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Bootstrap Modals']")
    private WebElement bootStrapModels;

    /**
     * This method is used to go to BootStrap Model page
     *
     * @throws InterruptedException
     */
    public void gotoBootStrapModels() throws InterruptedException {
        alert.click();
        Thread.sleep(2000);
        bootStrapModels.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Window Popup Modal']")
    private WebElement windowPopupModal;

    /**
     * This method is used to go to Window popup Model page
     *
     * @throws InterruptedException
     */
    public void gotoWindowPopupModal() throws InterruptedException {
        alert.click();
        Thread.sleep(2000);
        windowPopupModal.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Progress Bar Modal']")
    private WebElement progressBarModal;

    /**
     * This method is used to go to Progress Bar Model page
     *
     * @throws InterruptedException
     */
    public void gotoProgressBarModal() throws InterruptedException {
        alert.click();
        Thread.sleep(2000);
        progressBarModal.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Javascript Alerts']")
    private WebElement javaScriptAlerts;

    /**
     * This method is used to go to JavaScript Alert page
     *
     * @throws InterruptedException
     */
    public void gotoJavaScriptAlerts() throws InterruptedException {
        alert.click();
        Thread.sleep(2000);
        javaScriptAlerts.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='File Download']")
    private WebElement fileDownload;

    /**
     * This method is used to go to File Download page
     *
     * @throws InterruptedException
     */
    public void gotoFileDownload() throws InterruptedException {
        alert.click();
        Thread.sleep(2000);
        fileDownload.click();
    }


    @FindBy(xpath = "//li[@class='dropdown']/a[contains(text(),'List')]")
    private WebElement listBox;

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Bootstrap List Box']")
    private WebElement bootStrapListBox;

    /**
     * This method is used to go to BootStrap List Box page
     *
     * @throws InterruptedException
     */
    public void gotoBootStrapListBox() throws InterruptedException {
        listBox.click();
        Thread.sleep(2000);
        bootStrapListBox.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='JQuery List Box']")
    private WebElement jQueryListBox;

    /**
     * This method is used to go to JQuery List Box page
     *
     * @throws InterruptedException
     */
    public void gotoJQueryListBox() throws InterruptedException {
        listBox.click();
        Thread.sleep(2000);
        jQueryListBox.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Data List Filter']")
    private WebElement dataListFilter;

    /**
     * This method is used to go to Data List Filter page
     *
     * @throws InterruptedException
     */
    public void gotoDataListFilter() throws InterruptedException {
        listBox.click();
        Thread.sleep(2000);
        dataListFilter.click();
    }


    @FindBy(xpath = "//li[@class='dropdown']/a[contains(text(),'Others')]")
    private WebElement others;

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Drag and Drop']")
    private WebElement dragNDrop;

    /**
     * This method is used to go to Drag and drop page
     *
     * @throws InterruptedException
     */
    public void gotoDragNDrop() throws InterruptedException {
        others.click();
        Thread.sleep(2000);
        dragNDrop.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Dynamic Data Loading']")
    private WebElement dynamicDataLoading;

    /**
     * This method is used to go to Dynamic data Loading page
     *
     * @throws InterruptedException
     */
    public void gotoDynamicDataLoading() throws InterruptedException {
        others.click();
        Thread.sleep(2000);
        dynamicDataLoading.click();
    }

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Charts Demo']")
    private WebElement chartDemo;

    /**
     * This method is used to go to Chart demo page
     *
     * @throws InterruptedException
     */
    public void gotoChartDemo() throws InterruptedException {
        others.click();
        Thread.sleep(2000);
        chartDemo.click();
    }


}
