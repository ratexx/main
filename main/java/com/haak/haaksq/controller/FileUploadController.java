package com.haak.haaksq.controller;

import java.io.File;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
 
import com.haak.haaksq.constanst.HaakConst;
import com.haak.haaksq.form.FileUploadForm; 
import com.haak.haaksq.form.MenuForm;
import com.haak.haaksq.form.StmImg;
import com.haak.haaksq.form.UploadForm;
import com.haak.haaksq.form.UserProfileForm;
import com.haak.haaksq.service.AdminAddService;
import com.haak.haaksq.service.LoadPageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
 

@SessionAttributes({"menuformList","userdetail","adlist"})

@Controller
public class FileUploadController {
	
	
	
    
    @Autowired
    private AdminAddService adminService;    
     
    @RequestMapping(value = "/showajax.html", method = RequestMethod.GET)
    public String displayFormaj() {
        return "uploadpage2.html";
    }
  
    @RequestMapping(value = "/uploadETC.html", method = RequestMethod.GET)
    public String displayFormaj3() {
        return "saveIMGETC.html";
    }
    
	@RequestMapping(value = "/saveIMGETC.html"  , method = RequestMethod.POST)
	public @ResponseBody String loginpew(
  			  @ModelAttribute("images") FileUploadForm uploadForm,
  			  //@RequestParam(value="ipclient", required=true) String ipClient,
  			  @ModelAttribute(value= "userdetail") UserProfileForm userdetail,
			   HttpServletRequest request,  Model map) {
		 String ipClient = "0";
				System.out.println("xxxxxxxxxxxxxxxxxxxxx saveIMGETC xxxxxxxxxxxxxxxxxxxxx");
		
				
				String DAY = String.valueOf(java.util.Calendar.DAY_OF_MONTH);
				String MONTH = String.valueOf(java.util.Calendar.MONTH);
				String YEAR = String.valueOf(java.util.Calendar.YEAR);
				
				String imgPath = HaakConst.IMG_STREAMING +"/"+ YEAR +"/" +MONTH +"/"+DAY+"/";
				String newBigImageName =    HaakConst.IMG_STREAMING +"/"+ YEAR +"/" +MONTH +"/"+DAY+"/" +"H_";
				//String newSmallImageName =    realPath +"/"+ YEAR +"/" +MONTH +"/"+DAY+"/" +"H_"+multipartFile.getOriginalFilename();    
		
					

				MultipartHttpServletRequest mq = (MultipartHttpServletRequest)request;
		       List<MultipartFile> files = mq.getFiles("image_file");
		       List<String> fileNames = new ArrayList<String>();
		       String fileName = null;
		        if(null != files && files.size() > 0) {

		        	// single file
	                 fileName = System.currentTimeMillis()+".jpg";
	                saveAndResizeFiles(files.get(0), newBigImageName + fileName);
		        	
		        	//                 multi files
/*		        	for (MultipartFile multipartFile : files) {
		                String fileName = System.currentTimeMillis()+".jpg";
		                System.out.println("xxxxx " +fileName);
		                //saveFiles(multipartFile, request.getRealPath("") );
		                saveAndResizeFiles(multipartFile, newBigImageName + fileName);
		                fileNames.add(newBigImageName+fileName);
		            }*/
		        }
		        
		        StmImg stmImg =  adminService.save_img_stream(imgPath ,"H_" + fileName,userdetail.getUserID(),ipClient);


		        map.addAttribute("files", fileNames);
		        map.addAttribute("pliw", "Test Ajax");
		        
		   	return (newBigImageName + fileName + "-" + stmImg.getId());
 
	}
    
/*    
	@RequestMapping(value = "/ajaxsave"  , method = RequestMethod.POST)
	public @ResponseBody String ajaxsave(
			 @ModelAttribute("pic") FileUploadForm uploadForm,
            HttpServletRequest request,  Model map) {

		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		List<MultipartFile> files = multipartRequest.getFiles("pic");
		System.out.println("xxxxxxxxxxxxxxxxxxxxx ajax xxxxxxxxxxxxxxxxxxxxx");
		 
        String UPLOAD_FOLDER = "C:\\";
        List<String> fileNames = new ArrayList<String>();
         
        if(null != files && files.size() > 0) {
            for (MultipartFile multipartFile : files) {
 
                String fileName = multipartFile.getOriginalFilename();
        
                fileNames.add(fileName);
                saveAndResizeFiles(multipartFile, request.getRealPath("") );
 
            }
        }
        
        map.addAttribute("files", fileNames);
        map.addAttribute("pliw", "Test Ajax");
 
   	return null;
 
	}
  */
/*    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(
            @ModelAttribute("uploadForm") FileUploadForm uploadForm,
           
            HttpServletRequest request,
                    Model map) {
         
        List<MultipartFile> files = uploadForm.getFiles();
        String UPLOAD_FOLDER = "C:\\";
        List<String> fileNames = new ArrayList<String>();
         
        if(null != files && files.size() > 0) {
            for (MultipartFile multipartFile : files) {
 
                String fileName = multipartFile.getOriginalFilename();
                
                
                fileNames.add(fileName);
                //saveFiles(multipartFile, request.getRealPath("") );
                saveAndResizeFiles(multipartFile, request.getRealPath("") );
                //Handle file content - multipartFile.getInputStream()
 
                

                
            }
        }
         
        map.addAttribute("files", fileNames);
        return "uploadsuccess.html";
    }


*/
    
