package mack.controllers;

import javax.servlet.http.HttpServletRequest;

public abstract class AbstractController implements Controller {

    private HttpServletRequest request;
    protected String returnPage;

    public void init(HttpServletRequest request) {
        this.setRequest(request);
    }

    public void setReturnPage(String page) {
        returnPage = page;
    }

    public String getReturnPage() {
        return returnPage;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }
}
