package com.springapp.mvc.controller.admin;

import com.springapp.mvc.DAO.ItemDao;
import com.springapp.mvc.model.Brand;
import com.springapp.mvc.model.Category;
import com.springapp.mvc.model.Item;
import com.springapp.mvc.model.file.MultiPartFileUploadBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    ItemDao itemDao;

    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public String index(ModelMap model) {
        return "admin/index";
    }

    @RequestMapping(value = "/dashboard/product", method = RequestMethod.GET)
    public ModelAndView Product(ModelMap model) {
        return new ModelAndView("admin/index", "content", "product");
    }

    @RequestMapping(value = "/dashboard/product/new", method = RequestMethod.GET)
    public ModelAndView newProduct(ModelMap model) {

        List<Category> categories = itemDao.findAllCategories();
        List<Brand> brands = itemDao.findAllBrands();
        model.addAttribute("categories", categories);
        model.addAttribute("brands", brands);
//        MultipartFile
        return new ModelAndView("admin/index", "content", "forms/create_product");
    }

    @RequestMapping(value = "/dashboard/product/submit/create", method = RequestMethod.GET)
    public ModelAndView submitProduct(  ) {
        return new ModelAndView("admin/index", "content", "forms/create_product");
    }

    @RequestMapping(value = "/dashboard/product/submit/create", method = RequestMethod.POST)
    public String submitProduct(ModelMap model,
                                      @ModelAttribute("item") Item item
                                      ) {
        List<MultipartFile> files = item.getFiles();
        if(!files.isEmpty()) {
            try {
                List<String> imagePaths = new ArrayList();
                for (MultipartFile file : files) {
                    if (!file.isEmpty()) {
                        InputStream bis = new ByteArrayInputStream(file.getBytes());
                        BufferedImage bImageFromConvert = ImageIO.read(bis);
                        File path = new File("src/main/webapp/resources/img/"+file.getOriginalFilename());
                        imagePaths.add("/resources/img/"+file.getOriginalFilename());
                        ImageIO.write(bImageFromConvert, "png", path);
                    }
                }
                item.setImageAddress(imagePaths);
                item.setUserId(1);
                itemDao.insertItem(item);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
//        if (type == "create") {
//            itemDao.insertItem(item);
//        }
//        else if (type == "edit") {
////            itemDao;
//        }
//        return new ModelAndView("admin/index", "content", "forms/create_product");
        return "redirect:/admin/dashboard/product";
    }

//    @RequestMapping(method = RequestMethod.GET)
//    public String printWelcome(ModelMap model) {
//        model.addAttribute("message", "Hello world!");
//        return "hello";
//    }
}