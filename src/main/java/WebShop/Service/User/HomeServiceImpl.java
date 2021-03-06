package WebShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import WebShop.Dao.BillsDao;
import WebShop.Dao.CategorysDao;
import WebShop.Dao.MenusDao;
import WebShop.Dao.ProductsDao;
import WebShop.Dao.SlidesDao;
import WebShop.Dto.ProductDto;
import WebShop.Enity.Bills;
import WebShop.Enity.BillsDetail;
import WebShop.Enity.Categorys;
import WebShop.Enity.Menus;
import WebShop.Enity.Slides;

@Service
public class HomeServiceImpl implements IHomeService{
	@Autowired
	private SlidesDao slidesDao;
	@Autowired
	private CategorysDao categorysDao;
	@Autowired
	private MenusDao menusDao;
	@Autowired
	private ProductsDao productsDao;
	@Autowired
	private BillsDao billDao;
	
	public List<Slides> GetDataSlide() {
		return slidesDao.GetDataSlide();
	}

	public List<Categorys> GetDataCategorys() {
		return categorysDao.GetDataCategorys();
	}
	
	public List<Menus> GetDataMenus() {
		return menusDao.GetDataMenus();
	}

	public List<ProductDto> GetDataProducts() {
		List<ProductDto> listProduct = productsDao.GetDataProducts();
		return listProduct;
	}
	public List<ProductDto> GetNewProducts() {
		List<ProductDto> listProduct = productsDao.GetNewProducts();
		return listProduct;
	}
	public List<ProductDto> GetHighLightProducts() {
		List<ProductDto> listProduct = productsDao.GetHighLightProducts();
		return listProduct;
	}
	public List<ProductDto> GetFourProduct() {
		List<ProductDto> listProduct = productsDao.GetFourProduct();
		return listProduct;
	}
	//-=-=-=-=-=-=-=-=-=-=phan admin-=-=-=-=-=-
	

	//phần categpry
	public List<Categorys> GetCatetByID(long id) {
		return 	categorysDao.GetCateByID(id);
	}
	public int CreateCategory(Categorys newCate) {
		return 	categorysDao.CreateCategory(newCate);
	}
	public int DeleteCate(long id) {
		return 	categorysDao.DeleteCate(id);
	}
	public int EditCategory(Categorys editCate) {
		return 	categorysDao.EditCategory(editCate);
	}
}