    private static BufferedImage resizeImage(BufferedImage originalImage, int type){
	BufferedImage resizedImage = new BufferedImage(HaakConst.IMG_B_WIDTH,HaakConst.IMG_B_HEIGHT, type);
	Graphics2D g = resizedImage.createGraphics();
	g.drawImage(originalImage, 0, 0,HaakConst.IMG_B_WIDTH,HaakConst.IMG_B_HEIGHT, null);
	g.dispose();
 
	return resizedImage;
    }
 
    private static BufferedImage resizeImageWithHint(BufferedImage originalImage, int type){
 
    int WIDTH = originalImage.getWidth()/2;
    int HEIGHT =originalImage.getHeight()/2;
    	
    while(WIDTH > 1024 || HEIGHT > 1024){
    	WIDTH = WIDTH/2;
    	HEIGHT = HEIGHT/2;
    } 	
    System.out.println("WIDTH >" +WIDTH + " <HEIGHT>" + HEIGHT);
	//BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
	BufferedImage resizedImage = new BufferedImage(WIDTH, HEIGHT, type);
	Graphics2D g = resizedImage.createGraphics();
	
	g.drawImage(originalImage, 0, 0,WIDTH, HEIGHT, null);
	g.dispose();	
	g.setComposite(AlphaComposite.Src);
 
	g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
	RenderingHints.VALUE_INTERPOLATION_BILINEAR);
	g.setRenderingHint(RenderingHints.KEY_RENDERING,
	//RenderingHints.VALUE_RENDER_QUALITY);
	RenderingHints.VALUE_RENDER_SPEED);
	g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
	RenderingHints.VALUE_ANTIALIAS_ON);
 
	return resizedImage;
    }	
	
    private void saveAndResizeFiles(MultipartFile multipartFile,String realPath){
		try {
			
			BufferedImage originalImage = ImageIO.read(multipartFile.getInputStream());
			int type = originalImage.getType() == 0? BufferedImage.TYPE_INT_ARGB : originalImage.getType();
			
			BufferedImage resizeImageHintJpg = resizeImageWithHint(originalImage, type);
			
			File realUpload = new File(realPath);
			realUpload.mkdirs();
			ImageIO.write(resizeImageHintJpg, "jpg", new File(realPath));	
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    	
    }
	
	private void saveFiles(MultipartFile multipartFile,String realPath){
    	
 /*   	multiPathFile.
		BufferedImage originalImage = ImageIO.read(new File("c:\\image\\mkyong.jpg"));
		int type = originalImage.getType() == 0? BufferedImage.TYPE_INT_ARGB : originalImage.getType();
 
		BufferedImage resizeImageHintJpg = resizeImageWithHint(originalImage, type);
		ImageIO.write(resizeImageHintJpg, "jpg", new File("c:\\image\\mkyong_hint_jpg.jpg")); 
 */
		
        // image type of file processing...
        System.err.println("-------------------------------------------");
        realPath = "D:/";
        try {
          InputStream inputStream = null;
          OutputStream outputStream = null;
          if (multipartFile.getSize() > 0) {
                 inputStream = multipartFile.getInputStream();
                 String fileName = realPath+   "/images/"+ multipartFile.getOriginalFilename();              
                 outputStream = new FileOutputStream(fileName);
                 int readBytes = 0;
                 byte[] buffer = new byte[5000000];
                 while ((readBytes = inputStream.read(buffer, 0, 5000000)) != -1) {
                        outputStream.write(buffer, 0, readBytes);
                  }
                 outputStream.close();
                 inputStream.close();
               }           
         } catch (Exception e) {
                e.printStackTrace();
         }

    	
    }
  
    
    
}