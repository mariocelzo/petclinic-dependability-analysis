package org.springframework.samples.petclinic.generated;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0001");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        visit1.setDescription("");
        pet0.addVisit(visit1);
        org.springframework.samples.petclinic.owner.Visit visit5 = new org.springframework.samples.petclinic.owner.Visit();
        visit5.setDescription("");
        java.lang.Integer int8 = visit5.getId();
        pet0.addVisit(visit5);
        java.lang.Class<?> wildcardClass10 = pet0.getClass();
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0002");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        owner0.setCity("hi!");
        java.lang.String str6 = owner0.getTelephone();
        org.springframework.samples.petclinic.owner.Visit visit8 = new org.springframework.samples.petclinic.owner.Visit();
        visit8.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 1, visit8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0003");
        org.springframework.samples.petclinic.vet.Vets vets0 = new org.springframework.samples.petclinic.vet.Vets();
        java.util.List<org.springframework.samples.petclinic.vet.Vet> vetList1 = vets0.getVetList();
        java.lang.Class<?> wildcardClass2 = vetList1.getClass();
        org.junit.Assert.assertNotNull(vetList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0004");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Visit visit2 = new org.springframework.samples.petclinic.owner.Visit();
        visit2.setDescription("");
        java.time.LocalDate localDate5 = visit2.getDate();
        java.time.LocalDate localDate6 = visit2.getDate();
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) (-1), visit2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0005");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        owner0.setCity("hi!");
        owner0.setTelephone("hi!");
        owner0.setTelephone("hi!");
        org.springframework.samples.petclinic.owner.Pet pet11 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate12 = null;
        pet11.setBirthDate(localDate12);
        pet11.setName("");
        org.springframework.samples.petclinic.owner.Pet pet16 = new org.springframework.samples.petclinic.owner.Pet();
        pet16.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit19 = new org.springframework.samples.petclinic.owner.Visit();
        visit19.setDescription("");
        boolean boolean22 = visit19.isNew();
        pet16.addVisit(visit19);
        pet11.addVisit(visit19);
        visit19.setDescription("<null>");
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 1, visit19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0006");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        owner0.setCity("hi!");
        owner0.setTelephone("hi!");
        owner0.setTelephone("hi!");
        org.springframework.samples.petclinic.owner.Pet pet11 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit12 = new org.springframework.samples.petclinic.owner.Visit();
        pet11.addVisit(visit12);
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 1, visit12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet2);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0007");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 10);
        java.lang.String str6 = owner0.getFirstName();
        owner0.setFirstName("hi!");
        org.springframework.samples.petclinic.owner.Pet pet10 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit11 = new org.springframework.samples.petclinic.owner.Visit();
        visit11.setDescription("");
        pet10.addVisit(visit11);
        org.springframework.samples.petclinic.owner.Visit visit15 = new org.springframework.samples.petclinic.owner.Visit();
        visit15.setDescription("");
        java.lang.Integer int18 = visit15.getId();
        pet10.addVisit(visit15);
        java.lang.String str20 = visit15.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) (-1), visit15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0008");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType6 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int7 = petType6.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNull(petType6);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0009");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        owner0.setCity("hi!");
        owner0.setTelephone("hi!");
        boolean boolean8 = owner0.isNew();
        org.springframework.samples.petclinic.owner.Pet pet10 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit11 = new org.springframework.samples.petclinic.owner.Visit();
        visit11.setDescription("");
        pet10.addVisit(visit11);
        visit11.setDescription("");
        visit11.setDescription("<null>");
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) (-1), visit11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0010");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.Visit visit3 = new org.springframework.samples.petclinic.owner.Visit();
        visit3.setDescription("");
        java.time.LocalDate localDate6 = visit3.getDate();
        pet0.setBirthDate(localDate6);
        org.springframework.samples.petclinic.owner.Pet pet8 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit9 = new org.springframework.samples.petclinic.owner.Visit();
        visit9.setDescription("");
        pet8.addVisit(visit9);
        org.springframework.samples.petclinic.owner.Visit visit13 = new org.springframework.samples.petclinic.owner.Visit();
        visit13.setDescription("");
        java.lang.Integer int16 = visit13.getId();
        pet8.addVisit(visit13);
        java.lang.String str18 = visit13.getDescription();
        pet0.addVisit(visit13);
        java.lang.Class<?> wildcardClass20 = visit13.getClass();
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0011");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet("");
        org.springframework.samples.petclinic.owner.Pet pet6 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit7 = new org.springframework.samples.petclinic.owner.Visit();
        visit7.setDescription("");
        pet6.addVisit(visit7);
        org.springframework.samples.petclinic.owner.PetType petType11 = null;
        pet6.setType(petType11);
        owner0.addPet(pet6);
        java.lang.String str14 = owner0.getFirstName();
        java.lang.Class<?> wildcardClass15 = owner0.getClass();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0012");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit6 = new org.springframework.samples.petclinic.owner.Visit();
        pet0.addVisit(visit6);
        java.lang.Class<?> wildcardClass8 = pet0.getClass();
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0013");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty1 = new org.springframework.samples.petclinic.vet.Specialty();
        vet0.addSpecialty(specialty1);
        int int3 = vet0.getNrOfSpecialties();
        java.lang.String str4 = vet0.getFirstName();
        org.springframework.samples.petclinic.vet.Vet vet5 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty6 = new org.springframework.samples.petclinic.vet.Specialty();
        vet5.addSpecialty(specialty6);
        vet0.addSpecialty(specialty6);
        java.lang.String str9 = vet0.getLastName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0014");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList3 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet4 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate5 = null;
        pet4.setBirthDate(localDate5);
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet4.setType(petType7);
        java.time.LocalDate localDate9 = pet4.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit10 = new org.springframework.samples.petclinic.owner.Visit();
        pet4.addVisit(visit10);
        owner0.addPet(pet4);
        java.lang.String str13 = owner0.getTelephone();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList14 = owner0.getPets();
        owner0.setLastName("hi!");
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList3);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(petList14);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0015");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setAddress("<null>");
        org.springframework.samples.petclinic.owner.Visit visit4 = new org.springframework.samples.petclinic.owner.Visit();
        visit4.setDescription("");
        java.time.LocalDate localDate7 = visit4.getDate();
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 0, visit4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0016");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.Visit visit7 = new org.springframework.samples.petclinic.owner.Visit();
        visit7.setDescription("");
        java.time.LocalDate localDate10 = visit7.getDate();
        pet0.setBirthDate(localDate10);
        java.lang.Class<?> wildcardClass12 = pet0.getClass();
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0017");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit3 = new org.springframework.samples.petclinic.owner.Visit();
        visit3.setDescription("");
        boolean boolean6 = visit3.isNew();
        pet0.addVisit(visit3);
        java.lang.Class<?> wildcardClass8 = visit3.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0018");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList1 = vet0.getSpecialties();
        java.lang.Class<?> wildcardClass2 = vet0.getClass();
        org.junit.Assert.assertNotNull(specialtyList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0019");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 10);
        java.lang.String str6 = owner0.getFirstName();
        owner0.setFirstName("hi!");
        org.springframework.samples.petclinic.owner.Pet pet10 = owner0.getPet("<null>");
        org.springframework.samples.petclinic.owner.Visit visit12 = new org.springframework.samples.petclinic.owner.Visit();
        visit12.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 100, visit12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(pet10);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0020");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        java.lang.String str9 = owner0.getTelephone();
        java.lang.String str10 = owner0.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet12 = owner0.getPet((java.lang.Integer) (-1));
        org.springframework.samples.petclinic.owner.Pet pet14 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit15 = new org.springframework.samples.petclinic.owner.Visit();
        pet14.addVisit(visit15);
        java.lang.String str17 = visit15.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 10, visit15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertNull(pet12);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0021");
        org.springframework.samples.petclinic.model.NamedEntity namedEntity0 = new org.springframework.samples.petclinic.model.NamedEntity();
        namedEntity0.setId((java.lang.Integer) 10);
        java.lang.String str3 = namedEntity0.getName();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0022");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList1 = vet0.getSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList2 = vet0.getSpecialties();
        org.springframework.samples.petclinic.vet.Specialty specialty3 = null;
        vet0.addSpecialty(specialty3);
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList5 = vet0.getSpecialties();
        org.junit.Assert.assertNotNull(specialtyList1);
        org.junit.Assert.assertNotNull(specialtyList2);
        org.junit.Assert.assertNotNull(specialtyList5);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0023");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 10);
        java.lang.String str6 = owner0.getFirstName();
        java.lang.String str7 = owner0.getCity();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Visit visit10 = new org.springframework.samples.petclinic.owner.Visit();
        visit10.setDescription("");
        boolean boolean13 = visit10.isNew();
        java.lang.String str14 = visit10.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 10, visit10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0024");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        java.lang.String str9 = owner0.getTelephone();
        java.lang.String str10 = owner0.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet12 = owner0.getPet((java.lang.Integer) (-1));
        org.springframework.samples.petclinic.owner.Pet pet14 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit15 = new org.springframework.samples.petclinic.owner.Visit();
        visit15.setDescription("");
        pet14.addVisit(visit15);
        org.springframework.samples.petclinic.owner.Visit visit19 = new org.springframework.samples.petclinic.owner.Visit();
        visit19.setDescription("");
        java.lang.Integer int22 = visit19.getId();
        pet14.addVisit(visit19);
        org.springframework.samples.petclinic.owner.Visit visit24 = new org.springframework.samples.petclinic.owner.Visit();
        visit24.setDescription("");
        boolean boolean27 = visit24.isNew();
        java.lang.String str28 = visit24.getDescription();
        pet14.addVisit(visit24);
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 10, visit24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertNull(pet12);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0025");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        java.lang.String str4 = owner0.getCity();
        java.lang.Class<?> wildcardClass5 = owner0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0026");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType6 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            petType6.setName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNull(petType6);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0027");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet3 = owner0.getPet("hi!", false);
        org.springframework.samples.petclinic.owner.Pet pet4 = new org.springframework.samples.petclinic.owner.Pet();
        pet4.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit7 = new org.springframework.samples.petclinic.owner.Visit();
        visit7.setDescription("");
        boolean boolean10 = visit7.isNew();
        pet4.addVisit(visit7);
        java.time.LocalDate localDate12 = pet4.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet13 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit14 = new org.springframework.samples.petclinic.owner.Visit();
        visit14.setDescription("");
        pet13.addVisit(visit14);
        org.springframework.samples.petclinic.owner.PetType petType18 = null;
        pet13.setType(petType18);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection20 = pet13.getVisits();
        pet13.setName("");
        org.springframework.samples.petclinic.owner.PetType petType23 = new org.springframework.samples.petclinic.owner.PetType();
        pet13.setType(petType23);
        pet4.setType(petType23);
        owner0.addPet(pet4);
        org.springframework.samples.petclinic.owner.Pet pet28 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit29 = new org.springframework.samples.petclinic.owner.Visit();
        visit29.setDescription("");
        pet28.addVisit(visit29);
        visit29.setDescription("");
        java.time.LocalDate localDate35 = visit29.getDate();
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 1, visit29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNotNull(visitCollection20);
        org.junit.Assert.assertNotNull(localDate35);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0028");
        org.springframework.samples.petclinic.owner.Visit visit0 = new org.springframework.samples.petclinic.owner.Visit();
        visit0.setDescription("");
        java.lang.Integer int3 = visit0.getId();
        java.time.LocalDate localDate4 = visit0.getDate();
        org.springframework.samples.petclinic.owner.Visit visit5 = new org.springframework.samples.petclinic.owner.Visit();
        visit5.setDescription("");
        java.time.LocalDate localDate8 = visit5.getDate();
        java.time.LocalDate localDate9 = visit5.getDate();
        visit0.setDate(localDate9);
        java.lang.Class<?> wildcardClass11 = localDate9.getClass();
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0029");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList3 = owner0.getPets();
        java.lang.String str4 = owner0.getFirstName();
        org.springframework.samples.petclinic.owner.Pet pet6 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate7 = null;
        pet6.setBirthDate(localDate7);
        org.springframework.samples.petclinic.owner.PetType petType9 = null;
        pet6.setType(petType9);
        java.time.LocalDate localDate11 = pet6.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType12 = pet6.getType();
        org.springframework.samples.petclinic.owner.Visit visit13 = new org.springframework.samples.petclinic.owner.Visit();
        visit13.setDescription("");
        java.lang.Integer int16 = visit13.getId();
        pet6.addVisit(visit13);
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) (-1), visit13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(petType12);
        org.junit.Assert.assertNull(int16);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0030");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit6 = new org.springframework.samples.petclinic.owner.Visit();
        visit6.setDescription("");
        java.lang.Integer int9 = visit6.getId();
        java.time.LocalDate localDate10 = visit6.getDate();
        pet0.setBirthDate(localDate10);
        java.time.LocalDate localDate12 = pet0.getBirthDate();
        java.lang.Class<?> wildcardClass13 = pet0.getClass();
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0031");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList7 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet9 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str10 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet13 = owner0.getPet("<null>", false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertNotNull(petList7);
        org.junit.Assert.assertNull(pet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertNull(pet13);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0032");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList3 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet4 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate5 = null;
        pet4.setBirthDate(localDate5);
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet4.setType(petType7);
        java.time.LocalDate localDate9 = pet4.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit10 = new org.springframework.samples.petclinic.owner.Visit();
        pet4.addVisit(visit10);
        owner0.addPet(pet4);
        java.lang.String str13 = owner0.getTelephone();
        org.springframework.samples.petclinic.owner.Visit visit15 = new org.springframework.samples.petclinic.owner.Visit();
        visit15.setDescription("");
        java.time.LocalDate localDate18 = visit15.getDate();
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 100, visit15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList3);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(localDate18);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0033");
        org.springframework.samples.petclinic.owner.Visit visit0 = new org.springframework.samples.petclinic.owner.Visit();
        visit0.setDescription("");
        java.time.LocalDate localDate3 = visit0.getDate();
        visit0.setId((java.lang.Integer) 1);
        boolean boolean6 = visit0.isNew();
        java.lang.String str7 = visit0.getDescription();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0034");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setId((java.lang.Integer) (-1));
        org.springframework.samples.petclinic.owner.Pet pet7 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit8 = new org.springframework.samples.petclinic.owner.Visit();
        pet7.addVisit(visit8);
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 10, visit8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0035");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        visit1.setDescription("");
        pet0.addVisit(visit1);
        org.springframework.samples.petclinic.owner.Pet pet5 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate6 = null;
        pet5.setBirthDate(localDate6);
        org.springframework.samples.petclinic.owner.Visit visit8 = new org.springframework.samples.petclinic.owner.Visit();
        visit8.setDescription("");
        java.time.LocalDate localDate11 = visit8.getDate();
        pet5.setBirthDate(localDate11);
        pet0.setBirthDate(localDate11);
        boolean boolean14 = pet0.isNew();
        java.lang.String str15 = pet0.getName();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection16 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType17 = pet0.getType();
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(visitCollection16);
        org.junit.Assert.assertNull(petType17);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0036");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = pet8.isNew();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertNull(pet8);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0037");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        java.lang.Integer int3 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        pet0.setId((java.lang.Integer) 1);
        java.lang.String str7 = pet0.toString();
        java.lang.Class<?> wildcardClass8 = pet0.getClass();
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<null>" + "'", str7, "<null>");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0038");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        java.lang.String str4 = owner0.toString();
        java.lang.Integer int5 = owner0.getId();
        owner0.setCity("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0039");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        owner0.setCity("hi!");
        owner0.setTelephone("hi!");
        owner0.setTelephone("hi!");
        org.springframework.samples.petclinic.owner.Pet pet10 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate11 = null;
        pet10.setBirthDate(localDate11);
        pet10.setName("");
        org.springframework.samples.petclinic.owner.Pet pet15 = new org.springframework.samples.petclinic.owner.Pet();
        pet15.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit18 = new org.springframework.samples.petclinic.owner.Visit();
        visit18.setDescription("");
        boolean boolean21 = visit18.isNew();
        pet15.addVisit(visit18);
        pet10.addVisit(visit18);
        java.lang.String str24 = pet10.getName();
        owner0.addPet(pet10);
        java.lang.String str26 = owner0.getLastName();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0040");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList3 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet4 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate5 = null;
        pet4.setBirthDate(localDate5);
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet4.setType(petType7);
        java.time.LocalDate localDate9 = pet4.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit10 = new org.springframework.samples.petclinic.owner.Visit();
        pet4.addVisit(visit10);
        owner0.addPet(pet4);
        java.lang.String str13 = owner0.getTelephone();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList14 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet17 = owner0.getPet("hi!", true);
        owner0.setTelephone("hi!");
        owner0.setCity("<null>");
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList3);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(petList14);
        org.junit.Assert.assertNull(pet17);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0041");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setId((java.lang.Integer) (-1));
        java.lang.String str6 = owner0.getFirstName();
        org.springframework.samples.petclinic.owner.Pet pet8 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate9 = null;
        pet8.setBirthDate(localDate9);
        pet8.setName("");
        org.springframework.samples.petclinic.owner.Pet pet13 = new org.springframework.samples.petclinic.owner.Pet();
        pet13.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit16 = new org.springframework.samples.petclinic.owner.Visit();
        visit16.setDescription("");
        boolean boolean19 = visit16.isNew();
        pet13.addVisit(visit16);
        pet8.addVisit(visit16);
        visit16.setDescription("<null>");
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 0, visit16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0042");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        owner0.setLastName("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0043");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        java.lang.String str4 = owner0.getCity();
        owner0.setLastName("");
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("");
        org.springframework.samples.petclinic.owner.Visit visit10 = new org.springframework.samples.petclinic.owner.Visit();
        visit10.setDescription("");
        java.time.LocalDate localDate13 = visit10.getDate();
        java.lang.String str14 = visit10.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 1, visit10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(pet8);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0044");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit3 = new org.springframework.samples.petclinic.owner.Visit();
        visit3.setDescription("");
        pet2.addVisit(visit3);
        org.springframework.samples.petclinic.owner.Visit visit7 = new org.springframework.samples.petclinic.owner.Visit();
        visit7.setDescription("");
        java.lang.Integer int10 = visit7.getId();
        pet2.addVisit(visit7);
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) (-1), visit7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0045");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        org.springframework.samples.petclinic.owner.Pet pet6 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit7 = new org.springframework.samples.petclinic.owner.Visit();
        visit7.setDescription("");
        pet6.addVisit(visit7);
        org.springframework.samples.petclinic.owner.Visit visit11 = new org.springframework.samples.petclinic.owner.Visit();
        visit11.setDescription("");
        java.lang.Integer int14 = visit11.getId();
        pet6.addVisit(visit11);
        owner0.addPet(pet6);
        owner0.setFirstName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int14);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0046");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType6 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = petType6.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNull(petType6);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0047");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        owner0.setCity("hi!");
        owner0.setTelephone("hi!");
        owner0.setTelephone("hi!");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList10 = owner0.getPets();
        java.lang.String str11 = owner0.getFirstName();
        org.springframework.samples.petclinic.owner.Pet pet13 = owner0.getPet("");
        java.lang.Class<?> wildcardClass14 = owner0.getClass();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(pet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0048");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList7 = owner0.getPets();
        java.lang.String str8 = owner0.getFirstName();
        owner0.setTelephone("<null>");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertNotNull(petList7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0049");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        owner0.setFirstName("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0050");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList7 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet9 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str10 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet13 = owner0.getPet("", true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertNotNull(petList7);
        org.junit.Assert.assertNull(pet9);
        org.junit.Assert.assertNull(pet13);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0051");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        pet0.setName("");
        org.springframework.samples.petclinic.owner.Pet pet5 = new org.springframework.samples.petclinic.owner.Pet();
        pet5.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit8 = new org.springframework.samples.petclinic.owner.Visit();
        visit8.setDescription("");
        boolean boolean11 = visit8.isNew();
        pet5.addVisit(visit8);
        java.time.LocalDate localDate13 = pet5.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet14 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit15 = new org.springframework.samples.petclinic.owner.Visit();
        visit15.setDescription("");
        pet14.addVisit(visit15);
        org.springframework.samples.petclinic.owner.PetType petType19 = null;
        pet14.setType(petType19);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection21 = pet14.getVisits();
        pet14.setName("");
        org.springframework.samples.petclinic.owner.PetType petType24 = new org.springframework.samples.petclinic.owner.PetType();
        pet14.setType(petType24);
        pet5.setType(petType24);
        pet0.setType(petType24);
        java.lang.String str28 = petType24.getName();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNotNull(visitCollection21);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0052");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList4 = owner0.getPets();
        owner0.setLastName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit8 = new org.springframework.samples.petclinic.owner.Visit();
        visit8.setDescription("");
        java.time.LocalDate localDate11 = visit8.getDate();
        visit8.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) (-1), visit8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList4);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0053");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList4 = owner0.getPets();
        java.lang.String str5 = owner0.getAddress();
        owner0.setTelephone("");
        java.lang.String str8 = owner0.getTelephone();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0054");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList4 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet6 = owner0.getPet("");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList7 = owner0.getPets();
        owner0.setFirstName("");
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList4);
        org.junit.Assert.assertNull(pet6);
        org.junit.Assert.assertNotNull(petList7);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0055");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        owner0.setCity("");
        owner0.setTelephone("hi!");
        org.springframework.samples.petclinic.owner.Pet pet12 = new org.springframework.samples.petclinic.owner.Pet();
        pet12.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit15 = new org.springframework.samples.petclinic.owner.Visit();
        visit15.setDescription("");
        boolean boolean18 = visit15.isNew();
        pet12.addVisit(visit15);
        java.time.LocalDate localDate20 = visit15.getDate();
        org.springframework.samples.petclinic.owner.Visit visit21 = new org.springframework.samples.petclinic.owner.Visit();
        visit21.setDescription("");
        java.lang.Integer int24 = visit21.getId();
        java.time.LocalDate localDate25 = visit21.getDate();
        org.springframework.samples.petclinic.owner.Visit visit26 = new org.springframework.samples.petclinic.owner.Visit();
        visit26.setDescription("");
        java.time.LocalDate localDate29 = visit26.getDate();
        java.time.LocalDate localDate30 = visit26.getDate();
        visit21.setDate(localDate30);
        visit15.setDate(localDate30);
        visit15.setDescription("");
        java.lang.Integer int35 = visit15.getId();
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 1, visit15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNull(int35);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0056");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        java.lang.Class<?> wildcardClass7 = visitCollection6.getClass();
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0057");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        java.lang.String str9 = owner0.getTelephone();
        java.lang.String str10 = owner0.getTelephone();
        java.lang.String str11 = owner0.toString();
        java.lang.String str12 = owner0.getCity();
        org.springframework.samples.petclinic.owner.Pet pet15 = owner0.getPet("", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = pet15.isNew();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(pet15);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0058");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet3 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit4 = new org.springframework.samples.petclinic.owner.Visit();
        visit4.setDescription("");
        pet3.addVisit(visit4);
        org.springframework.samples.petclinic.owner.PetType petType8 = null;
        pet3.setType(petType8);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection10 = pet3.getVisits();
        pet3.setName("");
        org.springframework.samples.petclinic.owner.PetType petType13 = new org.springframework.samples.petclinic.owner.PetType();
        pet3.setType(petType13);
        pet0.setType(petType13);
        pet0.setName("<null>");
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection18 = pet0.getVisits();
        org.junit.Assert.assertNotNull(visitCollection10);
        org.junit.Assert.assertNotNull(visitCollection18);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0059");
        org.springframework.samples.petclinic.model.NamedEntity namedEntity0 = new org.springframework.samples.petclinic.model.NamedEntity();
        namedEntity0.setId((java.lang.Integer) 10);
        boolean boolean3 = namedEntity0.isNew();
        java.lang.String str4 = namedEntity0.toString();
        boolean boolean5 = namedEntity0.isNew();
        java.lang.String str6 = namedEntity0.getName();
        java.lang.Class<?> wildcardClass7 = namedEntity0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<null>" + "'", str4, "<null>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0060");
        org.springframework.samples.petclinic.model.NamedEntity namedEntity0 = new org.springframework.samples.petclinic.model.NamedEntity();
        java.lang.Integer int1 = namedEntity0.getId();
        java.lang.String str2 = namedEntity0.getName();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0061");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList3 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet4 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate5 = null;
        pet4.setBirthDate(localDate5);
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet4.setType(petType7);
        java.time.LocalDate localDate9 = pet4.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit10 = new org.springframework.samples.petclinic.owner.Visit();
        pet4.addVisit(visit10);
        owner0.addPet(pet4);
        java.lang.String str13 = owner0.getTelephone();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList14 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet17 = owner0.getPet("hi!", true);
        owner0.setTelephone("hi!");
        java.lang.String str20 = owner0.getAddress();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList3);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(petList14);
        org.junit.Assert.assertNull(pet17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0062");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("hi!");
        owner0.setTelephone("hi!");
        org.springframework.samples.petclinic.owner.Pet pet13 = owner0.getPet("<null>", false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertNull(pet8);
        org.junit.Assert.assertNull(pet13);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0063");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        pet0.setName("");
        pet0.setName("");
        boolean boolean7 = pet0.isNew();
        org.springframework.samples.petclinic.owner.Pet pet8 = new org.springframework.samples.petclinic.owner.Pet();
        pet8.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit11 = new org.springframework.samples.petclinic.owner.Visit();
        visit11.setDescription("");
        boolean boolean14 = visit11.isNew();
        pet8.addVisit(visit11);
        java.time.LocalDate localDate16 = pet8.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet17 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit18 = new org.springframework.samples.petclinic.owner.Visit();
        visit18.setDescription("");
        pet17.addVisit(visit18);
        org.springframework.samples.petclinic.owner.PetType petType22 = null;
        pet17.setType(petType22);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection24 = pet17.getVisits();
        pet17.setName("");
        org.springframework.samples.petclinic.owner.PetType petType27 = new org.springframework.samples.petclinic.owner.PetType();
        pet17.setType(petType27);
        pet8.setType(petType27);
        pet0.setType(petType27);
        org.springframework.samples.petclinic.owner.Pet pet31 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit32 = new org.springframework.samples.petclinic.owner.Visit();
        visit32.setDescription("");
        pet31.addVisit(visit32);
        java.time.LocalDate localDate36 = visit32.getDate();
        pet0.setBirthDate(localDate36);
        org.springframework.samples.petclinic.owner.Pet pet38 = new org.springframework.samples.petclinic.owner.Pet();
        pet38.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit41 = new org.springframework.samples.petclinic.owner.Visit();
        visit41.setDescription("");
        boolean boolean44 = visit41.isNew();
        pet38.addVisit(visit41);
        java.time.LocalDate localDate46 = visit41.getDate();
        org.springframework.samples.petclinic.owner.Visit visit47 = new org.springframework.samples.petclinic.owner.Visit();
        visit47.setDescription("");
        java.lang.Integer int50 = visit47.getId();
        java.time.LocalDate localDate51 = visit47.getDate();
        org.springframework.samples.petclinic.owner.Visit visit52 = new org.springframework.samples.petclinic.owner.Visit();
        visit52.setDescription("");
        java.time.LocalDate localDate55 = visit52.getDate();
        java.time.LocalDate localDate56 = visit52.getDate();
        visit47.setDate(localDate56);
        visit41.setDate(localDate56);
        visit41.setDescription("");
        java.time.LocalDate localDate61 = visit41.getDate();
        pet0.setBirthDate(localDate61);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNotNull(visitCollection24);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertNull(int50);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertNotNull(localDate56);
        org.junit.Assert.assertNotNull(localDate61);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0064");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList4 = owner0.getPets();
        java.lang.String str5 = owner0.getAddress();
        java.lang.Class<?> wildcardClass6 = owner0.getClass();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0065");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit6 = new org.springframework.samples.petclinic.owner.Visit();
        visit6.setDescription("");
        java.lang.Integer int9 = visit6.getId();
        java.time.LocalDate localDate10 = visit6.getDate();
        pet0.setBirthDate(localDate10);
        java.lang.Class<?> wildcardClass12 = localDate10.getClass();
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0066");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        java.lang.String str4 = owner0.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet6 = owner0.getPet((java.lang.Integer) 1);
        org.springframework.samples.petclinic.owner.Visit visit8 = new org.springframework.samples.petclinic.owner.Visit();
        visit8.setDescription("");
        java.lang.Integer int11 = visit8.getId();
        java.time.LocalDate localDate12 = visit8.getDate();
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) (-1), visit8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(pet6);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0067");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty1 = new org.springframework.samples.petclinic.vet.Specialty();
        vet0.addSpecialty(specialty1);
        int int3 = vet0.getNrOfSpecialties();
        java.lang.String str4 = vet0.getFirstName();
        org.springframework.samples.petclinic.vet.Vet vet5 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty6 = new org.springframework.samples.petclinic.vet.Specialty();
        vet5.addSpecialty(specialty6);
        vet0.addSpecialty(specialty6);
        vet0.setLastName("");
        int int11 = vet0.getNrOfSpecialties();
        java.lang.Integer int12 = vet0.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0068");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        java.lang.String str9 = owner0.getTelephone();
        java.lang.String str10 = owner0.getTelephone();
        java.lang.String str11 = owner0.toString();
        java.lang.String str12 = owner0.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet15 = owner0.getPet("<null>", true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = pet15.isNew();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<null>" + "'", str12, "<null>");
        org.junit.Assert.assertNull(pet15);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0069");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        java.lang.String str4 = owner0.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet6 = owner0.getPet((java.lang.Integer) 1);
        owner0.setCity("<null>");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(pet6);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0070");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setAddress("<null>");
        java.lang.Integer int3 = owner0.getId();
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0071");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList7 = owner0.getPets();
        owner0.setLastName("hi!");
        java.lang.String str10 = owner0.getCity();
        owner0.setCity("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertNotNull(petList7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0072");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        owner0.setCity("hi!");
        owner0.setCity("hi!");
        org.springframework.samples.petclinic.owner.Pet pet9 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate10 = null;
        pet9.setBirthDate(localDate10);
        org.springframework.samples.petclinic.owner.Visit visit12 = new org.springframework.samples.petclinic.owner.Visit();
        visit12.setDescription("");
        java.time.LocalDate localDate15 = visit12.getDate();
        pet9.setBirthDate(localDate15);
        org.springframework.samples.petclinic.owner.Pet pet17 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit18 = new org.springframework.samples.petclinic.owner.Visit();
        visit18.setDescription("");
        pet17.addVisit(visit18);
        org.springframework.samples.petclinic.owner.Visit visit22 = new org.springframework.samples.petclinic.owner.Visit();
        visit22.setDescription("");
        java.lang.Integer int25 = visit22.getId();
        pet17.addVisit(visit22);
        java.lang.String str27 = visit22.getDescription();
        pet9.addVisit(visit22);
        visit22.setDescription("<null>");
        java.time.LocalDate localDate31 = visit22.getDate();
        java.lang.Integer int32 = visit22.getId();
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 3, visit22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNull(int25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNull(int32);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0073");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        visit1.setDescription("");
        pet0.addVisit(visit1);
        org.springframework.samples.petclinic.owner.PetType petType5 = new org.springframework.samples.petclinic.owner.PetType();
        pet0.setType(petType5);
        java.time.LocalDate localDate7 = pet0.getBirthDate();
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0074");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        java.lang.String str9 = owner0.getTelephone();
        java.lang.String str10 = owner0.getTelephone();
        owner0.setTelephone("hi!");
        owner0.setLastName("");
        org.springframework.samples.petclinic.owner.Visit visit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 3, visit16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Visit must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0075");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        visit1.setDescription("");
        pet0.addVisit(visit1);
        org.springframework.samples.petclinic.owner.PetType petType5 = new org.springframework.samples.petclinic.owner.PetType();
        pet0.setType(petType5);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        java.lang.Class<?> wildcardClass8 = pet0.getClass();
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0076");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList3 = owner0.getPets();
        java.lang.String str4 = owner0.getFirstName();
        owner0.setCity("hi!");
        java.lang.String str7 = owner0.toString();
        java.lang.String str8 = owner0.getFirstName();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0077");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 10);
        java.lang.String str6 = owner0.getFirstName();
        owner0.setFirstName("hi!");
        java.lang.String str9 = owner0.getCity();
        org.springframework.samples.petclinic.owner.Pet pet11 = owner0.getPet("hi!");
        java.lang.String str12 = owner0.getTelephone();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(pet11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0078");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType6 = pet0.getType();
        org.springframework.samples.petclinic.owner.Pet pet7 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit8 = new org.springframework.samples.petclinic.owner.Visit();
        visit8.setDescription("");
        pet7.addVisit(visit8);
        visit8.setDescription("");
        java.time.LocalDate localDate14 = visit8.getDate();
        pet0.setBirthDate(localDate14);
        java.lang.String str16 = pet0.toString();
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNull(petType6);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<null>" + "'", str16, "<null>");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0079");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList4 = owner0.getPets();
        java.lang.Class<?> wildcardClass5 = owner0.getClass();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0080");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList4 = owner0.getPets();
        owner0.setLastName("<null>");
        java.lang.String str7 = owner0.getCity();
        owner0.setTelephone("<null>");
        owner0.setLastName("hi!");
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0081");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList7 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet9 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str10 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet12 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate13 = null;
        pet12.setBirthDate(localDate13);
        java.time.LocalDate localDate15 = pet12.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit16 = new org.springframework.samples.petclinic.owner.Visit();
        visit16.setDescription("");
        java.time.LocalDate localDate19 = visit16.getDate();
        visit16.setDescription("");
        pet12.addVisit(visit16);
        org.springframework.samples.petclinic.owner.Pet pet23 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit24 = new org.springframework.samples.petclinic.owner.Visit();
        visit24.setDescription("");
        pet23.addVisit(visit24);
        visit24.setDescription("");
        java.time.LocalDate localDate30 = visit24.getDate();
        visit16.setDate(localDate30);
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 10, visit16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertNotNull(petList7);
        org.junit.Assert.assertNull(pet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate30);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0082");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        org.springframework.samples.petclinic.owner.Pet pet6 = owner0.getPet("hi!", false);
        org.springframework.samples.petclinic.owner.Pet pet7 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit8 = new org.springframework.samples.petclinic.owner.Visit();
        visit8.setDescription("");
        pet7.addVisit(visit8);
        org.springframework.samples.petclinic.owner.PetType petType12 = null;
        pet7.setType(petType12);
        java.time.LocalDate localDate14 = pet7.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection15 = pet7.getVisits();
        owner0.addPet(pet7);
        owner0.setFirstName("<null>");
        java.lang.Class<?> wildcardClass19 = owner0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(pet6);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNotNull(visitCollection15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0083");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList4 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet6 = owner0.getPet("");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList7 = owner0.getPets();
        owner0.setFirstName("<null>");
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList4);
        org.junit.Assert.assertNull(pet6);
        org.junit.Assert.assertNotNull(petList7);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0084");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        java.lang.String str9 = owner0.getTelephone();
        java.lang.String str10 = owner0.getTelephone();
        java.lang.Integer int11 = owner0.getId();
        java.lang.String str12 = owner0.getAddress();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList13 = owner0.getPets();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<null>" + "'", str12, "<null>");
        org.junit.Assert.assertNotNull(petList13);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0085");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet3 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit4 = new org.springframework.samples.petclinic.owner.Visit();
        visit4.setDescription("");
        pet3.addVisit(visit4);
        org.springframework.samples.petclinic.owner.PetType petType8 = null;
        pet3.setType(petType8);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection10 = pet3.getVisits();
        pet3.setName("");
        org.springframework.samples.petclinic.owner.PetType petType13 = new org.springframework.samples.petclinic.owner.PetType();
        pet3.setType(petType13);
        pet0.setType(petType13);
        java.time.LocalDate localDate16 = pet0.getBirthDate();
        java.time.LocalDate localDate17 = pet0.getBirthDate();
        org.junit.Assert.assertNotNull(visitCollection10);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0086");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        org.springframework.samples.petclinic.owner.Pet pet6 = owner0.getPet("hi!", false);
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("");
        java.lang.String str9 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Visit visit11 = new org.springframework.samples.petclinic.owner.Visit();
        visit11.setDescription("");
        java.time.LocalDate localDate14 = visit11.getDate();
        java.time.LocalDate localDate15 = visit11.getDate();
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 10, visit11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(pet6);
        org.junit.Assert.assertNull(pet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0087");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet("", false);
        owner0.setTelephone("<null>");
        org.springframework.samples.petclinic.owner.Pet pet10 = owner0.getPet("<null>", false);
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(pet10);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0088");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit3 = new org.springframework.samples.petclinic.owner.Visit();
        visit3.setDescription("");
        boolean boolean6 = visit3.isNew();
        pet0.addVisit(visit3);
        java.time.LocalDate localDate8 = visit3.getDate();
        org.springframework.samples.petclinic.owner.Visit visit9 = new org.springframework.samples.petclinic.owner.Visit();
        visit9.setDescription("");
        java.lang.Integer int12 = visit9.getId();
        java.time.LocalDate localDate13 = visit9.getDate();
        org.springframework.samples.petclinic.owner.Visit visit14 = new org.springframework.samples.petclinic.owner.Visit();
        visit14.setDescription("");
        java.time.LocalDate localDate17 = visit14.getDate();
        java.time.LocalDate localDate18 = visit14.getDate();
        visit9.setDate(localDate18);
        visit3.setDate(localDate18);
        visit3.setDescription("");
        java.time.LocalDate localDate23 = null;
        visit3.setDate(localDate23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate18);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0089");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty1 = new org.springframework.samples.petclinic.vet.Specialty();
        vet0.addSpecialty(specialty1);
        int int3 = vet0.getNrOfSpecialties();
        java.lang.String str4 = vet0.getFirstName();
        org.springframework.samples.petclinic.vet.Vet vet5 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty6 = new org.springframework.samples.petclinic.vet.Specialty();
        vet5.addSpecialty(specialty6);
        vet0.addSpecialty(specialty6);
        java.lang.Class<?> wildcardClass9 = specialty6.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0090");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList3 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet4 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate5 = null;
        pet4.setBirthDate(localDate5);
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet4.setType(petType7);
        java.time.LocalDate localDate9 = pet4.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit10 = new org.springframework.samples.petclinic.owner.Visit();
        pet4.addVisit(visit10);
        owner0.addPet(pet4);
        org.springframework.samples.petclinic.owner.PetType petType13 = pet4.getType();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList3);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(petType13);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0091");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        pet0.addVisit(visit1);
        org.springframework.samples.petclinic.owner.Pet pet3 = new org.springframework.samples.petclinic.owner.Pet();
        pet3.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit6 = new org.springframework.samples.petclinic.owner.Visit();
        visit6.setDescription("");
        boolean boolean9 = visit6.isNew();
        pet3.addVisit(visit6);
        java.time.LocalDate localDate11 = visit6.getDate();
        visit1.setDate(localDate11);
        visit1.setDescription("");
        org.springframework.samples.petclinic.owner.Pet pet15 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate16 = null;
        pet15.setBirthDate(localDate16);
        org.springframework.samples.petclinic.owner.Visit visit18 = new org.springframework.samples.petclinic.owner.Visit();
        visit18.setDescription("");
        java.time.LocalDate localDate21 = visit18.getDate();
        pet15.setBirthDate(localDate21);
        org.springframework.samples.petclinic.owner.Pet pet23 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit24 = new org.springframework.samples.petclinic.owner.Visit();
        visit24.setDescription("");
        pet23.addVisit(visit24);
        org.springframework.samples.petclinic.owner.Visit visit28 = new org.springframework.samples.petclinic.owner.Visit();
        visit28.setDescription("");
        java.lang.Integer int31 = visit28.getId();
        pet23.addVisit(visit28);
        java.lang.String str33 = visit28.getDescription();
        pet15.addVisit(visit28);
        visit28.setDescription("<null>");
        java.time.LocalDate localDate37 = visit28.getDate();
        visit1.setDate(localDate37);
        java.lang.String str39 = visit1.getDescription();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNull(int31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0092");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType6 = pet0.getType();
        pet0.setName("<null>");
        java.lang.String str9 = pet0.getName();
        pet0.setId((java.lang.Integer) 100);
        org.springframework.samples.petclinic.owner.PetType petType12 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = petType12.isNew();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNull(petType6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertNull(petType12);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0093");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        java.lang.String str9 = owner0.getTelephone();
        java.lang.String str10 = owner0.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet12 = owner0.getPet((java.lang.Integer) (-1));
        owner0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertNull(pet12);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0094");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty1 = new org.springframework.samples.petclinic.vet.Specialty();
        specialty1.setId((java.lang.Integer) 100);
        vet0.addSpecialty(specialty1);
        org.springframework.samples.petclinic.vet.Vet vet5 = new org.springframework.samples.petclinic.vet.Vet();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList6 = vet5.getSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList7 = vet5.getSpecialties();
        java.lang.String str8 = vet5.getLastName();
        org.springframework.samples.petclinic.vet.Specialty specialty9 = new org.springframework.samples.petclinic.vet.Specialty();
        specialty9.setId((java.lang.Integer) 100);
        vet5.addSpecialty(specialty9);
        vet0.addSpecialty(specialty9);
        java.lang.String str14 = vet0.getFirstName();
        org.junit.Assert.assertNotNull(specialtyList6);
        org.junit.Assert.assertNotNull(specialtyList7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0095");
        org.springframework.samples.petclinic.model.BaseEntity baseEntity0 = new org.springframework.samples.petclinic.model.BaseEntity();
        boolean boolean1 = baseEntity0.isNew();
        boolean boolean2 = baseEntity0.isNew();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0096");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType6 = pet0.getType();
        pet0.setName("<null>");
        java.lang.String str9 = pet0.getName();
        org.springframework.samples.petclinic.owner.Visit visit10 = new org.springframework.samples.petclinic.owner.Visit();
        visit10.setDescription("");
        java.lang.Integer int13 = visit10.getId();
        boolean boolean14 = visit10.isNew();
        pet0.addVisit(visit10);
        java.lang.Class<?> wildcardClass16 = visit10.getClass();
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNull(petType6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0097");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.Visit visit3 = new org.springframework.samples.petclinic.owner.Visit();
        visit3.setDescription("");
        java.time.LocalDate localDate6 = visit3.getDate();
        pet0.setBirthDate(localDate6);
        java.lang.String str8 = pet0.getName();
        java.time.LocalDate localDate9 = pet0.getBirthDate();
        java.lang.Class<?> wildcardClass10 = localDate9.getClass();
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0098");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType6 = pet0.getType();
        pet0.setName("<null>");
        java.lang.String str9 = pet0.getName();
        org.springframework.samples.petclinic.owner.Visit visit10 = new org.springframework.samples.petclinic.owner.Visit();
        visit10.setDescription("");
        java.lang.Integer int13 = visit10.getId();
        boolean boolean14 = visit10.isNew();
        pet0.addVisit(visit10);
        java.lang.String str16 = visit10.getDescription();
        java.lang.String str17 = visit10.getDescription();
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNull(petType6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0099");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        visit1.setDescription("");
        pet0.addVisit(visit1);
        org.springframework.samples.petclinic.owner.PetType petType5 = null;
        pet0.setType(petType5);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        pet0.setName("");
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection10 = pet0.getVisits();
        java.time.LocalDate localDate11 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection12 = pet0.getVisits();
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertNotNull(visitCollection10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNotNull(visitCollection12);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0100");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        java.lang.String str9 = owner0.getTelephone();
        java.lang.String str10 = owner0.getTelephone();
        java.lang.String str11 = owner0.toString();
        java.lang.String str12 = owner0.getCity();
        org.springframework.samples.petclinic.owner.Pet pet15 = owner0.getPet("", false);
        org.springframework.samples.petclinic.owner.Pet pet16 = null;
        // The following exception was thrown during execution in test generation
        try {
            owner0.addPet(pet16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.samples.petclinic.owner.Pet.isNew()\" because \"pet\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(pet15);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0101");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        owner0.setCity("hi!");
        owner0.setCity("hi!");
        java.lang.String str8 = owner0.getTelephone();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0102");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        java.lang.String str4 = owner0.getCity();
        java.lang.String str5 = owner0.getTelephone();
        java.lang.String str6 = owner0.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet7 = new org.springframework.samples.petclinic.owner.Pet();
        pet7.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet10 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit11 = new org.springframework.samples.petclinic.owner.Visit();
        visit11.setDescription("");
        pet10.addVisit(visit11);
        org.springframework.samples.petclinic.owner.PetType petType15 = null;
        pet10.setType(petType15);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection17 = pet10.getVisits();
        pet10.setName("");
        org.springframework.samples.petclinic.owner.PetType petType20 = new org.springframework.samples.petclinic.owner.PetType();
        pet10.setType(petType20);
        pet7.setType(petType20);
        pet7.setName("<null>");
        org.springframework.samples.petclinic.owner.PetType petType25 = pet7.getType();
        owner0.addPet(pet7);
        java.lang.Integer int27 = pet7.getId();
        org.springframework.samples.petclinic.owner.PetType petType28 = pet7.getType();
        org.springframework.samples.petclinic.owner.Visit visit29 = new org.springframework.samples.petclinic.owner.Visit();
        visit29.setDescription("");
        java.lang.Integer int32 = visit29.getId();
        org.springframework.samples.petclinic.owner.Pet pet33 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit34 = new org.springframework.samples.petclinic.owner.Visit();
        visit34.setDescription("");
        pet33.addVisit(visit34);
        org.springframework.samples.petclinic.owner.PetType petType38 = null;
        pet33.setType(petType38);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection40 = pet33.getVisits();
        pet33.setName("");
        org.springframework.samples.petclinic.owner.PetType petType43 = pet33.getType();
        java.time.LocalDate localDate44 = pet33.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet45 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit46 = new org.springframework.samples.petclinic.owner.Visit();
        visit46.setDescription("");
        pet45.addVisit(visit46);
        org.springframework.samples.petclinic.owner.Pet pet50 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate51 = null;
        pet50.setBirthDate(localDate51);
        org.springframework.samples.petclinic.owner.Visit visit53 = new org.springframework.samples.petclinic.owner.Visit();
        visit53.setDescription("");
        java.time.LocalDate localDate56 = visit53.getDate();
        pet50.setBirthDate(localDate56);
        pet45.setBirthDate(localDate56);
        org.springframework.samples.petclinic.owner.Visit visit59 = new org.springframework.samples.petclinic.owner.Visit();
        visit59.setDescription("");
        java.time.LocalDate localDate62 = visit59.getDate();
        pet45.setBirthDate(localDate62);
        pet33.setBirthDate(localDate62);
        visit29.setDate(localDate62);
        pet7.addVisit(visit29);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(visitCollection17);
        org.junit.Assert.assertNotNull(petType25);
        org.junit.Assert.assertNull(int27);
        org.junit.Assert.assertNotNull(petType28);
        org.junit.Assert.assertNull(int32);
        org.junit.Assert.assertNotNull(visitCollection40);
        org.junit.Assert.assertNull(petType43);
        org.junit.Assert.assertNull(localDate44);
        org.junit.Assert.assertNotNull(localDate56);
        org.junit.Assert.assertNotNull(localDate62);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0103");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setId((java.lang.Integer) (-1));
        java.lang.String str6 = owner0.getTelephone();
        owner0.setAddress("<null>");
        java.lang.String str9 = owner0.getTelephone();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0104");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.Visit visit7 = new org.springframework.samples.petclinic.owner.Visit();
        visit7.setDescription("");
        java.time.LocalDate localDate10 = visit7.getDate();
        pet0.setBirthDate(localDate10);
        org.springframework.samples.petclinic.owner.Visit visit12 = new org.springframework.samples.petclinic.owner.Visit();
        visit12.setDescription("");
        java.lang.Integer int15 = visit12.getId();
        java.time.LocalDate localDate16 = visit12.getDate();
        pet0.setBirthDate(localDate16);
        java.time.LocalDate localDate18 = pet0.getBirthDate();
        boolean boolean19 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType20 = pet0.getType();
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(petType20);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0105");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        owner0.setCity("");
        java.lang.String str9 = owner0.getCity();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0106");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet("");
        org.springframework.samples.petclinic.owner.Pet pet6 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit7 = new org.springframework.samples.petclinic.owner.Visit();
        visit7.setDescription("");
        pet6.addVisit(visit7);
        org.springframework.samples.petclinic.owner.PetType petType11 = null;
        pet6.setType(petType11);
        owner0.addPet(pet6);
        java.lang.String str14 = owner0.getFirstName();
        owner0.setCity("");
        org.springframework.samples.petclinic.owner.Pet pet18 = owner0.getPet("<null>");
        owner0.setFirstName("");
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(pet18);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0107");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty1 = new org.springframework.samples.petclinic.vet.Specialty();
        specialty1.setId((java.lang.Integer) 100);
        vet0.addSpecialty(specialty1);
        vet0.setId((java.lang.Integer) 0);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0108");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        java.lang.String str4 = owner0.getCity();
        java.lang.String str5 = owner0.getTelephone();
        owner0.setTelephone("hi!");
        org.springframework.samples.petclinic.owner.Pet pet9 = new org.springframework.samples.petclinic.owner.Pet();
        pet9.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet12 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit13 = new org.springframework.samples.petclinic.owner.Visit();
        visit13.setDescription("");
        pet12.addVisit(visit13);
        org.springframework.samples.petclinic.owner.PetType petType17 = null;
        pet12.setType(petType17);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection19 = pet12.getVisits();
        pet12.setName("");
        org.springframework.samples.petclinic.owner.PetType petType22 = new org.springframework.samples.petclinic.owner.PetType();
        pet12.setType(petType22);
        pet9.setType(petType22);
        org.springframework.samples.petclinic.owner.Pet pet25 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate26 = null;
        pet25.setBirthDate(localDate26);
        java.time.LocalDate localDate28 = pet25.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit29 = new org.springframework.samples.petclinic.owner.Visit();
        visit29.setDescription("");
        java.time.LocalDate localDate32 = visit29.getDate();
        visit29.setDescription("");
        pet25.addVisit(visit29);
        pet9.addVisit(visit29);
        java.lang.String str37 = visit29.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 0, visit29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(visitCollection19);
        org.junit.Assert.assertNull(localDate28);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0109");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList3 = owner0.getPets();
        java.lang.String str4 = owner0.getFirstName();
        owner0.setCity("hi!");
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("hi!");
        org.springframework.samples.petclinic.owner.Pet pet10 = owner0.getPet((java.lang.Integer) (-1));
        org.springframework.samples.petclinic.owner.Pet pet13 = owner0.getPet("<null>", true);
        java.lang.String str14 = owner0.getAddress();
        owner0.setAddress("hi!");
        org.springframework.samples.petclinic.owner.Visit visit18 = new org.springframework.samples.petclinic.owner.Visit();
        visit18.setDescription("");
        java.time.LocalDate localDate21 = visit18.getDate();
        visit18.setId((java.lang.Integer) 1);
        boolean boolean24 = visit18.isNew();
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 10, visit18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(pet8);
        org.junit.Assert.assertNull(pet10);
        org.junit.Assert.assertNull(pet13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0110");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty1 = new org.springframework.samples.petclinic.vet.Specialty();
        specialty1.setId((java.lang.Integer) 100);
        vet0.addSpecialty(specialty1);
        org.springframework.samples.petclinic.vet.Vet vet5 = new org.springframework.samples.petclinic.vet.Vet();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList6 = vet5.getSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList7 = vet5.getSpecialties();
        java.lang.String str8 = vet5.getLastName();
        org.springframework.samples.petclinic.vet.Specialty specialty9 = new org.springframework.samples.petclinic.vet.Specialty();
        specialty9.setId((java.lang.Integer) 100);
        vet5.addSpecialty(specialty9);
        vet0.addSpecialty(specialty9);
        int int14 = vet0.getNrOfSpecialties();
        vet0.setId((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(specialtyList6);
        org.junit.Assert.assertNotNull(specialtyList7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0111");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit3 = new org.springframework.samples.petclinic.owner.Visit();
        visit3.setDescription("");
        boolean boolean6 = visit3.isNew();
        pet0.addVisit(visit3);
        visit3.setDescription("");
        java.lang.Class<?> wildcardClass10 = visit3.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0112");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList4 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet6 = owner0.getPet("");
        java.lang.String str7 = owner0.getLastName();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList4);
        org.junit.Assert.assertNull(pet6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0113");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList4 = owner0.getPets();
        java.lang.String str5 = owner0.getAddress();
        java.lang.String str6 = owner0.getLastName();
        java.lang.String str7 = owner0.getLastName();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0114");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        owner0.setCity("hi!");
        java.lang.String str6 = owner0.getTelephone();
        owner0.setCity("hi!");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList9 = owner0.getPets();
        java.lang.String str10 = owner0.getAddress();
        owner0.setTelephone("<null>");
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(petList9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0115");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        java.lang.String str4 = owner0.getCity();
        java.lang.String str5 = owner0.getFirstName();
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("<null>", true);
        org.springframework.samples.petclinic.owner.Pet pet10 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate11 = null;
        pet10.setBirthDate(localDate11);
        pet10.setName("");
        org.springframework.samples.petclinic.owner.Pet pet15 = new org.springframework.samples.petclinic.owner.Pet();
        pet15.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit18 = new org.springframework.samples.petclinic.owner.Visit();
        visit18.setDescription("");
        boolean boolean21 = visit18.isNew();
        pet15.addVisit(visit18);
        pet10.addVisit(visit18);
        visit18.setDescription("<null>");
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 100, visit18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(pet8);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0116");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList4 = owner0.getPets();
        owner0.setLastName("<null>");
        boolean boolean7 = owner0.isNew();
        org.springframework.samples.petclinic.owner.Pet pet8 = null;
        // The following exception was thrown during execution in test generation
        try {
            owner0.addPet(pet8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.samples.petclinic.owner.Pet.isNew()\" because \"pet\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0117");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        java.lang.String str4 = owner0.getCity();
        owner0.setTelephone("");
        org.springframework.samples.petclinic.owner.Pet pet7 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit8 = new org.springframework.samples.petclinic.owner.Visit();
        visit8.setDescription("");
        pet7.addVisit(visit8);
        org.springframework.samples.petclinic.owner.PetType petType12 = new org.springframework.samples.petclinic.owner.PetType();
        pet7.setType(petType12);
        java.lang.String str14 = pet7.toString();
        owner0.addPet(pet7);
        java.lang.String str16 = pet7.getName();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<null>" + "'", str14, "<null>");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0118");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList3 = owner0.getPets();
        java.lang.String str4 = owner0.getFirstName();
        owner0.setCity("hi!");
        org.springframework.samples.petclinic.owner.Pet pet9 = owner0.getPet("<null>", true);
        java.lang.String str10 = owner0.getCity();
        java.lang.String str11 = owner0.getLastName();
        org.springframework.samples.petclinic.owner.Pet pet13 = owner0.getPet("");
        boolean boolean14 = owner0.isNew();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(pet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(pet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0119");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        pet0.setName("");
        pet0.setName("");
        boolean boolean7 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType8 = pet0.getType();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(petType8);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0120");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        visit1.setDescription("");
        pet0.addVisit(visit1);
        org.springframework.samples.petclinic.owner.PetType petType5 = null;
        pet0.setType(petType5);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType10 = pet0.getType();
        java.time.LocalDate localDate11 = pet0.getBirthDate();
        java.time.LocalDate localDate12 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit13 = new org.springframework.samples.petclinic.owner.Visit();
        visit13.setDescription("");
        java.lang.Integer int16 = visit13.getId();
        java.lang.String str17 = visit13.getDescription();
        pet0.addVisit(visit13);
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertNull(petType10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0121");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        owner0.setCity("hi!");
        owner0.setTelephone("hi!");
        owner0.setTelephone("hi!");
        java.lang.String str10 = owner0.getCity();
        org.springframework.samples.petclinic.owner.Visit visit12 = new org.springframework.samples.petclinic.owner.Visit();
        visit12.setDescription("");
        java.lang.Integer int15 = visit12.getId();
        java.time.LocalDate localDate16 = visit12.getDate();
        visit12.setDescription("<null>");
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 2, visit12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0122");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        visit1.setDescription("");
        pet0.addVisit(visit1);
        org.springframework.samples.petclinic.owner.PetType petType5 = null;
        pet0.setType(petType5);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType10 = pet0.getType();
        org.springframework.samples.petclinic.owner.PetType petType11 = new org.springframework.samples.petclinic.owner.PetType();
        petType11.setName("hi!");
        pet0.setType(petType11);
        org.springframework.samples.petclinic.owner.PetType petType15 = pet0.getType();
        java.lang.String str16 = pet0.toString();
        pet0.setId((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertNull(petType10);
        org.junit.Assert.assertNotNull(petType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0123");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.Pet pet7 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit8 = new org.springframework.samples.petclinic.owner.Visit();
        visit8.setDescription("");
        pet7.addVisit(visit8);
        org.springframework.samples.petclinic.owner.PetType petType12 = null;
        pet7.setType(petType12);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection14 = pet7.getVisits();
        pet7.setName("");
        org.springframework.samples.petclinic.owner.PetType petType17 = new org.springframework.samples.petclinic.owner.PetType();
        pet7.setType(petType17);
        java.lang.Integer int19 = pet7.getId();
        org.springframework.samples.petclinic.owner.Pet pet20 = new org.springframework.samples.petclinic.owner.Pet();
        pet20.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet23 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit24 = new org.springframework.samples.petclinic.owner.Visit();
        visit24.setDescription("");
        pet23.addVisit(visit24);
        org.springframework.samples.petclinic.owner.PetType petType28 = null;
        pet23.setType(petType28);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection30 = pet23.getVisits();
        pet23.setName("");
        org.springframework.samples.petclinic.owner.PetType petType33 = new org.springframework.samples.petclinic.owner.PetType();
        pet23.setType(petType33);
        pet20.setType(petType33);
        pet20.setName("<null>");
        org.springframework.samples.petclinic.owner.PetType petType38 = pet20.getType();
        pet7.setType(petType38);
        pet0.setType(petType38);
        java.lang.String str41 = petType38.getName();
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNotNull(visitCollection14);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNotNull(visitCollection30);
        org.junit.Assert.assertNotNull(petType38);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0124");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 10);
        java.lang.String str6 = owner0.getFirstName();
        java.lang.String str7 = owner0.getCity();
        org.springframework.samples.petclinic.owner.Pet pet9 = owner0.getPet("hi!");
        org.springframework.samples.petclinic.owner.Visit visit11 = new org.springframework.samples.petclinic.owner.Visit();
        visit11.setDescription("");
        java.time.LocalDate localDate14 = visit11.getDate();
        java.time.LocalDate localDate15 = visit11.getDate();
        boolean boolean16 = visit11.isNew();
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 100, visit11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(pet9);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0125");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 10);
        java.lang.String str6 = owner0.getFirstName();
        owner0.setFirstName("hi!");
        boolean boolean9 = owner0.isNew();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0126");
        org.springframework.samples.petclinic.owner.PetType petType0 = new org.springframework.samples.petclinic.owner.PetType();
        petType0.setName("");
        java.lang.String str3 = petType0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0127");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 10);
        java.lang.String str6 = owner0.getFirstName();
        owner0.setFirstName("hi!");
        org.springframework.samples.petclinic.owner.Pet pet10 = owner0.getPet("<null>");
        owner0.setTelephone("");
        java.lang.String str13 = owner0.getFirstName();
        org.springframework.samples.petclinic.owner.Pet pet15 = owner0.getPet((java.lang.Integer) 0);
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(pet10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(pet15);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0128");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        owner0.setCity("hi!");
        java.lang.String str6 = owner0.getTelephone();
        owner0.setCity("hi!");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList9 = owner0.getPets();
        boolean boolean10 = owner0.isNew();
        org.springframework.samples.petclinic.owner.Pet pet13 = owner0.getPet("", true);
        org.springframework.samples.petclinic.owner.Pet pet16 = owner0.getPet("<null>", false);
        java.lang.String str17 = owner0.toString();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(petList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(pet13);
        org.junit.Assert.assertNull(pet16);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0129");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 10);
        java.lang.String str6 = owner0.getFirstName();
        owner0.setFirstName("");
        org.springframework.samples.petclinic.owner.Visit visit10 = new org.springframework.samples.petclinic.owner.Visit();
        java.lang.String str11 = visit10.getDescription();
        visit10.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 0, visit10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0130");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet3 = owner0.getPet("hi!", false);
        org.springframework.samples.petclinic.owner.Pet pet6 = owner0.getPet("", true);
        owner0.setLastName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet9 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate10 = null;
        pet9.setBirthDate(localDate10);
        pet9.setName("");
        owner0.addPet(pet9);
        java.lang.String str15 = pet9.getName();
        org.junit.Assert.assertNull(pet3);
        org.junit.Assert.assertNull(pet6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0131");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet("");
        owner0.setLastName("");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        java.lang.String str9 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet11 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit12 = new org.springframework.samples.petclinic.owner.Visit();
        visit12.setDescription("");
        pet11.addVisit(visit12);
        visit12.setDescription("");
        java.lang.String str18 = visit12.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 2, visit12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0132");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList4 = owner0.getPets();
        owner0.setLastName("");
        owner0.setLastName("hi!");
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList4);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0133");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 10);
        java.lang.String str6 = owner0.getFirstName();
        java.lang.String str7 = owner0.getCity();
        org.springframework.samples.petclinic.owner.Pet pet9 = owner0.getPet("hi!");
        java.lang.String str10 = owner0.getCity();
        owner0.setCity("<null>");
        owner0.setLastName("");
        java.lang.String str15 = owner0.getFirstName();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(pet9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0134");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit3 = new org.springframework.samples.petclinic.owner.Visit();
        visit3.setDescription("");
        boolean boolean6 = visit3.isNew();
        pet0.addVisit(visit3);
        java.time.LocalDate localDate8 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet9 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit10 = new org.springframework.samples.petclinic.owner.Visit();
        visit10.setDescription("");
        pet9.addVisit(visit10);
        org.springframework.samples.petclinic.owner.PetType petType14 = null;
        pet9.setType(petType14);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection16 = pet9.getVisits();
        pet9.setName("");
        org.springframework.samples.petclinic.owner.PetType petType19 = new org.springframework.samples.petclinic.owner.PetType();
        pet9.setType(petType19);
        pet0.setType(petType19);
        java.lang.Integer int22 = petType19.getId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNotNull(visitCollection16);
        org.junit.Assert.assertNull(int22);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0135");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = pet5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(pet5);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0136");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        owner0.setCity("hi!");
        java.lang.String str6 = owner0.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet((java.lang.Integer) 10);
        java.lang.String str9 = owner0.getCity();
        org.springframework.samples.petclinic.owner.Owner owner10 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet12 = owner10.getPet((java.lang.Integer) 0);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList13 = owner10.getPets();
        java.lang.String str14 = owner10.getFirstName();
        owner10.setCity("hi!");
        java.lang.String str17 = owner10.toString();
        org.springframework.samples.petclinic.owner.Pet pet18 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit19 = new org.springframework.samples.petclinic.owner.Visit();
        pet18.addVisit(visit19);
        owner10.addPet(pet18);
        owner0.addPet(pet18);
        java.lang.String str23 = pet18.toString();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(pet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(pet12);
        org.junit.Assert.assertNotNull(petList13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<null>" + "'", str23, "<null>");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0137");
        org.springframework.samples.petclinic.model.NamedEntity namedEntity0 = new org.springframework.samples.petclinic.model.NamedEntity();
        boolean boolean1 = namedEntity0.isNew();
        java.lang.String str2 = namedEntity0.toString();
        namedEntity0.setName("<null>");
        boolean boolean5 = namedEntity0.isNew();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<null>" + "'", str2, "<null>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0138");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit6 = new org.springframework.samples.petclinic.owner.Visit();
        pet0.addVisit(visit6);
        boolean boolean8 = pet0.isNew();
        java.lang.Class<?> wildcardClass9 = pet0.getClass();
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0139");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        visit1.setDescription("");
        pet0.addVisit(visit1);
        org.springframework.samples.petclinic.owner.PetType petType5 = null;
        pet0.setType(petType5);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType10 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = petType10.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertNull(petType10);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0140");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList3 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet4 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate5 = null;
        pet4.setBirthDate(localDate5);
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet4.setType(petType7);
        java.time.LocalDate localDate9 = pet4.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit10 = new org.springframework.samples.petclinic.owner.Visit();
        pet4.addVisit(visit10);
        owner0.addPet(pet4);
        java.lang.String str13 = owner0.getTelephone();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList14 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet15 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit16 = new org.springframework.samples.petclinic.owner.Visit();
        visit16.setDescription("");
        pet15.addVisit(visit16);
        org.springframework.samples.petclinic.owner.Pet pet20 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate21 = null;
        pet20.setBirthDate(localDate21);
        org.springframework.samples.petclinic.owner.Visit visit23 = new org.springframework.samples.petclinic.owner.Visit();
        visit23.setDescription("");
        java.time.LocalDate localDate26 = visit23.getDate();
        pet20.setBirthDate(localDate26);
        pet15.setBirthDate(localDate26);
        org.springframework.samples.petclinic.owner.Visit visit29 = new org.springframework.samples.petclinic.owner.Visit();
        visit29.setDescription("");
        java.time.LocalDate localDate32 = visit29.getDate();
        pet15.setBirthDate(localDate32);
        owner0.addPet(pet15);
        org.springframework.samples.petclinic.owner.Pet pet36 = owner0.getPet("");
        owner0.setTelephone("");
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList3);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(petList14);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNull(pet36);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0141");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        visit1.setDescription("");
        pet0.addVisit(visit1);
        visit1.setDescription("");
        java.lang.String str7 = visit1.getDescription();
        java.time.LocalDate localDate8 = visit1.getDate();
        org.springframework.samples.petclinic.owner.Pet pet9 = new org.springframework.samples.petclinic.owner.Pet();
        pet9.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit12 = new org.springframework.samples.petclinic.owner.Visit();
        visit12.setDescription("");
        boolean boolean15 = visit12.isNew();
        pet9.addVisit(visit12);
        java.time.LocalDate localDate17 = visit12.getDate();
        org.springframework.samples.petclinic.owner.Visit visit18 = new org.springframework.samples.petclinic.owner.Visit();
        visit18.setDescription("");
        java.lang.Integer int21 = visit18.getId();
        java.time.LocalDate localDate22 = visit18.getDate();
        org.springframework.samples.petclinic.owner.Visit visit23 = new org.springframework.samples.petclinic.owner.Visit();
        visit23.setDescription("");
        java.time.LocalDate localDate26 = visit23.getDate();
        java.time.LocalDate localDate27 = visit23.getDate();
        visit18.setDate(localDate27);
        visit12.setDate(localDate27);
        visit12.setDescription("");
        java.time.LocalDate localDate32 = visit12.getDate();
        java.time.LocalDate localDate33 = visit12.getDate();
        org.springframework.samples.petclinic.owner.Pet pet34 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit35 = new org.springframework.samples.petclinic.owner.Visit();
        visit35.setDescription("");
        pet34.addVisit(visit35);
        org.springframework.samples.petclinic.owner.Pet pet39 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate40 = null;
        pet39.setBirthDate(localDate40);
        org.springframework.samples.petclinic.owner.Visit visit42 = new org.springframework.samples.petclinic.owner.Visit();
        visit42.setDescription("");
        java.time.LocalDate localDate45 = visit42.getDate();
        pet39.setBirthDate(localDate45);
        pet34.setBirthDate(localDate45);
        boolean boolean48 = pet34.isNew();
        org.springframework.samples.petclinic.owner.Visit visit49 = new org.springframework.samples.petclinic.owner.Visit();
        visit49.setDescription("");
        java.lang.Integer int52 = visit49.getId();
        java.time.LocalDate localDate53 = visit49.getDate();
        org.springframework.samples.petclinic.owner.Visit visit54 = new org.springframework.samples.petclinic.owner.Visit();
        visit54.setDescription("");
        java.time.LocalDate localDate57 = visit54.getDate();
        java.time.LocalDate localDate58 = visit54.getDate();
        visit49.setDate(localDate58);
        org.springframework.samples.petclinic.owner.Pet pet60 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit61 = new org.springframework.samples.petclinic.owner.Visit();
        visit61.setDescription("");
        pet60.addVisit(visit61);
        org.springframework.samples.petclinic.owner.Pet pet65 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate66 = null;
        pet65.setBirthDate(localDate66);
        org.springframework.samples.petclinic.owner.Visit visit68 = new org.springframework.samples.petclinic.owner.Visit();
        visit68.setDescription("");
        java.time.LocalDate localDate71 = visit68.getDate();
        pet65.setBirthDate(localDate71);
        pet60.setBirthDate(localDate71);
        visit49.setDate(localDate71);
        java.time.LocalDate localDate75 = visit49.getDate();
        pet34.addVisit(visit49);
        java.time.LocalDate localDate77 = visit49.getDate();
        visit12.setDate(localDate77);
        visit1.setDate(localDate77);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(int52);
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertNotNull(localDate57);
        org.junit.Assert.assertNotNull(localDate58);
        org.junit.Assert.assertNotNull(localDate71);
        org.junit.Assert.assertNotNull(localDate75);
        org.junit.Assert.assertNotNull(localDate77);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0142");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        java.lang.String str9 = owner0.getTelephone();
        owner0.setAddress("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0143");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        visit1.setDescription("");
        pet0.addVisit(visit1);
        org.springframework.samples.petclinic.owner.PetType petType5 = null;
        pet0.setType(petType5);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType10 = pet0.getType();
        java.time.LocalDate localDate11 = pet0.getBirthDate();
        java.time.LocalDate localDate12 = pet0.getBirthDate();
        java.time.LocalDate localDate13 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType14 = pet0.getType();
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertNull(petType10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(petType14);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0144");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0145");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setFirstName("hi!");
        org.springframework.samples.petclinic.owner.Pet pet7 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate8 = null;
        pet7.setBirthDate(localDate8);
        org.springframework.samples.petclinic.owner.PetType petType10 = null;
        pet7.setType(petType10);
        java.time.LocalDate localDate12 = pet7.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit13 = new org.springframework.samples.petclinic.owner.Visit();
        pet7.addVisit(visit13);
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 0, visit13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0146");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet3 = owner0.getPet("hi!", false);
        org.springframework.samples.petclinic.owner.Pet pet4 = new org.springframework.samples.petclinic.owner.Pet();
        pet4.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit7 = new org.springframework.samples.petclinic.owner.Visit();
        visit7.setDescription("");
        boolean boolean10 = visit7.isNew();
        pet4.addVisit(visit7);
        java.time.LocalDate localDate12 = pet4.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet13 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit14 = new org.springframework.samples.petclinic.owner.Visit();
        visit14.setDescription("");
        pet13.addVisit(visit14);
        org.springframework.samples.petclinic.owner.PetType petType18 = null;
        pet13.setType(petType18);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection20 = pet13.getVisits();
        pet13.setName("");
        org.springframework.samples.petclinic.owner.PetType petType23 = new org.springframework.samples.petclinic.owner.PetType();
        pet13.setType(petType23);
        pet4.setType(petType23);
        owner0.addPet(pet4);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList27 = owner0.getPets();
        owner0.setTelephone("");
        java.lang.String str30 = owner0.getTelephone();
        org.junit.Assert.assertNull(pet3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNotNull(visitCollection20);
        org.junit.Assert.assertNotNull(petList27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0147");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        owner0.setCity("hi!");
        owner0.setTelephone("hi!");
        owner0.setTelephone("hi!");
        org.springframework.samples.petclinic.owner.Pet pet10 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate11 = null;
        pet10.setBirthDate(localDate11);
        pet10.setName("");
        org.springframework.samples.petclinic.owner.Pet pet15 = new org.springframework.samples.petclinic.owner.Pet();
        pet15.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit18 = new org.springframework.samples.petclinic.owner.Visit();
        visit18.setDescription("");
        boolean boolean21 = visit18.isNew();
        pet15.addVisit(visit18);
        pet10.addVisit(visit18);
        java.lang.String str24 = pet10.getName();
        owner0.addPet(pet10);
        org.springframework.samples.petclinic.owner.Pet pet26 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate27 = null;
        pet26.setBirthDate(localDate27);
        org.springframework.samples.petclinic.owner.PetType petType29 = null;
        pet26.setType(petType29);
        java.time.LocalDate localDate31 = pet26.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit32 = new org.springframework.samples.petclinic.owner.Visit();
        visit32.setDescription("");
        java.lang.Integer int35 = visit32.getId();
        java.time.LocalDate localDate36 = visit32.getDate();
        pet26.setBirthDate(localDate36);
        org.springframework.samples.petclinic.owner.Pet pet38 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate39 = null;
        pet38.setBirthDate(localDate39);
        org.springframework.samples.petclinic.owner.Visit visit41 = new org.springframework.samples.petclinic.owner.Visit();
        visit41.setDescription("");
        java.time.LocalDate localDate44 = visit41.getDate();
        pet38.setBirthDate(localDate44);
        java.lang.String str46 = pet38.getName();
        java.time.LocalDate localDate47 = pet38.getBirthDate();
        pet26.setBirthDate(localDate47);
        pet10.setBirthDate(localDate47);
        java.lang.String str50 = pet10.getName();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(localDate31);
        org.junit.Assert.assertNull(int35);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0148");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        java.lang.String str4 = owner0.getCity();
        java.lang.String str5 = owner0.getTelephone();
        java.lang.String str6 = owner0.getTelephone();
        java.lang.Class<?> wildcardClass7 = owner0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0149");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 100);
        java.lang.String str6 = owner0.getTelephone();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0150");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit3 = new org.springframework.samples.petclinic.owner.Visit();
        visit3.setDescription("");
        boolean boolean6 = visit3.isNew();
        pet0.addVisit(visit3);
        java.time.LocalDate localDate8 = visit3.getDate();
        org.springframework.samples.petclinic.owner.Visit visit9 = new org.springframework.samples.petclinic.owner.Visit();
        visit9.setDescription("");
        java.lang.Integer int12 = visit9.getId();
        java.time.LocalDate localDate13 = visit9.getDate();
        org.springframework.samples.petclinic.owner.Visit visit14 = new org.springframework.samples.petclinic.owner.Visit();
        visit14.setDescription("");
        java.time.LocalDate localDate17 = visit14.getDate();
        java.time.LocalDate localDate18 = visit14.getDate();
        visit9.setDate(localDate18);
        visit3.setDate(localDate18);
        visit3.setDescription("");
        java.time.LocalDate localDate23 = visit3.getDate();
        java.time.LocalDate localDate24 = visit3.getDate();
        org.springframework.samples.petclinic.owner.Pet pet25 = new org.springframework.samples.petclinic.owner.Pet();
        pet25.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit28 = new org.springframework.samples.petclinic.owner.Visit();
        visit28.setDescription("");
        boolean boolean31 = visit28.isNew();
        pet25.addVisit(visit28);
        java.time.LocalDate localDate33 = visit28.getDate();
        org.springframework.samples.petclinic.owner.Visit visit34 = new org.springframework.samples.petclinic.owner.Visit();
        visit34.setDescription("");
        java.lang.Integer int37 = visit34.getId();
        java.time.LocalDate localDate38 = visit34.getDate();
        org.springframework.samples.petclinic.owner.Visit visit39 = new org.springframework.samples.petclinic.owner.Visit();
        visit39.setDescription("");
        java.time.LocalDate localDate42 = visit39.getDate();
        java.time.LocalDate localDate43 = visit39.getDate();
        visit34.setDate(localDate43);
        visit28.setDate(localDate43);
        org.springframework.samples.petclinic.owner.Pet pet46 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate47 = null;
        pet46.setBirthDate(localDate47);
        org.springframework.samples.petclinic.owner.PetType petType49 = null;
        pet46.setType(petType49);
        java.time.LocalDate localDate51 = pet46.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit52 = new org.springframework.samples.petclinic.owner.Visit();
        visit52.setDescription("");
        java.lang.Integer int55 = visit52.getId();
        java.time.LocalDate localDate56 = visit52.getDate();
        pet46.setBirthDate(localDate56);
        visit28.setDate(localDate56);
        java.time.LocalDate localDate59 = visit28.getDate();
        visit3.setDate(localDate59);
        org.springframework.samples.petclinic.owner.Pet pet61 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate62 = null;
        pet61.setBirthDate(localDate62);
        pet61.setName("");
        pet61.setName("");
        boolean boolean68 = pet61.isNew();
        org.springframework.samples.petclinic.owner.Pet pet69 = new org.springframework.samples.petclinic.owner.Pet();
        pet69.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit72 = new org.springframework.samples.petclinic.owner.Visit();
        visit72.setDescription("");
        boolean boolean75 = visit72.isNew();
        pet69.addVisit(visit72);
        java.time.LocalDate localDate77 = pet69.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet78 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit79 = new org.springframework.samples.petclinic.owner.Visit();
        visit79.setDescription("");
        pet78.addVisit(visit79);
        org.springframework.samples.petclinic.owner.PetType petType83 = null;
        pet78.setType(petType83);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection85 = pet78.getVisits();
        pet78.setName("");
        org.springframework.samples.petclinic.owner.PetType petType88 = new org.springframework.samples.petclinic.owner.PetType();
        pet78.setType(petType88);
        pet69.setType(petType88);
        pet61.setType(petType88);
        org.springframework.samples.petclinic.owner.Pet pet92 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit93 = new org.springframework.samples.petclinic.owner.Visit();
        visit93.setDescription("");
        pet92.addVisit(visit93);
        java.time.LocalDate localDate97 = visit93.getDate();
        pet61.setBirthDate(localDate97);
        visit3.setDate(localDate97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNull(int37);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNull(localDate51);
        org.junit.Assert.assertNull(int55);
        org.junit.Assert.assertNotNull(localDate56);
        org.junit.Assert.assertNotNull(localDate59);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNull(localDate77);
        org.junit.Assert.assertNotNull(visitCollection85);
        org.junit.Assert.assertNotNull(localDate97);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0151");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        java.lang.String str4 = owner0.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet6 = owner0.getPet("hi!");
        owner0.setCity("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(pet6);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0152");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        java.lang.String str4 = owner0.getTelephone();
        java.lang.Class<?> wildcardClass5 = owner0.getClass();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0153");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty1 = new org.springframework.samples.petclinic.vet.Specialty();
        vet0.addSpecialty(specialty1);
        int int3 = vet0.getNrOfSpecialties();
        java.lang.String str4 = vet0.getFirstName();
        java.lang.Integer int5 = vet0.getId();
        int int6 = vet0.getNrOfSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList7 = vet0.getSpecialties();
        org.springframework.samples.petclinic.vet.Specialty specialty8 = null;
        vet0.addSpecialty(specialty8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList10 = vet0.getSpecialties();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(specialtyList7);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0154");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty1 = new org.springframework.samples.petclinic.vet.Specialty();
        vet0.addSpecialty(specialty1);
        vet0.setFirstName("hi!");
        java.lang.String str5 = vet0.getLastName();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList6 = vet0.getSpecialties();
        java.lang.Class<?> wildcardClass7 = vet0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(specialtyList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0155");
        org.springframework.samples.petclinic.model.NamedEntity namedEntity0 = new org.springframework.samples.petclinic.model.NamedEntity();
        namedEntity0.setId((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass3 = namedEntity0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0156");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        java.lang.String str4 = owner0.getCity();
        java.lang.String str5 = owner0.getLastName();
        owner0.setFirstName("");
        java.lang.String str8 = owner0.getCity();
        java.lang.String str9 = owner0.getLastName();
        owner0.setTelephone("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0157");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.Visit visit3 = new org.springframework.samples.petclinic.owner.Visit();
        visit3.setDescription("");
        java.time.LocalDate localDate6 = visit3.getDate();
        pet0.setBirthDate(localDate6);
        org.springframework.samples.petclinic.owner.Pet pet8 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit9 = new org.springframework.samples.petclinic.owner.Visit();
        visit9.setDescription("");
        pet8.addVisit(visit9);
        org.springframework.samples.petclinic.owner.Visit visit13 = new org.springframework.samples.petclinic.owner.Visit();
        visit13.setDescription("");
        java.lang.Integer int16 = visit13.getId();
        pet8.addVisit(visit13);
        java.lang.String str18 = visit13.getDescription();
        pet0.addVisit(visit13);
        visit13.setDescription("<null>");
        java.time.LocalDate localDate22 = visit13.getDate();
        visit13.setDescription("hi!");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(localDate22);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0158");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        java.lang.String str9 = owner0.getTelephone();
        java.lang.String str10 = owner0.getTelephone();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList11 = owner0.getPets();
        owner0.setLastName("");
        java.lang.String str14 = owner0.getAddress();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertNotNull(petList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<null>" + "'", str14, "<null>");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0159");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        java.lang.Integer int3 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        pet0.setId((java.lang.Integer) 1);
        java.lang.String str7 = pet0.toString();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType10 = pet0.getType();
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<null>" + "'", str7, "<null>");
        org.junit.Assert.assertNull(petType10);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0160");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit3 = new org.springframework.samples.petclinic.owner.Visit();
        visit3.setDescription("");
        boolean boolean6 = visit3.isNew();
        pet0.addVisit(visit3);
        java.time.LocalDate localDate8 = visit3.getDate();
        org.springframework.samples.petclinic.owner.Visit visit9 = new org.springframework.samples.petclinic.owner.Visit();
        visit9.setDescription("");
        java.lang.Integer int12 = visit9.getId();
        java.time.LocalDate localDate13 = visit9.getDate();
        org.springframework.samples.petclinic.owner.Visit visit14 = new org.springframework.samples.petclinic.owner.Visit();
        visit14.setDescription("");
        java.time.LocalDate localDate17 = visit14.getDate();
        java.time.LocalDate localDate18 = visit14.getDate();
        visit9.setDate(localDate18);
        visit3.setDate(localDate18);
        visit3.setDescription("");
        java.time.LocalDate localDate23 = visit3.getDate();
        visit3.setDescription("<null>");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate23);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0161");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty1 = new org.springframework.samples.petclinic.vet.Specialty();
        vet0.addSpecialty(specialty1);
        int int3 = vet0.getNrOfSpecialties();
        java.lang.String str4 = vet0.getFirstName();
        org.springframework.samples.petclinic.vet.Vet vet5 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty6 = new org.springframework.samples.petclinic.vet.Specialty();
        vet5.addSpecialty(specialty6);
        vet0.addSpecialty(specialty6);
        vet0.setLastName("");
        int int11 = vet0.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Vet vet12 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty13 = new org.springframework.samples.petclinic.vet.Specialty();
        vet12.addSpecialty(specialty13);
        int int15 = vet12.getNrOfSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList16 = vet12.getSpecialties();
        org.springframework.samples.petclinic.vet.Specialty specialty17 = new org.springframework.samples.petclinic.vet.Specialty();
        specialty17.setId((java.lang.Integer) 100);
        vet12.addSpecialty(specialty17);
        vet0.addSpecialty(specialty17);
        java.lang.String str22 = specialty17.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(specialtyList16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<null>" + "'", str22, "<null>");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0162");
        org.springframework.samples.petclinic.model.Person person0 = new org.springframework.samples.petclinic.model.Person();
        java.lang.String str1 = person0.getFirstName();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0163");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        int int1 = vet0.getNrOfSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList2 = vet0.getSpecialties();
        int int3 = vet0.getNrOfSpecialties();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(specialtyList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0164");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        java.lang.String str4 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet6 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate7 = null;
        pet6.setBirthDate(localDate7);
        org.springframework.samples.petclinic.owner.Visit visit9 = new org.springframework.samples.petclinic.owner.Visit();
        visit9.setDescription("");
        java.time.LocalDate localDate12 = visit9.getDate();
        pet6.setBirthDate(localDate12);
        org.springframework.samples.petclinic.owner.Pet pet14 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit15 = new org.springframework.samples.petclinic.owner.Visit();
        visit15.setDescription("");
        pet14.addVisit(visit15);
        org.springframework.samples.petclinic.owner.Visit visit19 = new org.springframework.samples.petclinic.owner.Visit();
        visit19.setDescription("");
        java.lang.Integer int22 = visit19.getId();
        pet14.addVisit(visit19);
        java.lang.String str24 = visit19.getDescription();
        pet6.addVisit(visit19);
        visit19.setDescription("<null>");
        java.time.LocalDate localDate28 = visit19.getDate();
        java.lang.Integer int29 = visit19.getId();
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 2, visit19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNull(int29);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0165");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList4 = owner0.getPets();
        java.lang.String str5 = owner0.getTelephone();
        java.lang.String str6 = owner0.getFirstName();
        java.lang.String str7 = owner0.getCity();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0166");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        java.lang.String str1 = vet0.getLastName();
        int int2 = vet0.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Vet vet3 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty4 = new org.springframework.samples.petclinic.vet.Specialty();
        vet3.addSpecialty(specialty4);
        int int6 = vet3.getNrOfSpecialties();
        java.lang.String str7 = vet3.getFirstName();
        org.springframework.samples.petclinic.vet.Vet vet8 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty9 = new org.springframework.samples.petclinic.vet.Specialty();
        vet8.addSpecialty(specialty9);
        vet3.addSpecialty(specialty9);
        vet3.setLastName("");
        int int14 = vet3.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Vet vet15 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty16 = new org.springframework.samples.petclinic.vet.Specialty();
        vet15.addSpecialty(specialty16);
        int int18 = vet15.getNrOfSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList19 = vet15.getSpecialties();
        org.springframework.samples.petclinic.vet.Specialty specialty20 = new org.springframework.samples.petclinic.vet.Specialty();
        specialty20.setId((java.lang.Integer) 100);
        vet15.addSpecialty(specialty20);
        vet3.addSpecialty(specialty20);
        vet0.addSpecialty(specialty20);
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList26 = vet0.getSpecialties();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(specialtyList19);
        org.junit.Assert.assertNotNull(specialtyList26);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0167");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        java.lang.String str9 = owner0.getTelephone();
        java.lang.String str10 = owner0.getTelephone();
        java.lang.String str11 = owner0.toString();
        java.lang.String str12 = owner0.getTelephone();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList13 = owner0.getPets();
        java.lang.Class<?> wildcardClass14 = petList13.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<null>" + "'", str12, "<null>");
        org.junit.Assert.assertNotNull(petList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0168");
        org.springframework.samples.petclinic.owner.Visit visit0 = new org.springframework.samples.petclinic.owner.Visit();
        visit0.setDescription("");
        java.time.LocalDate localDate3 = visit0.getDate();
        java.time.LocalDate localDate4 = visit0.getDate();
        java.time.LocalDate localDate5 = visit0.getDate();
        visit0.setId((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0169");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        visit1.setDescription("");
        pet0.addVisit(visit1);
        org.springframework.samples.petclinic.owner.Pet pet5 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate6 = null;
        pet5.setBirthDate(localDate6);
        org.springframework.samples.petclinic.owner.Visit visit8 = new org.springframework.samples.petclinic.owner.Visit();
        visit8.setDescription("");
        java.time.LocalDate localDate11 = visit8.getDate();
        pet5.setBirthDate(localDate11);
        pet0.setBirthDate(localDate11);
        boolean boolean14 = pet0.isNew();
        org.springframework.samples.petclinic.owner.Visit visit15 = new org.springframework.samples.petclinic.owner.Visit();
        visit15.setDescription("");
        java.lang.Integer int18 = visit15.getId();
        java.time.LocalDate localDate19 = visit15.getDate();
        org.springframework.samples.petclinic.owner.Visit visit20 = new org.springframework.samples.petclinic.owner.Visit();
        visit20.setDescription("");
        java.time.LocalDate localDate23 = visit20.getDate();
        java.time.LocalDate localDate24 = visit20.getDate();
        visit15.setDate(localDate24);
        org.springframework.samples.petclinic.owner.Pet pet26 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit27 = new org.springframework.samples.petclinic.owner.Visit();
        visit27.setDescription("");
        pet26.addVisit(visit27);
        org.springframework.samples.petclinic.owner.Pet pet31 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate32 = null;
        pet31.setBirthDate(localDate32);
        org.springframework.samples.petclinic.owner.Visit visit34 = new org.springframework.samples.petclinic.owner.Visit();
        visit34.setDescription("");
        java.time.LocalDate localDate37 = visit34.getDate();
        pet31.setBirthDate(localDate37);
        pet26.setBirthDate(localDate37);
        visit15.setDate(localDate37);
        java.time.LocalDate localDate41 = visit15.getDate();
        pet0.addVisit(visit15);
        org.springframework.samples.petclinic.owner.PetType petType43 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass44 = petType43.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNull(petType43);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0170");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList4 = owner0.getPets();
        java.lang.String str5 = owner0.getTelephone();
        java.lang.String str6 = owner0.getFirstName();
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("");
        org.springframework.samples.petclinic.owner.Pet pet10 = owner0.getPet("<null>");
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(pet8);
        org.junit.Assert.assertNull(pet10);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0171");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.getAddress();
        java.lang.Integer int4 = owner0.getId();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0172");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        org.springframework.samples.petclinic.owner.Pet pet6 = owner0.getPet("hi!", false);
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("");
        owner0.setCity("");
        java.lang.String str11 = owner0.getCity();
        java.lang.String str12 = owner0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(pet6);
        org.junit.Assert.assertNull(pet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0173");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty1 = new org.springframework.samples.petclinic.vet.Specialty();
        vet0.addSpecialty(specialty1);
        vet0.setFirstName("hi!");
        vet0.setLastName("hi!");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0174");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        java.lang.String str4 = owner0.getCity();
        owner0.setTelephone("");
        org.springframework.samples.petclinic.owner.Pet pet7 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit8 = new org.springframework.samples.petclinic.owner.Visit();
        visit8.setDescription("");
        pet7.addVisit(visit8);
        org.springframework.samples.petclinic.owner.PetType petType12 = new org.springframework.samples.petclinic.owner.PetType();
        pet7.setType(petType12);
        java.lang.String str14 = pet7.toString();
        owner0.addPet(pet7);
        org.springframework.samples.petclinic.owner.Pet pet16 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit17 = new org.springframework.samples.petclinic.owner.Visit();
        pet16.addVisit(visit17);
        java.time.LocalDate localDate19 = pet16.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet20 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate21 = null;
        pet20.setBirthDate(localDate21);
        org.springframework.samples.petclinic.owner.PetType petType23 = null;
        pet20.setType(petType23);
        java.time.LocalDate localDate25 = pet20.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection26 = pet20.getVisits();
        org.springframework.samples.petclinic.owner.Visit visit27 = new org.springframework.samples.petclinic.owner.Visit();
        visit27.setDescription("");
        java.time.LocalDate localDate30 = visit27.getDate();
        pet20.setBirthDate(localDate30);
        org.springframework.samples.petclinic.owner.Visit visit32 = new org.springframework.samples.petclinic.owner.Visit();
        visit32.setDescription("");
        java.lang.Integer int35 = visit32.getId();
        java.time.LocalDate localDate36 = visit32.getDate();
        pet20.setBirthDate(localDate36);
        pet16.setBirthDate(localDate36);
        pet7.setBirthDate(localDate36);
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<null>" + "'", str14, "<null>");
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertNull(localDate25);
        org.junit.Assert.assertNotNull(visitCollection26);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNull(int35);
        org.junit.Assert.assertNotNull(localDate36);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0175");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        visit1.setDescription("");
        pet0.addVisit(visit1);
        org.springframework.samples.petclinic.owner.Visit visit5 = new org.springframework.samples.petclinic.owner.Visit();
        visit5.setDescription("");
        java.lang.Integer int8 = visit5.getId();
        pet0.addVisit(visit5);
        org.springframework.samples.petclinic.owner.Visit visit10 = new org.springframework.samples.petclinic.owner.Visit();
        visit10.setDescription("");
        boolean boolean13 = visit10.isNew();
        java.lang.String str14 = visit10.getDescription();
        pet0.addVisit(visit10);
        java.time.LocalDate localDate16 = pet0.getBirthDate();
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0176");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        java.lang.String str9 = owner0.getTelephone();
        java.lang.String str10 = owner0.getTelephone();
        java.lang.String str11 = owner0.toString();
        java.lang.String str12 = owner0.getCity();
        org.springframework.samples.petclinic.owner.Pet pet15 = owner0.getPet("", false);
        owner0.setLastName("");
        org.springframework.samples.petclinic.owner.Pet pet19 = new org.springframework.samples.petclinic.owner.Pet();
        pet19.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit22 = new org.springframework.samples.petclinic.owner.Visit();
        visit22.setDescription("");
        boolean boolean25 = visit22.isNew();
        pet19.addVisit(visit22);
        java.time.LocalDate localDate27 = visit22.getDate();
        org.springframework.samples.petclinic.owner.Visit visit28 = new org.springframework.samples.petclinic.owner.Visit();
        visit28.setDescription("");
        java.lang.Integer int31 = visit28.getId();
        java.time.LocalDate localDate32 = visit28.getDate();
        org.springframework.samples.petclinic.owner.Visit visit33 = new org.springframework.samples.petclinic.owner.Visit();
        visit33.setDescription("");
        java.time.LocalDate localDate36 = visit33.getDate();
        java.time.LocalDate localDate37 = visit33.getDate();
        visit28.setDate(localDate37);
        visit22.setDate(localDate37);
        visit22.setDescription("");
        java.lang.Integer int42 = visit22.getId();
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 10, visit22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(pet15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNull(int31);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNull(int42);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0177");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit6 = new org.springframework.samples.petclinic.owner.Visit();
        pet0.addVisit(visit6);
        java.lang.Integer int8 = pet0.getId();
        java.lang.Integer int9 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection10 = pet0.getVisits();
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(visitCollection10);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0178");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        boolean boolean1 = pet0.isNew();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0179");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        java.lang.String str9 = owner0.getTelephone();
        java.lang.String str10 = owner0.getTelephone();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList11 = owner0.getPets();
        owner0.setLastName("");
        org.springframework.samples.petclinic.owner.Pet pet15 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit16 = new org.springframework.samples.petclinic.owner.Visit();
        pet15.addVisit(visit16);
        org.springframework.samples.petclinic.owner.Pet pet18 = new org.springframework.samples.petclinic.owner.Pet();
        pet18.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit21 = new org.springframework.samples.petclinic.owner.Visit();
        visit21.setDescription("");
        boolean boolean24 = visit21.isNew();
        pet18.addVisit(visit21);
        java.time.LocalDate localDate26 = visit21.getDate();
        visit16.setDate(localDate26);
        java.lang.String str28 = visit16.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 0, visit16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertNotNull(petList11);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0180");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        visit1.setDescription("");
        pet0.addVisit(visit1);
        org.springframework.samples.petclinic.owner.PetType petType5 = null;
        pet0.setType(petType5);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType10 = pet0.getType();
        java.time.LocalDate localDate11 = pet0.getBirthDate();
        java.time.LocalDate localDate12 = pet0.getBirthDate();
        java.time.LocalDate localDate13 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet14 = new org.springframework.samples.petclinic.owner.Pet();
        pet14.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit17 = new org.springframework.samples.petclinic.owner.Visit();
        visit17.setDescription("");
        boolean boolean20 = visit17.isNew();
        pet14.addVisit(visit17);
        java.time.LocalDate localDate22 = visit17.getDate();
        org.springframework.samples.petclinic.owner.Visit visit23 = new org.springframework.samples.petclinic.owner.Visit();
        visit23.setDescription("");
        java.lang.Integer int26 = visit23.getId();
        java.time.LocalDate localDate27 = visit23.getDate();
        org.springframework.samples.petclinic.owner.Visit visit28 = new org.springframework.samples.petclinic.owner.Visit();
        visit28.setDescription("");
        java.time.LocalDate localDate31 = visit28.getDate();
        java.time.LocalDate localDate32 = visit28.getDate();
        visit23.setDate(localDate32);
        visit17.setDate(localDate32);
        pet0.addVisit(visit17);
        java.time.LocalDate localDate36 = visit17.getDate();
        org.springframework.samples.petclinic.owner.Pet pet37 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit38 = new org.springframework.samples.petclinic.owner.Visit();
        visit38.setDescription("");
        pet37.addVisit(visit38);
        visit38.setDescription("");
        java.time.LocalDate localDate44 = visit38.getDate();
        visit17.setDate(localDate44);
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertNull(petType10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNull(int26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(localDate44);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0181");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        boolean boolean3 = owner0.isNew();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0182");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit3 = new org.springframework.samples.petclinic.owner.Visit();
        visit3.setDescription("");
        boolean boolean6 = visit3.isNew();
        pet0.addVisit(visit3);
        java.lang.String str8 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType9 = pet0.getType();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection10 = pet0.getVisits();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<null>" + "'", str8, "<null>");
        org.junit.Assert.assertNull(petType9);
        org.junit.Assert.assertNotNull(visitCollection10);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0183");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 10);
        java.lang.String str6 = owner0.getFirstName();
        java.lang.String str7 = owner0.getCity();
        org.springframework.samples.petclinic.owner.Pet pet8 = new org.springframework.samples.petclinic.owner.Pet();
        pet8.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet11 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit12 = new org.springframework.samples.petclinic.owner.Visit();
        visit12.setDescription("");
        pet11.addVisit(visit12);
        org.springframework.samples.petclinic.owner.PetType petType16 = null;
        pet11.setType(petType16);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection18 = pet11.getVisits();
        pet11.setName("");
        org.springframework.samples.petclinic.owner.PetType petType21 = new org.springframework.samples.petclinic.owner.PetType();
        pet11.setType(petType21);
        pet8.setType(petType21);
        owner0.addPet(pet8);
        org.springframework.samples.petclinic.owner.Pet pet25 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit26 = new org.springframework.samples.petclinic.owner.Visit();
        visit26.setDescription("");
        pet25.addVisit(visit26);
        org.springframework.samples.petclinic.owner.PetType petType30 = null;
        pet25.setType(petType30);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection32 = pet25.getVisits();
        pet25.setName("");
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection35 = pet25.getVisits();
        java.lang.Integer int36 = pet25.getId();
        owner0.addPet(pet25);
        owner0.setAddress("");
        java.lang.String str40 = owner0.getTelephone();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(visitCollection18);
        org.junit.Assert.assertNotNull(visitCollection32);
        org.junit.Assert.assertNotNull(visitCollection35);
        org.junit.Assert.assertNull(int36);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0184");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList3 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet4 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate5 = null;
        pet4.setBirthDate(localDate5);
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet4.setType(petType7);
        java.time.LocalDate localDate9 = pet4.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit10 = new org.springframework.samples.petclinic.owner.Visit();
        pet4.addVisit(visit10);
        owner0.addPet(pet4);
        java.lang.String str13 = owner0.getTelephone();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList14 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet17 = owner0.getPet("hi!", true);
        org.springframework.samples.petclinic.owner.Pet pet19 = owner0.getPet("");
        org.springframework.samples.petclinic.owner.Pet pet21 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate22 = null;
        pet21.setBirthDate(localDate22);
        org.springframework.samples.petclinic.owner.PetType petType24 = null;
        pet21.setType(petType24);
        java.time.LocalDate localDate26 = pet21.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType27 = pet21.getType();
        pet21.setName("<null>");
        java.lang.String str30 = pet21.getName();
        org.springframework.samples.petclinic.owner.Visit visit31 = new org.springframework.samples.petclinic.owner.Visit();
        visit31.setDescription("");
        java.lang.Integer int34 = visit31.getId();
        boolean boolean35 = visit31.isNew();
        pet21.addVisit(visit31);
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 0, visit31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList3);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(petList14);
        org.junit.Assert.assertNull(pet17);
        org.junit.Assert.assertNull(pet19);
        org.junit.Assert.assertNull(localDate26);
        org.junit.Assert.assertNull(petType27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<null>" + "'", str30, "<null>");
        org.junit.Assert.assertNull(int34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0185");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        java.lang.String str9 = owner0.getTelephone();
        java.lang.String str10 = owner0.getTelephone();
        java.lang.String str11 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet13 = owner0.getPet("");
        java.lang.String str14 = owner0.getLastName();
        org.springframework.samples.petclinic.owner.Pet pet16 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate17 = null;
        pet16.setBirthDate(localDate17);
        org.springframework.samples.petclinic.owner.PetType petType19 = null;
        pet16.setType(petType19);
        java.time.LocalDate localDate21 = pet16.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType22 = pet16.getType();
        pet16.setName("<null>");
        java.lang.String str25 = pet16.getName();
        pet16.setId((java.lang.Integer) 100);
        pet16.setName("hi!");
        org.springframework.samples.petclinic.owner.Visit visit30 = new org.springframework.samples.petclinic.owner.Visit();
        java.lang.String str31 = visit30.getDescription();
        pet16.addVisit(visit30);
        visit30.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 0, visit30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertNull(pet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDate21);
        org.junit.Assert.assertNull(petType22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<null>" + "'", str25, "<null>");
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0186");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("<null>");
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.getName();
        pet0.setId((java.lang.Integer) 100);
        pet0.setName("");
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<null>" + "'", str4, "<null>");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0187");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 100);
        java.lang.String str6 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet9 = owner0.getPet("<null>", true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(pet9);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0188");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList3 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet4 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate5 = null;
        pet4.setBirthDate(localDate5);
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet4.setType(petType7);
        java.time.LocalDate localDate9 = pet4.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit10 = new org.springframework.samples.petclinic.owner.Visit();
        pet4.addVisit(visit10);
        owner0.addPet(pet4);
        java.lang.String str13 = owner0.getTelephone();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList14 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet17 = owner0.getPet("hi!", true);
        owner0.setTelephone("hi!");
        boolean boolean20 = owner0.isNew();
        org.springframework.samples.petclinic.owner.Visit visit22 = new org.springframework.samples.petclinic.owner.Visit();
        visit22.setDescription("");
        java.time.LocalDate localDate25 = visit22.getDate();
        visit22.setDescription("");
        java.lang.String str28 = visit22.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 10, visit22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList3);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(petList14);
        org.junit.Assert.assertNull(pet17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0189");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        owner0.setTelephone("<null>");
        org.springframework.samples.petclinic.owner.Pet pet7 = owner0.getPet("hi!");
        java.lang.Class<?> wildcardClass8 = owner0.getClass();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0190");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType6 = pet0.getType();
        org.springframework.samples.petclinic.owner.Visit visit7 = new org.springframework.samples.petclinic.owner.Visit();
        visit7.setDescription("");
        java.lang.Integer int10 = visit7.getId();
        pet0.addVisit(visit7);
        boolean boolean12 = visit7.isNew();
        java.lang.String str13 = visit7.getDescription();
        visit7.setDescription("");
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNull(petType6);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0191");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        org.springframework.samples.petclinic.owner.Pet pet6 = owner0.getPet("hi!", false);
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("");
        owner0.setCity("");
        owner0.setFirstName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet14 = owner0.getPet("<null>");
        owner0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(pet6);
        org.junit.Assert.assertNull(pet8);
        org.junit.Assert.assertNull(pet14);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0192");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        java.lang.String str4 = owner0.getCity();
        java.lang.String str5 = owner0.getLastName();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertNull(pet8);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0193");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        visit1.setDescription("");
        pet0.addVisit(visit1);
        org.springframework.samples.petclinic.owner.PetType petType5 = null;
        pet0.setType(petType5);
        java.time.LocalDate localDate7 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet8 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate9 = null;
        pet8.setBirthDate(localDate9);
        org.springframework.samples.petclinic.owner.Visit visit11 = new org.springframework.samples.petclinic.owner.Visit();
        visit11.setDescription("");
        java.time.LocalDate localDate14 = visit11.getDate();
        pet8.setBirthDate(localDate14);
        org.springframework.samples.petclinic.owner.Pet pet16 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit17 = new org.springframework.samples.petclinic.owner.Visit();
        visit17.setDescription("");
        pet16.addVisit(visit17);
        org.springframework.samples.petclinic.owner.Visit visit21 = new org.springframework.samples.petclinic.owner.Visit();
        visit21.setDescription("");
        java.lang.Integer int24 = visit21.getId();
        pet16.addVisit(visit21);
        java.lang.String str26 = visit21.getDescription();
        pet8.addVisit(visit21);
        visit21.setDescription("<null>");
        java.time.LocalDate localDate30 = visit21.getDate();
        java.time.LocalDate localDate31 = visit21.getDate();
        pet0.setBirthDate(localDate31);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(localDate31);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0194");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        org.springframework.samples.petclinic.owner.Pet pet6 = owner0.getPet("hi!", false);
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("");
        owner0.setCity("");
        java.lang.String str11 = owner0.getCity();
        java.lang.String str12 = owner0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(pet6);
        org.junit.Assert.assertNull(pet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0195");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList1 = vet0.getSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList2 = vet0.getSpecialties();
        java.lang.String str3 = vet0.getLastName();
        int int4 = vet0.getNrOfSpecialties();
        int int5 = vet0.getNrOfSpecialties();
        java.lang.String str6 = vet0.getFirstName();
        org.junit.Assert.assertNotNull(specialtyList1);
        org.junit.Assert.assertNotNull(specialtyList2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0196");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        visit1.setDescription("");
        pet0.addVisit(visit1);
        org.springframework.samples.petclinic.owner.PetType petType5 = null;
        pet0.setType(petType5);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType10 = pet0.getType();
        java.time.LocalDate localDate11 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet12 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit13 = new org.springframework.samples.petclinic.owner.Visit();
        visit13.setDescription("");
        pet12.addVisit(visit13);
        org.springframework.samples.petclinic.owner.Pet pet17 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate18 = null;
        pet17.setBirthDate(localDate18);
        org.springframework.samples.petclinic.owner.Visit visit20 = new org.springframework.samples.petclinic.owner.Visit();
        visit20.setDescription("");
        java.time.LocalDate localDate23 = visit20.getDate();
        pet17.setBirthDate(localDate23);
        pet12.setBirthDate(localDate23);
        org.springframework.samples.petclinic.owner.Visit visit26 = new org.springframework.samples.petclinic.owner.Visit();
        visit26.setDescription("");
        java.time.LocalDate localDate29 = visit26.getDate();
        pet12.setBirthDate(localDate29);
        pet0.setBirthDate(localDate29);
        org.springframework.samples.petclinic.owner.PetType petType32 = null;
        pet0.setType(petType32);
        pet0.setId((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertNull(petType10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate29);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0197");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList3 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet4 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate5 = null;
        pet4.setBirthDate(localDate5);
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet4.setType(petType7);
        java.time.LocalDate localDate9 = pet4.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit10 = new org.springframework.samples.petclinic.owner.Visit();
        pet4.addVisit(visit10);
        owner0.addPet(pet4);
        java.lang.String str13 = owner0.getTelephone();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList14 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet15 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit16 = new org.springframework.samples.petclinic.owner.Visit();
        visit16.setDescription("");
        pet15.addVisit(visit16);
        org.springframework.samples.petclinic.owner.Pet pet20 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate21 = null;
        pet20.setBirthDate(localDate21);
        org.springframework.samples.petclinic.owner.Visit visit23 = new org.springframework.samples.petclinic.owner.Visit();
        visit23.setDescription("");
        java.time.LocalDate localDate26 = visit23.getDate();
        pet20.setBirthDate(localDate26);
        pet15.setBirthDate(localDate26);
        org.springframework.samples.petclinic.owner.Visit visit29 = new org.springframework.samples.petclinic.owner.Visit();
        visit29.setDescription("");
        java.time.LocalDate localDate32 = visit29.getDate();
        pet15.setBirthDate(localDate32);
        owner0.addPet(pet15);
        org.springframework.samples.petclinic.owner.Pet pet36 = owner0.getPet("");
        org.springframework.samples.petclinic.owner.Pet pet38 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate39 = null;
        pet38.setBirthDate(localDate39);
        pet38.setName("");
        org.springframework.samples.petclinic.owner.Pet pet43 = new org.springframework.samples.petclinic.owner.Pet();
        pet43.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit46 = new org.springframework.samples.petclinic.owner.Visit();
        visit46.setDescription("");
        boolean boolean49 = visit46.isNew();
        pet43.addVisit(visit46);
        pet38.addVisit(visit46);
        visit46.setDescription("<null>");
        visit46.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 10, visit46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList3);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(petList14);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNull(pet36);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0198");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet3 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit4 = new org.springframework.samples.petclinic.owner.Visit();
        visit4.setDescription("");
        pet3.addVisit(visit4);
        org.springframework.samples.petclinic.owner.PetType petType8 = null;
        pet3.setType(petType8);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection10 = pet3.getVisits();
        pet3.setName("");
        org.springframework.samples.petclinic.owner.PetType petType13 = new org.springframework.samples.petclinic.owner.PetType();
        pet3.setType(petType13);
        pet0.setType(petType13);
        pet0.setName("<null>");
        org.springframework.samples.petclinic.owner.PetType petType18 = pet0.getType();
        org.springframework.samples.petclinic.owner.Pet pet19 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit20 = new org.springframework.samples.petclinic.owner.Visit();
        pet19.addVisit(visit20);
        java.lang.String str22 = visit20.getDescription();
        pet0.addVisit(visit20);
        java.lang.String str24 = pet0.toString();
        org.junit.Assert.assertNotNull(visitCollection10);
        org.junit.Assert.assertNotNull(petType18);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<null>" + "'", str24, "<null>");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0199");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList7 = owner0.getPets();
        owner0.setLastName("hi!");
        java.lang.String str10 = owner0.getCity();
        owner0.setFirstName("hi!");
        owner0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertNotNull(petList7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0200");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList1 = vet0.getSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList2 = vet0.getSpecialties();
        java.lang.String str3 = vet0.getLastName();
        int int4 = vet0.getNrOfSpecialties();
        int int5 = vet0.getNrOfSpecialties();
        int int6 = vet0.getNrOfSpecialties();
        org.junit.Assert.assertNotNull(specialtyList1);
        org.junit.Assert.assertNotNull(specialtyList2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0201");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        org.springframework.samples.petclinic.owner.Pet pet6 = owner0.getPet("hi!", false);
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("");
        owner0.setCity("");
        owner0.setFirstName("<null>");
        java.lang.String str13 = owner0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(pet6);
        org.junit.Assert.assertNull(pet8);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0202");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setId((java.lang.Integer) (-1));
        org.springframework.samples.petclinic.owner.Pet pet8 = new org.springframework.samples.petclinic.owner.Pet();
        pet8.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet11 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit12 = new org.springframework.samples.petclinic.owner.Visit();
        visit12.setDescription("");
        pet11.addVisit(visit12);
        org.springframework.samples.petclinic.owner.PetType petType16 = null;
        pet11.setType(petType16);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection18 = pet11.getVisits();
        pet11.setName("");
        org.springframework.samples.petclinic.owner.PetType petType21 = new org.springframework.samples.petclinic.owner.PetType();
        pet11.setType(petType21);
        pet8.setType(petType21);
        java.time.LocalDate localDate24 = pet8.getBirthDate();
        owner0.addPet(pet8);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(visitCollection18);
        org.junit.Assert.assertNull(localDate24);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0203");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.Pet pet7 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit8 = new org.springframework.samples.petclinic.owner.Visit();
        visit8.setDescription("");
        pet7.addVisit(visit8);
        org.springframework.samples.petclinic.owner.PetType petType12 = null;
        pet7.setType(petType12);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection14 = pet7.getVisits();
        pet7.setName("");
        org.springframework.samples.petclinic.owner.PetType petType17 = new org.springframework.samples.petclinic.owner.PetType();
        pet7.setType(petType17);
        java.lang.Integer int19 = pet7.getId();
        org.springframework.samples.petclinic.owner.Pet pet20 = new org.springframework.samples.petclinic.owner.Pet();
        pet20.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet23 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit24 = new org.springframework.samples.petclinic.owner.Visit();
        visit24.setDescription("");
        pet23.addVisit(visit24);
        org.springframework.samples.petclinic.owner.PetType petType28 = null;
        pet23.setType(petType28);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection30 = pet23.getVisits();
        pet23.setName("");
        org.springframework.samples.petclinic.owner.PetType petType33 = new org.springframework.samples.petclinic.owner.PetType();
        pet23.setType(petType33);
        pet20.setType(petType33);
        pet20.setName("<null>");
        org.springframework.samples.petclinic.owner.PetType petType38 = pet20.getType();
        pet7.setType(petType38);
        pet0.setType(petType38);
        petType38.setName("<null>");
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNotNull(visitCollection14);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNotNull(visitCollection30);
        org.junit.Assert.assertNotNull(petType38);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0204");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        pet0.setName("");
        org.springframework.samples.petclinic.owner.Pet pet5 = new org.springframework.samples.petclinic.owner.Pet();
        pet5.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit8 = new org.springframework.samples.petclinic.owner.Visit();
        visit8.setDescription("");
        boolean boolean11 = visit8.isNew();
        pet5.addVisit(visit8);
        pet0.addVisit(visit8);
        java.lang.String str14 = pet0.getName();
        org.springframework.samples.petclinic.owner.Pet pet15 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate16 = null;
        pet15.setBirthDate(localDate16);
        org.springframework.samples.petclinic.owner.PetType petType18 = null;
        pet15.setType(petType18);
        java.time.LocalDate localDate20 = pet15.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection21 = pet15.getVisits();
        org.springframework.samples.petclinic.owner.Pet pet22 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit23 = new org.springframework.samples.petclinic.owner.Visit();
        visit23.setDescription("");
        pet22.addVisit(visit23);
        org.springframework.samples.petclinic.owner.PetType petType27 = null;
        pet22.setType(petType27);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection29 = pet22.getVisits();
        pet22.setName("");
        org.springframework.samples.petclinic.owner.PetType petType32 = new org.springframework.samples.petclinic.owner.PetType();
        pet22.setType(petType32);
        java.lang.Integer int34 = pet22.getId();
        org.springframework.samples.petclinic.owner.Pet pet35 = new org.springframework.samples.petclinic.owner.Pet();
        pet35.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet38 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit39 = new org.springframework.samples.petclinic.owner.Visit();
        visit39.setDescription("");
        pet38.addVisit(visit39);
        org.springframework.samples.petclinic.owner.PetType petType43 = null;
        pet38.setType(petType43);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection45 = pet38.getVisits();
        pet38.setName("");
        org.springframework.samples.petclinic.owner.PetType petType48 = new org.springframework.samples.petclinic.owner.PetType();
        pet38.setType(petType48);
        pet35.setType(petType48);
        pet35.setName("<null>");
        org.springframework.samples.petclinic.owner.PetType petType53 = pet35.getType();
        pet22.setType(petType53);
        pet15.setType(petType53);
        pet0.setType(petType53);
        org.springframework.samples.petclinic.owner.PetType petType57 = pet0.getType();
        petType57.setName("hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNotNull(visitCollection21);
        org.junit.Assert.assertNotNull(visitCollection29);
        org.junit.Assert.assertNull(int34);
        org.junit.Assert.assertNotNull(visitCollection45);
        org.junit.Assert.assertNotNull(petType53);
        org.junit.Assert.assertNotNull(petType57);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0205");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 10);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        owner0.setFirstName("");
        java.lang.String str9 = owner0.getAddress();
        java.lang.String str10 = owner0.getAddress();
        owner0.setId((java.lang.Integer) 100);
        java.lang.String str13 = owner0.getTelephone();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0206");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty1 = new org.springframework.samples.petclinic.vet.Specialty();
        vet0.addSpecialty(specialty1);
        org.springframework.samples.petclinic.vet.Vet vet3 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty4 = new org.springframework.samples.petclinic.vet.Specialty();
        vet3.addSpecialty(specialty4);
        int int6 = vet3.getNrOfSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList7 = vet3.getSpecialties();
        org.springframework.samples.petclinic.vet.Specialty specialty8 = new org.springframework.samples.petclinic.vet.Specialty();
        specialty8.setId((java.lang.Integer) 100);
        vet3.addSpecialty(specialty8);
        vet0.addSpecialty(specialty8);
        int int13 = vet0.getNrOfSpecialties();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(specialtyList7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0207");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        java.lang.String str4 = owner0.getCity();
        java.lang.String str5 = owner0.getTelephone();
        java.lang.String str6 = owner0.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet7 = new org.springframework.samples.petclinic.owner.Pet();
        pet7.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet10 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit11 = new org.springframework.samples.petclinic.owner.Visit();
        visit11.setDescription("");
        pet10.addVisit(visit11);
        org.springframework.samples.petclinic.owner.PetType petType15 = null;
        pet10.setType(petType15);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection17 = pet10.getVisits();
        pet10.setName("");
        org.springframework.samples.petclinic.owner.PetType petType20 = new org.springframework.samples.petclinic.owner.PetType();
        pet10.setType(petType20);
        pet7.setType(petType20);
        pet7.setName("<null>");
        org.springframework.samples.petclinic.owner.PetType petType25 = pet7.getType();
        owner0.addPet(pet7);
        java.lang.Integer int27 = pet7.getId();
        org.springframework.samples.petclinic.owner.PetType petType28 = pet7.getType();
        petType28.setId((java.lang.Integer) 1);
        petType28.setName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(visitCollection17);
        org.junit.Assert.assertNotNull(petType25);
        org.junit.Assert.assertNull(int27);
        org.junit.Assert.assertNotNull(petType28);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0208");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList4 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet6 = owner0.getPet("");
        org.springframework.samples.petclinic.owner.Pet pet7 = new org.springframework.samples.petclinic.owner.Pet();
        pet7.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet10 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit11 = new org.springframework.samples.petclinic.owner.Visit();
        visit11.setDescription("");
        pet10.addVisit(visit11);
        org.springframework.samples.petclinic.owner.PetType petType15 = null;
        pet10.setType(petType15);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection17 = pet10.getVisits();
        pet10.setName("");
        org.springframework.samples.petclinic.owner.PetType petType20 = new org.springframework.samples.petclinic.owner.PetType();
        pet10.setType(petType20);
        pet7.setType(petType20);
        owner0.addPet(pet7);
        java.lang.String str24 = pet7.getName();
        org.springframework.samples.petclinic.owner.PetType petType25 = null;
        pet7.setType(petType25);
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList4);
        org.junit.Assert.assertNull(pet6);
        org.junit.Assert.assertNotNull(visitCollection17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<null>" + "'", str24, "<null>");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0209");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        owner0.setCity("hi!");
        owner0.setTelephone("hi!");
        owner0.setTelephone("hi!");
        org.springframework.samples.petclinic.owner.Pet pet10 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate11 = null;
        pet10.setBirthDate(localDate11);
        pet10.setName("");
        org.springframework.samples.petclinic.owner.Pet pet15 = new org.springframework.samples.petclinic.owner.Pet();
        pet15.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit18 = new org.springframework.samples.petclinic.owner.Visit();
        visit18.setDescription("");
        boolean boolean21 = visit18.isNew();
        pet15.addVisit(visit18);
        pet10.addVisit(visit18);
        java.lang.String str24 = pet10.getName();
        owner0.addPet(pet10);
        org.springframework.samples.petclinic.owner.Pet pet26 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit27 = new org.springframework.samples.petclinic.owner.Visit();
        visit27.setDescription("");
        pet26.addVisit(visit27);
        org.springframework.samples.petclinic.owner.PetType petType31 = null;
        pet26.setType(petType31);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection33 = pet26.getVisits();
        pet26.setName("");
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection36 = pet26.getVisits();
        org.springframework.samples.petclinic.owner.Pet pet37 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit38 = new org.springframework.samples.petclinic.owner.Visit();
        visit38.setDescription("");
        pet37.addVisit(visit38);
        org.springframework.samples.petclinic.owner.Visit visit42 = new org.springframework.samples.petclinic.owner.Visit();
        visit42.setDescription("");
        java.lang.Integer int45 = visit42.getId();
        pet37.addVisit(visit42);
        java.time.LocalDate localDate47 = visit42.getDate();
        pet26.setBirthDate(localDate47);
        pet10.setBirthDate(localDate47);
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(visitCollection33);
        org.junit.Assert.assertNotNull(visitCollection36);
        org.junit.Assert.assertNull(int45);
        org.junit.Assert.assertNotNull(localDate47);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0210");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList7 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet9 = owner0.getPet((java.lang.Integer) 0);
        owner0.setCity("");
        org.springframework.samples.petclinic.owner.Pet pet14 = owner0.getPet("<null>", false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertNotNull(petList7);
        org.junit.Assert.assertNull(pet9);
        org.junit.Assert.assertNull(pet14);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0211");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        java.lang.String str9 = owner0.getTelephone();
        java.lang.String str10 = owner0.getTelephone();
        java.lang.String str11 = owner0.toString();
        java.lang.String str12 = owner0.getCity();
        java.lang.Integer int13 = owner0.getId();
        java.lang.String str14 = owner0.getFirstName();
        java.lang.Class<?> wildcardClass15 = owner0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0212");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        visit1.setDescription("");
        pet0.addVisit(visit1);
        org.springframework.samples.petclinic.owner.Visit visit5 = new org.springframework.samples.petclinic.owner.Visit();
        visit5.setDescription("");
        java.lang.Integer int8 = visit5.getId();
        pet0.addVisit(visit5);
        java.time.LocalDate localDate10 = visit5.getDate();
        visit5.setDescription("hi!");
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0213");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 10);
        java.lang.String str6 = owner0.getFirstName();
        java.lang.String str7 = owner0.getCity();
        org.springframework.samples.petclinic.owner.Pet pet8 = new org.springframework.samples.petclinic.owner.Pet();
        pet8.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet11 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit12 = new org.springframework.samples.petclinic.owner.Visit();
        visit12.setDescription("");
        pet11.addVisit(visit12);
        org.springframework.samples.petclinic.owner.PetType petType16 = null;
        pet11.setType(petType16);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection18 = pet11.getVisits();
        pet11.setName("");
        org.springframework.samples.petclinic.owner.PetType petType21 = new org.springframework.samples.petclinic.owner.PetType();
        pet11.setType(petType21);
        pet8.setType(petType21);
        owner0.addPet(pet8);
        org.springframework.samples.petclinic.owner.Pet pet25 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit26 = new org.springframework.samples.petclinic.owner.Visit();
        visit26.setDescription("");
        pet25.addVisit(visit26);
        org.springframework.samples.petclinic.owner.PetType petType30 = null;
        pet25.setType(petType30);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection32 = pet25.getVisits();
        pet25.setName("");
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection35 = pet25.getVisits();
        java.lang.Integer int36 = pet25.getId();
        owner0.addPet(pet25);
        owner0.setLastName("");
        org.springframework.samples.petclinic.owner.Pet pet41 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit42 = new org.springframework.samples.petclinic.owner.Visit();
        pet41.addVisit(visit42);
        org.springframework.samples.petclinic.owner.Pet pet44 = new org.springframework.samples.petclinic.owner.Pet();
        pet44.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit47 = new org.springframework.samples.petclinic.owner.Visit();
        visit47.setDescription("");
        boolean boolean50 = visit47.isNew();
        pet44.addVisit(visit47);
        java.time.LocalDate localDate52 = visit47.getDate();
        visit42.setDate(localDate52);
        visit42.setDescription("");
        org.springframework.samples.petclinic.owner.Pet pet56 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit57 = new org.springframework.samples.petclinic.owner.Visit();
        pet56.addVisit(visit57);
        org.springframework.samples.petclinic.owner.Pet pet59 = new org.springframework.samples.petclinic.owner.Pet();
        pet59.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit62 = new org.springframework.samples.petclinic.owner.Visit();
        visit62.setDescription("");
        boolean boolean65 = visit62.isNew();
        pet59.addVisit(visit62);
        java.time.LocalDate localDate67 = visit62.getDate();
        visit57.setDate(localDate67);
        java.time.LocalDate localDate69 = visit57.getDate();
        visit42.setDate(localDate69);
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 100, visit42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(visitCollection18);
        org.junit.Assert.assertNotNull(visitCollection32);
        org.junit.Assert.assertNotNull(visitCollection35);
        org.junit.Assert.assertNull(int36);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(localDate67);
        org.junit.Assert.assertNotNull(localDate69);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0214");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList3 = owner0.getPets();
        java.lang.String str4 = owner0.getFirstName();
        owner0.setCity("hi!");
        owner0.setCity("hi!");
        java.lang.Integer int9 = owner0.getId();
        org.springframework.samples.petclinic.owner.Pet pet11 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit12 = new org.springframework.samples.petclinic.owner.Visit();
        visit12.setDescription("");
        pet11.addVisit(visit12);
        org.springframework.samples.petclinic.owner.Pet pet16 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate17 = null;
        pet16.setBirthDate(localDate17);
        org.springframework.samples.petclinic.owner.Visit visit19 = new org.springframework.samples.petclinic.owner.Visit();
        visit19.setDescription("");
        java.time.LocalDate localDate22 = visit19.getDate();
        pet16.setBirthDate(localDate22);
        pet11.setBirthDate(localDate22);
        boolean boolean25 = pet11.isNew();
        org.springframework.samples.petclinic.owner.Visit visit26 = new org.springframework.samples.petclinic.owner.Visit();
        visit26.setDescription("");
        java.lang.Integer int29 = visit26.getId();
        java.time.LocalDate localDate30 = visit26.getDate();
        org.springframework.samples.petclinic.owner.Visit visit31 = new org.springframework.samples.petclinic.owner.Visit();
        visit31.setDescription("");
        java.time.LocalDate localDate34 = visit31.getDate();
        java.time.LocalDate localDate35 = visit31.getDate();
        visit26.setDate(localDate35);
        org.springframework.samples.petclinic.owner.Pet pet37 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit38 = new org.springframework.samples.petclinic.owner.Visit();
        visit38.setDescription("");
        pet37.addVisit(visit38);
        org.springframework.samples.petclinic.owner.Pet pet42 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate43 = null;
        pet42.setBirthDate(localDate43);
        org.springframework.samples.petclinic.owner.Visit visit45 = new org.springframework.samples.petclinic.owner.Visit();
        visit45.setDescription("");
        java.time.LocalDate localDate48 = visit45.getDate();
        pet42.setBirthDate(localDate48);
        pet37.setBirthDate(localDate48);
        visit26.setDate(localDate48);
        java.time.LocalDate localDate52 = visit26.getDate();
        pet11.addVisit(visit26);
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 2, visit26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertNotNull(localDate52);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0215");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.Visit visit3 = new org.springframework.samples.petclinic.owner.Visit();
        visit3.setDescription("");
        java.time.LocalDate localDate6 = visit3.getDate();
        pet0.setBirthDate(localDate6);
        org.springframework.samples.petclinic.owner.Pet pet8 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit9 = new org.springframework.samples.petclinic.owner.Visit();
        visit9.setDescription("");
        pet8.addVisit(visit9);
        org.springframework.samples.petclinic.owner.Visit visit13 = new org.springframework.samples.petclinic.owner.Visit();
        visit13.setDescription("");
        java.lang.Integer int16 = visit13.getId();
        pet8.addVisit(visit13);
        java.lang.String str18 = visit13.getDescription();
        pet0.addVisit(visit13);
        org.springframework.samples.petclinic.owner.Pet pet20 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit21 = new org.springframework.samples.petclinic.owner.Visit();
        visit21.setDescription("");
        pet20.addVisit(visit21);
        visit21.setDescription("");
        java.time.LocalDate localDate27 = visit21.getDate();
        visit13.setDate(localDate27);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(localDate27);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0216");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        owner0.setCity("hi!");
        owner0.setTelephone("hi!");
        owner0.setTelephone("hi!");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList10 = owner0.getPets();
        java.lang.String str11 = owner0.getCity();
        owner0.setTelephone("hi!");
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0217");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList4 = owner0.getPets();
        java.lang.String str5 = owner0.getAddress();
        owner0.setTelephone("");
        boolean boolean8 = owner0.isNew();
        org.springframework.samples.petclinic.owner.Pet pet10 = owner0.getPet((java.lang.Integer) 3);
        owner0.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList13 = owner0.getPets();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(pet10);
        org.junit.Assert.assertNotNull(petList13);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0218");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        visit1.setDescription("");
        pet0.addVisit(visit1);
        org.springframework.samples.petclinic.owner.PetType petType5 = null;
        pet0.setType(petType5);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType10 = pet0.getType();
        java.time.LocalDate localDate11 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet12 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit13 = new org.springframework.samples.petclinic.owner.Visit();
        visit13.setDescription("");
        pet12.addVisit(visit13);
        org.springframework.samples.petclinic.owner.Pet pet17 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate18 = null;
        pet17.setBirthDate(localDate18);
        org.springframework.samples.petclinic.owner.Visit visit20 = new org.springframework.samples.petclinic.owner.Visit();
        visit20.setDescription("");
        java.time.LocalDate localDate23 = visit20.getDate();
        pet17.setBirthDate(localDate23);
        pet12.setBirthDate(localDate23);
        org.springframework.samples.petclinic.owner.Visit visit26 = new org.springframework.samples.petclinic.owner.Visit();
        visit26.setDescription("");
        java.time.LocalDate localDate29 = visit26.getDate();
        pet12.setBirthDate(localDate29);
        pet0.setBirthDate(localDate29);
        org.springframework.samples.petclinic.owner.PetType petType32 = null;
        pet0.setType(petType32);
        org.springframework.samples.petclinic.owner.Visit visit34 = null;
        pet0.addVisit(visit34);
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertNull(petType10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate29);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0219");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        owner0.setCity("hi!");
        owner0.setTelephone("hi!");
        owner0.setTelephone("hi!");
        java.lang.String str10 = owner0.getCity();
        java.lang.String str11 = owner0.getLastName();
        owner0.setAddress("hi!");
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0220");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList3 = owner0.getPets();
        java.lang.String str4 = owner0.getFirstName();
        owner0.setCity("hi!");
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("hi!");
        owner0.setAddress("");
        java.lang.String str11 = owner0.getTelephone();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(pet8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0221");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList3 = owner0.getPets();
        java.lang.String str4 = owner0.getFirstName();
        owner0.setCity("hi!");
        java.lang.String str7 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet9 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str10 = owner0.getCity();
        java.lang.String str11 = owner0.getAddress();
        java.lang.String str12 = owner0.getTelephone();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(pet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0222");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList1 = vet0.getSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList2 = vet0.getSpecialties();
        vet0.setFirstName("<null>");
        int int5 = vet0.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Vet vet6 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty7 = new org.springframework.samples.petclinic.vet.Specialty();
        vet6.addSpecialty(specialty7);
        vet0.addSpecialty(specialty7);
        java.lang.String str10 = specialty7.getName();
        org.junit.Assert.assertNotNull(specialtyList1);
        org.junit.Assert.assertNotNull(specialtyList2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0223");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        owner0.setCity("hi!");
        java.lang.String str6 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("");
        org.springframework.samples.petclinic.owner.Owner owner9 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet11 = owner9.getPet("<null>");
        java.lang.String str12 = owner9.toString();
        owner9.setCity("hi!");
        owner9.setTelephone("hi!");
        owner9.setTelephone("hi!");
        org.springframework.samples.petclinic.owner.Pet pet19 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate20 = null;
        pet19.setBirthDate(localDate20);
        pet19.setName("");
        org.springframework.samples.petclinic.owner.Pet pet24 = new org.springframework.samples.petclinic.owner.Pet();
        pet24.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit27 = new org.springframework.samples.petclinic.owner.Visit();
        visit27.setDescription("");
        boolean boolean30 = visit27.isNew();
        pet24.addVisit(visit27);
        pet19.addVisit(visit27);
        java.lang.String str33 = pet19.getName();
        owner9.addPet(pet19);
        pet19.setId((java.lang.Integer) 2);
        owner0.addPet(pet19);
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet8);
        org.junit.Assert.assertNull(pet11);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0224");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        java.lang.String str4 = owner0.toString();
        java.lang.String str5 = owner0.getAddress();
        owner0.setAddress("");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(petList8);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0225");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList3 = owner0.getPets();
        java.lang.String str4 = owner0.getFirstName();
        owner0.setCity("hi!");
        java.lang.String str7 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet9 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str10 = owner0.getCity();
        org.springframework.samples.petclinic.owner.Pet pet12 = new org.springframework.samples.petclinic.owner.Pet();
        pet12.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit15 = new org.springframework.samples.petclinic.owner.Visit();
        visit15.setDescription("");
        boolean boolean18 = visit15.isNew();
        pet12.addVisit(visit15);
        java.time.LocalDate localDate20 = pet12.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet21 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate22 = null;
        pet21.setBirthDate(localDate22);
        org.springframework.samples.petclinic.owner.PetType petType24 = null;
        pet21.setType(petType24);
        java.time.LocalDate localDate26 = pet21.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType27 = pet21.getType();
        org.springframework.samples.petclinic.owner.Visit visit28 = new org.springframework.samples.petclinic.owner.Visit();
        visit28.setDescription("");
        java.lang.Integer int31 = visit28.getId();
        pet21.addVisit(visit28);
        pet12.addVisit(visit28);
        java.time.LocalDate localDate34 = visit28.getDate();
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 3, visit28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(pet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDate26);
        org.junit.Assert.assertNull(petType27);
        org.junit.Assert.assertNull(int31);
        org.junit.Assert.assertNotNull(localDate34);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0226");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        org.springframework.samples.petclinic.owner.Pet pet6 = owner0.getPet("hi!", false);
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("");
        java.lang.String str9 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setId((java.lang.Integer) 10);
        org.springframework.samples.petclinic.owner.Pet pet16 = owner0.getPet("", false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(pet6);
        org.junit.Assert.assertNull(pet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(pet16);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0227");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        java.lang.String str9 = owner0.getTelephone();
        java.lang.String str10 = owner0.getTelephone();
        java.lang.String str11 = owner0.toString();
        java.lang.String str12 = owner0.getCity();
        org.springframework.samples.petclinic.owner.Pet pet15 = owner0.getPet("", false);
        org.springframework.samples.petclinic.owner.Visit visit17 = new org.springframework.samples.petclinic.owner.Visit();
        visit17.setDescription("");
        boolean boolean20 = visit17.isNew();
        java.lang.String str21 = visit17.getDescription();
        java.lang.String str22 = visit17.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 1, visit17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(pet15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0228");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 10);
        java.lang.String str6 = owner0.getFirstName();
        owner0.setFirstName("hi!");
        org.springframework.samples.petclinic.owner.Pet pet10 = owner0.getPet("<null>");
        owner0.setTelephone("");
        owner0.setFirstName("<null>");
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(pet10);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0229");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList4 = owner0.getPets();
        java.lang.String str5 = owner0.getAddress();
        owner0.setTelephone("");
        owner0.setTelephone("<null>");
        owner0.setLastName("hi!");
        owner0.setAddress("");
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0230");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        java.lang.String str1 = vet0.getLastName();
        int int2 = vet0.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Vet vet3 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty4 = new org.springframework.samples.petclinic.vet.Specialty();
        vet3.addSpecialty(specialty4);
        int int6 = vet3.getNrOfSpecialties();
        java.lang.String str7 = vet3.getFirstName();
        org.springframework.samples.petclinic.vet.Vet vet8 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty9 = new org.springframework.samples.petclinic.vet.Specialty();
        vet8.addSpecialty(specialty9);
        vet3.addSpecialty(specialty9);
        vet3.setLastName("");
        int int14 = vet3.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Vet vet15 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty16 = new org.springframework.samples.petclinic.vet.Specialty();
        vet15.addSpecialty(specialty16);
        int int18 = vet15.getNrOfSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList19 = vet15.getSpecialties();
        org.springframework.samples.petclinic.vet.Specialty specialty20 = new org.springframework.samples.petclinic.vet.Specialty();
        specialty20.setId((java.lang.Integer) 100);
        vet15.addSpecialty(specialty20);
        vet3.addSpecialty(specialty20);
        vet0.addSpecialty(specialty20);
        org.springframework.samples.petclinic.vet.Specialty specialty26 = null;
        vet0.addSpecialty(specialty26);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(specialtyList19);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0231");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("hi!");
        org.springframework.samples.petclinic.owner.Pet pet9 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate10 = null;
        pet9.setBirthDate(localDate10);
        org.springframework.samples.petclinic.owner.Visit visit12 = new org.springframework.samples.petclinic.owner.Visit();
        visit12.setDescription("");
        java.time.LocalDate localDate15 = visit12.getDate();
        pet9.setBirthDate(localDate15);
        owner0.addPet(pet9);
        org.springframework.samples.petclinic.owner.Pet pet18 = new org.springframework.samples.petclinic.owner.Pet();
        pet18.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet21 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit22 = new org.springframework.samples.petclinic.owner.Visit();
        visit22.setDescription("");
        pet21.addVisit(visit22);
        org.springframework.samples.petclinic.owner.PetType petType26 = null;
        pet21.setType(petType26);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection28 = pet21.getVisits();
        pet21.setName("");
        org.springframework.samples.petclinic.owner.PetType petType31 = new org.springframework.samples.petclinic.owner.PetType();
        pet21.setType(petType31);
        pet18.setType(petType31);
        pet9.setType(petType31);
        org.springframework.samples.petclinic.owner.Pet pet35 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit36 = new org.springframework.samples.petclinic.owner.Visit();
        visit36.setDescription("");
        pet35.addVisit(visit36);
        pet9.addVisit(visit36);
        java.lang.String str41 = visit36.getDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertNull(pet8);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(visitCollection28);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0232");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setId((java.lang.Integer) (-1));
        owner0.setCity("");
        owner0.setLastName("hi!");
        java.lang.String str10 = owner0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0233");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 10);
        java.lang.String str6 = owner0.getFirstName();
        java.lang.String str7 = owner0.getCity();
        org.springframework.samples.petclinic.owner.Pet pet9 = owner0.getPet("hi!");
        java.lang.String str10 = owner0.getCity();
        org.springframework.samples.petclinic.owner.Visit visit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) (-1), visit12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Visit must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(pet9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0234");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        owner0.setCity("hi!");
        java.lang.String str6 = owner0.toString();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList7 = owner0.getPets();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList7);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0235");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList7 = owner0.getPets();
        owner0.setId((java.lang.Integer) 2);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertNotNull(petList7);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0236");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        java.lang.String str1 = vet0.getLastName();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList2 = vet0.getSpecialties();
        int int3 = vet0.getNrOfSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList4 = vet0.getSpecialties();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(specialtyList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(specialtyList4);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0237");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.Visit visit3 = new org.springframework.samples.petclinic.owner.Visit();
        visit3.setDescription("");
        java.time.LocalDate localDate6 = visit3.getDate();
        pet0.setBirthDate(localDate6);
        org.springframework.samples.petclinic.owner.Pet pet8 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit9 = new org.springframework.samples.petclinic.owner.Visit();
        visit9.setDescription("");
        pet8.addVisit(visit9);
        org.springframework.samples.petclinic.owner.Visit visit13 = new org.springframework.samples.petclinic.owner.Visit();
        visit13.setDescription("");
        java.lang.Integer int16 = visit13.getId();
        pet8.addVisit(visit13);
        java.lang.String str18 = visit13.getDescription();
        pet0.addVisit(visit13);
        java.lang.String str20 = pet0.getName();
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0238");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty1 = new org.springframework.samples.petclinic.vet.Specialty();
        vet0.addSpecialty(specialty1);
        int int3 = vet0.getNrOfSpecialties();
        int int4 = vet0.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Vet vet5 = new org.springframework.samples.petclinic.vet.Vet();
        java.lang.String str6 = vet5.getLastName();
        int int7 = vet5.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Vet vet8 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty9 = new org.springframework.samples.petclinic.vet.Specialty();
        vet8.addSpecialty(specialty9);
        int int11 = vet8.getNrOfSpecialties();
        java.lang.String str12 = vet8.getFirstName();
        org.springframework.samples.petclinic.vet.Vet vet13 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty14 = new org.springframework.samples.petclinic.vet.Specialty();
        vet13.addSpecialty(specialty14);
        vet8.addSpecialty(specialty14);
        vet8.setLastName("");
        int int19 = vet8.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Vet vet20 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty21 = new org.springframework.samples.petclinic.vet.Specialty();
        vet20.addSpecialty(specialty21);
        int int23 = vet20.getNrOfSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList24 = vet20.getSpecialties();
        org.springframework.samples.petclinic.vet.Specialty specialty25 = new org.springframework.samples.petclinic.vet.Specialty();
        specialty25.setId((java.lang.Integer) 100);
        vet20.addSpecialty(specialty25);
        vet8.addSpecialty(specialty25);
        vet5.addSpecialty(specialty25);
        org.springframework.samples.petclinic.vet.Specialty specialty31 = new org.springframework.samples.petclinic.vet.Specialty();
        vet5.addSpecialty(specialty31);
        vet0.addSpecialty(specialty31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(specialtyList24);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0239");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        owner0.setFirstName("");
        org.springframework.samples.petclinic.owner.Pet pet10 = new org.springframework.samples.petclinic.owner.Pet();
        pet10.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit13 = new org.springframework.samples.petclinic.owner.Visit();
        visit13.setDescription("");
        boolean boolean16 = visit13.isNew();
        pet10.addVisit(visit13);
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) (-1), visit13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0240");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        java.lang.String str1 = vet0.getLastName();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList2 = vet0.getSpecialties();
        org.springframework.samples.petclinic.vet.Specialty specialty3 = new org.springframework.samples.petclinic.vet.Specialty();
        vet0.addSpecialty(specialty3);
        java.lang.String str5 = specialty3.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(specialtyList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<null>" + "'", str5, "<null>");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0241");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        java.lang.String str4 = owner0.getCity();
        owner0.setLastName("");
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList9 = owner0.getPets();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(pet8);
        org.junit.Assert.assertNotNull(petList9);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0242");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet("");
        org.springframework.samples.petclinic.owner.Pet pet7 = owner0.getPet("hi!");
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(pet7);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0243");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        owner0.setCity("hi!");
        owner0.setTelephone("hi!");
        owner0.setTelephone("hi!");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList10 = owner0.getPets();
        java.lang.String str11 = owner0.getFirstName();
        org.springframework.samples.petclinic.owner.Pet pet12 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate13 = null;
        pet12.setBirthDate(localDate13);
        org.springframework.samples.petclinic.owner.PetType petType15 = null;
        pet12.setType(petType15);
        java.time.LocalDate localDate17 = pet12.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit18 = new org.springframework.samples.petclinic.owner.Visit();
        pet12.addVisit(visit18);
        java.lang.Integer int20 = pet12.getId();
        pet12.setName("");
        owner0.addPet(pet12);
        owner0.setCity("hi!");
        java.lang.String str26 = owner0.getCity();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0244");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 10);
        java.lang.String str6 = owner0.getFirstName();
        owner0.setFirstName("hi!");
        org.springframework.samples.petclinic.owner.Pet pet10 = owner0.getPet("<null>");
        owner0.setTelephone("");
        java.lang.String str13 = owner0.getFirstName();
        owner0.setCity("");
        owner0.setFirstName("<null>");
        java.lang.String str18 = owner0.getLastName();
        java.lang.Class<?> wildcardClass19 = owner0.getClass();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(pet10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0245");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        java.lang.String str4 = owner0.getCity();
        java.lang.String str5 = owner0.getLastName();
        owner0.setFirstName("");
        owner0.setTelephone("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0246");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType6 = pet0.getType();
        pet0.setName("<null>");
        java.lang.String str9 = pet0.getName();
        pet0.setId((java.lang.Integer) 100);
        pet0.setName("hi!");
        org.springframework.samples.petclinic.owner.Visit visit14 = new org.springframework.samples.petclinic.owner.Visit();
        java.lang.String str15 = visit14.getDescription();
        pet0.addVisit(visit14);
        java.lang.String str17 = visit14.getDescription();
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNull(petType6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0247");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        owner0.setCity("hi!");
        java.lang.String str6 = owner0.getTelephone();
        owner0.setCity("hi!");
        org.springframework.samples.petclinic.owner.Pet pet10 = owner0.getPet("");
        java.lang.String str11 = owner0.getTelephone();
        java.lang.String str12 = owner0.getLastName();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(pet10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0248");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        java.lang.String str4 = owner0.getCity();
        owner0.setTelephone("");
        org.springframework.samples.petclinic.owner.Pet pet7 = new org.springframework.samples.petclinic.owner.Pet();
        pet7.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet10 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit11 = new org.springframework.samples.petclinic.owner.Visit();
        visit11.setDescription("");
        pet10.addVisit(visit11);
        org.springframework.samples.petclinic.owner.PetType petType15 = null;
        pet10.setType(petType15);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection17 = pet10.getVisits();
        pet10.setName("");
        org.springframework.samples.petclinic.owner.PetType petType20 = new org.springframework.samples.petclinic.owner.PetType();
        pet10.setType(petType20);
        pet7.setType(petType20);
        pet7.setName("<null>");
        java.lang.String str25 = pet7.toString();
        boolean boolean26 = pet7.isNew();
        owner0.addPet(pet7);
        owner0.setId((java.lang.Integer) 3);
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(visitCollection17);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<null>" + "'", str25, "<null>");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0249");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        owner0.setCity("");
        owner0.setTelephone("hi!");
        java.lang.String str11 = owner0.getAddress();
        java.lang.String str12 = owner0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<null>" + "'", str11, "<null>");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0250");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet("", false);
        owner0.setTelephone("<null>");
        java.lang.String str8 = owner0.getTelephone();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList9 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet11 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit12 = new org.springframework.samples.petclinic.owner.Visit();
        pet11.addVisit(visit12);
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 3, visit12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<null>" + "'", str8, "<null>");
        org.junit.Assert.assertNotNull(petList9);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0251");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        java.lang.String str4 = owner0.getCity();
        java.lang.String str5 = owner0.getTelephone();
        java.lang.String str6 = owner0.getTelephone();
        owner0.setTelephone("hi!");
        org.springframework.samples.petclinic.owner.Pet pet10 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate11 = null;
        pet10.setBirthDate(localDate11);
        org.springframework.samples.petclinic.owner.Visit visit13 = new org.springframework.samples.petclinic.owner.Visit();
        visit13.setDescription("");
        java.time.LocalDate localDate16 = visit13.getDate();
        pet10.setBirthDate(localDate16);
        org.springframework.samples.petclinic.owner.Pet pet18 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit19 = new org.springframework.samples.petclinic.owner.Visit();
        visit19.setDescription("");
        pet18.addVisit(visit19);
        org.springframework.samples.petclinic.owner.Visit visit23 = new org.springframework.samples.petclinic.owner.Visit();
        visit23.setDescription("");
        java.lang.Integer int26 = visit23.getId();
        pet18.addVisit(visit23);
        java.lang.String str28 = visit23.getDescription();
        pet10.addVisit(visit23);
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 10, visit23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNull(int26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0252");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty1 = new org.springframework.samples.petclinic.vet.Specialty();
        specialty1.setId((java.lang.Integer) 100);
        vet0.addSpecialty(specialty1);
        int int5 = vet0.getNrOfSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList6 = vet0.getSpecialties();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(specialtyList6);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0253");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        vet0.setLastName("<null>");
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList3 = vet0.getSpecialties();
        org.springframework.samples.petclinic.vet.Vet vet4 = new org.springframework.samples.petclinic.vet.Vet();
        java.lang.String str5 = vet4.getLastName();
        int int6 = vet4.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Vet vet7 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty8 = new org.springframework.samples.petclinic.vet.Specialty();
        vet7.addSpecialty(specialty8);
        int int10 = vet7.getNrOfSpecialties();
        java.lang.String str11 = vet7.getFirstName();
        org.springframework.samples.petclinic.vet.Vet vet12 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty13 = new org.springframework.samples.petclinic.vet.Specialty();
        vet12.addSpecialty(specialty13);
        vet7.addSpecialty(specialty13);
        vet7.setLastName("");
        int int18 = vet7.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Vet vet19 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty20 = new org.springframework.samples.petclinic.vet.Specialty();
        vet19.addSpecialty(specialty20);
        int int22 = vet19.getNrOfSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList23 = vet19.getSpecialties();
        org.springframework.samples.petclinic.vet.Specialty specialty24 = new org.springframework.samples.petclinic.vet.Specialty();
        specialty24.setId((java.lang.Integer) 100);
        vet19.addSpecialty(specialty24);
        vet7.addSpecialty(specialty24);
        vet4.addSpecialty(specialty24);
        specialty24.setName("<null>");
        vet0.addSpecialty(specialty24);
        org.junit.Assert.assertNotNull(specialtyList3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(specialtyList23);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0254");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        visit1.setDescription("");
        pet0.addVisit(visit1);
        org.springframework.samples.petclinic.owner.PetType petType5 = null;
        pet0.setType(petType5);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType10 = new org.springframework.samples.petclinic.owner.PetType();
        pet0.setType(petType10);
        java.time.LocalDate localDate12 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection13 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType14 = pet0.getType();
        java.lang.Class<?> wildcardClass15 = petType14.getClass();
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNotNull(visitCollection13);
        org.junit.Assert.assertNotNull(petType14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0255");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet("");
        org.springframework.samples.petclinic.owner.Pet pet6 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit7 = new org.springframework.samples.petclinic.owner.Visit();
        visit7.setDescription("");
        pet6.addVisit(visit7);
        org.springframework.samples.petclinic.owner.PetType petType11 = null;
        pet6.setType(petType11);
        owner0.addPet(pet6);
        java.lang.String str14 = owner0.getFirstName();
        owner0.setFirstName("");
        org.springframework.samples.petclinic.owner.Pet pet18 = owner0.getPet((java.lang.Integer) 1);
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(pet18);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0256");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet3 = owner0.getPet("hi!", false);
        org.springframework.samples.petclinic.owner.Pet pet4 = new org.springframework.samples.petclinic.owner.Pet();
        pet4.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit7 = new org.springframework.samples.petclinic.owner.Visit();
        visit7.setDescription("");
        boolean boolean10 = visit7.isNew();
        pet4.addVisit(visit7);
        java.time.LocalDate localDate12 = pet4.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet13 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit14 = new org.springframework.samples.petclinic.owner.Visit();
        visit14.setDescription("");
        pet13.addVisit(visit14);
        org.springframework.samples.petclinic.owner.PetType petType18 = null;
        pet13.setType(petType18);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection20 = pet13.getVisits();
        pet13.setName("");
        org.springframework.samples.petclinic.owner.PetType petType23 = new org.springframework.samples.petclinic.owner.PetType();
        pet13.setType(petType23);
        pet4.setType(petType23);
        owner0.addPet(pet4);
        pet4.setName("");
        org.springframework.samples.petclinic.owner.Pet pet29 = new org.springframework.samples.petclinic.owner.Pet();
        pet29.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit32 = new org.springframework.samples.petclinic.owner.Visit();
        visit32.setDescription("");
        boolean boolean35 = visit32.isNew();
        pet29.addVisit(visit32);
        java.time.LocalDate localDate37 = visit32.getDate();
        org.springframework.samples.petclinic.owner.Visit visit38 = new org.springframework.samples.petclinic.owner.Visit();
        visit38.setDescription("");
        java.lang.Integer int41 = visit38.getId();
        java.time.LocalDate localDate42 = visit38.getDate();
        org.springframework.samples.petclinic.owner.Visit visit43 = new org.springframework.samples.petclinic.owner.Visit();
        visit43.setDescription("");
        java.time.LocalDate localDate46 = visit43.getDate();
        java.time.LocalDate localDate47 = visit43.getDate();
        visit38.setDate(localDate47);
        visit32.setDate(localDate47);
        visit32.setDescription("");
        java.lang.String str52 = visit32.getDescription();
        java.lang.String str53 = visit32.getDescription();
        pet4.addVisit(visit32);
        java.time.LocalDate localDate55 = pet4.getBirthDate();
        org.junit.Assert.assertNull(pet3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNotNull(visitCollection20);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNull(int41);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNull(localDate55);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0257");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet3 = owner0.getPet("hi!", false);
        org.springframework.samples.petclinic.owner.Pet pet4 = new org.springframework.samples.petclinic.owner.Pet();
        pet4.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit7 = new org.springframework.samples.petclinic.owner.Visit();
        visit7.setDescription("");
        boolean boolean10 = visit7.isNew();
        pet4.addVisit(visit7);
        java.time.LocalDate localDate12 = pet4.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet13 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit14 = new org.springframework.samples.petclinic.owner.Visit();
        visit14.setDescription("");
        pet13.addVisit(visit14);
        org.springframework.samples.petclinic.owner.PetType petType18 = null;
        pet13.setType(petType18);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection20 = pet13.getVisits();
        pet13.setName("");
        org.springframework.samples.petclinic.owner.PetType petType23 = new org.springframework.samples.petclinic.owner.PetType();
        pet13.setType(petType23);
        pet4.setType(petType23);
        owner0.addPet(pet4);
        java.lang.String str27 = pet4.toString();
        org.springframework.samples.petclinic.owner.Pet pet28 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate29 = null;
        pet28.setBirthDate(localDate29);
        pet28.setName("");
        org.springframework.samples.petclinic.owner.Pet pet33 = new org.springframework.samples.petclinic.owner.Pet();
        pet33.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit36 = new org.springframework.samples.petclinic.owner.Visit();
        visit36.setDescription("");
        boolean boolean39 = visit36.isNew();
        pet33.addVisit(visit36);
        pet28.addVisit(visit36);
        java.lang.String str42 = pet28.getName();
        org.springframework.samples.petclinic.owner.Pet pet43 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate44 = null;
        pet43.setBirthDate(localDate44);
        org.springframework.samples.petclinic.owner.PetType petType46 = null;
        pet43.setType(petType46);
        java.time.LocalDate localDate48 = pet43.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection49 = pet43.getVisits();
        org.springframework.samples.petclinic.owner.Pet pet50 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit51 = new org.springframework.samples.petclinic.owner.Visit();
        visit51.setDescription("");
        pet50.addVisit(visit51);
        org.springframework.samples.petclinic.owner.PetType petType55 = null;
        pet50.setType(petType55);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection57 = pet50.getVisits();
        pet50.setName("");
        org.springframework.samples.petclinic.owner.PetType petType60 = new org.springframework.samples.petclinic.owner.PetType();
        pet50.setType(petType60);
        java.lang.Integer int62 = pet50.getId();
        org.springframework.samples.petclinic.owner.Pet pet63 = new org.springframework.samples.petclinic.owner.Pet();
        pet63.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet66 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit67 = new org.springframework.samples.petclinic.owner.Visit();
        visit67.setDescription("");
        pet66.addVisit(visit67);
        org.springframework.samples.petclinic.owner.PetType petType71 = null;
        pet66.setType(petType71);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection73 = pet66.getVisits();
        pet66.setName("");
        org.springframework.samples.petclinic.owner.PetType petType76 = new org.springframework.samples.petclinic.owner.PetType();
        pet66.setType(petType76);
        pet63.setType(petType76);
        pet63.setName("<null>");
        org.springframework.samples.petclinic.owner.PetType petType81 = pet63.getType();
        pet50.setType(petType81);
        pet43.setType(petType81);
        pet28.setType(petType81);
        pet4.setType(petType81);
        pet4.setId((java.lang.Integer) 10);
        org.junit.Assert.assertNull(pet3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNotNull(visitCollection20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<null>" + "'", str27, "<null>");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(localDate48);
        org.junit.Assert.assertNotNull(visitCollection49);
        org.junit.Assert.assertNotNull(visitCollection57);
        org.junit.Assert.assertNull(int62);
        org.junit.Assert.assertNotNull(visitCollection73);
        org.junit.Assert.assertNotNull(petType81);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0258");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        owner0.setCity("hi!");
        org.springframework.samples.petclinic.owner.Pet pet10 = owner0.getPet("<null>");
        org.springframework.samples.petclinic.owner.Pet pet12 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit13 = new org.springframework.samples.petclinic.owner.Visit();
        visit13.setDescription("");
        pet12.addVisit(visit13);
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 100, visit13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertNull(pet10);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0259");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        java.lang.String str4 = owner0.getCity();
        java.lang.String str5 = owner0.getLastName();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        java.lang.String str7 = owner0.getCity();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0260");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 10);
        java.lang.String str6 = owner0.getFirstName();
        java.lang.String str7 = owner0.getCity();
        org.springframework.samples.petclinic.owner.Pet pet9 = owner0.getPet("hi!");
        java.lang.String str10 = owner0.getFirstName();
        org.springframework.samples.petclinic.owner.Pet pet12 = owner0.getPet((java.lang.Integer) 1);
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(pet9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(pet12);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0261");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 10);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        owner0.setFirstName("");
        java.lang.String str9 = owner0.getAddress();
        java.lang.String str10 = owner0.getAddress();
        java.lang.String str11 = owner0.getLastName();
        owner0.setCity("<null>");
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0262");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setFirstName("hi!");
        java.lang.Integer int3 = owner0.getId();
        java.lang.String str4 = owner0.getAddress();
        java.lang.Class<?> wildcardClass5 = owner0.getClass();
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0263");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList7 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet9 = owner0.getPet((java.lang.Integer) 0);
        owner0.setCity("");
        owner0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertNotNull(petList7);
        org.junit.Assert.assertNull(pet9);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0264");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet3 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit4 = new org.springframework.samples.petclinic.owner.Visit();
        visit4.setDescription("");
        pet3.addVisit(visit4);
        org.springframework.samples.petclinic.owner.PetType petType8 = null;
        pet3.setType(petType8);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection10 = pet3.getVisits();
        pet3.setName("");
        org.springframework.samples.petclinic.owner.PetType petType13 = new org.springframework.samples.petclinic.owner.PetType();
        pet3.setType(petType13);
        pet0.setType(petType13);
        pet0.setName("<null>");
        org.springframework.samples.petclinic.owner.PetType petType18 = pet0.getType();
        java.time.LocalDate localDate19 = pet0.getBirthDate();
        org.junit.Assert.assertNotNull(visitCollection10);
        org.junit.Assert.assertNotNull(petType18);
        org.junit.Assert.assertNull(localDate19);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0265");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet3 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit4 = new org.springframework.samples.petclinic.owner.Visit();
        visit4.setDescription("");
        pet3.addVisit(visit4);
        org.springframework.samples.petclinic.owner.PetType petType8 = null;
        pet3.setType(petType8);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection10 = pet3.getVisits();
        pet3.setName("");
        org.springframework.samples.petclinic.owner.PetType petType13 = new org.springframework.samples.petclinic.owner.PetType();
        pet3.setType(petType13);
        pet0.setType(petType13);
        java.lang.Integer int16 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType17 = pet0.getType();
        java.lang.String str18 = petType17.toString();
        org.junit.Assert.assertNotNull(visitCollection10);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(petType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<null>" + "'", str18, "<null>");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0266");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList1 = vet0.getSpecialties();
        java.lang.String str2 = vet0.getFirstName();
        org.springframework.samples.petclinic.vet.Vet vet3 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty4 = new org.springframework.samples.petclinic.vet.Specialty();
        vet3.addSpecialty(specialty4);
        int int6 = vet3.getNrOfSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList7 = vet3.getSpecialties();
        org.springframework.samples.petclinic.vet.Specialty specialty8 = new org.springframework.samples.petclinic.vet.Specialty();
        specialty8.setId((java.lang.Integer) 100);
        vet3.addSpecialty(specialty8);
        vet0.addSpecialty(specialty8);
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList13 = vet0.getSpecialties();
        org.junit.Assert.assertNotNull(specialtyList1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(specialtyList7);
        org.junit.Assert.assertNotNull(specialtyList13);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0267");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        java.lang.String str9 = owner0.getTelephone();
        java.lang.String str10 = owner0.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet12 = owner0.getPet((java.lang.Integer) (-1));
        org.springframework.samples.petclinic.owner.Pet pet14 = owner0.getPet("<null>");
        java.lang.String str15 = owner0.getCity();
        org.springframework.samples.petclinic.owner.Pet pet16 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit17 = new org.springframework.samples.petclinic.owner.Visit();
        visit17.setDescription("");
        pet16.addVisit(visit17);
        org.springframework.samples.petclinic.owner.PetType petType21 = null;
        pet16.setType(petType21);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection23 = pet16.getVisits();
        pet16.setName("");
        org.springframework.samples.petclinic.owner.PetType petType26 = new org.springframework.samples.petclinic.owner.PetType();
        pet16.setType(petType26);
        java.time.LocalDate localDate28 = pet16.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection29 = pet16.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType30 = pet16.getType();
        owner0.addPet(pet16);
        java.lang.String str32 = owner0.getAddress();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertNull(pet12);
        org.junit.Assert.assertNull(pet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(visitCollection23);
        org.junit.Assert.assertNull(localDate28);
        org.junit.Assert.assertNotNull(visitCollection29);
        org.junit.Assert.assertNotNull(petType30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<null>" + "'", str32, "<null>");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0268");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        java.lang.String str9 = owner0.getTelephone();
        java.lang.String str10 = owner0.getTelephone();
        java.lang.String str11 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet12 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit13 = new org.springframework.samples.petclinic.owner.Visit();
        visit13.setDescription("");
        pet12.addVisit(visit13);
        org.springframework.samples.petclinic.owner.Pet pet17 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate18 = null;
        pet17.setBirthDate(localDate18);
        org.springframework.samples.petclinic.owner.Visit visit20 = new org.springframework.samples.petclinic.owner.Visit();
        visit20.setDescription("");
        java.time.LocalDate localDate23 = visit20.getDate();
        pet17.setBirthDate(localDate23);
        pet12.setBirthDate(localDate23);
        boolean boolean26 = pet12.isNew();
        owner0.addPet(pet12);
        java.time.LocalDate localDate28 = pet12.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType29 = pet12.getType();
        org.springframework.samples.petclinic.owner.PetType petType30 = pet12.getType();
        org.springframework.samples.petclinic.owner.PetType petType31 = pet12.getType();
        org.springframework.samples.petclinic.owner.PetType petType32 = pet12.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNull(petType29);
        org.junit.Assert.assertNull(petType30);
        org.junit.Assert.assertNull(petType31);
        org.junit.Assert.assertNull(petType32);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0269");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        java.lang.String str9 = owner0.getTelephone();
        java.lang.String str10 = owner0.getTelephone();
        java.lang.String str11 = owner0.toString();
        java.lang.String str12 = owner0.getCity();
        owner0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0270");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet10 = owner0.getPet("<null>");
        java.lang.String str11 = owner0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertNull(pet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0271");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList1 = vet0.getSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList2 = vet0.getSpecialties();
        java.lang.String str3 = vet0.getLastName();
        org.springframework.samples.petclinic.vet.Specialty specialty4 = new org.springframework.samples.petclinic.vet.Specialty();
        specialty4.setId((java.lang.Integer) 100);
        vet0.addSpecialty(specialty4);
        org.springframework.samples.petclinic.vet.Vet vet8 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty9 = new org.springframework.samples.petclinic.vet.Specialty();
        vet8.addSpecialty(specialty9);
        int int11 = vet8.getNrOfSpecialties();
        java.lang.String str12 = vet8.getFirstName();
        org.springframework.samples.petclinic.vet.Vet vet13 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty14 = new org.springframework.samples.petclinic.vet.Specialty();
        vet13.addSpecialty(specialty14);
        vet8.addSpecialty(specialty14);
        vet8.setLastName("");
        int int19 = vet8.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Vet vet20 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty21 = new org.springframework.samples.petclinic.vet.Specialty();
        vet20.addSpecialty(specialty21);
        int int23 = vet20.getNrOfSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList24 = vet20.getSpecialties();
        org.springframework.samples.petclinic.vet.Specialty specialty25 = new org.springframework.samples.petclinic.vet.Specialty();
        specialty25.setId((java.lang.Integer) 100);
        vet20.addSpecialty(specialty25);
        vet8.addSpecialty(specialty25);
        vet0.addSpecialty(specialty25);
        org.springframework.samples.petclinic.vet.Specialty specialty31 = null;
        vet0.addSpecialty(specialty31);
        org.junit.Assert.assertNotNull(specialtyList1);
        org.junit.Assert.assertNotNull(specialtyList2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(specialtyList24);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0272");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setId((java.lang.Integer) (-1));
        owner0.setCity("<null>");
        java.lang.String str8 = owner0.getCity();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<null>" + "'", str8, "<null>");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0273");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        java.lang.String str4 = owner0.getCity();
        java.lang.String str5 = owner0.getLastName();
        owner0.setFirstName("");
        java.lang.String str8 = owner0.getCity();
        java.lang.String str9 = owner0.getLastName();
        owner0.setAddress("");
        boolean boolean12 = owner0.isNew();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0274");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        visit1.setDescription("");
        pet0.addVisit(visit1);
        org.springframework.samples.petclinic.owner.Pet pet5 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate6 = null;
        pet5.setBirthDate(localDate6);
        org.springframework.samples.petclinic.owner.Visit visit8 = new org.springframework.samples.petclinic.owner.Visit();
        visit8.setDescription("");
        java.time.LocalDate localDate11 = visit8.getDate();
        pet5.setBirthDate(localDate11);
        pet0.setBirthDate(localDate11);
        boolean boolean14 = pet0.isNew();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection15 = pet0.getVisits();
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(visitCollection15);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0275");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        java.lang.String str9 = owner0.getTelephone();
        java.lang.String str10 = owner0.getTelephone();
        java.lang.String str11 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet12 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit13 = new org.springframework.samples.petclinic.owner.Visit();
        visit13.setDescription("");
        pet12.addVisit(visit13);
        org.springframework.samples.petclinic.owner.Pet pet17 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate18 = null;
        pet17.setBirthDate(localDate18);
        org.springframework.samples.petclinic.owner.Visit visit20 = new org.springframework.samples.petclinic.owner.Visit();
        visit20.setDescription("");
        java.time.LocalDate localDate23 = visit20.getDate();
        pet17.setBirthDate(localDate23);
        pet12.setBirthDate(localDate23);
        boolean boolean26 = pet12.isNew();
        owner0.addPet(pet12);
        java.time.LocalDate localDate28 = pet12.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType29 = pet12.getType();
        org.springframework.samples.petclinic.owner.PetType petType30 = pet12.getType();
        org.springframework.samples.petclinic.owner.PetType petType31 = pet12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass32 = petType31.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNull(petType29);
        org.junit.Assert.assertNull(petType30);
        org.junit.Assert.assertNull(petType31);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0276");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList4 = owner0.getPets();
        owner0.setLastName("<null>");
        java.lang.String str7 = owner0.getTelephone();
        owner0.setLastName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit11 = new org.springframework.samples.petclinic.owner.Visit();
        visit11.setDescription("");
        visit11.setDescription("<null>");
        java.time.LocalDate localDate16 = visit11.getDate();
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 3, visit11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0277");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet("", false);
        org.springframework.samples.petclinic.owner.Pet pet7 = owner0.getPet((java.lang.Integer) 1);
        owner0.setLastName("hi!");
        org.springframework.samples.petclinic.owner.Pet pet11 = owner0.getPet("<null>");
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(pet7);
        org.junit.Assert.assertNull(pet11);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0278");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet("", false);
        org.springframework.samples.petclinic.owner.Pet pet7 = owner0.getPet("<null>");
        owner0.setAddress("hi!");
        owner0.setLastName("");
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(pet7);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0279");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        java.lang.String str9 = owner0.getTelephone();
        java.lang.String str10 = owner0.getTelephone();
        java.lang.String str11 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet12 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit13 = new org.springframework.samples.petclinic.owner.Visit();
        visit13.setDescription("");
        pet12.addVisit(visit13);
        org.springframework.samples.petclinic.owner.Pet pet17 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate18 = null;
        pet17.setBirthDate(localDate18);
        org.springframework.samples.petclinic.owner.Visit visit20 = new org.springframework.samples.petclinic.owner.Visit();
        visit20.setDescription("");
        java.time.LocalDate localDate23 = visit20.getDate();
        pet17.setBirthDate(localDate23);
        pet12.setBirthDate(localDate23);
        boolean boolean26 = pet12.isNew();
        owner0.addPet(pet12);
        java.time.LocalDate localDate28 = pet12.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection29 = pet12.getVisits();
        org.springframework.samples.petclinic.owner.Visit visit30 = new org.springframework.samples.petclinic.owner.Visit();
        visit30.setDescription("");
        java.time.LocalDate localDate33 = visit30.getDate();
        java.lang.String str34 = visit30.getDescription();
        org.springframework.samples.petclinic.owner.Pet pet35 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit36 = new org.springframework.samples.petclinic.owner.Visit();
        pet35.addVisit(visit36);
        org.springframework.samples.petclinic.owner.Pet pet38 = new org.springframework.samples.petclinic.owner.Pet();
        pet38.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit41 = new org.springframework.samples.petclinic.owner.Visit();
        visit41.setDescription("");
        boolean boolean44 = visit41.isNew();
        pet38.addVisit(visit41);
        java.time.LocalDate localDate46 = visit41.getDate();
        visit36.setDate(localDate46);
        visit30.setDate(localDate46);
        pet12.setBirthDate(localDate46);
        org.springframework.samples.petclinic.owner.Pet pet50 = new org.springframework.samples.petclinic.owner.Pet();
        pet50.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet53 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit54 = new org.springframework.samples.petclinic.owner.Visit();
        visit54.setDescription("");
        pet53.addVisit(visit54);
        org.springframework.samples.petclinic.owner.PetType petType58 = null;
        pet53.setType(petType58);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection60 = pet53.getVisits();
        pet53.setName("");
        org.springframework.samples.petclinic.owner.PetType petType63 = new org.springframework.samples.petclinic.owner.PetType();
        pet53.setType(petType63);
        pet50.setType(petType63);
        org.springframework.samples.petclinic.owner.Pet pet66 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate67 = null;
        pet66.setBirthDate(localDate67);
        java.time.LocalDate localDate69 = pet66.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit70 = new org.springframework.samples.petclinic.owner.Visit();
        visit70.setDescription("");
        java.time.LocalDate localDate73 = visit70.getDate();
        visit70.setDescription("");
        pet66.addVisit(visit70);
        pet50.addVisit(visit70);
        java.lang.String str78 = visit70.getDescription();
        visit70.setDescription("hi!");
        pet12.addVisit(visit70);
        java.lang.String str82 = pet12.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(visitCollection29);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertNotNull(visitCollection60);
        org.junit.Assert.assertNull(localDate69);
        org.junit.Assert.assertNotNull(localDate73);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNull(str82);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0280");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.Visit visit7 = new org.springframework.samples.petclinic.owner.Visit();
        visit7.setDescription("");
        java.time.LocalDate localDate10 = visit7.getDate();
        pet0.setBirthDate(localDate10);
        org.springframework.samples.petclinic.owner.Visit visit12 = new org.springframework.samples.petclinic.owner.Visit();
        visit12.setDescription("");
        java.lang.Integer int15 = visit12.getId();
        java.time.LocalDate localDate16 = visit12.getDate();
        pet0.setBirthDate(localDate16);
        org.springframework.samples.petclinic.owner.Pet pet18 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit19 = new org.springframework.samples.petclinic.owner.Visit();
        visit19.setDescription("");
        pet18.addVisit(visit19);
        org.springframework.samples.petclinic.owner.PetType petType23 = null;
        pet18.setType(petType23);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection25 = pet18.getVisits();
        pet18.setName("");
        org.springframework.samples.petclinic.owner.PetType petType28 = pet18.getType();
        java.time.LocalDate localDate29 = pet18.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet30 = new org.springframework.samples.petclinic.owner.Pet();
        pet30.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet33 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit34 = new org.springframework.samples.petclinic.owner.Visit();
        visit34.setDescription("");
        pet33.addVisit(visit34);
        org.springframework.samples.petclinic.owner.PetType petType38 = null;
        pet33.setType(petType38);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection40 = pet33.getVisits();
        pet33.setName("");
        org.springframework.samples.petclinic.owner.PetType petType43 = new org.springframework.samples.petclinic.owner.PetType();
        pet33.setType(petType43);
        pet30.setType(petType43);
        pet18.setType(petType43);
        org.springframework.samples.petclinic.owner.PetType petType47 = new org.springframework.samples.petclinic.owner.PetType();
        pet18.setType(petType47);
        pet0.setType(petType47);
        java.lang.String str50 = petType47.toString();
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(visitCollection25);
        org.junit.Assert.assertNull(petType28);
        org.junit.Assert.assertNull(localDate29);
        org.junit.Assert.assertNotNull(visitCollection40);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "<null>" + "'", str50, "<null>");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0281");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        owner0.setCity("hi!");
        java.lang.String str6 = owner0.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet((java.lang.Integer) 10);
        java.lang.String str9 = owner0.getCity();
        org.springframework.samples.petclinic.owner.Owner owner10 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet12 = owner10.getPet((java.lang.Integer) 0);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList13 = owner10.getPets();
        java.lang.String str14 = owner10.getFirstName();
        owner10.setCity("hi!");
        java.lang.String str17 = owner10.toString();
        org.springframework.samples.petclinic.owner.Pet pet18 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit19 = new org.springframework.samples.petclinic.owner.Visit();
        pet18.addVisit(visit19);
        owner10.addPet(pet18);
        owner0.addPet(pet18);
        java.time.LocalDate localDate23 = pet18.getBirthDate();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(pet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(pet12);
        org.junit.Assert.assertNotNull(petList13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(localDate23);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0282");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList4 = owner0.getPets();
        java.lang.String str5 = owner0.getAddress();
        owner0.setTelephone("");
        boolean boolean8 = owner0.isNew();
        java.lang.String str9 = owner0.toString();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0283");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 10);
        java.lang.String str6 = owner0.getFirstName();
        java.lang.String str7 = owner0.getCity();
        org.springframework.samples.petclinic.owner.Pet pet10 = owner0.getPet("", false);
        owner0.setFirstName("");
        org.springframework.samples.petclinic.owner.Pet pet14 = owner0.getPet((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(pet10);
        org.junit.Assert.assertNull(pet14);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0284");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        java.lang.Integer int3 = pet0.getId();
        java.lang.Integer int4 = pet0.getId();
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0285");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 10);
        java.lang.String str6 = owner0.getFirstName();
        java.lang.String str7 = owner0.getCity();
        org.springframework.samples.petclinic.owner.Pet pet8 = new org.springframework.samples.petclinic.owner.Pet();
        pet8.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet11 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit12 = new org.springframework.samples.petclinic.owner.Visit();
        visit12.setDescription("");
        pet11.addVisit(visit12);
        org.springframework.samples.petclinic.owner.PetType petType16 = null;
        pet11.setType(petType16);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection18 = pet11.getVisits();
        pet11.setName("");
        org.springframework.samples.petclinic.owner.PetType petType21 = new org.springframework.samples.petclinic.owner.PetType();
        pet11.setType(petType21);
        pet8.setType(petType21);
        owner0.addPet(pet8);
        org.springframework.samples.petclinic.owner.Pet pet25 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit26 = new org.springframework.samples.petclinic.owner.Visit();
        visit26.setDescription("");
        pet25.addVisit(visit26);
        org.springframework.samples.petclinic.owner.PetType petType30 = null;
        pet25.setType(petType30);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection32 = pet25.getVisits();
        pet25.setName("");
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection35 = pet25.getVisits();
        java.lang.Integer int36 = pet25.getId();
        owner0.addPet(pet25);
        org.springframework.samples.petclinic.owner.Pet pet39 = owner0.getPet("hi!");
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(visitCollection18);
        org.junit.Assert.assertNotNull(visitCollection32);
        org.junit.Assert.assertNotNull(visitCollection35);
        org.junit.Assert.assertNull(int36);
        org.junit.Assert.assertNull(pet39);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0286");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList1 = vet0.getSpecialties();
        int int2 = vet0.getNrOfSpecialties();
        java.lang.String str3 = vet0.getFirstName();
        org.junit.Assert.assertNotNull(specialtyList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0287");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList4 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet6 = owner0.getPet("");
        java.lang.String str7 = owner0.getFirstName();
        java.lang.String str8 = owner0.getAddress();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList4);
        org.junit.Assert.assertNull(pet6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0288");
        org.springframework.samples.petclinic.vet.Vets vets0 = new org.springframework.samples.petclinic.vet.Vets();
        java.util.List<org.springframework.samples.petclinic.vet.Vet> vetList1 = vets0.getVetList();
        java.util.List<org.springframework.samples.petclinic.vet.Vet> vetList2 = vets0.getVetList();
        java.util.List<org.springframework.samples.petclinic.vet.Vet> vetList3 = vets0.getVetList();
        java.util.List<org.springframework.samples.petclinic.vet.Vet> vetList4 = vets0.getVetList();
        java.util.List<org.springframework.samples.petclinic.vet.Vet> vetList5 = vets0.getVetList();
        java.util.List<org.springframework.samples.petclinic.vet.Vet> vetList6 = vets0.getVetList();
        java.util.List<org.springframework.samples.petclinic.vet.Vet> vetList7 = vets0.getVetList();
        java.lang.Class<?> wildcardClass8 = vets0.getClass();
        org.junit.Assert.assertNotNull(vetList1);
        org.junit.Assert.assertNotNull(vetList2);
        org.junit.Assert.assertNotNull(vetList3);
        org.junit.Assert.assertNotNull(vetList4);
        org.junit.Assert.assertNotNull(vetList5);
        org.junit.Assert.assertNotNull(vetList6);
        org.junit.Assert.assertNotNull(vetList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0289");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList3 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet4 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate5 = null;
        pet4.setBirthDate(localDate5);
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet4.setType(petType7);
        java.time.LocalDate localDate9 = pet4.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit10 = new org.springframework.samples.petclinic.owner.Visit();
        pet4.addVisit(visit10);
        owner0.addPet(pet4);
        java.lang.String str13 = owner0.getTelephone();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList14 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet15 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit16 = new org.springframework.samples.petclinic.owner.Visit();
        visit16.setDescription("");
        pet15.addVisit(visit16);
        org.springframework.samples.petclinic.owner.Pet pet20 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate21 = null;
        pet20.setBirthDate(localDate21);
        org.springframework.samples.petclinic.owner.Visit visit23 = new org.springframework.samples.petclinic.owner.Visit();
        visit23.setDescription("");
        java.time.LocalDate localDate26 = visit23.getDate();
        pet20.setBirthDate(localDate26);
        pet15.setBirthDate(localDate26);
        org.springframework.samples.petclinic.owner.Visit visit29 = new org.springframework.samples.petclinic.owner.Visit();
        visit29.setDescription("");
        java.time.LocalDate localDate32 = visit29.getDate();
        pet15.setBirthDate(localDate32);
        owner0.addPet(pet15);
        org.springframework.samples.petclinic.owner.Pet pet35 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate36 = null;
        pet35.setBirthDate(localDate36);
        org.springframework.samples.petclinic.owner.Visit visit38 = new org.springframework.samples.petclinic.owner.Visit();
        visit38.setDescription("");
        java.time.LocalDate localDate41 = visit38.getDate();
        pet35.setBirthDate(localDate41);
        java.lang.String str43 = pet35.getName();
        java.time.LocalDate localDate44 = pet35.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet45 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit46 = new org.springframework.samples.petclinic.owner.Visit();
        visit46.setDescription("");
        pet45.addVisit(visit46);
        org.springframework.samples.petclinic.owner.PetType petType50 = null;
        pet45.setType(petType50);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection52 = pet45.getVisits();
        pet45.setName("");
        org.springframework.samples.petclinic.owner.PetType petType55 = pet45.getType();
        java.time.LocalDate localDate56 = pet45.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet57 = new org.springframework.samples.petclinic.owner.Pet();
        pet57.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet60 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit61 = new org.springframework.samples.petclinic.owner.Visit();
        visit61.setDescription("");
        pet60.addVisit(visit61);
        org.springframework.samples.petclinic.owner.PetType petType65 = null;
        pet60.setType(petType65);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection67 = pet60.getVisits();
        pet60.setName("");
        org.springframework.samples.petclinic.owner.PetType petType70 = new org.springframework.samples.petclinic.owner.PetType();
        pet60.setType(petType70);
        pet57.setType(petType70);
        pet45.setType(petType70);
        org.springframework.samples.petclinic.owner.Owner owner74 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet76 = owner74.getPet((java.lang.Integer) 0);
        java.lang.String str77 = owner74.toString();
        org.springframework.samples.petclinic.owner.Pet pet79 = owner74.getPet("");
        org.springframework.samples.petclinic.owner.Pet pet80 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit81 = new org.springframework.samples.petclinic.owner.Visit();
        visit81.setDescription("");
        pet80.addVisit(visit81);
        org.springframework.samples.petclinic.owner.PetType petType85 = null;
        pet80.setType(petType85);
        owner74.addPet(pet80);
        org.springframework.samples.petclinic.owner.Pet pet88 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit89 = new org.springframework.samples.petclinic.owner.Visit();
        visit89.setDescription("");
        pet88.addVisit(visit89);
        org.springframework.samples.petclinic.owner.PetType petType93 = new org.springframework.samples.petclinic.owner.PetType();
        pet88.setType(petType93);
        pet80.setType(petType93);
        pet45.setType(petType93);
        boolean boolean97 = petType93.isNew();
        pet35.setType(petType93);
        pet15.setType(petType93);
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList3);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(petList14);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(visitCollection52);
        org.junit.Assert.assertNull(petType55);
        org.junit.Assert.assertNull(localDate56);
        org.junit.Assert.assertNotNull(visitCollection67);
        org.junit.Assert.assertNull(pet76);
        org.junit.Assert.assertNull(pet79);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0290");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        pet0.setName("");
        org.springframework.samples.petclinic.owner.Visit visit5 = new org.springframework.samples.petclinic.owner.Visit();
        visit5.setDescription("");
        visit5.setDescription("<null>");
        pet0.addVisit(visit5);
        java.lang.String str11 = pet0.toString();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0291");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 10);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        owner0.setId((java.lang.Integer) 10);
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNotNull(petList6);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0292");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("hi!");
        org.springframework.samples.petclinic.owner.Pet pet9 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate10 = null;
        pet9.setBirthDate(localDate10);
        org.springframework.samples.petclinic.owner.Visit visit12 = new org.springframework.samples.petclinic.owner.Visit();
        visit12.setDescription("");
        java.time.LocalDate localDate15 = visit12.getDate();
        pet9.setBirthDate(localDate15);
        owner0.addPet(pet9);
        owner0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertNull(pet8);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0293");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.Visit visit7 = new org.springframework.samples.petclinic.owner.Visit();
        visit7.setDescription("");
        java.time.LocalDate localDate10 = visit7.getDate();
        pet0.setBirthDate(localDate10);
        org.springframework.samples.petclinic.owner.Visit visit12 = new org.springframework.samples.petclinic.owner.Visit();
        visit12.setDescription("");
        java.lang.Integer int15 = visit12.getId();
        java.time.LocalDate localDate16 = visit12.getDate();
        pet0.setBirthDate(localDate16);
        org.springframework.samples.petclinic.owner.Pet pet18 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit19 = new org.springframework.samples.petclinic.owner.Visit();
        visit19.setDescription("");
        pet18.addVisit(visit19);
        org.springframework.samples.petclinic.owner.PetType petType23 = null;
        pet18.setType(petType23);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection25 = pet18.getVisits();
        pet18.setName("");
        org.springframework.samples.petclinic.owner.PetType petType28 = pet18.getType();
        java.time.LocalDate localDate29 = pet18.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet30 = new org.springframework.samples.petclinic.owner.Pet();
        pet30.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet33 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit34 = new org.springframework.samples.petclinic.owner.Visit();
        visit34.setDescription("");
        pet33.addVisit(visit34);
        org.springframework.samples.petclinic.owner.PetType petType38 = null;
        pet33.setType(petType38);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection40 = pet33.getVisits();
        pet33.setName("");
        org.springframework.samples.petclinic.owner.PetType petType43 = new org.springframework.samples.petclinic.owner.PetType();
        pet33.setType(petType43);
        pet30.setType(petType43);
        pet18.setType(petType43);
        org.springframework.samples.petclinic.owner.PetType petType47 = new org.springframework.samples.petclinic.owner.PetType();
        pet18.setType(petType47);
        pet0.setType(petType47);
        java.time.LocalDate localDate50 = pet0.getBirthDate();
        java.lang.Integer int51 = pet0.getId();
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(visitCollection25);
        org.junit.Assert.assertNull(petType28);
        org.junit.Assert.assertNull(localDate29);
        org.junit.Assert.assertNotNull(visitCollection40);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertNull(int51);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0294");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setFirstName("hi!");
        owner0.setCity("");
        owner0.setCity("<null>");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0295");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        owner0.setCity("hi!");
        java.lang.String str6 = owner0.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet((java.lang.Integer) 10);
        java.lang.String str9 = owner0.getCity();
        org.springframework.samples.petclinic.owner.Owner owner10 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet12 = owner10.getPet((java.lang.Integer) 0);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList13 = owner10.getPets();
        java.lang.String str14 = owner10.getFirstName();
        owner10.setCity("hi!");
        java.lang.String str17 = owner10.toString();
        org.springframework.samples.petclinic.owner.Pet pet18 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit19 = new org.springframework.samples.petclinic.owner.Visit();
        pet18.addVisit(visit19);
        owner10.addPet(pet18);
        owner0.addPet(pet18);
        org.springframework.samples.petclinic.owner.PetType petType23 = null;
        pet18.setType(petType23);
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(pet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(pet12);
        org.junit.Assert.assertNotNull(petList13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0296");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 0);
        owner0.setTelephone("");
        org.springframework.samples.petclinic.owner.Pet pet10 = owner0.getPet("<null>", true);
        java.lang.String str11 = owner0.getAddress();
        owner0.setTelephone("hi!");
        owner0.setTelephone("<null>");
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(pet10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0297");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        pet0.setName("");
        pet0.setName("");
        boolean boolean7 = pet0.isNew();
        org.springframework.samples.petclinic.owner.Pet pet8 = new org.springframework.samples.petclinic.owner.Pet();
        pet8.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit11 = new org.springframework.samples.petclinic.owner.Visit();
        visit11.setDescription("");
        boolean boolean14 = visit11.isNew();
        pet8.addVisit(visit11);
        java.time.LocalDate localDate16 = pet8.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet17 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit18 = new org.springframework.samples.petclinic.owner.Visit();
        visit18.setDescription("");
        pet17.addVisit(visit18);
        org.springframework.samples.petclinic.owner.PetType petType22 = null;
        pet17.setType(petType22);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection24 = pet17.getVisits();
        pet17.setName("");
        org.springframework.samples.petclinic.owner.PetType petType27 = new org.springframework.samples.petclinic.owner.PetType();
        pet17.setType(petType27);
        pet8.setType(petType27);
        pet0.setType(petType27);
        org.springframework.samples.petclinic.owner.Pet pet31 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit32 = new org.springframework.samples.petclinic.owner.Visit();
        visit32.setDescription("");
        pet31.addVisit(visit32);
        java.time.LocalDate localDate36 = visit32.getDate();
        pet0.setBirthDate(localDate36);
        org.springframework.samples.petclinic.owner.Pet pet38 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate39 = null;
        pet38.setBirthDate(localDate39);
        org.springframework.samples.petclinic.owner.PetType petType41 = null;
        pet38.setType(petType41);
        java.time.LocalDate localDate43 = pet38.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection44 = pet38.getVisits();
        org.springframework.samples.petclinic.owner.Pet pet45 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit46 = new org.springframework.samples.petclinic.owner.Visit();
        visit46.setDescription("");
        pet45.addVisit(visit46);
        org.springframework.samples.petclinic.owner.PetType petType50 = null;
        pet45.setType(petType50);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection52 = pet45.getVisits();
        pet45.setName("");
        org.springframework.samples.petclinic.owner.PetType petType55 = new org.springframework.samples.petclinic.owner.PetType();
        pet45.setType(petType55);
        java.lang.Integer int57 = pet45.getId();
        org.springframework.samples.petclinic.owner.Pet pet58 = new org.springframework.samples.petclinic.owner.Pet();
        pet58.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet61 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit62 = new org.springframework.samples.petclinic.owner.Visit();
        visit62.setDescription("");
        pet61.addVisit(visit62);
        org.springframework.samples.petclinic.owner.PetType petType66 = null;
        pet61.setType(petType66);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection68 = pet61.getVisits();
        pet61.setName("");
        org.springframework.samples.petclinic.owner.PetType petType71 = new org.springframework.samples.petclinic.owner.PetType();
        pet61.setType(petType71);
        pet58.setType(petType71);
        pet58.setName("<null>");
        org.springframework.samples.petclinic.owner.PetType petType76 = pet58.getType();
        pet45.setType(petType76);
        pet38.setType(petType76);
        pet0.setType(petType76);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNotNull(visitCollection24);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNull(localDate43);
        org.junit.Assert.assertNotNull(visitCollection44);
        org.junit.Assert.assertNotNull(visitCollection52);
        org.junit.Assert.assertNull(int57);
        org.junit.Assert.assertNotNull(visitCollection68);
        org.junit.Assert.assertNotNull(petType76);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0298");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 10);
        java.lang.String str6 = owner0.getFirstName();
        java.lang.String str7 = owner0.getCity();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        java.lang.Integer int9 = owner0.getId();
        org.springframework.samples.petclinic.owner.Pet pet10 = null;
        // The following exception was thrown during execution in test generation
        try {
            owner0.addPet(pet10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.samples.petclinic.owner.Pet.isNew()\" because \"pet\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0299");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 10);
        java.lang.String str6 = owner0.getFirstName();
        owner0.setFirstName("hi!");
        java.lang.String str9 = owner0.getCity();
        org.springframework.samples.petclinic.owner.Pet pet11 = owner0.getPet("hi!");
        java.lang.String str12 = owner0.getCity();
        java.lang.String str13 = owner0.getTelephone();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(pet11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0300");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList3 = owner0.getPets();
        java.lang.String str4 = owner0.getLastName();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList5 = owner0.getPets();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(petList5);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0301");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        owner0.setCity("hi!");
        owner0.setTelephone("hi!");
        owner0.setTelephone("hi!");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList10 = owner0.getPets();
        java.lang.String str11 = owner0.getAddress();
        owner0.setCity("<null>");
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0302");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        visit1.setDescription("");
        pet0.addVisit(visit1);
        org.springframework.samples.petclinic.owner.Visit visit5 = new org.springframework.samples.petclinic.owner.Visit();
        visit5.setDescription("");
        java.lang.Integer int8 = visit5.getId();
        pet0.addVisit(visit5);
        java.time.LocalDate localDate10 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType11 = pet0.getType();
        org.springframework.samples.petclinic.owner.PetType petType12 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = petType12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(petType11);
        org.junit.Assert.assertNull(petType12);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0303");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 10);
        owner0.setTelephone("hi!");
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0304");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setId((java.lang.Integer) (-1));
        java.lang.String str6 = owner0.getFirstName();
        boolean boolean7 = owner0.isNew();
        org.springframework.samples.petclinic.owner.Pet pet9 = owner0.getPet("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList10 = owner0.getPets();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(pet9);
        org.junit.Assert.assertNotNull(petList10);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0305");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit4 = new org.springframework.samples.petclinic.owner.Visit();
        visit4.setDescription("");
        java.time.LocalDate localDate7 = visit4.getDate();
        visit4.setDescription("");
        pet0.addVisit(visit4);
        org.springframework.samples.petclinic.owner.Pet pet11 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit12 = new org.springframework.samples.petclinic.owner.Visit();
        visit12.setDescription("");
        pet11.addVisit(visit12);
        visit12.setDescription("");
        java.time.LocalDate localDate18 = visit12.getDate();
        visit4.setDate(localDate18);
        visit4.setDescription("");
        org.springframework.samples.petclinic.owner.Visit visit22 = new org.springframework.samples.petclinic.owner.Visit();
        visit22.setDescription("");
        boolean boolean25 = visit22.isNew();
        org.springframework.samples.petclinic.owner.Visit visit26 = new org.springframework.samples.petclinic.owner.Visit();
        visit26.setDescription("");
        java.lang.Integer int29 = visit26.getId();
        java.time.LocalDate localDate30 = visit26.getDate();
        visit22.setDate(localDate30);
        visit4.setDate(localDate30);
        java.lang.Integer int33 = visit4.getId();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNull(int33);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0306");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 10);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        owner0.setFirstName("");
        java.lang.String str9 = owner0.getTelephone();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0307");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 10);
        java.lang.String str6 = owner0.getFirstName();
        owner0.setAddress("hi!");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList9 = owner0.getPets();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(petList9);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0308");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList3 = owner0.getPets();
        java.lang.String str4 = owner0.getFirstName();
        owner0.setCity("hi!");
        org.springframework.samples.petclinic.owner.Pet pet9 = owner0.getPet("<null>", true);
        java.lang.String str10 = owner0.getCity();
        java.lang.String str11 = owner0.getLastName();
        org.springframework.samples.petclinic.owner.Pet pet13 = owner0.getPet("");
        java.lang.String str14 = owner0.getTelephone();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(pet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(pet13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0309");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        java.lang.Integer int3 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection5 = pet0.getVisits();
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertNotNull(visitCollection5);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0310");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet3 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit4 = new org.springframework.samples.petclinic.owner.Visit();
        visit4.setDescription("");
        pet3.addVisit(visit4);
        org.springframework.samples.petclinic.owner.PetType petType8 = null;
        pet3.setType(petType8);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection10 = pet3.getVisits();
        pet3.setName("");
        org.springframework.samples.petclinic.owner.PetType petType13 = new org.springframework.samples.petclinic.owner.PetType();
        pet3.setType(petType13);
        pet0.setType(petType13);
        pet0.setName("<null>");
        org.springframework.samples.petclinic.owner.PetType petType18 = pet0.getType();
        org.springframework.samples.petclinic.owner.Pet pet19 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit20 = new org.springframework.samples.petclinic.owner.Visit();
        pet19.addVisit(visit20);
        java.lang.String str22 = visit20.getDescription();
        pet0.addVisit(visit20);
        java.lang.String str24 = visit20.getDescription();
        java.lang.String str25 = visit20.getDescription();
        org.junit.Assert.assertNotNull(visitCollection10);
        org.junit.Assert.assertNotNull(petType18);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0311");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        org.springframework.samples.petclinic.owner.Pet pet6 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit7 = new org.springframework.samples.petclinic.owner.Visit();
        visit7.setDescription("");
        pet6.addVisit(visit7);
        org.springframework.samples.petclinic.owner.Visit visit11 = new org.springframework.samples.petclinic.owner.Visit();
        visit11.setDescription("");
        java.lang.Integer int14 = visit11.getId();
        pet6.addVisit(visit11);
        owner0.addPet(pet6);
        org.springframework.samples.petclinic.owner.Pet pet17 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate18 = null;
        pet17.setBirthDate(localDate18);
        java.time.LocalDate localDate20 = pet17.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit21 = new org.springframework.samples.petclinic.owner.Visit();
        visit21.setDescription("");
        java.time.LocalDate localDate24 = visit21.getDate();
        visit21.setDescription("");
        pet17.addVisit(visit21);
        org.springframework.samples.petclinic.owner.Pet pet28 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit29 = new org.springframework.samples.petclinic.owner.Visit();
        visit29.setDescription("");
        pet28.addVisit(visit29);
        visit29.setDescription("");
        java.time.LocalDate localDate35 = visit29.getDate();
        visit21.setDate(localDate35);
        pet6.addVisit(visit21);
        visit21.setDescription("hi!");
        org.springframework.samples.petclinic.owner.Visit visit40 = new org.springframework.samples.petclinic.owner.Visit();
        visit40.setDescription("");
        java.lang.Integer int43 = visit40.getId();
        boolean boolean44 = visit40.isNew();
        org.springframework.samples.petclinic.owner.Visit visit45 = new org.springframework.samples.petclinic.owner.Visit();
        visit45.setDescription("");
        java.lang.Integer int48 = visit45.getId();
        java.time.LocalDate localDate49 = visit45.getDate();
        org.springframework.samples.petclinic.owner.Visit visit50 = new org.springframework.samples.petclinic.owner.Visit();
        visit50.setDescription("");
        java.time.LocalDate localDate53 = visit50.getDate();
        java.time.LocalDate localDate54 = visit50.getDate();
        visit45.setDate(localDate54);
        org.springframework.samples.petclinic.owner.Pet pet56 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit57 = new org.springframework.samples.petclinic.owner.Visit();
        visit57.setDescription("");
        pet56.addVisit(visit57);
        org.springframework.samples.petclinic.owner.Pet pet61 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate62 = null;
        pet61.setBirthDate(localDate62);
        org.springframework.samples.petclinic.owner.Visit visit64 = new org.springframework.samples.petclinic.owner.Visit();
        visit64.setDescription("");
        java.time.LocalDate localDate67 = visit64.getDate();
        pet61.setBirthDate(localDate67);
        pet56.setBirthDate(localDate67);
        visit45.setDate(localDate67);
        java.time.LocalDate localDate71 = visit45.getDate();
        visit40.setDate(localDate71);
        visit21.setDate(localDate71);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNull(int43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(int48);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertNotNull(localDate54);
        org.junit.Assert.assertNotNull(localDate67);
        org.junit.Assert.assertNotNull(localDate71);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0312");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet3 = owner0.getPet("hi!", false);
        org.springframework.samples.petclinic.owner.Visit visit5 = new org.springframework.samples.petclinic.owner.Visit();
        visit5.setDescription("");
        java.time.LocalDate localDate8 = visit5.getDate();
        java.time.LocalDate localDate9 = visit5.getDate();
        org.springframework.samples.petclinic.owner.Pet pet10 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit11 = new org.springframework.samples.petclinic.owner.Visit();
        visit11.setDescription("");
        pet10.addVisit(visit11);
        org.springframework.samples.petclinic.owner.Pet pet15 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate16 = null;
        pet15.setBirthDate(localDate16);
        org.springframework.samples.petclinic.owner.Visit visit18 = new org.springframework.samples.petclinic.owner.Visit();
        visit18.setDescription("");
        java.time.LocalDate localDate21 = visit18.getDate();
        pet15.setBirthDate(localDate21);
        pet10.setBirthDate(localDate21);
        java.lang.Integer int24 = pet10.getId();
        java.lang.String str25 = pet10.toString();
        org.springframework.samples.petclinic.owner.Pet pet26 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate27 = null;
        pet26.setBirthDate(localDate27);
        org.springframework.samples.petclinic.owner.PetType petType29 = null;
        pet26.setType(petType29);
        java.time.LocalDate localDate31 = pet26.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit32 = new org.springframework.samples.petclinic.owner.Visit();
        visit32.setDescription("");
        java.lang.Integer int35 = visit32.getId();
        java.time.LocalDate localDate36 = visit32.getDate();
        pet26.setBirthDate(localDate36);
        pet10.setBirthDate(localDate36);
        visit5.setDate(localDate36);
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) (-1), visit5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet3);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<null>" + "'", str25, "<null>");
        org.junit.Assert.assertNull(localDate31);
        org.junit.Assert.assertNull(int35);
        org.junit.Assert.assertNotNull(localDate36);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0313");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList4 = owner0.getPets();
        owner0.setLastName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet9 = owner0.getPet("hi!", true);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList10 = owner0.getPets();
        java.lang.Integer int11 = owner0.getId();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList4);
        org.junit.Assert.assertNull(pet9);
        org.junit.Assert.assertNotNull(petList10);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0314");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList1 = vet0.getSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList2 = vet0.getSpecialties();
        vet0.setFirstName("<null>");
        int int5 = vet0.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Vet vet6 = new org.springframework.samples.petclinic.vet.Vet();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList7 = vet6.getSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList8 = vet6.getSpecialties();
        java.lang.String str9 = vet6.getLastName();
        org.springframework.samples.petclinic.vet.Specialty specialty10 = new org.springframework.samples.petclinic.vet.Specialty();
        specialty10.setId((java.lang.Integer) 100);
        vet6.addSpecialty(specialty10);
        vet0.addSpecialty(specialty10);
        vet0.setFirstName("");
        org.junit.Assert.assertNotNull(specialtyList1);
        org.junit.Assert.assertNotNull(specialtyList2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(specialtyList7);
        org.junit.Assert.assertNotNull(specialtyList8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0315");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("");
        org.springframework.samples.petclinic.owner.Pet pet10 = owner0.getPet((java.lang.Integer) 3);
        owner0.setTelephone("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertNull(pet8);
        org.junit.Assert.assertNull(pet10);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0316");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 10);
        java.lang.String str6 = owner0.getFirstName();
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("<null>");
        java.lang.String str9 = owner0.getFirstName();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(pet8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0317");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        java.lang.String str4 = owner0.getCity();
        java.lang.String str5 = owner0.getLastName();
        owner0.setFirstName("");
        owner0.setId((java.lang.Integer) (-1));
        owner0.setTelephone("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0318");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        java.lang.String str9 = owner0.getTelephone();
        java.lang.String str10 = owner0.getTelephone();
        java.lang.Integer int11 = owner0.getId();
        java.lang.String str12 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet14 = new org.springframework.samples.petclinic.owner.Pet();
        pet14.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit17 = new org.springframework.samples.petclinic.owner.Visit();
        visit17.setDescription("");
        boolean boolean20 = visit17.isNew();
        pet14.addVisit(visit17);
        visit17.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 100, visit17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<null>" + "'", str12, "<null>");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0319");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        java.lang.String str4 = owner0.getCity();
        java.lang.String str5 = owner0.getLastName();
        owner0.setFirstName("");
        owner0.setTelephone("<null>");
        org.springframework.samples.petclinic.owner.Pet pet12 = owner0.getPet("hi!", true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(pet12);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0320");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList3 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet6 = owner0.getPet("<null>", true);
        owner0.setTelephone("hi!");
        org.springframework.samples.petclinic.owner.Pet pet10 = owner0.getPet("hi!");
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList3);
        org.junit.Assert.assertNull(pet6);
        org.junit.Assert.assertNull(pet10);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0321");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit3 = new org.springframework.samples.petclinic.owner.Visit();
        visit3.setDescription("");
        boolean boolean6 = visit3.isNew();
        pet0.addVisit(visit3);
        java.lang.String str8 = pet0.getName();
        java.lang.String str9 = pet0.getName();
        java.lang.String str10 = pet0.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<null>" + "'", str8, "<null>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0322");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit6 = new org.springframework.samples.petclinic.owner.Visit();
        pet0.addVisit(visit6);
        java.lang.Integer int8 = pet0.getId();
        org.springframework.samples.petclinic.owner.Pet pet9 = new org.springframework.samples.petclinic.owner.Pet();
        pet9.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit12 = new org.springframework.samples.petclinic.owner.Visit();
        visit12.setDescription("");
        boolean boolean15 = visit12.isNew();
        pet9.addVisit(visit12);
        java.time.LocalDate localDate17 = visit12.getDate();
        pet0.addVisit(visit12);
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0323");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        owner0.setCity("<null>");
        owner0.setCity("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList6);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0324");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        org.springframework.samples.petclinic.owner.Pet pet6 = owner0.getPet("hi!", false);
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("");
        java.lang.String str9 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setLastName("<null>");
        owner0.setAddress("<null>");
        boolean boolean16 = owner0.isNew();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(pet6);
        org.junit.Assert.assertNull(pet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0325");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit4 = new org.springframework.samples.petclinic.owner.Visit();
        visit4.setDescription("");
        java.time.LocalDate localDate7 = visit4.getDate();
        visit4.setDescription("");
        pet0.addVisit(visit4);
        org.springframework.samples.petclinic.owner.Pet pet11 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit12 = new org.springframework.samples.petclinic.owner.Visit();
        visit12.setDescription("");
        pet11.addVisit(visit12);
        visit12.setDescription("");
        java.time.LocalDate localDate18 = visit12.getDate();
        visit4.setDate(localDate18);
        visit4.setDescription("");
        org.springframework.samples.petclinic.owner.Visit visit22 = new org.springframework.samples.petclinic.owner.Visit();
        visit22.setDescription("");
        boolean boolean25 = visit22.isNew();
        org.springframework.samples.petclinic.owner.Visit visit26 = new org.springframework.samples.petclinic.owner.Visit();
        visit26.setDescription("");
        java.lang.Integer int29 = visit26.getId();
        java.time.LocalDate localDate30 = visit26.getDate();
        visit22.setDate(localDate30);
        visit4.setDate(localDate30);
        java.lang.Class<?> wildcardClass33 = visit4.getClass();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0326");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("<null>");
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection3 = pet0.getVisits();
        org.junit.Assert.assertNotNull(visitCollection3);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0327");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setFirstName("hi!");
        java.lang.String str3 = owner0.getCity();
        org.springframework.samples.petclinic.owner.Visit visit5 = new org.springframework.samples.petclinic.owner.Visit();
        visit5.setDescription("");
        java.time.LocalDate localDate8 = visit5.getDate();
        java.lang.String str9 = visit5.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 10, visit5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0328");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet("", false);
        org.springframework.samples.petclinic.owner.Pet pet7 = owner0.getPet((java.lang.Integer) (-1));
        java.lang.String str8 = owner0.toString();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(pet7);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0329");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        java.lang.String str4 = owner0.getCity();
        java.lang.String str5 = owner0.getTelephone();
        java.lang.String str6 = owner0.getTelephone();
        java.lang.String str7 = owner0.getCity();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0330");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        visit1.setDescription("");
        pet0.addVisit(visit1);
        org.springframework.samples.petclinic.owner.PetType petType5 = null;
        pet0.setType(petType5);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType10 = pet0.getType();
        java.time.LocalDate localDate11 = pet0.getBirthDate();
        java.time.LocalDate localDate12 = pet0.getBirthDate();
        java.time.LocalDate localDate13 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet14 = new org.springframework.samples.petclinic.owner.Pet();
        pet14.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit17 = new org.springframework.samples.petclinic.owner.Visit();
        visit17.setDescription("");
        boolean boolean20 = visit17.isNew();
        pet14.addVisit(visit17);
        java.time.LocalDate localDate22 = visit17.getDate();
        org.springframework.samples.petclinic.owner.Visit visit23 = new org.springframework.samples.petclinic.owner.Visit();
        visit23.setDescription("");
        java.lang.Integer int26 = visit23.getId();
        java.time.LocalDate localDate27 = visit23.getDate();
        org.springframework.samples.petclinic.owner.Visit visit28 = new org.springframework.samples.petclinic.owner.Visit();
        visit28.setDescription("");
        java.time.LocalDate localDate31 = visit28.getDate();
        java.time.LocalDate localDate32 = visit28.getDate();
        visit23.setDate(localDate32);
        visit17.setDate(localDate32);
        pet0.addVisit(visit17);
        boolean boolean36 = visit17.isNew();
        visit17.setDescription("");
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertNull(petType10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNull(int26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0331");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit3 = new org.springframework.samples.petclinic.owner.Visit();
        visit3.setDescription("");
        boolean boolean6 = visit3.isNew();
        pet0.addVisit(visit3);
        java.time.LocalDate localDate8 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet9 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit10 = new org.springframework.samples.petclinic.owner.Visit();
        visit10.setDescription("");
        pet9.addVisit(visit10);
        org.springframework.samples.petclinic.owner.PetType petType14 = null;
        pet9.setType(petType14);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection16 = pet9.getVisits();
        pet9.setName("");
        org.springframework.samples.petclinic.owner.PetType petType19 = new org.springframework.samples.petclinic.owner.PetType();
        pet9.setType(petType19);
        pet0.setType(petType19);
        java.time.LocalDate localDate22 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Owner owner23 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet25 = owner23.getPet((java.lang.Integer) 0);
        java.lang.String str26 = owner23.toString();
        org.springframework.samples.petclinic.owner.Pet pet28 = owner23.getPet("");
        org.springframework.samples.petclinic.owner.Pet pet29 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit30 = new org.springframework.samples.petclinic.owner.Visit();
        visit30.setDescription("");
        pet29.addVisit(visit30);
        org.springframework.samples.petclinic.owner.PetType petType34 = null;
        pet29.setType(petType34);
        owner23.addPet(pet29);
        org.springframework.samples.petclinic.owner.Pet pet37 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit38 = new org.springframework.samples.petclinic.owner.Visit();
        visit38.setDescription("");
        pet37.addVisit(visit38);
        org.springframework.samples.petclinic.owner.PetType petType42 = new org.springframework.samples.petclinic.owner.PetType();
        pet37.setType(petType42);
        pet29.setType(petType42);
        org.springframework.samples.petclinic.owner.Pet pet45 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit46 = new org.springframework.samples.petclinic.owner.Visit();
        pet45.addVisit(visit46);
        java.time.LocalDate localDate48 = pet45.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet49 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate50 = null;
        pet49.setBirthDate(localDate50);
        org.springframework.samples.petclinic.owner.PetType petType52 = null;
        pet49.setType(petType52);
        java.time.LocalDate localDate54 = pet49.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection55 = pet49.getVisits();
        org.springframework.samples.petclinic.owner.Visit visit56 = new org.springframework.samples.petclinic.owner.Visit();
        visit56.setDescription("");
        java.time.LocalDate localDate59 = visit56.getDate();
        pet49.setBirthDate(localDate59);
        org.springframework.samples.petclinic.owner.Visit visit61 = new org.springframework.samples.petclinic.owner.Visit();
        visit61.setDescription("");
        java.lang.Integer int64 = visit61.getId();
        java.time.LocalDate localDate65 = visit61.getDate();
        pet49.setBirthDate(localDate65);
        pet45.setBirthDate(localDate65);
        pet29.setBirthDate(localDate65);
        pet0.setBirthDate(localDate65);
        java.lang.String str70 = pet0.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNotNull(visitCollection16);
        org.junit.Assert.assertNull(localDate22);
        org.junit.Assert.assertNull(pet25);
        org.junit.Assert.assertNull(pet28);
        org.junit.Assert.assertNull(localDate48);
        org.junit.Assert.assertNull(localDate54);
        org.junit.Assert.assertNotNull(visitCollection55);
        org.junit.Assert.assertNotNull(localDate59);
        org.junit.Assert.assertNull(int64);
        org.junit.Assert.assertNotNull(localDate65);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "<null>" + "'", str70, "<null>");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0332");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit6 = new org.springframework.samples.petclinic.owner.Visit();
        visit6.setDescription("");
        java.lang.Integer int9 = visit6.getId();
        java.time.LocalDate localDate10 = visit6.getDate();
        pet0.setBirthDate(localDate10);
        java.time.LocalDate localDate12 = pet0.getBirthDate();
        java.lang.Integer int13 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection14 = pet0.getVisits();
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNotNull(visitCollection14);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0333");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.Visit visit3 = new org.springframework.samples.petclinic.owner.Visit();
        visit3.setDescription("");
        java.time.LocalDate localDate6 = visit3.getDate();
        pet0.setBirthDate(localDate6);
        org.springframework.samples.petclinic.owner.Pet pet8 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit9 = new org.springframework.samples.petclinic.owner.Visit();
        visit9.setDescription("");
        pet8.addVisit(visit9);
        org.springframework.samples.petclinic.owner.Visit visit13 = new org.springframework.samples.petclinic.owner.Visit();
        visit13.setDescription("");
        java.lang.Integer int16 = visit13.getId();
        pet8.addVisit(visit13);
        java.lang.String str18 = visit13.getDescription();
        pet0.addVisit(visit13);
        java.time.LocalDate localDate20 = pet0.getBirthDate();
        pet0.setName("");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(localDate20);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0334");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList3 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet4 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate5 = null;
        pet4.setBirthDate(localDate5);
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet4.setType(petType7);
        java.time.LocalDate localDate9 = pet4.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit10 = new org.springframework.samples.petclinic.owner.Visit();
        pet4.addVisit(visit10);
        owner0.addPet(pet4);
        java.lang.String str13 = owner0.getTelephone();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList14 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet15 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit16 = new org.springframework.samples.petclinic.owner.Visit();
        visit16.setDescription("");
        pet15.addVisit(visit16);
        org.springframework.samples.petclinic.owner.Pet pet20 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate21 = null;
        pet20.setBirthDate(localDate21);
        org.springframework.samples.petclinic.owner.Visit visit23 = new org.springframework.samples.petclinic.owner.Visit();
        visit23.setDescription("");
        java.time.LocalDate localDate26 = visit23.getDate();
        pet20.setBirthDate(localDate26);
        pet15.setBirthDate(localDate26);
        org.springframework.samples.petclinic.owner.Visit visit29 = new org.springframework.samples.petclinic.owner.Visit();
        visit29.setDescription("");
        java.time.LocalDate localDate32 = visit29.getDate();
        pet15.setBirthDate(localDate32);
        owner0.addPet(pet15);
        org.springframework.samples.petclinic.owner.Pet pet36 = owner0.getPet("");
        java.lang.String str37 = owner0.getCity();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList3);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(petList14);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNull(pet36);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0335");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList3 = owner0.getPets();
        java.lang.String str4 = owner0.getFirstName();
        owner0.setCity("hi!");
        java.lang.String str7 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet9 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str10 = owner0.getCity();
        owner0.setTelephone("");
        boolean boolean13 = owner0.isNew();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(pet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0336");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setFirstName("hi!");
        java.lang.Integer int3 = owner0.getId();
        java.lang.String str4 = owner0.getCity();
        owner0.setCity("");
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0337");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        pet0.setName("");
        pet0.setName("");
        boolean boolean7 = pet0.isNew();
        org.springframework.samples.petclinic.owner.Owner owner8 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str9 = owner8.getAddress();
        owner8.setLastName("hi!");
        java.lang.String str12 = owner8.getCity();
        java.lang.String str13 = owner8.getTelephone();
        java.lang.String str14 = owner8.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet15 = new org.springframework.samples.petclinic.owner.Pet();
        pet15.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet18 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit19 = new org.springframework.samples.petclinic.owner.Visit();
        visit19.setDescription("");
        pet18.addVisit(visit19);
        org.springframework.samples.petclinic.owner.PetType petType23 = null;
        pet18.setType(petType23);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection25 = pet18.getVisits();
        pet18.setName("");
        org.springframework.samples.petclinic.owner.PetType petType28 = new org.springframework.samples.petclinic.owner.PetType();
        pet18.setType(petType28);
        pet15.setType(petType28);
        pet15.setName("<null>");
        org.springframework.samples.petclinic.owner.PetType petType33 = pet15.getType();
        owner8.addPet(pet15);
        java.lang.Integer int35 = pet15.getId();
        org.springframework.samples.petclinic.owner.PetType petType36 = pet15.getType();
        pet0.setType(petType36);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection38 = pet0.getVisits();
        java.lang.Integer int39 = pet0.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(visitCollection25);
        org.junit.Assert.assertNotNull(petType33);
        org.junit.Assert.assertNull(int35);
        org.junit.Assert.assertNotNull(petType36);
        org.junit.Assert.assertNotNull(visitCollection38);
        org.junit.Assert.assertNull(int39);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0338");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        java.lang.String str4 = owner0.getCity();
        owner0.setLastName("");
        owner0.setAddress("hi!");
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0339");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setFirstName("hi!");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList3 = owner0.getPets();
        org.junit.Assert.assertNotNull(petList3);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0340");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        java.lang.Integer int3 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        pet0.setId((java.lang.Integer) 1);
        java.lang.String str7 = pet0.toString();
        pet0.setName("");
        java.lang.String str10 = pet0.toString();
        java.lang.Class<?> wildcardClass11 = pet0.getClass();
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<null>" + "'", str7, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0341");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        pet0.addVisit(visit1);
        java.lang.String str3 = visit1.getDescription();
        visit1.setDescription("<null>");
        java.lang.String str6 = visit1.getDescription();
        visit1.setDescription("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<null>" + "'", str6, "<null>");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0342");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList4 = owner0.getPets();
        java.lang.String str5 = owner0.getAddress();
        owner0.setTelephone("");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        owner0.setTelephone("hi!");
        org.springframework.samples.petclinic.owner.Pet pet11 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit12 = new org.springframework.samples.petclinic.owner.Visit();
        visit12.setDescription("");
        pet11.addVisit(visit12);
        org.springframework.samples.petclinic.owner.PetType petType16 = null;
        pet11.setType(petType16);
        owner0.addPet(pet11);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection19 = pet11.getVisits();
        org.springframework.samples.petclinic.owner.Owner owner20 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str21 = owner20.getAddress();
        owner20.setLastName("hi!");
        owner20.setAddress("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList26 = owner20.getPets();
        org.springframework.samples.petclinic.owner.Pet pet28 = owner20.getPet("hi!");
        org.springframework.samples.petclinic.owner.Pet pet29 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate30 = null;
        pet29.setBirthDate(localDate30);
        org.springframework.samples.petclinic.owner.Visit visit32 = new org.springframework.samples.petclinic.owner.Visit();
        visit32.setDescription("");
        java.time.LocalDate localDate35 = visit32.getDate();
        pet29.setBirthDate(localDate35);
        owner20.addPet(pet29);
        org.springframework.samples.petclinic.owner.Pet pet38 = new org.springframework.samples.petclinic.owner.Pet();
        pet38.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet41 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit42 = new org.springframework.samples.petclinic.owner.Visit();
        visit42.setDescription("");
        pet41.addVisit(visit42);
        org.springframework.samples.petclinic.owner.PetType petType46 = null;
        pet41.setType(petType46);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection48 = pet41.getVisits();
        pet41.setName("");
        org.springframework.samples.petclinic.owner.PetType petType51 = new org.springframework.samples.petclinic.owner.PetType();
        pet41.setType(petType51);
        pet38.setType(petType51);
        pet29.setType(petType51);
        org.springframework.samples.petclinic.owner.Pet pet55 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit56 = new org.springframework.samples.petclinic.owner.Visit();
        visit56.setDescription("");
        pet55.addVisit(visit56);
        pet29.addVisit(visit56);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection61 = pet29.getVisits();
        org.springframework.samples.petclinic.owner.Pet pet62 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit63 = new org.springframework.samples.petclinic.owner.Visit();
        visit63.setDescription("");
        pet62.addVisit(visit63);
        org.springframework.samples.petclinic.owner.PetType petType67 = null;
        pet62.setType(petType67);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection69 = pet62.getVisits();
        pet62.setName("");
        org.springframework.samples.petclinic.owner.PetType petType72 = pet62.getType();
        java.time.LocalDate localDate73 = pet62.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet74 = new org.springframework.samples.petclinic.owner.Pet();
        pet74.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet77 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit78 = new org.springframework.samples.petclinic.owner.Visit();
        visit78.setDescription("");
        pet77.addVisit(visit78);
        org.springframework.samples.petclinic.owner.PetType petType82 = null;
        pet77.setType(petType82);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection84 = pet77.getVisits();
        pet77.setName("");
        org.springframework.samples.petclinic.owner.PetType petType87 = new org.springframework.samples.petclinic.owner.PetType();
        pet77.setType(petType87);
        pet74.setType(petType87);
        pet62.setType(petType87);
        pet29.setType(petType87);
        pet11.setType(petType87);
        java.lang.String str93 = petType87.toString();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertNotNull(visitCollection19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(petList26);
        org.junit.Assert.assertNull(pet28);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(visitCollection48);
        org.junit.Assert.assertNotNull(visitCollection61);
        org.junit.Assert.assertNotNull(visitCollection69);
        org.junit.Assert.assertNull(petType72);
        org.junit.Assert.assertNull(localDate73);
        org.junit.Assert.assertNotNull(visitCollection84);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "<null>" + "'", str93, "<null>");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0343");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet("");
        owner0.setLastName("");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        boolean boolean9 = owner0.isNew();
        org.springframework.samples.petclinic.owner.Pet pet11 = new org.springframework.samples.petclinic.owner.Pet();
        pet11.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet14 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit15 = new org.springframework.samples.petclinic.owner.Visit();
        visit15.setDescription("");
        pet14.addVisit(visit15);
        org.springframework.samples.petclinic.owner.PetType petType19 = null;
        pet14.setType(petType19);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection21 = pet14.getVisits();
        pet14.setName("");
        org.springframework.samples.petclinic.owner.PetType petType24 = new org.springframework.samples.petclinic.owner.PetType();
        pet14.setType(petType24);
        pet11.setType(petType24);
        org.springframework.samples.petclinic.owner.Pet pet27 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate28 = null;
        pet27.setBirthDate(localDate28);
        java.time.LocalDate localDate30 = pet27.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit31 = new org.springframework.samples.petclinic.owner.Visit();
        visit31.setDescription("");
        java.time.LocalDate localDate34 = visit31.getDate();
        visit31.setDescription("");
        pet27.addVisit(visit31);
        pet11.addVisit(visit31);
        java.lang.String str39 = visit31.getDescription();
        visit31.setDescription("hi!");
        visit31.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 2, visit31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(visitCollection21);
        org.junit.Assert.assertNull(localDate30);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0344");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        java.lang.String str9 = owner0.getTelephone();
        java.lang.String str10 = owner0.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet12 = owner0.getPet((java.lang.Integer) (-1));
        org.springframework.samples.petclinic.owner.Pet pet14 = owner0.getPet("<null>");
        java.lang.String str15 = owner0.getCity();
        owner0.setTelephone("<null>");
        owner0.setLastName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertNull(pet12);
        org.junit.Assert.assertNull(pet14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0345");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList4 = owner0.getPets();
        owner0.setLastName("");
        java.lang.String str7 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet9 = owner0.getPet("");
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(pet9);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0346");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        org.springframework.samples.petclinic.owner.Pet pet7 = owner0.getPet("hi!");
        org.springframework.samples.petclinic.owner.Pet pet10 = owner0.getPet("", false);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList11 = owner0.getPets();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(pet7);
        org.junit.Assert.assertNull(pet10);
        org.junit.Assert.assertNotNull(petList11);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0347");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        owner0.setLastName("hi!");
        owner0.setFirstName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet((java.lang.Integer) 10);
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet8);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0348");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit3 = new org.springframework.samples.petclinic.owner.Visit();
        visit3.setDescription("");
        boolean boolean6 = visit3.isNew();
        pet0.addVisit(visit3);
        java.time.LocalDate localDate8 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet9 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate10 = null;
        pet9.setBirthDate(localDate10);
        org.springframework.samples.petclinic.owner.PetType petType12 = null;
        pet9.setType(petType12);
        java.time.LocalDate localDate14 = pet9.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType15 = pet9.getType();
        org.springframework.samples.petclinic.owner.Visit visit16 = new org.springframework.samples.petclinic.owner.Visit();
        visit16.setDescription("");
        java.lang.Integer int19 = visit16.getId();
        pet9.addVisit(visit16);
        pet0.addVisit(visit16);
        java.time.LocalDate localDate22 = visit16.getDate();
        visit16.setDescription("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(petType15);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNotNull(localDate22);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0349");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList4 = owner0.getPets();
        java.lang.String str5 = owner0.getCity();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0350");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList3 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet4 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate5 = null;
        pet4.setBirthDate(localDate5);
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet4.setType(petType7);
        java.time.LocalDate localDate9 = pet4.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit10 = new org.springframework.samples.petclinic.owner.Visit();
        pet4.addVisit(visit10);
        owner0.addPet(pet4);
        java.lang.String str13 = owner0.getTelephone();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList14 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet17 = owner0.getPet("hi!", true);
        owner0.setTelephone("hi!");
        owner0.setCity("hi!");
        owner0.setAddress("hi!");
        owner0.setLastName("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList26 = owner0.getPets();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList3);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(petList14);
        org.junit.Assert.assertNull(pet17);
        org.junit.Assert.assertNotNull(petList26);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0351");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        java.lang.String str4 = owner0.getCity();
        owner0.setLastName("");
        owner0.setFirstName("");
        boolean boolean9 = owner0.isNew();
        org.springframework.samples.petclinic.owner.Pet pet11 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit12 = new org.springframework.samples.petclinic.owner.Visit();
        visit12.setDescription("");
        pet11.addVisit(visit12);
        org.springframework.samples.petclinic.owner.Pet pet16 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate17 = null;
        pet16.setBirthDate(localDate17);
        org.springframework.samples.petclinic.owner.Visit visit19 = new org.springframework.samples.petclinic.owner.Visit();
        visit19.setDescription("");
        java.time.LocalDate localDate22 = visit19.getDate();
        pet16.setBirthDate(localDate22);
        pet11.setBirthDate(localDate22);
        java.lang.Integer int25 = pet11.getId();
        java.lang.String str26 = pet11.toString();
        org.springframework.samples.petclinic.owner.Visit visit27 = new org.springframework.samples.petclinic.owner.Visit();
        java.lang.String str28 = visit27.getDescription();
        visit27.setDescription("hi!");
        java.time.LocalDate localDate31 = visit27.getDate();
        pet11.addVisit(visit27);
        org.springframework.samples.petclinic.owner.Pet pet33 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit34 = new org.springframework.samples.petclinic.owner.Visit();
        visit34.setDescription("");
        pet33.addVisit(visit34);
        visit34.setDescription("");
        java.lang.String str40 = visit34.getDescription();
        java.lang.String str41 = visit34.getDescription();
        pet11.addVisit(visit34);
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 100, visit34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNull(int25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<null>" + "'", str26, "<null>");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0352");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType6 = pet0.getType();
        org.springframework.samples.petclinic.owner.Visit visit7 = new org.springframework.samples.petclinic.owner.Visit();
        visit7.setDescription("");
        java.lang.Integer int10 = visit7.getId();
        pet0.addVisit(visit7);
        boolean boolean12 = visit7.isNew();
        visit7.setDescription("");
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNull(petType6);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0353");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        visit1.setDescription("");
        pet0.addVisit(visit1);
        org.springframework.samples.petclinic.owner.Pet pet5 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate6 = null;
        pet5.setBirthDate(localDate6);
        org.springframework.samples.petclinic.owner.Visit visit8 = new org.springframework.samples.petclinic.owner.Visit();
        visit8.setDescription("");
        java.time.LocalDate localDate11 = visit8.getDate();
        pet5.setBirthDate(localDate11);
        pet0.setBirthDate(localDate11);
        boolean boolean14 = pet0.isNew();
        java.lang.String str15 = pet0.getName();
        org.springframework.samples.petclinic.owner.PetType petType16 = pet0.getType();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection17 = pet0.getVisits();
        java.lang.Class<?> wildcardClass18 = visitCollection17.getClass();
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(petType16);
        org.junit.Assert.assertNotNull(visitCollection17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0354");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        owner0.setCity("hi!");
        java.lang.String str6 = owner0.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet((java.lang.Integer) 10);
        java.lang.String str9 = owner0.getCity();
        org.springframework.samples.petclinic.owner.Visit visit11 = new org.springframework.samples.petclinic.owner.Visit();
        visit11.setDescription("");
        java.time.LocalDate localDate14 = visit11.getDate();
        java.time.LocalDate localDate15 = visit11.getDate();
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 2, visit11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(pet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0355");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("hi!");
        org.springframework.samples.petclinic.owner.Pet pet9 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate10 = null;
        pet9.setBirthDate(localDate10);
        org.springframework.samples.petclinic.owner.Visit visit12 = new org.springframework.samples.petclinic.owner.Visit();
        visit12.setDescription("");
        java.time.LocalDate localDate15 = visit12.getDate();
        pet9.setBirthDate(localDate15);
        owner0.addPet(pet9);
        org.springframework.samples.petclinic.owner.Pet pet18 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate19 = null;
        pet18.setBirthDate(localDate19);
        org.springframework.samples.petclinic.owner.PetType petType21 = null;
        pet18.setType(petType21);
        java.time.LocalDate localDate23 = pet18.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType24 = pet18.getType();
        owner0.addPet(pet18);
        pet18.setName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertNull(pet8);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNull(localDate23);
        org.junit.Assert.assertNull(petType24);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0356");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        java.lang.String str9 = owner0.getTelephone();
        java.lang.String str10 = owner0.getTelephone();
        owner0.setTelephone("hi!");
        java.lang.String str13 = owner0.getTelephone();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0357");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        org.springframework.samples.petclinic.owner.Pet pet6 = owner0.getPet("hi!", false);
        org.springframework.samples.petclinic.owner.Pet pet7 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit8 = new org.springframework.samples.petclinic.owner.Visit();
        visit8.setDescription("");
        pet7.addVisit(visit8);
        org.springframework.samples.petclinic.owner.PetType petType12 = null;
        pet7.setType(petType12);
        java.time.LocalDate localDate14 = pet7.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection15 = pet7.getVisits();
        owner0.addPet(pet7);
        owner0.setFirstName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet20 = owner0.getPet((java.lang.Integer) 3);
        java.lang.String str21 = owner0.getTelephone();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(pet6);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNotNull(visitCollection15);
        org.junit.Assert.assertNull(pet20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0358");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        java.lang.String str1 = vet0.getLastName();
        java.lang.String str2 = vet0.getFirstName();
        org.springframework.samples.petclinic.vet.Vet vet3 = new org.springframework.samples.petclinic.vet.Vet();
        java.lang.String str4 = vet3.getLastName();
        int int5 = vet3.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Vet vet6 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty7 = new org.springframework.samples.petclinic.vet.Specialty();
        vet6.addSpecialty(specialty7);
        int int9 = vet6.getNrOfSpecialties();
        java.lang.String str10 = vet6.getFirstName();
        org.springframework.samples.petclinic.vet.Vet vet11 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty12 = new org.springframework.samples.petclinic.vet.Specialty();
        vet11.addSpecialty(specialty12);
        vet6.addSpecialty(specialty12);
        vet6.setLastName("");
        int int17 = vet6.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Vet vet18 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty19 = new org.springframework.samples.petclinic.vet.Specialty();
        vet18.addSpecialty(specialty19);
        int int21 = vet18.getNrOfSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList22 = vet18.getSpecialties();
        org.springframework.samples.petclinic.vet.Specialty specialty23 = new org.springframework.samples.petclinic.vet.Specialty();
        specialty23.setId((java.lang.Integer) 100);
        vet18.addSpecialty(specialty23);
        vet6.addSpecialty(specialty23);
        vet3.addSpecialty(specialty23);
        org.springframework.samples.petclinic.vet.Specialty specialty29 = new org.springframework.samples.petclinic.vet.Specialty();
        vet3.addSpecialty(specialty29);
        java.lang.String str31 = specialty29.toString();
        vet0.addSpecialty(specialty29);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(specialtyList22);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<null>" + "'", str31, "<null>");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0359");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        java.lang.String str9 = owner0.getTelephone();
        java.lang.String str10 = owner0.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet12 = owner0.getPet((java.lang.Integer) (-1));
        java.lang.String str13 = owner0.getFirstName();
        java.lang.Class<?> wildcardClass14 = owner0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertNull(pet12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0360");
        org.springframework.samples.petclinic.owner.Visit visit0 = new org.springframework.samples.petclinic.owner.Visit();
        visit0.setDescription("");
        java.lang.Integer int3 = visit0.getId();
        org.springframework.samples.petclinic.owner.Pet pet4 = new org.springframework.samples.petclinic.owner.Pet();
        pet4.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet7 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit8 = new org.springframework.samples.petclinic.owner.Visit();
        visit8.setDescription("");
        pet7.addVisit(visit8);
        org.springframework.samples.petclinic.owner.PetType petType12 = null;
        pet7.setType(petType12);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection14 = pet7.getVisits();
        pet7.setName("");
        org.springframework.samples.petclinic.owner.PetType petType17 = new org.springframework.samples.petclinic.owner.PetType();
        pet7.setType(petType17);
        pet4.setType(petType17);
        org.springframework.samples.petclinic.owner.Pet pet20 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate21 = null;
        pet20.setBirthDate(localDate21);
        java.time.LocalDate localDate23 = pet20.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit24 = new org.springframework.samples.petclinic.owner.Visit();
        visit24.setDescription("");
        java.time.LocalDate localDate27 = visit24.getDate();
        visit24.setDescription("");
        pet20.addVisit(visit24);
        pet4.addVisit(visit24);
        java.time.LocalDate localDate32 = visit24.getDate();
        visit0.setDate(localDate32);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(visitCollection14);
        org.junit.Assert.assertNull(localDate23);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate32);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0361");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit3 = new org.springframework.samples.petclinic.owner.Visit();
        visit3.setDescription("");
        boolean boolean6 = visit3.isNew();
        pet0.addVisit(visit3);
        java.lang.String str8 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType9 = pet0.getType();
        java.lang.String str10 = pet0.toString();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection11 = pet0.getVisits();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<null>" + "'", str8, "<null>");
        org.junit.Assert.assertNull(petType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertNotNull(visitCollection11);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0362");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        java.lang.String str1 = vet0.getLastName();
        int int2 = vet0.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Vet vet3 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty4 = new org.springframework.samples.petclinic.vet.Specialty();
        vet3.addSpecialty(specialty4);
        int int6 = vet3.getNrOfSpecialties();
        java.lang.String str7 = vet3.getFirstName();
        org.springframework.samples.petclinic.vet.Vet vet8 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty9 = new org.springframework.samples.petclinic.vet.Specialty();
        vet8.addSpecialty(specialty9);
        vet3.addSpecialty(specialty9);
        vet3.setLastName("");
        int int14 = vet3.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Vet vet15 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty16 = new org.springframework.samples.petclinic.vet.Specialty();
        vet15.addSpecialty(specialty16);
        int int18 = vet15.getNrOfSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList19 = vet15.getSpecialties();
        org.springframework.samples.petclinic.vet.Specialty specialty20 = new org.springframework.samples.petclinic.vet.Specialty();
        specialty20.setId((java.lang.Integer) 100);
        vet15.addSpecialty(specialty20);
        vet3.addSpecialty(specialty20);
        vet0.addSpecialty(specialty20);
        vet0.setFirstName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(specialtyList19);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0363");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        owner0.setCity("hi!");
        owner0.setTelephone("hi!");
        owner0.setFirstName("<null>");
        org.junit.Assert.assertNull(pet2);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0364");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        visit1.setDescription("");
        pet0.addVisit(visit1);
        org.springframework.samples.petclinic.owner.PetType petType5 = null;
        pet0.setType(petType5);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        boolean boolean8 = pet0.isNew();
        pet0.setName("hi!");
        java.time.LocalDate localDate11 = pet0.getBirthDate();
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0365");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        java.lang.String str4 = owner0.getCity();
        java.lang.String str5 = owner0.getLastName();
        owner0.setFirstName("");
        owner0.setTelephone("<null>");
        owner0.setTelephone("<null>");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0366");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        owner0.setCity("hi!");
        owner0.setTelephone("hi!");
        owner0.setTelephone("hi!");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList10 = owner0.getPets();
        java.lang.String str11 = owner0.getFirstName();
        java.lang.String str12 = owner0.getCity();
        owner0.setFirstName("hi!");
        owner0.setTelephone("");
        org.springframework.samples.petclinic.owner.Pet pet18 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit19 = new org.springframework.samples.petclinic.owner.Visit();
        visit19.setDescription("");
        pet18.addVisit(visit19);
        visit19.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) (-1), visit19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0367");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        org.springframework.samples.petclinic.owner.Pet pet4 = owner0.getPet("");
        boolean boolean5 = owner0.isNew();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0368");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        java.lang.String str4 = owner0.toString();
        java.lang.Integer int5 = owner0.getId();
        java.lang.String str6 = owner0.getCity();
        java.lang.String str7 = owner0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0369");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList1 = vet0.getSpecialties();
        java.lang.String str2 = vet0.getFirstName();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList3 = vet0.getSpecialties();
        int int4 = vet0.getNrOfSpecialties();
        org.junit.Assert.assertNotNull(specialtyList1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(specialtyList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0370");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        owner0.setCity("hi!");
        owner0.setTelephone("hi!");
        owner0.setTelephone("hi!");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList10 = owner0.getPets();
        java.lang.String str11 = owner0.getFirstName();
        org.springframework.samples.petclinic.owner.Pet pet12 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate13 = null;
        pet12.setBirthDate(localDate13);
        org.springframework.samples.petclinic.owner.PetType petType15 = null;
        pet12.setType(petType15);
        java.time.LocalDate localDate17 = pet12.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit18 = new org.springframework.samples.petclinic.owner.Visit();
        pet12.addVisit(visit18);
        java.lang.Integer int20 = pet12.getId();
        pet12.setName("");
        owner0.addPet(pet12);
        owner0.setCity("hi!");
        java.lang.String str26 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet28 = owner0.getPet((java.lang.Integer) 1);
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNull(pet28);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0371");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        owner0.setFirstName("");
        org.springframework.samples.petclinic.owner.Pet pet10 = owner0.getPet("");
        java.lang.Integer int11 = owner0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertNull(pet10);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0372");
        org.springframework.samples.petclinic.owner.Visit visit0 = new org.springframework.samples.petclinic.owner.Visit();
        visit0.setDescription("");
        visit0.setDescription("<null>");
        java.time.LocalDate localDate5 = visit0.getDate();
        visit0.setDescription("");
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0373");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        java.lang.String str7 = pet0.getName();
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0374");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        java.lang.String str9 = owner0.getTelephone();
        java.lang.String str10 = owner0.getTelephone();
        java.lang.String str11 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet13 = owner0.getPet("");
        java.lang.String str14 = owner0.getLastName();
        java.lang.String str15 = owner0.getLastName();
        owner0.setCity("<null>");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertNull(pet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0375");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet3 = owner0.getPet("hi!", false);
        org.springframework.samples.petclinic.owner.Pet pet4 = new org.springframework.samples.petclinic.owner.Pet();
        pet4.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit7 = new org.springframework.samples.petclinic.owner.Visit();
        visit7.setDescription("");
        boolean boolean10 = visit7.isNew();
        pet4.addVisit(visit7);
        java.time.LocalDate localDate12 = pet4.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet13 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit14 = new org.springframework.samples.petclinic.owner.Visit();
        visit14.setDescription("");
        pet13.addVisit(visit14);
        org.springframework.samples.petclinic.owner.PetType petType18 = null;
        pet13.setType(petType18);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection20 = pet13.getVisits();
        pet13.setName("");
        org.springframework.samples.petclinic.owner.PetType petType23 = new org.springframework.samples.petclinic.owner.PetType();
        pet13.setType(petType23);
        pet4.setType(petType23);
        owner0.addPet(pet4);
        pet4.setName("");
        org.springframework.samples.petclinic.owner.Pet pet29 = new org.springframework.samples.petclinic.owner.Pet();
        pet29.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit32 = new org.springframework.samples.petclinic.owner.Visit();
        visit32.setDescription("");
        boolean boolean35 = visit32.isNew();
        pet29.addVisit(visit32);
        java.time.LocalDate localDate37 = visit32.getDate();
        org.springframework.samples.petclinic.owner.Visit visit38 = new org.springframework.samples.petclinic.owner.Visit();
        visit38.setDescription("");
        java.lang.Integer int41 = visit38.getId();
        java.time.LocalDate localDate42 = visit38.getDate();
        org.springframework.samples.petclinic.owner.Visit visit43 = new org.springframework.samples.petclinic.owner.Visit();
        visit43.setDescription("");
        java.time.LocalDate localDate46 = visit43.getDate();
        java.time.LocalDate localDate47 = visit43.getDate();
        visit38.setDate(localDate47);
        visit32.setDate(localDate47);
        visit32.setDescription("");
        java.lang.String str52 = visit32.getDescription();
        java.lang.String str53 = visit32.getDescription();
        pet4.addVisit(visit32);
        java.lang.String str55 = visit32.getDescription();
        java.lang.String str56 = visit32.getDescription();
        org.junit.Assert.assertNull(pet3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNotNull(visitCollection20);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNull(int41);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0376");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        pet0.setName("");
        org.springframework.samples.petclinic.owner.Pet pet5 = new org.springframework.samples.petclinic.owner.Pet();
        pet5.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit8 = new org.springframework.samples.petclinic.owner.Visit();
        visit8.setDescription("");
        boolean boolean11 = visit8.isNew();
        pet5.addVisit(visit8);
        pet0.addVisit(visit8);
        java.lang.String str14 = pet0.getName();
        org.springframework.samples.petclinic.owner.Pet pet15 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate16 = null;
        pet15.setBirthDate(localDate16);
        org.springframework.samples.petclinic.owner.PetType petType18 = null;
        pet15.setType(petType18);
        java.time.LocalDate localDate20 = pet15.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection21 = pet15.getVisits();
        org.springframework.samples.petclinic.owner.Pet pet22 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit23 = new org.springframework.samples.petclinic.owner.Visit();
        visit23.setDescription("");
        pet22.addVisit(visit23);
        org.springframework.samples.petclinic.owner.PetType petType27 = null;
        pet22.setType(petType27);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection29 = pet22.getVisits();
        pet22.setName("");
        org.springframework.samples.petclinic.owner.PetType petType32 = new org.springframework.samples.petclinic.owner.PetType();
        pet22.setType(petType32);
        java.lang.Integer int34 = pet22.getId();
        org.springframework.samples.petclinic.owner.Pet pet35 = new org.springframework.samples.petclinic.owner.Pet();
        pet35.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet38 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit39 = new org.springframework.samples.petclinic.owner.Visit();
        visit39.setDescription("");
        pet38.addVisit(visit39);
        org.springframework.samples.petclinic.owner.PetType petType43 = null;
        pet38.setType(petType43);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection45 = pet38.getVisits();
        pet38.setName("");
        org.springframework.samples.petclinic.owner.PetType petType48 = new org.springframework.samples.petclinic.owner.PetType();
        pet38.setType(petType48);
        pet35.setType(petType48);
        pet35.setName("<null>");
        org.springframework.samples.petclinic.owner.PetType petType53 = pet35.getType();
        pet22.setType(petType53);
        pet15.setType(petType53);
        pet0.setType(petType53);
        java.lang.String str57 = petType53.getName();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNotNull(visitCollection21);
        org.junit.Assert.assertNotNull(visitCollection29);
        org.junit.Assert.assertNull(int34);
        org.junit.Assert.assertNotNull(visitCollection45);
        org.junit.Assert.assertNotNull(petType53);
        org.junit.Assert.assertNull(str57);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0377");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.Visit visit7 = new org.springframework.samples.petclinic.owner.Visit();
        visit7.setDescription("");
        java.time.LocalDate localDate10 = visit7.getDate();
        pet0.setBirthDate(localDate10);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection12 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.Pet pet13 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate14 = null;
        pet13.setBirthDate(localDate14);
        org.springframework.samples.petclinic.owner.PetType petType16 = null;
        pet13.setType(petType16);
        java.time.LocalDate localDate18 = pet13.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType19 = pet13.getType();
        pet13.setName("<null>");
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection22 = pet13.getVisits();
        org.springframework.samples.petclinic.owner.Pet pet23 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit24 = new org.springframework.samples.petclinic.owner.Visit();
        visit24.setDescription("");
        pet23.addVisit(visit24);
        org.springframework.samples.petclinic.owner.PetType petType28 = null;
        pet23.setType(petType28);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection30 = pet23.getVisits();
        pet23.setName("");
        org.springframework.samples.petclinic.owner.PetType petType33 = pet23.getType();
        org.springframework.samples.petclinic.owner.PetType petType34 = new org.springframework.samples.petclinic.owner.PetType();
        petType34.setName("hi!");
        pet23.setType(petType34);
        pet13.setType(petType34);
        pet0.setType(petType34);
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(visitCollection12);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(petType19);
        org.junit.Assert.assertNotNull(visitCollection22);
        org.junit.Assert.assertNotNull(visitCollection30);
        org.junit.Assert.assertNull(petType33);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0378");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList1 = vet0.getSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList2 = vet0.getSpecialties();
        java.lang.String str3 = vet0.getLastName();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList4 = vet0.getSpecialties();
        int int5 = vet0.getNrOfSpecialties();
        org.junit.Assert.assertNotNull(specialtyList1);
        org.junit.Assert.assertNotNull(specialtyList2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(specialtyList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0379");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty1 = new org.springframework.samples.petclinic.vet.Specialty();
        vet0.addSpecialty(specialty1);
        int int3 = vet0.getNrOfSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList4 = vet0.getSpecialties();
        org.springframework.samples.petclinic.vet.Specialty specialty5 = new org.springframework.samples.petclinic.vet.Specialty();
        specialty5.setId((java.lang.Integer) 100);
        vet0.addSpecialty(specialty5);
        vet0.setLastName("");
        int int11 = vet0.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Vet vet12 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty13 = new org.springframework.samples.petclinic.vet.Specialty();
        specialty13.setId((java.lang.Integer) 100);
        vet12.addSpecialty(specialty13);
        org.springframework.samples.petclinic.vet.Vet vet17 = new org.springframework.samples.petclinic.vet.Vet();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList18 = vet17.getSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList19 = vet17.getSpecialties();
        java.lang.String str20 = vet17.getLastName();
        org.springframework.samples.petclinic.vet.Specialty specialty21 = new org.springframework.samples.petclinic.vet.Specialty();
        specialty21.setId((java.lang.Integer) 100);
        vet17.addSpecialty(specialty21);
        vet12.addSpecialty(specialty21);
        vet0.addSpecialty(specialty21);
        int int27 = vet0.getNrOfSpecialties();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(specialtyList4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(specialtyList18);
        org.junit.Assert.assertNotNull(specialtyList19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0380");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        visit1.setDescription("");
        pet0.addVisit(visit1);
        org.springframework.samples.petclinic.owner.Pet pet5 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate6 = null;
        pet5.setBirthDate(localDate6);
        org.springframework.samples.petclinic.owner.Visit visit8 = new org.springframework.samples.petclinic.owner.Visit();
        visit8.setDescription("");
        java.time.LocalDate localDate11 = visit8.getDate();
        pet5.setBirthDate(localDate11);
        pet0.setBirthDate(localDate11);
        boolean boolean14 = pet0.isNew();
        java.lang.String str15 = pet0.getName();
        org.springframework.samples.petclinic.owner.PetType petType16 = pet0.getType();
        org.springframework.samples.petclinic.owner.Visit visit17 = new org.springframework.samples.petclinic.owner.Visit();
        visit17.setDescription("");
        java.time.LocalDate localDate20 = visit17.getDate();
        visit17.setDescription("");
        pet0.addVisit(visit17);
        java.lang.String str24 = pet0.getName();
        java.time.LocalDate localDate25 = pet0.getBirthDate();
        java.lang.Integer int26 = pet0.getId();
        org.springframework.samples.petclinic.owner.Visit visit27 = null;
        pet0.addVisit(visit27);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(petType16);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNull(int26);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0381");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        pet0.setName("");
        pet0.setName("");
        boolean boolean7 = pet0.isNew();
        java.lang.String str8 = pet0.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0382");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList7 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet9 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str10 = owner0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertNotNull(petList7);
        org.junit.Assert.assertNull(pet9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0383");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        pet0.setName("");
        pet0.setName("");
        boolean boolean7 = pet0.isNew();
        org.springframework.samples.petclinic.owner.Pet pet8 = new org.springframework.samples.petclinic.owner.Pet();
        pet8.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit11 = new org.springframework.samples.petclinic.owner.Visit();
        visit11.setDescription("");
        boolean boolean14 = visit11.isNew();
        pet8.addVisit(visit11);
        java.time.LocalDate localDate16 = pet8.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet17 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit18 = new org.springframework.samples.petclinic.owner.Visit();
        visit18.setDescription("");
        pet17.addVisit(visit18);
        org.springframework.samples.petclinic.owner.PetType petType22 = null;
        pet17.setType(petType22);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection24 = pet17.getVisits();
        pet17.setName("");
        org.springframework.samples.petclinic.owner.PetType petType27 = new org.springframework.samples.petclinic.owner.PetType();
        pet17.setType(petType27);
        pet8.setType(petType27);
        pet0.setType(petType27);
        org.springframework.samples.petclinic.owner.Pet pet31 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit32 = new org.springframework.samples.petclinic.owner.Visit();
        visit32.setDescription("");
        pet31.addVisit(visit32);
        java.time.LocalDate localDate36 = visit32.getDate();
        pet0.setBirthDate(localDate36);
        org.springframework.samples.petclinic.owner.Pet pet38 = new org.springframework.samples.petclinic.owner.Pet();
        pet38.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet41 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit42 = new org.springframework.samples.petclinic.owner.Visit();
        visit42.setDescription("");
        pet41.addVisit(visit42);
        org.springframework.samples.petclinic.owner.PetType petType46 = null;
        pet41.setType(petType46);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection48 = pet41.getVisits();
        pet41.setName("");
        org.springframework.samples.petclinic.owner.PetType petType51 = new org.springframework.samples.petclinic.owner.PetType();
        pet41.setType(petType51);
        pet38.setType(petType51);
        org.springframework.samples.petclinic.owner.Pet pet54 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate55 = null;
        pet54.setBirthDate(localDate55);
        java.time.LocalDate localDate57 = pet54.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit58 = new org.springframework.samples.petclinic.owner.Visit();
        visit58.setDescription("");
        java.time.LocalDate localDate61 = visit58.getDate();
        visit58.setDescription("");
        pet54.addVisit(visit58);
        pet38.addVisit(visit58);
        java.lang.String str66 = visit58.getDescription();
        pet0.addVisit(visit58);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection68 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType69 = pet0.getType();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNotNull(visitCollection24);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(visitCollection48);
        org.junit.Assert.assertNull(localDate57);
        org.junit.Assert.assertNotNull(localDate61);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(visitCollection68);
        org.junit.Assert.assertNotNull(petType69);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0384");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType6 = pet0.getType();
        org.springframework.samples.petclinic.owner.Visit visit7 = new org.springframework.samples.petclinic.owner.Visit();
        visit7.setDescription("");
        java.lang.Integer int10 = visit7.getId();
        pet0.addVisit(visit7);
        boolean boolean12 = visit7.isNew();
        java.lang.String str13 = visit7.getDescription();
        java.time.LocalDate localDate14 = visit7.getDate();
        org.springframework.samples.petclinic.owner.Pet pet15 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit16 = new org.springframework.samples.petclinic.owner.Visit();
        visit16.setDescription("");
        pet15.addVisit(visit16);
        visit16.setDescription("");
        java.lang.String str22 = visit16.getDescription();
        java.lang.String str23 = visit16.getDescription();
        java.time.LocalDate localDate24 = visit16.getDate();
        visit7.setDate(localDate24);
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNull(petType6);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(localDate24);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0385");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        java.lang.String str1 = vet0.getLastName();
        org.springframework.samples.petclinic.vet.Vet vet2 = new org.springframework.samples.petclinic.vet.Vet();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList3 = vet2.getSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList4 = vet2.getSpecialties();
        vet2.setFirstName("<null>");
        int int7 = vet2.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Vet vet8 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty9 = new org.springframework.samples.petclinic.vet.Specialty();
        vet8.addSpecialty(specialty9);
        vet2.addSpecialty(specialty9);
        vet0.addSpecialty(specialty9);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(specialtyList3);
        org.junit.Assert.assertNotNull(specialtyList4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0386");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList3 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet4 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate5 = null;
        pet4.setBirthDate(localDate5);
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet4.setType(petType7);
        java.time.LocalDate localDate9 = pet4.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit10 = new org.springframework.samples.petclinic.owner.Visit();
        pet4.addVisit(visit10);
        owner0.addPet(pet4);
        java.lang.String str13 = owner0.getTelephone();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList14 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet17 = owner0.getPet("hi!", true);
        owner0.setTelephone("hi!");
        owner0.setFirstName("<null>");
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList3);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(petList14);
        org.junit.Assert.assertNull(pet17);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0387");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 10);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        owner0.setFirstName("");
        java.lang.String str9 = owner0.getAddress();
        java.lang.Integer int10 = owner0.getId();
        org.springframework.samples.petclinic.owner.Pet pet11 = new org.springframework.samples.petclinic.owner.Pet();
        pet11.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet14 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit15 = new org.springframework.samples.petclinic.owner.Visit();
        visit15.setDescription("");
        pet14.addVisit(visit15);
        org.springframework.samples.petclinic.owner.PetType petType19 = null;
        pet14.setType(petType19);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection21 = pet14.getVisits();
        pet14.setName("");
        org.springframework.samples.petclinic.owner.PetType petType24 = new org.springframework.samples.petclinic.owner.PetType();
        pet14.setType(petType24);
        pet11.setType(petType24);
        pet11.setName("<null>");
        java.lang.String str29 = pet11.toString();
        org.springframework.samples.petclinic.owner.Pet pet30 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate31 = null;
        pet30.setBirthDate(localDate31);
        org.springframework.samples.petclinic.owner.PetType petType33 = null;
        pet30.setType(petType33);
        java.time.LocalDate localDate35 = pet30.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType36 = pet30.getType();
        org.springframework.samples.petclinic.owner.Visit visit37 = new org.springframework.samples.petclinic.owner.Visit();
        visit37.setDescription("");
        java.lang.Integer int40 = visit37.getId();
        pet30.addVisit(visit37);
        pet11.addVisit(visit37);
        owner0.addPet(pet11);
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNotNull(visitCollection21);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<null>" + "'", str29, "<null>");
        org.junit.Assert.assertNull(localDate35);
        org.junit.Assert.assertNull(petType36);
        org.junit.Assert.assertNull(int40);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0388");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList3 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet4 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate5 = null;
        pet4.setBirthDate(localDate5);
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet4.setType(petType7);
        java.time.LocalDate localDate9 = pet4.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit10 = new org.springframework.samples.petclinic.owner.Visit();
        pet4.addVisit(visit10);
        owner0.addPet(pet4);
        java.lang.String str13 = owner0.getTelephone();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList14 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet17 = owner0.getPet("hi!", true);
        owner0.setTelephone("hi!");
        owner0.setCity("hi!");
        java.lang.String str22 = owner0.getTelephone();
        java.lang.String str23 = owner0.toString();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList3);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(petList14);
        org.junit.Assert.assertNull(pet17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0389");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 10);
        java.lang.String str6 = owner0.getFirstName();
        owner0.setFirstName("hi!");
        org.springframework.samples.petclinic.owner.Pet pet10 = owner0.getPet("<null>");
        owner0.setTelephone("");
        owner0.setTelephone("");
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(pet10);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0390");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        org.springframework.samples.petclinic.owner.Pet pet6 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit7 = new org.springframework.samples.petclinic.owner.Visit();
        visit7.setDescription("");
        pet6.addVisit(visit7);
        org.springframework.samples.petclinic.owner.Visit visit11 = new org.springframework.samples.petclinic.owner.Visit();
        visit11.setDescription("");
        java.lang.Integer int14 = visit11.getId();
        pet6.addVisit(visit11);
        owner0.addPet(pet6);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection17 = pet6.getVisits();
        java.lang.String str18 = pet6.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNotNull(visitCollection17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0391");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.Visit visit7 = new org.springframework.samples.petclinic.owner.Visit();
        visit7.setDescription("");
        java.time.LocalDate localDate10 = visit7.getDate();
        pet0.setBirthDate(localDate10);
        org.springframework.samples.petclinic.owner.Visit visit12 = new org.springframework.samples.petclinic.owner.Visit();
        visit12.setDescription("");
        java.lang.Integer int15 = visit12.getId();
        java.time.LocalDate localDate16 = visit12.getDate();
        pet0.setBirthDate(localDate16);
        java.time.LocalDate localDate18 = pet0.getBirthDate();
        boolean boolean19 = pet0.isNew();
        java.time.LocalDate localDate20 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection21 = pet0.getVisits();
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(visitCollection21);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0392");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        java.lang.String str9 = owner0.getTelephone();
        java.lang.String str10 = owner0.getTelephone();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList11 = owner0.getPets();
        owner0.setLastName("");
        java.lang.String str14 = owner0.getTelephone();
        owner0.setTelephone("");
        owner0.setCity("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertNotNull(petList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<null>" + "'", str14, "<null>");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0393");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setId((java.lang.Integer) (-1));
        owner0.setCity("");
        java.lang.String str8 = owner0.getTelephone();
        owner0.setFirstName("");
        java.lang.Class<?> wildcardClass11 = owner0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0394");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        java.lang.String str9 = owner0.getTelephone();
        java.lang.String str10 = owner0.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet12 = owner0.getPet((java.lang.Integer) (-1));
        org.springframework.samples.petclinic.owner.Pet pet14 = owner0.getPet("<null>");
        java.lang.String str15 = owner0.getCity();
        org.springframework.samples.petclinic.owner.Pet pet16 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit17 = new org.springframework.samples.petclinic.owner.Visit();
        visit17.setDescription("");
        pet16.addVisit(visit17);
        org.springframework.samples.petclinic.owner.PetType petType21 = null;
        pet16.setType(petType21);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection23 = pet16.getVisits();
        pet16.setName("");
        org.springframework.samples.petclinic.owner.PetType petType26 = new org.springframework.samples.petclinic.owner.PetType();
        pet16.setType(petType26);
        java.time.LocalDate localDate28 = pet16.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection29 = pet16.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType30 = pet16.getType();
        owner0.addPet(pet16);
        pet16.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet34 = new org.springframework.samples.petclinic.owner.Pet();
        pet34.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet37 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit38 = new org.springframework.samples.petclinic.owner.Visit();
        visit38.setDescription("");
        pet37.addVisit(visit38);
        org.springframework.samples.petclinic.owner.PetType petType42 = null;
        pet37.setType(petType42);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection44 = pet37.getVisits();
        pet37.setName("");
        org.springframework.samples.petclinic.owner.PetType petType47 = new org.springframework.samples.petclinic.owner.PetType();
        pet37.setType(petType47);
        pet34.setType(petType47);
        org.springframework.samples.petclinic.owner.Pet pet50 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate51 = null;
        pet50.setBirthDate(localDate51);
        java.time.LocalDate localDate53 = pet50.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit54 = new org.springframework.samples.petclinic.owner.Visit();
        visit54.setDescription("");
        java.time.LocalDate localDate57 = visit54.getDate();
        visit54.setDescription("");
        pet50.addVisit(visit54);
        pet34.addVisit(visit54);
        java.time.LocalDate localDate62 = visit54.getDate();
        pet16.addVisit(visit54);
        java.time.LocalDate localDate64 = visit54.getDate();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertNull(pet12);
        org.junit.Assert.assertNull(pet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(visitCollection23);
        org.junit.Assert.assertNull(localDate28);
        org.junit.Assert.assertNotNull(visitCollection29);
        org.junit.Assert.assertNotNull(petType30);
        org.junit.Assert.assertNotNull(visitCollection44);
        org.junit.Assert.assertNull(localDate53);
        org.junit.Assert.assertNotNull(localDate57);
        org.junit.Assert.assertNotNull(localDate62);
        org.junit.Assert.assertNotNull(localDate64);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0395");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        java.lang.String str9 = owner0.getTelephone();
        java.lang.String str10 = owner0.getTelephone();
        java.lang.String str11 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet12 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit13 = new org.springframework.samples.petclinic.owner.Visit();
        visit13.setDescription("");
        pet12.addVisit(visit13);
        org.springframework.samples.petclinic.owner.Pet pet17 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate18 = null;
        pet17.setBirthDate(localDate18);
        org.springframework.samples.petclinic.owner.Visit visit20 = new org.springframework.samples.petclinic.owner.Visit();
        visit20.setDescription("");
        java.time.LocalDate localDate23 = visit20.getDate();
        pet17.setBirthDate(localDate23);
        pet12.setBirthDate(localDate23);
        boolean boolean26 = pet12.isNew();
        owner0.addPet(pet12);
        java.time.LocalDate localDate28 = pet12.getBirthDate();
        java.lang.String str29 = pet12.toString();
        org.springframework.samples.petclinic.owner.PetType petType30 = pet12.getType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<null>" + "'", str29, "<null>");
        org.junit.Assert.assertNull(petType30);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0396");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        java.lang.String str4 = owner0.getCity();
        java.lang.String str5 = owner0.getLastName();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        java.lang.String str7 = owner0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0397");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        pet0.addVisit(visit1);
        java.lang.String str3 = visit1.getDescription();
        visit1.setDescription("<null>");
        java.lang.String str6 = visit1.getDescription();
        org.springframework.samples.petclinic.owner.Pet pet7 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate8 = null;
        pet7.setBirthDate(localDate8);
        org.springframework.samples.petclinic.owner.PetType petType10 = null;
        pet7.setType(petType10);
        java.time.LocalDate localDate12 = pet7.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection13 = pet7.getVisits();
        org.springframework.samples.petclinic.owner.Visit visit14 = new org.springframework.samples.petclinic.owner.Visit();
        visit14.setDescription("");
        java.time.LocalDate localDate17 = visit14.getDate();
        pet7.setBirthDate(localDate17);
        org.springframework.samples.petclinic.owner.Visit visit19 = new org.springframework.samples.petclinic.owner.Visit();
        visit19.setDescription("");
        java.lang.Integer int22 = visit19.getId();
        java.time.LocalDate localDate23 = visit19.getDate();
        pet7.setBirthDate(localDate23);
        visit1.setDate(localDate23);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<null>" + "'", str6, "<null>");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNotNull(visitCollection13);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNotNull(localDate23);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0398");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        pet0.setName("");
        org.springframework.samples.petclinic.owner.Pet pet5 = new org.springframework.samples.petclinic.owner.Pet();
        pet5.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit8 = new org.springframework.samples.petclinic.owner.Visit();
        visit8.setDescription("");
        boolean boolean11 = visit8.isNew();
        pet5.addVisit(visit8);
        pet0.addVisit(visit8);
        java.lang.String str14 = pet0.getName();
        boolean boolean15 = pet0.isNew();
        java.lang.String str16 = pet0.getName();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection17 = pet0.getVisits();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(visitCollection17);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0399");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList1 = vet0.getSpecialties();
        int int2 = vet0.getNrOfSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList3 = vet0.getSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList4 = vet0.getSpecialties();
        int int5 = vet0.getNrOfSpecialties();
        vet0.setId((java.lang.Integer) 100);
        vet0.setLastName("");
        org.junit.Assert.assertNotNull(specialtyList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(specialtyList3);
        org.junit.Assert.assertNotNull(specialtyList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0400");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty1 = new org.springframework.samples.petclinic.vet.Specialty();
        vet0.addSpecialty(specialty1);
        int int3 = vet0.getNrOfSpecialties();
        java.lang.String str4 = vet0.getFirstName();
        org.springframework.samples.petclinic.vet.Vet vet5 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty6 = new org.springframework.samples.petclinic.vet.Specialty();
        vet5.addSpecialty(specialty6);
        vet0.addSpecialty(specialty6);
        vet0.setLastName("");
        vet0.setLastName("<null>");
        java.lang.String str13 = vet0.getLastName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<null>" + "'", str13, "<null>");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0401");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList7 = owner0.getPets();
        owner0.setLastName("hi!");
        org.springframework.samples.petclinic.owner.Owner owner10 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet12 = owner10.getPet((java.lang.Integer) 0);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList13 = owner10.getPets();
        java.lang.String str14 = owner10.getFirstName();
        owner10.setCity("hi!");
        java.lang.String str17 = owner10.toString();
        org.springframework.samples.petclinic.owner.Pet pet18 = new org.springframework.samples.petclinic.owner.Pet();
        pet18.setName("<null>");
        java.time.LocalDate localDate21 = pet18.getBirthDate();
        owner10.addPet(pet18);
        owner0.addPet(pet18);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList24 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet26 = owner0.getPet("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertNotNull(petList7);
        org.junit.Assert.assertNull(pet12);
        org.junit.Assert.assertNotNull(petList13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(localDate21);
        org.junit.Assert.assertNotNull(petList24);
        org.junit.Assert.assertNull(pet26);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0402");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.Visit visit7 = new org.springframework.samples.petclinic.owner.Visit();
        visit7.setDescription("");
        java.time.LocalDate localDate10 = visit7.getDate();
        pet0.setBirthDate(localDate10);
        org.springframework.samples.petclinic.owner.Visit visit12 = new org.springframework.samples.petclinic.owner.Visit();
        visit12.setDescription("");
        java.lang.Integer int15 = visit12.getId();
        java.time.LocalDate localDate16 = visit12.getDate();
        pet0.setBirthDate(localDate16);
        java.time.LocalDate localDate18 = pet0.getBirthDate();
        pet0.setId((java.lang.Integer) 2);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection21 = pet0.getVisits();
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(visitCollection21);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0403");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty1 = new org.springframework.samples.petclinic.vet.Specialty();
        vet0.addSpecialty(specialty1);
        int int3 = vet0.getNrOfSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList4 = vet0.getSpecialties();
        org.springframework.samples.petclinic.vet.Specialty specialty5 = new org.springframework.samples.petclinic.vet.Specialty();
        specialty5.setId((java.lang.Integer) 100);
        vet0.addSpecialty(specialty5);
        int int9 = vet0.getNrOfSpecialties();
        java.lang.Class<?> wildcardClass10 = vet0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(specialtyList4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0404");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList1 = vet0.getSpecialties();
        int int2 = vet0.getNrOfSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList3 = vet0.getSpecialties();
        vet0.setFirstName("");
        java.lang.String str6 = vet0.getFirstName();
        org.springframework.samples.petclinic.vet.Vet vet7 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty8 = new org.springframework.samples.petclinic.vet.Specialty();
        vet7.addSpecialty(specialty8);
        int int10 = vet7.getNrOfSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList11 = vet7.getSpecialties();
        org.springframework.samples.petclinic.vet.Specialty specialty12 = new org.springframework.samples.petclinic.vet.Specialty();
        specialty12.setId((java.lang.Integer) 100);
        vet7.addSpecialty(specialty12);
        java.lang.String str16 = specialty12.toString();
        java.lang.String str17 = specialty12.getName();
        specialty12.setName("<null>");
        vet0.addSpecialty(specialty12);
        org.junit.Assert.assertNotNull(specialtyList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(specialtyList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(specialtyList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<null>" + "'", str16, "<null>");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0405");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        visit1.setDescription("");
        pet0.addVisit(visit1);
        org.springframework.samples.petclinic.owner.Pet pet5 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate6 = null;
        pet5.setBirthDate(localDate6);
        org.springframework.samples.petclinic.owner.Visit visit8 = new org.springframework.samples.petclinic.owner.Visit();
        visit8.setDescription("");
        java.time.LocalDate localDate11 = visit8.getDate();
        pet5.setBirthDate(localDate11);
        pet0.setBirthDate(localDate11);
        boolean boolean14 = pet0.isNew();
        org.springframework.samples.petclinic.owner.Visit visit15 = new org.springframework.samples.petclinic.owner.Visit();
        visit15.setDescription("");
        java.lang.Integer int18 = visit15.getId();
        java.time.LocalDate localDate19 = visit15.getDate();
        org.springframework.samples.petclinic.owner.Visit visit20 = new org.springframework.samples.petclinic.owner.Visit();
        visit20.setDescription("");
        java.time.LocalDate localDate23 = visit20.getDate();
        java.time.LocalDate localDate24 = visit20.getDate();
        visit15.setDate(localDate24);
        org.springframework.samples.petclinic.owner.Pet pet26 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit27 = new org.springframework.samples.petclinic.owner.Visit();
        visit27.setDescription("");
        pet26.addVisit(visit27);
        org.springframework.samples.petclinic.owner.Pet pet31 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate32 = null;
        pet31.setBirthDate(localDate32);
        org.springframework.samples.petclinic.owner.Visit visit34 = new org.springframework.samples.petclinic.owner.Visit();
        visit34.setDescription("");
        java.time.LocalDate localDate37 = visit34.getDate();
        pet31.setBirthDate(localDate37);
        pet26.setBirthDate(localDate37);
        visit15.setDate(localDate37);
        java.time.LocalDate localDate41 = visit15.getDate();
        pet0.addVisit(visit15);
        visit15.setDescription("");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(localDate41);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0406");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        owner0.setCity("<null>");
        org.springframework.samples.petclinic.owner.Pet pet10 = owner0.getPet((java.lang.Integer) 100);
        java.lang.String str11 = owner0.getFirstName();
        boolean boolean12 = owner0.isNew();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList13 = owner0.getPets();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertNull(pet10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(petList13);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0407");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        visit1.setDescription("");
        pet0.addVisit(visit1);
        org.springframework.samples.petclinic.owner.PetType petType5 = null;
        pet0.setType(petType5);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType10 = pet0.getType();
        java.time.LocalDate localDate11 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet12 = new org.springframework.samples.petclinic.owner.Pet();
        pet12.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet15 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit16 = new org.springframework.samples.petclinic.owner.Visit();
        visit16.setDescription("");
        pet15.addVisit(visit16);
        org.springframework.samples.petclinic.owner.PetType petType20 = null;
        pet15.setType(petType20);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection22 = pet15.getVisits();
        pet15.setName("");
        org.springframework.samples.petclinic.owner.PetType petType25 = new org.springframework.samples.petclinic.owner.PetType();
        pet15.setType(petType25);
        pet12.setType(petType25);
        pet0.setType(petType25);
        org.springframework.samples.petclinic.owner.PetType petType29 = new org.springframework.samples.petclinic.owner.PetType();
        pet0.setType(petType29);
        java.time.LocalDate localDate31 = pet0.getBirthDate();
        java.lang.String str32 = pet0.getName();
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertNull(petType10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNotNull(visitCollection22);
        org.junit.Assert.assertNull(localDate31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0408");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        visit1.setDescription("");
        pet0.addVisit(visit1);
        visit1.setDescription("");
        visit1.setDescription("<null>");
        visit1.setDescription("");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0409");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        owner0.setCity("hi!");
        owner0.setTelephone("hi!");
        owner0.setTelephone("hi!");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList10 = owner0.getPets();
        java.lang.String str11 = owner0.getFirstName();
        java.lang.String str12 = owner0.getCity();
        owner0.setFirstName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit16 = new org.springframework.samples.petclinic.owner.Visit();
        visit16.setDescription("");
        visit16.setDescription("<null>");
        java.time.LocalDate localDate21 = visit16.getDate();
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 2, visit16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(localDate21);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0410");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList3 = owner0.getPets();
        java.lang.String str4 = owner0.getFirstName();
        owner0.setCity("hi!");
        org.springframework.samples.petclinic.owner.Pet pet9 = owner0.getPet("<null>", true);
        java.lang.String str10 = owner0.getCity();
        owner0.setLastName("<null>");
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(pet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0411");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        owner0.setCity("hi!");
        owner0.setTelephone("hi!");
        owner0.setTelephone("hi!");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList10 = owner0.getPets();
        java.lang.String str11 = owner0.getFirstName();
        java.lang.String str12 = owner0.getCity();
        owner0.setFirstName("<null>");
        java.lang.String str15 = owner0.getTelephone();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0412");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList3 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet4 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate5 = null;
        pet4.setBirthDate(localDate5);
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet4.setType(petType7);
        java.time.LocalDate localDate9 = pet4.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit10 = new org.springframework.samples.petclinic.owner.Visit();
        pet4.addVisit(visit10);
        owner0.addPet(pet4);
        java.lang.String str13 = owner0.getLastName();
        java.lang.String str14 = owner0.getCity();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList3);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0413");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        java.lang.String str4 = owner0.getCity();
        owner0.setAddress("hi!");
        boolean boolean7 = owner0.isNew();
        java.lang.String str8 = owner0.toString();
        java.lang.String str9 = owner0.getLastName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0414");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        java.lang.String str4 = owner0.getCity();
        owner0.setLastName("");
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("");
        java.lang.String str9 = owner0.getLastName();
        java.lang.String str10 = owner0.getAddress();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(pet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0415");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        java.lang.String str9 = owner0.getTelephone();
        java.lang.String str10 = owner0.getTelephone();
        java.lang.String str11 = owner0.toString();
        java.lang.String str12 = owner0.getCity();
        org.springframework.samples.petclinic.owner.Pet pet15 = owner0.getPet("", false);
        // The following exception was thrown during execution in test generation
        try {
            pet15.setId((java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(pet15);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0416");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        owner0.setCity("hi!");
        org.springframework.samples.petclinic.owner.Pet pet7 = owner0.getPet((java.lang.Integer) 100);
        java.lang.String str8 = owner0.getCity();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList9 = owner0.getPets();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(petList9);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0417");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        java.lang.String str9 = owner0.getTelephone();
        java.lang.String str10 = owner0.getTelephone();
        java.lang.String str11 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet12 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit13 = new org.springframework.samples.petclinic.owner.Visit();
        visit13.setDescription("");
        pet12.addVisit(visit13);
        org.springframework.samples.petclinic.owner.Pet pet17 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate18 = null;
        pet17.setBirthDate(localDate18);
        org.springframework.samples.petclinic.owner.Visit visit20 = new org.springframework.samples.petclinic.owner.Visit();
        visit20.setDescription("");
        java.time.LocalDate localDate23 = visit20.getDate();
        pet17.setBirthDate(localDate23);
        pet12.setBirthDate(localDate23);
        boolean boolean26 = pet12.isNew();
        owner0.addPet(pet12);
        java.time.LocalDate localDate28 = pet12.getBirthDate();
        java.lang.String str29 = pet12.toString();
        org.springframework.samples.petclinic.owner.Pet pet30 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate31 = null;
        pet30.setBirthDate(localDate31);
        org.springframework.samples.petclinic.owner.PetType petType33 = null;
        pet30.setType(petType33);
        java.time.LocalDate localDate35 = pet30.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType36 = pet30.getType();
        pet30.setName("<null>");
        java.lang.String str39 = pet30.getName();
        org.springframework.samples.petclinic.owner.Visit visit40 = new org.springframework.samples.petclinic.owner.Visit();
        visit40.setDescription("");
        java.lang.Integer int43 = visit40.getId();
        boolean boolean44 = visit40.isNew();
        pet30.addVisit(visit40);
        java.lang.String str46 = visit40.getDescription();
        pet12.addVisit(visit40);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<null>" + "'", str29, "<null>");
        org.junit.Assert.assertNull(localDate35);
        org.junit.Assert.assertNull(petType36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<null>" + "'", str39, "<null>");
        org.junit.Assert.assertNull(int43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0418");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit3 = new org.springframework.samples.petclinic.owner.Visit();
        visit3.setDescription("");
        boolean boolean6 = visit3.isNew();
        pet0.addVisit(visit3);
        java.time.LocalDate localDate8 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet9 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate10 = null;
        pet9.setBirthDate(localDate10);
        org.springframework.samples.petclinic.owner.PetType petType12 = null;
        pet9.setType(petType12);
        java.time.LocalDate localDate14 = pet9.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType15 = pet9.getType();
        org.springframework.samples.petclinic.owner.Visit visit16 = new org.springframework.samples.petclinic.owner.Visit();
        visit16.setDescription("");
        java.lang.Integer int19 = visit16.getId();
        pet9.addVisit(visit16);
        pet0.addVisit(visit16);
        org.springframework.samples.petclinic.owner.PetType petType22 = pet0.getType();
        org.springframework.samples.petclinic.owner.PetType petType23 = pet0.getType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(petType15);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNull(petType22);
        org.junit.Assert.assertNull(petType23);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0419");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        java.lang.String str1 = vet0.getLastName();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList2 = vet0.getSpecialties();
        int int3 = vet0.getNrOfSpecialties();
        int int4 = vet0.getNrOfSpecialties();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(specialtyList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0420");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        owner0.setLastName("hi!");
        owner0.setFirstName("<null>");
        owner0.setFirstName("");
        org.junit.Assert.assertNull(pet2);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0421");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        org.springframework.samples.petclinic.owner.Pet pet6 = owner0.getPet("hi!", false);
        org.springframework.samples.petclinic.owner.Pet pet7 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit8 = new org.springframework.samples.petclinic.owner.Visit();
        visit8.setDescription("");
        pet7.addVisit(visit8);
        org.springframework.samples.petclinic.owner.PetType petType12 = null;
        pet7.setType(petType12);
        java.time.LocalDate localDate14 = pet7.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection15 = pet7.getVisits();
        owner0.addPet(pet7);
        java.lang.String str17 = owner0.getAddress();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(pet6);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNotNull(visitCollection15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0422");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        pet0.setName("");
        org.springframework.samples.petclinic.owner.Pet pet5 = new org.springframework.samples.petclinic.owner.Pet();
        pet5.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit8 = new org.springframework.samples.petclinic.owner.Visit();
        visit8.setDescription("");
        boolean boolean11 = visit8.isNew();
        pet5.addVisit(visit8);
        pet0.addVisit(visit8);
        java.time.LocalDate localDate14 = visit8.getDate();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0423");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList7 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet9 = owner0.getPet((java.lang.Integer) 0);
        org.springframework.samples.petclinic.owner.Pet pet12 = owner0.getPet("<null>", true);
        java.lang.String str13 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet14 = null;
        // The following exception was thrown during execution in test generation
        try {
            owner0.addPet(pet14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.samples.petclinic.owner.Pet.isNew()\" because \"pet\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertNotNull(petList7);
        org.junit.Assert.assertNull(pet9);
        org.junit.Assert.assertNull(pet12);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0424");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.Visit visit3 = new org.springframework.samples.petclinic.owner.Visit();
        visit3.setDescription("");
        java.time.LocalDate localDate6 = visit3.getDate();
        pet0.setBirthDate(localDate6);
        org.springframework.samples.petclinic.owner.Pet pet8 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit9 = new org.springframework.samples.petclinic.owner.Visit();
        visit9.setDescription("");
        pet8.addVisit(visit9);
        org.springframework.samples.petclinic.owner.Visit visit13 = new org.springframework.samples.petclinic.owner.Visit();
        visit13.setDescription("");
        java.lang.Integer int16 = visit13.getId();
        pet8.addVisit(visit13);
        java.lang.String str18 = visit13.getDescription();
        pet0.addVisit(visit13);
        visit13.setDescription("<null>");
        org.springframework.samples.petclinic.owner.Pet pet22 = new org.springframework.samples.petclinic.owner.Pet();
        pet22.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit25 = new org.springframework.samples.petclinic.owner.Visit();
        visit25.setDescription("");
        boolean boolean28 = visit25.isNew();
        pet22.addVisit(visit25);
        java.time.LocalDate localDate30 = visit25.getDate();
        org.springframework.samples.petclinic.owner.Visit visit31 = new org.springframework.samples.petclinic.owner.Visit();
        visit31.setDescription("");
        java.lang.Integer int34 = visit31.getId();
        java.time.LocalDate localDate35 = visit31.getDate();
        org.springframework.samples.petclinic.owner.Visit visit36 = new org.springframework.samples.petclinic.owner.Visit();
        visit36.setDescription("");
        java.time.LocalDate localDate39 = visit36.getDate();
        java.time.LocalDate localDate40 = visit36.getDate();
        visit31.setDate(localDate40);
        visit25.setDate(localDate40);
        visit25.setDescription("");
        java.time.LocalDate localDate45 = visit25.getDate();
        java.time.LocalDate localDate46 = visit25.getDate();
        org.springframework.samples.petclinic.owner.Pet pet47 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit48 = new org.springframework.samples.petclinic.owner.Visit();
        visit48.setDescription("");
        pet47.addVisit(visit48);
        org.springframework.samples.petclinic.owner.Pet pet52 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate53 = null;
        pet52.setBirthDate(localDate53);
        org.springframework.samples.petclinic.owner.Visit visit55 = new org.springframework.samples.petclinic.owner.Visit();
        visit55.setDescription("");
        java.time.LocalDate localDate58 = visit55.getDate();
        pet52.setBirthDate(localDate58);
        pet47.setBirthDate(localDate58);
        boolean boolean61 = pet47.isNew();
        org.springframework.samples.petclinic.owner.Visit visit62 = new org.springframework.samples.petclinic.owner.Visit();
        visit62.setDescription("");
        java.lang.Integer int65 = visit62.getId();
        java.time.LocalDate localDate66 = visit62.getDate();
        org.springframework.samples.petclinic.owner.Visit visit67 = new org.springframework.samples.petclinic.owner.Visit();
        visit67.setDescription("");
        java.time.LocalDate localDate70 = visit67.getDate();
        java.time.LocalDate localDate71 = visit67.getDate();
        visit62.setDate(localDate71);
        org.springframework.samples.petclinic.owner.Pet pet73 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit74 = new org.springframework.samples.petclinic.owner.Visit();
        visit74.setDescription("");
        pet73.addVisit(visit74);
        org.springframework.samples.petclinic.owner.Pet pet78 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate79 = null;
        pet78.setBirthDate(localDate79);
        org.springframework.samples.petclinic.owner.Visit visit81 = new org.springframework.samples.petclinic.owner.Visit();
        visit81.setDescription("");
        java.time.LocalDate localDate84 = visit81.getDate();
        pet78.setBirthDate(localDate84);
        pet73.setBirthDate(localDate84);
        visit62.setDate(localDate84);
        java.time.LocalDate localDate88 = visit62.getDate();
        pet47.addVisit(visit62);
        java.time.LocalDate localDate90 = visit62.getDate();
        visit25.setDate(localDate90);
        visit13.setDate(localDate90);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNull(int34);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertNotNull(localDate58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNull(int65);
        org.junit.Assert.assertNotNull(localDate66);
        org.junit.Assert.assertNotNull(localDate70);
        org.junit.Assert.assertNotNull(localDate71);
        org.junit.Assert.assertNotNull(localDate84);
        org.junit.Assert.assertNotNull(localDate88);
        org.junit.Assert.assertNotNull(localDate90);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0425");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setId((java.lang.Integer) (-1));
        java.lang.String str6 = owner0.getFirstName();
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet((java.lang.Integer) 1);
        owner0.setCity("hi!");
        java.lang.String str11 = owner0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(pet8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0426");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList7 = owner0.getPets();
        owner0.setLastName("hi!");
        java.lang.String str10 = owner0.toString();
        java.lang.String str11 = owner0.getCity();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertNotNull(petList7);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0427");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        int int1 = vet0.getNrOfSpecialties();
        int int2 = vet0.getNrOfSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList3 = vet0.getSpecialties();
        vet0.setLastName("hi!");
        boolean boolean6 = vet0.isNew();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(specialtyList3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0428");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList1 = vet0.getSpecialties();
        int int2 = vet0.getNrOfSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList3 = vet0.getSpecialties();
        vet0.setFirstName("");
        java.lang.String str6 = vet0.getFirstName();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList7 = vet0.getSpecialties();
        org.junit.Assert.assertNotNull(specialtyList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(specialtyList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(specialtyList7);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0429");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 10);
        java.lang.String str6 = owner0.getFirstName();
        java.lang.String str7 = owner0.getCity();
        org.springframework.samples.petclinic.owner.Pet pet10 = owner0.getPet("", false);
        owner0.setTelephone("hi!");
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(pet10);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0430");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        owner0.setCity("<null>");
        org.springframework.samples.petclinic.owner.Pet pet10 = owner0.getPet((java.lang.Integer) 100);
        java.lang.String str11 = owner0.getFirstName();
        java.lang.String str12 = owner0.getCity();
        java.lang.String str13 = owner0.getTelephone();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertNull(pet10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<null>" + "'", str12, "<null>");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0431");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList1 = vet0.getSpecialties();
        java.lang.String str2 = vet0.getFirstName();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList3 = vet0.getSpecialties();
        vet0.setFirstName("<null>");
        org.junit.Assert.assertNotNull(specialtyList1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(specialtyList3);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0432");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet("");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        owner0.setTelephone("hi!");
        org.springframework.samples.petclinic.owner.Pet pet11 = owner0.getPet("", false);
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertNull(pet11);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0433");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        visit1.setDescription("");
        pet0.addVisit(visit1);
        org.springframework.samples.petclinic.owner.Pet pet5 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate6 = null;
        pet5.setBirthDate(localDate6);
        org.springframework.samples.petclinic.owner.Visit visit8 = new org.springframework.samples.petclinic.owner.Visit();
        visit8.setDescription("");
        java.time.LocalDate localDate11 = visit8.getDate();
        pet5.setBirthDate(localDate11);
        pet0.setBirthDate(localDate11);
        java.lang.Integer int14 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection15 = pet0.getVisits();
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNotNull(visitCollection15);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0434");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 10);
        java.lang.String str6 = owner0.getLastName();
        org.springframework.samples.petclinic.owner.Pet pet9 = owner0.getPet("<null>", false);
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(pet9);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0435");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 0);
        owner0.setTelephone("");
        org.springframework.samples.petclinic.owner.Pet pet10 = owner0.getPet("<null>", true);
        java.lang.String str11 = owner0.getAddress();
        java.lang.String str12 = owner0.getLastName();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList13 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet15 = owner0.getPet("<null>");
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(pet10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(petList13);
        org.junit.Assert.assertNull(pet15);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0436");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit3 = new org.springframework.samples.petclinic.owner.Visit();
        visit3.setDescription("");
        boolean boolean6 = visit3.isNew();
        pet0.addVisit(visit3);
        java.time.LocalDate localDate8 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet9 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit10 = new org.springframework.samples.petclinic.owner.Visit();
        visit10.setDescription("");
        pet9.addVisit(visit10);
        org.springframework.samples.petclinic.owner.PetType petType14 = null;
        pet9.setType(petType14);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection16 = pet9.getVisits();
        pet9.setName("");
        org.springframework.samples.petclinic.owner.PetType petType19 = new org.springframework.samples.petclinic.owner.PetType();
        pet9.setType(petType19);
        pet0.setType(petType19);
        java.time.LocalDate localDate22 = pet0.getBirthDate();
        pet0.setName("<null>");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNotNull(visitCollection16);
        org.junit.Assert.assertNull(localDate22);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0437");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList3 = owner0.getPets();
        java.lang.String str4 = owner0.getFirstName();
        owner0.setCity("hi!");
        owner0.setCity("hi!");
        java.lang.Integer int9 = owner0.getId();
        owner0.setTelephone("");
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0438");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList4 = owner0.getPets();
        owner0.setLastName("");
        java.lang.String str7 = owner0.toString();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList4);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0439");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList3 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet4 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate5 = null;
        pet4.setBirthDate(localDate5);
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet4.setType(petType7);
        java.time.LocalDate localDate9 = pet4.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit10 = new org.springframework.samples.petclinic.owner.Visit();
        pet4.addVisit(visit10);
        owner0.addPet(pet4);
        java.lang.String str13 = owner0.getTelephone();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList14 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet15 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit16 = new org.springframework.samples.petclinic.owner.Visit();
        visit16.setDescription("");
        pet15.addVisit(visit16);
        org.springframework.samples.petclinic.owner.Pet pet20 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate21 = null;
        pet20.setBirthDate(localDate21);
        org.springframework.samples.petclinic.owner.Visit visit23 = new org.springframework.samples.petclinic.owner.Visit();
        visit23.setDescription("");
        java.time.LocalDate localDate26 = visit23.getDate();
        pet20.setBirthDate(localDate26);
        pet15.setBirthDate(localDate26);
        org.springframework.samples.petclinic.owner.Visit visit29 = new org.springframework.samples.petclinic.owner.Visit();
        visit29.setDescription("");
        java.time.LocalDate localDate32 = visit29.getDate();
        pet15.setBirthDate(localDate32);
        owner0.addPet(pet15);
        java.lang.String str35 = pet15.getName();
        org.springframework.samples.petclinic.owner.Owner owner36 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet39 = owner36.getPet("hi!", false);
        org.springframework.samples.petclinic.owner.Pet pet42 = owner36.getPet("", true);
        owner36.setLastName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet45 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate46 = null;
        pet45.setBirthDate(localDate46);
        pet45.setName("");
        owner36.addPet(pet45);
        org.springframework.samples.petclinic.owner.Visit visit51 = new org.springframework.samples.petclinic.owner.Visit();
        visit51.setDescription("");
        java.time.LocalDate localDate54 = visit51.getDate();
        pet45.setBirthDate(localDate54);
        pet15.setBirthDate(localDate54);
        java.time.LocalDate localDate57 = pet15.getBirthDate();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList3);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(petList14);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(pet39);
        org.junit.Assert.assertNull(pet42);
        org.junit.Assert.assertNotNull(localDate54);
        org.junit.Assert.assertNotNull(localDate57);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0440");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        java.lang.String str9 = owner0.getTelephone();
        java.lang.String str10 = owner0.getTelephone();
        java.lang.String str11 = owner0.toString();
        java.lang.String str12 = owner0.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet15 = owner0.getPet("<null>", true);
        owner0.setAddress("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<null>" + "'", str12, "<null>");
        org.junit.Assert.assertNull(pet15);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0441");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet4 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate5 = null;
        pet4.setBirthDate(localDate5);
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet4.setType(petType7);
        java.time.LocalDate localDate9 = pet4.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection10 = pet4.getVisits();
        org.springframework.samples.petclinic.owner.Visit visit11 = new org.springframework.samples.petclinic.owner.Visit();
        visit11.setDescription("");
        java.time.LocalDate localDate14 = visit11.getDate();
        pet4.setBirthDate(localDate14);
        org.springframework.samples.petclinic.owner.Visit visit16 = new org.springframework.samples.petclinic.owner.Visit();
        visit16.setDescription("");
        java.lang.Integer int19 = visit16.getId();
        java.time.LocalDate localDate20 = visit16.getDate();
        pet4.setBirthDate(localDate20);
        pet0.setBirthDate(localDate20);
        org.springframework.samples.petclinic.owner.PetType petType23 = pet0.getType();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection24 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType25 = pet0.getType();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNotNull(visitCollection10);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNull(petType23);
        org.junit.Assert.assertNotNull(visitCollection24);
        org.junit.Assert.assertNull(petType25);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0442");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList4 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet6 = owner0.getPet("");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList7 = owner0.getPets();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList4);
        org.junit.Assert.assertNull(pet6);
        org.junit.Assert.assertNotNull(petList7);
        org.junit.Assert.assertNotNull(petList8);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0443");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 10);
        java.lang.String str6 = owner0.getFirstName();
        owner0.setLastName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet10 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate11 = null;
        pet10.setBirthDate(localDate11);
        pet10.setName("");
        pet10.setName("");
        boolean boolean17 = pet10.isNew();
        org.springframework.samples.petclinic.owner.Pet pet18 = new org.springframework.samples.petclinic.owner.Pet();
        pet18.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit21 = new org.springframework.samples.petclinic.owner.Visit();
        visit21.setDescription("");
        boolean boolean24 = visit21.isNew();
        pet18.addVisit(visit21);
        java.time.LocalDate localDate26 = pet18.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet27 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit28 = new org.springframework.samples.petclinic.owner.Visit();
        visit28.setDescription("");
        pet27.addVisit(visit28);
        org.springframework.samples.petclinic.owner.PetType petType32 = null;
        pet27.setType(petType32);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection34 = pet27.getVisits();
        pet27.setName("");
        org.springframework.samples.petclinic.owner.PetType petType37 = new org.springframework.samples.petclinic.owner.PetType();
        pet27.setType(petType37);
        pet18.setType(petType37);
        pet10.setType(petType37);
        org.springframework.samples.petclinic.owner.PetType petType41 = pet10.getType();
        org.springframework.samples.petclinic.owner.Pet pet42 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit43 = new org.springframework.samples.petclinic.owner.Visit();
        pet42.addVisit(visit43);
        org.springframework.samples.petclinic.owner.Pet pet45 = new org.springframework.samples.petclinic.owner.Pet();
        pet45.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit48 = new org.springframework.samples.petclinic.owner.Visit();
        visit48.setDescription("");
        boolean boolean51 = visit48.isNew();
        pet45.addVisit(visit48);
        java.time.LocalDate localDate53 = visit48.getDate();
        visit43.setDate(localDate53);
        java.time.LocalDate localDate55 = visit43.getDate();
        pet10.addVisit(visit43);
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 0, visit43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(localDate26);
        org.junit.Assert.assertNotNull(visitCollection34);
        org.junit.Assert.assertNotNull(petType41);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertNotNull(localDate55);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0444");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        owner0.setFirstName("hi!");
        java.lang.Integer int3 = owner0.getId();
        boolean boolean4 = owner0.isNew();
        java.lang.String str5 = owner0.getAddress();
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0445");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList3 = owner0.getPets();
        java.lang.String str4 = owner0.getFirstName();
        owner0.setCity("hi!");
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("hi!");
        org.springframework.samples.petclinic.owner.Pet pet10 = owner0.getPet((java.lang.Integer) (-1));
        org.springframework.samples.petclinic.owner.Pet pet13 = owner0.getPet("<null>", true);
        java.lang.String str14 = owner0.getAddress();
        owner0.setId((java.lang.Integer) 0);
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(pet8);
        org.junit.Assert.assertNull(pet10);
        org.junit.Assert.assertNull(pet13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0446");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        java.lang.String str9 = owner0.getTelephone();
        java.lang.String str10 = owner0.getTelephone();
        java.lang.String str11 = owner0.toString();
        java.lang.String str12 = owner0.getTelephone();
        java.lang.String str13 = owner0.getFirstName();
        owner0.setLastName("hi!");
        org.springframework.samples.petclinic.owner.Pet pet18 = owner0.getPet("hi!", false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<null>" + "'", str12, "<null>");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(pet18);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0447");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        java.lang.String str4 = owner0.getCity();
        java.lang.String str5 = owner0.getLastName();
        owner0.setFirstName("");
        java.lang.String str8 = owner0.getCity();
        owner0.setTelephone("");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList11 = owner0.getPets();
        owner0.setTelephone("<null>");
        org.springframework.samples.petclinic.owner.Pet pet14 = new org.springframework.samples.petclinic.owner.Pet();
        pet14.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit17 = new org.springframework.samples.petclinic.owner.Visit();
        visit17.setDescription("");
        boolean boolean20 = visit17.isNew();
        pet14.addVisit(visit17);
        java.time.LocalDate localDate22 = pet14.getBirthDate();
        owner0.addPet(pet14);
        owner0.setTelephone("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(petList11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(localDate22);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0448");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet3 = owner0.getPet("hi!", false);
        owner0.setTelephone("<null>");
        org.junit.Assert.assertNull(pet3);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0449");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet3 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit4 = new org.springframework.samples.petclinic.owner.Visit();
        visit4.setDescription("");
        pet3.addVisit(visit4);
        org.springframework.samples.petclinic.owner.PetType petType8 = null;
        pet3.setType(petType8);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection10 = pet3.getVisits();
        pet3.setName("");
        org.springframework.samples.petclinic.owner.PetType petType13 = new org.springframework.samples.petclinic.owner.PetType();
        pet3.setType(petType13);
        pet0.setType(petType13);
        pet0.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet18 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit19 = new org.springframework.samples.petclinic.owner.Visit();
        visit19.setDescription("");
        pet18.addVisit(visit19);
        org.springframework.samples.petclinic.owner.Pet pet23 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate24 = null;
        pet23.setBirthDate(localDate24);
        org.springframework.samples.petclinic.owner.Visit visit26 = new org.springframework.samples.petclinic.owner.Visit();
        visit26.setDescription("");
        java.time.LocalDate localDate29 = visit26.getDate();
        pet23.setBirthDate(localDate29);
        pet18.setBirthDate(localDate29);
        boolean boolean32 = pet18.isNew();
        java.lang.String str33 = pet18.getName();
        org.springframework.samples.petclinic.owner.PetType petType34 = pet18.getType();
        org.springframework.samples.petclinic.owner.Visit visit35 = new org.springframework.samples.petclinic.owner.Visit();
        visit35.setDescription("");
        java.time.LocalDate localDate38 = visit35.getDate();
        visit35.setDescription("");
        pet18.addVisit(visit35);
        pet0.addVisit(visit35);
        java.lang.Integer int43 = visit35.getId();
        org.junit.Assert.assertNotNull(visitCollection10);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(petType34);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNull(int43);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0450");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        visit1.setDescription("");
        pet0.addVisit(visit1);
        org.springframework.samples.petclinic.owner.PetType petType5 = null;
        pet0.setType(petType5);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType10 = pet0.getType();
        org.springframework.samples.petclinic.owner.Pet pet11 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate12 = null;
        pet11.setBirthDate(localDate12);
        org.springframework.samples.petclinic.owner.PetType petType14 = null;
        pet11.setType(petType14);
        java.time.LocalDate localDate16 = pet11.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection17 = pet11.getVisits();
        org.springframework.samples.petclinic.owner.Visit visit18 = new org.springframework.samples.petclinic.owner.Visit();
        visit18.setDescription("");
        java.time.LocalDate localDate21 = visit18.getDate();
        pet11.setBirthDate(localDate21);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection23 = pet11.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType24 = new org.springframework.samples.petclinic.owner.PetType();
        petType24.setName("");
        pet11.setType(petType24);
        pet0.setType(petType24);
        petType24.setName("hi!");
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertNull(petType10);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNotNull(visitCollection17);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(visitCollection23);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0451");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        owner0.setCity("hi!");
        org.springframework.samples.petclinic.owner.Pet pet7 = owner0.getPet((java.lang.Integer) 100);
        owner0.setTelephone("hi!");
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet7);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0452");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 10);
        java.lang.String str6 = owner0.getFirstName();
        java.lang.String str7 = owner0.getCity();
        org.springframework.samples.petclinic.owner.Pet pet9 = owner0.getPet("");
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(pet9);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0453");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList4 = owner0.getPets();
        java.lang.String str5 = owner0.getTelephone();
        java.lang.String str6 = owner0.getFirstName();
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = pet8.isNew();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(pet8);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0454");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 10);
        java.lang.String str6 = owner0.getLastName();
        owner0.setCity("");
        boolean boolean9 = owner0.isNew();
        org.springframework.samples.petclinic.owner.Pet pet11 = new org.springframework.samples.petclinic.owner.Pet();
        pet11.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet14 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit15 = new org.springframework.samples.petclinic.owner.Visit();
        visit15.setDescription("");
        pet14.addVisit(visit15);
        org.springframework.samples.petclinic.owner.PetType petType19 = null;
        pet14.setType(petType19);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection21 = pet14.getVisits();
        pet14.setName("");
        org.springframework.samples.petclinic.owner.PetType petType24 = new org.springframework.samples.petclinic.owner.PetType();
        pet14.setType(petType24);
        pet11.setType(petType24);
        org.springframework.samples.petclinic.owner.Pet pet27 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate28 = null;
        pet27.setBirthDate(localDate28);
        java.time.LocalDate localDate30 = pet27.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit31 = new org.springframework.samples.petclinic.owner.Visit();
        visit31.setDescription("");
        java.time.LocalDate localDate34 = visit31.getDate();
        visit31.setDescription("");
        pet27.addVisit(visit31);
        pet11.addVisit(visit31);
        java.lang.String str39 = visit31.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 1, visit31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(visitCollection21);
        org.junit.Assert.assertNull(localDate30);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0455");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet4 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate5 = null;
        pet4.setBirthDate(localDate5);
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet4.setType(petType7);
        java.time.LocalDate localDate9 = pet4.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection10 = pet4.getVisits();
        org.springframework.samples.petclinic.owner.Visit visit11 = new org.springframework.samples.petclinic.owner.Visit();
        visit11.setDescription("");
        java.time.LocalDate localDate14 = visit11.getDate();
        pet4.setBirthDate(localDate14);
        org.springframework.samples.petclinic.owner.Visit visit16 = new org.springframework.samples.petclinic.owner.Visit();
        visit16.setDescription("");
        java.lang.Integer int19 = visit16.getId();
        java.time.LocalDate localDate20 = visit16.getDate();
        pet4.setBirthDate(localDate20);
        pet0.setBirthDate(localDate20);
        org.springframework.samples.petclinic.owner.PetType petType23 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = petType23.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNotNull(visitCollection10);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNull(petType23);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0456");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList7 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet9 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str10 = owner0.toString();
        owner0.setCity("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertNotNull(petList7);
        org.junit.Assert.assertNull(pet9);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0457");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList7 = owner0.getPets();
        owner0.setTelephone("<null>");
        java.lang.String str10 = owner0.getAddress();
        java.lang.String str11 = owner0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertNotNull(petList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0458");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        visit1.setDescription("");
        pet0.addVisit(visit1);
        org.springframework.samples.petclinic.owner.PetType petType5 = null;
        pet0.setType(petType5);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType10 = new org.springframework.samples.petclinic.owner.PetType();
        pet0.setType(petType10);
        java.time.LocalDate localDate12 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection13 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType14 = pet0.getType();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection15 = pet0.getVisits();
        java.time.LocalDate localDate16 = pet0.getBirthDate();
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNotNull(visitCollection13);
        org.junit.Assert.assertNotNull(petType14);
        org.junit.Assert.assertNotNull(visitCollection15);
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0459");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList3 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet6 = owner0.getPet("<null>", true);
        owner0.setTelephone("hi!");
        org.springframework.samples.petclinic.owner.Pet pet11 = owner0.getPet("<null>", true);
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList3);
        org.junit.Assert.assertNull(pet6);
        org.junit.Assert.assertNull(pet11);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0460");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        visit1.setDescription("");
        pet0.addVisit(visit1);
        org.springframework.samples.petclinic.owner.PetType petType5 = new org.springframework.samples.petclinic.owner.PetType();
        pet0.setType(petType5);
        java.lang.String str7 = pet0.getName();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection8 = pet0.getVisits();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(visitCollection8);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0461");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        pet0.addVisit(visit1);
        org.springframework.samples.petclinic.owner.Pet pet3 = new org.springframework.samples.petclinic.owner.Pet();
        pet3.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit6 = new org.springframework.samples.petclinic.owner.Visit();
        visit6.setDescription("");
        boolean boolean9 = visit6.isNew();
        pet3.addVisit(visit6);
        java.time.LocalDate localDate11 = visit6.getDate();
        visit1.setDate(localDate11);
        visit1.setDescription("");
        org.springframework.samples.petclinic.owner.Pet pet15 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit16 = new org.springframework.samples.petclinic.owner.Visit();
        pet15.addVisit(visit16);
        org.springframework.samples.petclinic.owner.Pet pet18 = new org.springframework.samples.petclinic.owner.Pet();
        pet18.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit21 = new org.springframework.samples.petclinic.owner.Visit();
        visit21.setDescription("");
        boolean boolean24 = visit21.isNew();
        pet18.addVisit(visit21);
        java.time.LocalDate localDate26 = visit21.getDate();
        visit16.setDate(localDate26);
        java.time.LocalDate localDate28 = visit16.getDate();
        visit1.setDate(localDate28);
        java.lang.Integer int30 = visit1.getId();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNull(int30);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0462");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList4 = owner0.getPets();
        owner0.setLastName("<null>");
        owner0.setCity("hi!");
        java.lang.String str9 = owner0.getTelephone();
        java.lang.Integer int10 = owner0.getId();
        owner0.setLastName("");
        org.springframework.samples.petclinic.owner.Pet pet15 = owner0.getPet("", false);
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(pet15);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0463");
        org.springframework.samples.petclinic.model.NamedEntity namedEntity0 = new org.springframework.samples.petclinic.model.NamedEntity();
        namedEntity0.setId((java.lang.Integer) 10);
        namedEntity0.setName("<null>");
        namedEntity0.setId((java.lang.Integer) 3);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0464");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList7 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet9 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str10 = owner0.toString();
        owner0.setTelephone("<null>");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertNotNull(petList7);
        org.junit.Assert.assertNull(pet9);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0465");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList1 = vet0.getSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList2 = vet0.getSpecialties();
        boolean boolean3 = vet0.isNew();
        boolean boolean4 = vet0.isNew();
        org.junit.Assert.assertNotNull(specialtyList1);
        org.junit.Assert.assertNotNull(specialtyList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0466");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        owner0.setCity("hi!");
        java.lang.String str6 = owner0.getTelephone();
        owner0.setCity("hi!");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList9 = owner0.getPets();
        boolean boolean10 = owner0.isNew();
        org.springframework.samples.petclinic.owner.Pet pet13 = owner0.getPet("", true);
        org.springframework.samples.petclinic.owner.Pet pet16 = owner0.getPet("<null>", false);
        org.springframework.samples.petclinic.owner.Pet pet17 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit18 = new org.springframework.samples.petclinic.owner.Visit();
        visit18.setDescription("");
        pet17.addVisit(visit18);
        org.springframework.samples.petclinic.owner.PetType petType22 = null;
        pet17.setType(petType22);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection24 = pet17.getVisits();
        pet17.setName("");
        org.springframework.samples.petclinic.owner.PetType petType27 = pet17.getType();
        org.springframework.samples.petclinic.owner.PetType petType28 = new org.springframework.samples.petclinic.owner.PetType();
        petType28.setName("hi!");
        pet17.setType(petType28);
        owner0.addPet(pet17);
        java.lang.String str33 = pet17.toString();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(petList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(pet13);
        org.junit.Assert.assertNull(pet16);
        org.junit.Assert.assertNotNull(visitCollection24);
        org.junit.Assert.assertNull(petType27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0467");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        visit1.setDescription("");
        pet0.addVisit(visit1);
        org.springframework.samples.petclinic.owner.PetType petType5 = null;
        pet0.setType(petType5);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType10 = pet0.getType();
        java.time.LocalDate localDate11 = pet0.getBirthDate();
        java.time.LocalDate localDate12 = pet0.getBirthDate();
        java.time.LocalDate localDate13 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet14 = new org.springframework.samples.petclinic.owner.Pet();
        pet14.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit17 = new org.springframework.samples.petclinic.owner.Visit();
        visit17.setDescription("");
        boolean boolean20 = visit17.isNew();
        pet14.addVisit(visit17);
        java.time.LocalDate localDate22 = visit17.getDate();
        org.springframework.samples.petclinic.owner.Visit visit23 = new org.springframework.samples.petclinic.owner.Visit();
        visit23.setDescription("");
        java.lang.Integer int26 = visit23.getId();
        java.time.LocalDate localDate27 = visit23.getDate();
        org.springframework.samples.petclinic.owner.Visit visit28 = new org.springframework.samples.petclinic.owner.Visit();
        visit28.setDescription("");
        java.time.LocalDate localDate31 = visit28.getDate();
        java.time.LocalDate localDate32 = visit28.getDate();
        visit23.setDate(localDate32);
        visit17.setDate(localDate32);
        pet0.addVisit(visit17);
        boolean boolean36 = visit17.isNew();
        java.lang.String str37 = visit17.getDescription();
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertNull(petType10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNull(int26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0468");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        owner0.setCity("hi!");
        org.springframework.samples.petclinic.owner.Pet pet10 = owner0.getPet("<null>");
        owner0.setLastName("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertNull(pet10);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0469");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList3 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet6 = owner0.getPet("<null>", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = pet6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList3);
        org.junit.Assert.assertNull(pet6);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0470");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList1 = vet0.getSpecialties();
        int int2 = vet0.getNrOfSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList3 = vet0.getSpecialties();
        vet0.setFirstName("");
        int int6 = vet0.getNrOfSpecialties();
        vet0.setFirstName("");
        org.junit.Assert.assertNotNull(specialtyList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(specialtyList3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0471");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        owner0.setTelephone("<null>");
        owner0.setTelephone("<null>");
        org.springframework.samples.petclinic.owner.Pet pet13 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit14 = new org.springframework.samples.petclinic.owner.Visit();
        visit14.setDescription("");
        pet13.addVisit(visit14);
        org.springframework.samples.petclinic.owner.PetType petType18 = null;
        pet13.setType(petType18);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection20 = pet13.getVisits();
        pet13.setName("");
        org.springframework.samples.petclinic.owner.PetType petType23 = pet13.getType();
        org.springframework.samples.petclinic.owner.PetType petType24 = new org.springframework.samples.petclinic.owner.PetType();
        petType24.setName("hi!");
        pet13.setType(petType24);
        org.springframework.samples.petclinic.owner.PetType petType28 = pet13.getType();
        java.lang.String str29 = pet13.toString();
        owner0.addPet(pet13);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertNotNull(visitCollection20);
        org.junit.Assert.assertNull(petType23);
        org.junit.Assert.assertNotNull(petType28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0472");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("hi!");
        org.springframework.samples.petclinic.owner.Pet pet9 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate10 = null;
        pet9.setBirthDate(localDate10);
        org.springframework.samples.petclinic.owner.Visit visit12 = new org.springframework.samples.petclinic.owner.Visit();
        visit12.setDescription("");
        java.time.LocalDate localDate15 = visit12.getDate();
        pet9.setBirthDate(localDate15);
        owner0.addPet(pet9);
        org.springframework.samples.petclinic.owner.Pet pet18 = new org.springframework.samples.petclinic.owner.Pet();
        pet18.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet21 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit22 = new org.springframework.samples.petclinic.owner.Visit();
        visit22.setDescription("");
        pet21.addVisit(visit22);
        org.springframework.samples.petclinic.owner.PetType petType26 = null;
        pet21.setType(petType26);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection28 = pet21.getVisits();
        pet21.setName("");
        org.springframework.samples.petclinic.owner.PetType petType31 = new org.springframework.samples.petclinic.owner.PetType();
        pet21.setType(petType31);
        pet18.setType(petType31);
        pet9.setType(petType31);
        pet9.setName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertNull(pet8);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(visitCollection28);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0473");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.lang.String str8 = owner0.getFirstName();
        java.lang.String str9 = owner0.getCity();
        java.lang.String str10 = owner0.getAddress();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0474");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        int int1 = vet0.getNrOfSpecialties();
        int int2 = vet0.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Specialty specialty3 = new org.springframework.samples.petclinic.vet.Specialty();
        specialty3.setId((java.lang.Integer) 100);
        vet0.addSpecialty(specialty3);
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList7 = vet0.getSpecialties();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(specialtyList7);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0475");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet3 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit4 = new org.springframework.samples.petclinic.owner.Visit();
        visit4.setDescription("");
        pet3.addVisit(visit4);
        org.springframework.samples.petclinic.owner.PetType petType8 = null;
        pet3.setType(petType8);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection10 = pet3.getVisits();
        pet3.setName("");
        org.springframework.samples.petclinic.owner.PetType petType13 = new org.springframework.samples.petclinic.owner.PetType();
        pet3.setType(petType13);
        pet0.setType(petType13);
        pet0.setName("<null>");
        java.lang.String str18 = pet0.getName();
        org.junit.Assert.assertNotNull(visitCollection10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<null>" + "'", str18, "<null>");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0476");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList7 = owner0.getPets();
        owner0.setTelephone("<null>");
        java.lang.String str10 = owner0.getAddress();
        java.lang.String str11 = owner0.getAddress();
        org.springframework.samples.petclinic.owner.Pet pet14 = owner0.getPet("<null>", false);
        java.lang.Integer int15 = owner0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertNotNull(petList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<null>" + "'", str11, "<null>");
        org.junit.Assert.assertNull(pet14);
        org.junit.Assert.assertNull(int15);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0477");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        visit1.setDescription("");
        pet0.addVisit(visit1);
        org.springframework.samples.petclinic.owner.Pet pet5 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate6 = null;
        pet5.setBirthDate(localDate6);
        org.springframework.samples.petclinic.owner.Visit visit8 = new org.springframework.samples.petclinic.owner.Visit();
        visit8.setDescription("");
        java.time.LocalDate localDate11 = visit8.getDate();
        pet5.setBirthDate(localDate11);
        pet0.setBirthDate(localDate11);
        org.springframework.samples.petclinic.owner.Visit visit14 = new org.springframework.samples.petclinic.owner.Visit();
        visit14.setDescription("");
        java.time.LocalDate localDate17 = visit14.getDate();
        pet0.setBirthDate(localDate17);
        org.springframework.samples.petclinic.owner.Pet pet19 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit20 = new org.springframework.samples.petclinic.owner.Visit();
        visit20.setDescription("");
        pet19.addVisit(visit20);
        org.springframework.samples.petclinic.owner.Pet pet24 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate25 = null;
        pet24.setBirthDate(localDate25);
        org.springframework.samples.petclinic.owner.Visit visit27 = new org.springframework.samples.petclinic.owner.Visit();
        visit27.setDescription("");
        java.time.LocalDate localDate30 = visit27.getDate();
        pet24.setBirthDate(localDate30);
        pet19.setBirthDate(localDate30);
        org.springframework.samples.petclinic.owner.Visit visit33 = new org.springframework.samples.petclinic.owner.Visit();
        visit33.setDescription("");
        java.time.LocalDate localDate36 = visit33.getDate();
        pet19.setBirthDate(localDate36);
        pet0.setBirthDate(localDate36);
        pet0.setName("<null>");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(localDate36);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0478");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        visit1.setDescription("");
        pet0.addVisit(visit1);
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        org.junit.Assert.assertNull(petType5);
        org.junit.Assert.assertNotNull(visitCollection6);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0479");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        owner0.setCity("hi!");
        owner0.setTelephone("hi!");
        owner0.setTelephone("hi!");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList10 = owner0.getPets();
        java.lang.String str11 = owner0.getFirstName();
        org.springframework.samples.petclinic.owner.Pet pet13 = owner0.getPet("");
        org.springframework.samples.petclinic.owner.Owner owner14 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str15 = owner14.getAddress();
        owner14.setLastName("hi!");
        owner14.setAddress("<null>");
        owner14.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList22 = owner14.getPets();
        java.lang.String str23 = owner14.getTelephone();
        java.lang.String str24 = owner14.getTelephone();
        java.lang.String str25 = owner14.toString();
        org.springframework.samples.petclinic.owner.Pet pet26 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit27 = new org.springframework.samples.petclinic.owner.Visit();
        visit27.setDescription("");
        pet26.addVisit(visit27);
        org.springframework.samples.petclinic.owner.Pet pet31 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate32 = null;
        pet31.setBirthDate(localDate32);
        org.springframework.samples.petclinic.owner.Visit visit34 = new org.springframework.samples.petclinic.owner.Visit();
        visit34.setDescription("");
        java.time.LocalDate localDate37 = visit34.getDate();
        pet31.setBirthDate(localDate37);
        pet26.setBirthDate(localDate37);
        boolean boolean40 = pet26.isNew();
        owner14.addPet(pet26);
        java.time.LocalDate localDate42 = pet26.getBirthDate();
        owner0.addPet(pet26);
        org.springframework.samples.petclinic.owner.Pet pet44 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit45 = new org.springframework.samples.petclinic.owner.Visit();
        visit45.setDescription("");
        pet44.addVisit(visit45);
        org.springframework.samples.petclinic.owner.PetType petType49 = null;
        pet44.setType(petType49);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection51 = pet44.getVisits();
        pet44.setName("");
        org.springframework.samples.petclinic.owner.PetType petType54 = new org.springframework.samples.petclinic.owner.PetType();
        pet44.setType(petType54);
        pet26.setType(petType54);
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(pet13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(petList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<null>" + "'", str23, "<null>");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<null>" + "'", str24, "<null>");
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(visitCollection51);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0480");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setId((java.lang.Integer) (-1));
        java.lang.String str6 = owner0.getFirstName();
        java.lang.String str7 = owner0.toString();
        owner0.setId((java.lang.Integer) 100);
        org.springframework.samples.petclinic.owner.Pet pet11 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit12 = new org.springframework.samples.petclinic.owner.Visit();
        pet11.addVisit(visit12);
        org.springframework.samples.petclinic.owner.Pet pet14 = new org.springframework.samples.petclinic.owner.Pet();
        pet14.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit17 = new org.springframework.samples.petclinic.owner.Visit();
        visit17.setDescription("");
        boolean boolean20 = visit17.isNew();
        pet14.addVisit(visit17);
        java.time.LocalDate localDate22 = visit17.getDate();
        visit12.setDate(localDate22);
        visit12.setDescription("");
        visit12.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            owner0.addVisit((java.lang.Integer) 100, visit12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Pet identifier!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(localDate22);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0481");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList8 = owner0.getPets();
        java.lang.String str9 = owner0.getTelephone();
        java.lang.String str10 = owner0.getTelephone();
        java.lang.String str11 = owner0.toString();
        java.lang.String str12 = owner0.getCity();
        org.springframework.samples.petclinic.owner.Pet pet15 = owner0.getPet("", false);
        boolean boolean16 = owner0.isNew();
        owner0.setAddress("<null>");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(pet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0482");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        owner0.setCity("hi!");
        owner0.setTelephone("hi!");
        owner0.setTelephone("hi!");
        org.springframework.samples.petclinic.owner.Pet pet10 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate11 = null;
        pet10.setBirthDate(localDate11);
        pet10.setName("");
        org.springframework.samples.petclinic.owner.Pet pet15 = new org.springframework.samples.petclinic.owner.Pet();
        pet15.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit18 = new org.springframework.samples.petclinic.owner.Visit();
        visit18.setDescription("");
        boolean boolean21 = visit18.isNew();
        pet15.addVisit(visit18);
        pet10.addVisit(visit18);
        java.lang.String str24 = pet10.getName();
        owner0.addPet(pet10);
        org.springframework.samples.petclinic.owner.Pet pet26 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit27 = new org.springframework.samples.petclinic.owner.Visit();
        pet26.addVisit(visit27);
        java.time.LocalDate localDate29 = pet26.getBirthDate();
        owner0.addPet(pet26);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection31 = pet26.getVisits();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(localDate29);
        org.junit.Assert.assertNotNull(visitCollection31);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0483");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        java.lang.String str4 = owner0.getTelephone();
        org.springframework.samples.petclinic.owner.Pet pet6 = owner0.getPet("hi!");
        java.lang.String str7 = owner0.getCity();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(pet6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0484");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet("");
        owner0.setLastName("");
        java.lang.String str8 = owner0.toString();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0485");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        org.springframework.samples.petclinic.owner.Pet pet6 = owner0.getPet("hi!", false);
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("");
        java.lang.String str9 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setLastName("<null>");
        owner0.setAddress("<null>");
        java.lang.String str16 = owner0.getCity();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(pet6);
        org.junit.Assert.assertNull(pet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0486");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList6 = owner0.getPets();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList7 = owner0.getPets();
        owner0.setTelephone("<null>");
        java.lang.String str10 = owner0.getCity();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(petList6);
        org.junit.Assert.assertNotNull(petList7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0487");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        owner0.setCity("hi!");
        owner0.setCity("hi!");
        java.lang.String str8 = owner0.getFirstName();
        java.lang.String str9 = owner0.getCity();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0488");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        owner0.setTelephone("<null>");
        java.lang.String str8 = owner0.getFirstName();
        java.lang.String str9 = owner0.getAddress();
        java.lang.String str10 = owner0.getFirstName();
        owner0.setAddress("<null>");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0489");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        visit1.setDescription("");
        pet0.addVisit(visit1);
        org.springframework.samples.petclinic.owner.Visit visit5 = new org.springframework.samples.petclinic.owner.Visit();
        visit5.setDescription("");
        java.lang.Integer int8 = visit5.getId();
        pet0.addVisit(visit5);
        java.time.LocalDate localDate10 = pet0.getBirthDate();
        java.time.LocalDate localDate11 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet12 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate13 = null;
        pet12.setBirthDate(localDate13);
        org.springframework.samples.petclinic.owner.PetType petType15 = null;
        pet12.setType(petType15);
        java.time.LocalDate localDate17 = pet12.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection18 = pet12.getVisits();
        org.springframework.samples.petclinic.owner.Visit visit19 = new org.springframework.samples.petclinic.owner.Visit();
        visit19.setDescription("");
        java.time.LocalDate localDate22 = visit19.getDate();
        pet12.setBirthDate(localDate22);
        org.springframework.samples.petclinic.owner.Visit visit24 = new org.springframework.samples.petclinic.owner.Visit();
        visit24.setDescription("");
        java.lang.Integer int27 = visit24.getId();
        java.time.LocalDate localDate28 = visit24.getDate();
        pet12.setBirthDate(localDate28);
        pet0.setBirthDate(localDate28);
        pet0.setName("<null>");
        java.lang.Integer int33 = pet0.getId();
        org.springframework.samples.petclinic.owner.Owner owner34 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet36 = owner34.getPet((java.lang.Integer) 0);
        java.lang.String str37 = owner34.toString();
        org.springframework.samples.petclinic.owner.Pet pet38 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit39 = new org.springframework.samples.petclinic.owner.Visit();
        visit39.setDescription("");
        pet38.addVisit(visit39);
        org.springframework.samples.petclinic.owner.Pet pet43 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate44 = null;
        pet43.setBirthDate(localDate44);
        org.springframework.samples.petclinic.owner.Visit visit46 = new org.springframework.samples.petclinic.owner.Visit();
        visit46.setDescription("");
        java.time.LocalDate localDate49 = visit46.getDate();
        pet43.setBirthDate(localDate49);
        pet38.setBirthDate(localDate49);
        boolean boolean52 = pet38.isNew();
        java.lang.String str53 = pet38.getName();
        org.springframework.samples.petclinic.owner.PetType petType54 = pet38.getType();
        org.springframework.samples.petclinic.owner.Visit visit55 = new org.springframework.samples.petclinic.owner.Visit();
        visit55.setDescription("");
        java.time.LocalDate localDate58 = visit55.getDate();
        visit55.setDescription("");
        pet38.addVisit(visit55);
        java.lang.String str62 = pet38.getName();
        owner34.addPet(pet38);
        org.springframework.samples.petclinic.owner.Pet pet64 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit65 = new org.springframework.samples.petclinic.owner.Visit();
        pet64.addVisit(visit65);
        org.springframework.samples.petclinic.owner.Pet pet67 = new org.springframework.samples.petclinic.owner.Pet();
        pet67.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit70 = new org.springframework.samples.petclinic.owner.Visit();
        visit70.setDescription("");
        boolean boolean73 = visit70.isNew();
        pet67.addVisit(visit70);
        java.time.LocalDate localDate75 = visit70.getDate();
        visit65.setDate(localDate75);
        java.lang.String str77 = visit65.getDescription();
        pet38.addVisit(visit65);
        pet0.addVisit(visit65);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNotNull(visitCollection18);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNull(int27);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNull(int33);
        org.junit.Assert.assertNull(pet36);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(petType54);
        org.junit.Assert.assertNotNull(localDate58);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(localDate75);
        org.junit.Assert.assertNull(str77);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0490");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList4 = owner0.getPets();
        java.lang.String str5 = owner0.getAddress();
        owner0.setTelephone("");
        boolean boolean8 = owner0.isNew();
        org.springframework.samples.petclinic.owner.Pet pet10 = owner0.getPet((java.lang.Integer) 3);
        java.lang.String str11 = owner0.getAddress();
        java.lang.String str12 = owner0.toString();
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(pet10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0491");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        java.lang.String str1 = owner0.getAddress();
        owner0.setLastName("hi!");
        owner0.setAddress("<null>");
        org.springframework.samples.petclinic.owner.Pet pet6 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit7 = new org.springframework.samples.petclinic.owner.Visit();
        visit7.setDescription("");
        pet6.addVisit(visit7);
        org.springframework.samples.petclinic.owner.Visit visit11 = new org.springframework.samples.petclinic.owner.Visit();
        visit11.setDescription("");
        java.lang.Integer int14 = visit11.getId();
        pet6.addVisit(visit11);
        owner0.addPet(pet6);
        org.springframework.samples.petclinic.owner.Pet pet17 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate18 = null;
        pet17.setBirthDate(localDate18);
        java.time.LocalDate localDate20 = pet17.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit21 = new org.springframework.samples.petclinic.owner.Visit();
        visit21.setDescription("");
        java.time.LocalDate localDate24 = visit21.getDate();
        visit21.setDescription("");
        pet17.addVisit(visit21);
        org.springframework.samples.petclinic.owner.Pet pet28 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit29 = new org.springframework.samples.petclinic.owner.Visit();
        visit29.setDescription("");
        pet28.addVisit(visit29);
        visit29.setDescription("");
        java.time.LocalDate localDate35 = visit29.getDate();
        visit21.setDate(localDate35);
        pet6.addVisit(visit21);
        visit21.setDescription("<null>");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate35);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0492");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty1 = new org.springframework.samples.petclinic.vet.Specialty();
        specialty1.setId((java.lang.Integer) 100);
        vet0.addSpecialty(specialty1);
        org.springframework.samples.petclinic.vet.Vet vet5 = new org.springframework.samples.petclinic.vet.Vet();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList6 = vet5.getSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList7 = vet5.getSpecialties();
        java.lang.String str8 = vet5.getLastName();
        org.springframework.samples.petclinic.vet.Specialty specialty9 = new org.springframework.samples.petclinic.vet.Specialty();
        specialty9.setId((java.lang.Integer) 100);
        vet5.addSpecialty(specialty9);
        vet0.addSpecialty(specialty9);
        java.lang.String str14 = vet0.getLastName();
        org.springframework.samples.petclinic.vet.Vet vet15 = new org.springframework.samples.petclinic.vet.Vet();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList16 = vet15.getSpecialties();
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList17 = vet15.getSpecialties();
        vet15.setFirstName("<null>");
        int int20 = vet15.getNrOfSpecialties();
        org.springframework.samples.petclinic.vet.Vet vet21 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty22 = new org.springframework.samples.petclinic.vet.Specialty();
        vet21.addSpecialty(specialty22);
        vet15.addSpecialty(specialty22);
        vet0.addSpecialty(specialty22);
        java.lang.Integer int26 = vet0.getId();
        org.junit.Assert.assertNotNull(specialtyList6);
        org.junit.Assert.assertNotNull(specialtyList7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(specialtyList16);
        org.junit.Assert.assertNotNull(specialtyList17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(int26);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0493");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = new org.springframework.samples.petclinic.owner.Visit();
        visit1.setDescription("");
        pet0.addVisit(visit1);
        org.springframework.samples.petclinic.owner.PetType petType5 = null;
        pet0.setType(petType5);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType10 = pet0.getType();
        java.time.LocalDate localDate11 = pet0.getBirthDate();
        java.time.LocalDate localDate12 = pet0.getBirthDate();
        java.time.LocalDate localDate13 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Pet pet14 = new org.springframework.samples.petclinic.owner.Pet();
        pet14.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit17 = new org.springframework.samples.petclinic.owner.Visit();
        visit17.setDescription("");
        boolean boolean20 = visit17.isNew();
        pet14.addVisit(visit17);
        java.time.LocalDate localDate22 = visit17.getDate();
        org.springframework.samples.petclinic.owner.Visit visit23 = new org.springframework.samples.petclinic.owner.Visit();
        visit23.setDescription("");
        java.lang.Integer int26 = visit23.getId();
        java.time.LocalDate localDate27 = visit23.getDate();
        org.springframework.samples.petclinic.owner.Visit visit28 = new org.springframework.samples.petclinic.owner.Visit();
        visit28.setDescription("");
        java.time.LocalDate localDate31 = visit28.getDate();
        java.time.LocalDate localDate32 = visit28.getDate();
        visit23.setDate(localDate32);
        visit17.setDate(localDate32);
        pet0.addVisit(visit17);
        visit17.setDescription("hi!");
        org.springframework.samples.petclinic.owner.Pet pet38 = new org.springframework.samples.petclinic.owner.Pet();
        pet38.setName("<null>");
        org.springframework.samples.petclinic.owner.Pet pet41 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit42 = new org.springframework.samples.petclinic.owner.Visit();
        visit42.setDescription("");
        pet41.addVisit(visit42);
        org.springframework.samples.petclinic.owner.PetType petType46 = null;
        pet41.setType(petType46);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection48 = pet41.getVisits();
        pet41.setName("");
        org.springframework.samples.petclinic.owner.PetType petType51 = new org.springframework.samples.petclinic.owner.PetType();
        pet41.setType(petType51);
        pet38.setType(petType51);
        org.springframework.samples.petclinic.owner.Pet pet54 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate55 = null;
        pet54.setBirthDate(localDate55);
        java.time.LocalDate localDate57 = pet54.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit58 = new org.springframework.samples.petclinic.owner.Visit();
        visit58.setDescription("");
        java.time.LocalDate localDate61 = visit58.getDate();
        visit58.setDescription("");
        pet54.addVisit(visit58);
        pet38.addVisit(visit58);
        java.lang.String str66 = visit58.getDescription();
        visit58.setDescription("hi!");
        java.time.LocalDate localDate69 = visit58.getDate();
        visit17.setDate(localDate69);
        java.time.LocalDate localDate71 = visit17.getDate();
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertNull(petType10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNull(int26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(visitCollection48);
        org.junit.Assert.assertNull(localDate57);
        org.junit.Assert.assertNotNull(localDate61);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(localDate69);
        org.junit.Assert.assertNotNull(localDate71);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0494");
        org.springframework.samples.petclinic.model.NamedEntity namedEntity0 = new org.springframework.samples.petclinic.model.NamedEntity();
        namedEntity0.setId((java.lang.Integer) 10);
        boolean boolean3 = namedEntity0.isNew();
        java.lang.String str4 = namedEntity0.toString();
        java.lang.String str5 = namedEntity0.getName();
        java.lang.String str6 = namedEntity0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<null>" + "'", str4, "<null>");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<null>" + "'", str6, "<null>");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0495");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("<null>");
        org.springframework.samples.petclinic.owner.Visit visit3 = new org.springframework.samples.petclinic.owner.Visit();
        visit3.setDescription("");
        boolean boolean6 = visit3.isNew();
        pet0.addVisit(visit3);
        java.lang.String str8 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType9 = pet0.getType();
        java.lang.String str10 = pet0.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<null>" + "'", str8, "<null>");
        org.junit.Assert.assertNull(petType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<null>" + "'", str10, "<null>");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0496");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType6 = pet0.getType();
        pet0.setName("<null>");
        java.lang.String str9 = pet0.getName();
        org.springframework.samples.petclinic.owner.Visit visit10 = new org.springframework.samples.petclinic.owner.Visit();
        visit10.setDescription("");
        java.lang.Integer int13 = visit10.getId();
        boolean boolean14 = visit10.isNew();
        pet0.addVisit(visit10);
        java.lang.String str16 = visit10.getDescription();
        org.springframework.samples.petclinic.owner.Pet pet17 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate18 = null;
        pet17.setBirthDate(localDate18);
        org.springframework.samples.petclinic.owner.PetType petType20 = null;
        pet17.setType(petType20);
        java.time.LocalDate localDate22 = pet17.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit23 = new org.springframework.samples.petclinic.owner.Visit();
        visit23.setDescription("");
        java.lang.Integer int26 = visit23.getId();
        java.time.LocalDate localDate27 = visit23.getDate();
        pet17.setBirthDate(localDate27);
        org.springframework.samples.petclinic.owner.Pet pet29 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate30 = null;
        pet29.setBirthDate(localDate30);
        org.springframework.samples.petclinic.owner.Visit visit32 = new org.springframework.samples.petclinic.owner.Visit();
        visit32.setDescription("");
        java.time.LocalDate localDate35 = visit32.getDate();
        pet29.setBirthDate(localDate35);
        java.lang.String str37 = pet29.getName();
        java.time.LocalDate localDate38 = pet29.getBirthDate();
        pet17.setBirthDate(localDate38);
        visit10.setDate(localDate38);
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNull(petType6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<null>" + "'", str9, "<null>");
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(localDate22);
        org.junit.Assert.assertNull(int26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(localDate38);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0497");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        java.util.List<org.springframework.samples.petclinic.owner.Pet> petList4 = owner0.getPets();
        java.lang.String str5 = owner0.getAddress();
        owner0.setCity("");
        owner0.setCity("");
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNotNull(petList4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0498");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet("<null>");
        java.lang.String str3 = owner0.toString();
        owner0.setCity("hi!");
        java.lang.String str6 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet8 = owner0.getPet("");
        java.lang.String str9 = owner0.getLastName();
        owner0.setAddress("");
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0499");
        org.springframework.samples.petclinic.owner.Owner owner0 = new org.springframework.samples.petclinic.owner.Owner();
        org.springframework.samples.petclinic.owner.Pet pet2 = owner0.getPet((java.lang.Integer) 0);
        java.lang.String str3 = owner0.toString();
        org.springframework.samples.petclinic.owner.Pet pet5 = owner0.getPet((java.lang.Integer) 10);
        org.springframework.samples.petclinic.owner.Pet pet7 = owner0.getPet((java.lang.Integer) 10);
        owner0.setCity("");
        org.junit.Assert.assertNull(pet2);
        org.junit.Assert.assertNull(pet5);
        org.junit.Assert.assertNull(pet7);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0500");
        org.springframework.samples.petclinic.vet.Vet vet0 = new org.springframework.samples.petclinic.vet.Vet();
        org.springframework.samples.petclinic.vet.Specialty specialty1 = new org.springframework.samples.petclinic.vet.Specialty();
        specialty1.setId((java.lang.Integer) 100);
        vet0.addSpecialty(specialty1);
        java.util.List<org.springframework.samples.petclinic.vet.Specialty> specialtyList5 = vet0.getSpecialties();
        int int6 = vet0.getNrOfSpecialties();
        boolean boolean7 = vet0.isNew();
        org.junit.Assert.assertNotNull(specialtyList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }
}

