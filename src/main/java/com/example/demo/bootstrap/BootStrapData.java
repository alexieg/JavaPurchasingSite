package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.List;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if (outsourcedPartRepository.count() == 0) {
            OutsourcedPart keycaps = new OutsourcedPart();
            keycaps.setCompanyName("Basic Keys Company");
            keycaps.setName("Keycaps");
            keycaps.setInv(200);
            keycaps.setPrice(20.0);
            keycaps.setId(1);
            keycaps.setInvMin(100);
            keycaps.setInvMax(400);

            OutsourcedPart stabilizer = new OutsourcedPart();
            stabilizer.setCompanyName("Expensekeys Company");
            stabilizer.setName("Stabilizer");
            stabilizer.setInv(30);
            stabilizer.setPrice(3.0);
            stabilizer.setId(2);
            stabilizer.setInvMin(10);
            stabilizer.setInvMax(60);

            OutsourcedPart film = new OutsourcedPart();
            film.setCompanyName("Sleekeys Ltd.");
            film.setName("Keycap Film");
            film.setInv(100);
            film.setPrice(1.0);
            film.setId(3);
            film.setInvMin(50);
            film.setInvMax(300);

            OutsourcedPart customKeys = new OutsourcedPart();
            customKeys.setCompanyName("Expensekeys Company");
            customKeys.setName("Custom Art Keycap");
            customKeys.setInv(10);
            customKeys.setPrice(50.0);
            customKeys.setId(4);
            customKeys.setInvMin(1);
            customKeys.setInvMax(50);

            OutsourcedPart base = new OutsourcedPart();
            base.setCompanyName("SleeKeys Ltd.");
            base.setName("Keyboard Base");
            base.setInv(100);
            base.setPrice(30.0);
            base.setId(5);
            base.setInvMax(200);
            base.setInvMin(20);

            outsourcedPartRepository.save(keycaps);
            outsourcedPartRepository.save(stabilizer);
            outsourcedPartRepository.save(film);
            outsourcedPartRepository.save(customKeys);
            outsourcedPartRepository.save(base);

            OutsourcedPart thePart = null;
            List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for (OutsourcedPart part : outsourcedParts) {
                if (part.getName().equals("Keycaps")) thePart = part;
            }

            System.out.println(thePart.getCompanyName());
        }

        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

         if (productRepository.count() == 0) {
             Product cuteKeyboard = new Product("Cute Keyboard", 100.0, 40);
             Product modernKeyboard = new Product("Modern Keyboard", 200.0, 20);
             Product ergonomicKeyboard = new Product("Ergonomic Keyboard", 150.0, 15);
             Product splitKeyboard = new Product("Split Keyboard", 300.0, 15);
             Product customKeyboard = new Product("Custom Keyboard", 400.0, 10);
             productRepository.save(cuteKeyboard);
             productRepository.save(modernKeyboard);
             productRepository.save(ergonomicKeyboard);
             productRepository.save(splitKeyboard);
             productRepository.save(customKeyboard);
            }


        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
