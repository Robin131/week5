package rejsekort;

public class ResponseObject {

	int errorCode;
	String errorInfo;
	
	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(String errorInfo) {
		this.errorInfo = errorInfo;
	}

	
	public ResponseObject(int errorCode, String errorInfo) {
		super();
		this.errorCode = errorCode;
		this.errorInfo = errorInfo;
	}
	
	
}
