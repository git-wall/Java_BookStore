package WebShop.Controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import WebShop.Service.User.AccountServiceImpl;
import WebShop.Service.User.CategoryServiceImpl;
@Controller
public class CustomerAdminController extends BaseAdminController{
	@Autowired
	AccountServiceImpl _accountService;
	
	
	@RequestMapping(value = "/admin/khach-hang")
	public ModelAndView Index() {
		
		
		mvShare.clear();
		// lấy danh sách thể loại
		mvShare.addObject("accounts", _accountService.GetUsersAdmin());
	
		mvShare.setViewName("admin/Cumtomer/customer");
		System.out.print(_accountService.GetUsersAdmin().size());
		
	
		return mvShare;
	}
	
	@RequestMapping(value = "/admin/Cumtomer/{id}", method = RequestMethod.GET)
	public ModelAndView Detail(@PathVariable long id) {
		
	
		
		if (isLogin()) {
			mvShare.clear();
			mvShare.addObject("bill", _BillService.GetBillByID(id).get(0));
			mvShare.addObject("detail",_BillDetailService.GetBillDetailByIDBill(id) );
		
			mvShare.setViewName("admin/Cumtomer/detailCustomer");
		}
		return mvShare;
	}
	
}
