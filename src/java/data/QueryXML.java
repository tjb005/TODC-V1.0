package data;

import java.util.*;
import java.io.*;
import javax.xml.stream.*;
import objects.XMLFormat;

public class QueryXML {

    public ArrayList<XMLFormat> getXMLFormats(String file) throws IOException, XMLStreamException {
        ArrayList<XMLFormat> XMLFormats = new ArrayList<XMLFormat>();
        XMLFormat x = null;
        XMLInputFactory inputFactory = XMLInputFactory.newFactory();

        try {
            FileReader fileReader = new FileReader(file);
            XMLStreamReader reader = inputFactory.createXMLStreamReader(fileReader);

            while (reader.hasNext()) {
                int eventType = reader.getEventType();
                switch (eventType) {
                    case XMLStreamConstants.START_ELEMENT:
                        String elementName = reader.getLocalName();
                        if (elementName.equals("Aircraft")) {
                            x = new XMLFormat();
                            String code = reader.getAttributeValue(0);
                            x.setAC_type(code);
                        }

                        int i = 0;
                        if (elementName.equals("toplabel")) {
                            String toplabel = reader.getElementText();
                            x.setTopLabel(toplabel);
                        }
                        if (elementName.equals("toplabel_input")) {
                            String toplabel_input = reader.getElementText();
                            x.setTopLabel_input(toplabel_input);
                            x.setTopLabel_Vident(toplabel_input);
                        }
                        if (elementName.equals("toplabel_val")) {
                            String toplabel_val = reader.getElementText();
                            x.setTopLabel_Vneed(toplabel_val);
                            x.setTopLabel_Vdata(toplabel_val);
                            x.setTopLabel_Vlength(toplabel_val);
                            x.setTopLabel_VRNG1(toplabel_val);
                            x.setTopLabel_VRNG2(toplabel_val);
                            x.setTopLabel_Vcmt(toplabel_val);
                        }


                        if (elementName.equals("L1")) {
                            String L1 = reader.getElementText();
                            x.setL1(L1);
                        }
                        if (elementName.equals("L1_input")) {
                            String L1_input = reader.getElementText();
                            x.setL1_input(L1_input);
                            x.setL1_Vident(L1_input);
                        }
                        if (elementName.equals("L1_val")) {
                            String L1_val = reader.getElementText();
                            x.setL1_Vneed(L1_val);
                            x.setL1_Vdata(L1_val);
                            x.setL1_Vlength(L1_val);
                            x.setL1_VRNG1(L1_val);
                            x.setL1_VRNG2(L1_val);
                            x.setL1_Vcmt(L1_val);
                        }

                        if (elementName.equals("L2")) {
                            String L2 = reader.getElementText();
                            x.setL2(L2);
                        }
                        if (elementName.equals("L2_input")) {
                            String L2_input = reader.getElementText();
                            x.setL2_input(L2_input);
                            x.setL2_Vident(L2_input);
                        }
                        if (elementName.equals("L2_val")) {
                            String L2_val = reader.getElementText();
                            x.setL2_Vneed(L2_val);
                            x.setL2_Vdata(L2_val);
                            x.setL2_Vlength(L2_val);
                            x.setL2_VRNG1(L2_val);
                            x.setL2_VRNG2(L2_val);
                            x.setL2_Vcmt(L2_val);
                        }

                        if (elementName.equals("L3")) {
                            String L3 = reader.getElementText();
                            x.setL3(L3);
                        }
                        if (elementName.equals("L3_input")) {
                            String L3_input = reader.getElementText();
                            x.setL3_input(L3_input);
                        }
                        if (elementName.equals("L4")) {
                            String L4 = reader.getElementText();
                            x.setL4(L4);
                        }
                        if (elementName.equals("L4_input")) {
                            String L4_input = reader.getElementText();
                            x.setL4_input(L4_input);
                        }
                        if (elementName.equals("L5")) {
                            String L5 = reader.getElementText();
                            x.setL5(L5);
                        }
                        if (elementName.equals("L5_input")) {
                            String L5_input = reader.getElementText();
                            x.setL5_input(L5_input);
                        }
                        if (elementName.equals("L6")) {
                            String L6 = reader.getElementText();
                            x.setL6(L6);
                        }
                        if (elementName.equals("L6_input")) {
                            String L6_input = reader.getElementText();
                            x.setL6_input(L6_input);
                        }
                        if (elementName.equals("L7")) {
                            String L7 = reader.getElementText();
                            x.setL7(L7);
                        }
                        if (elementName.equals("L7_input")) {
                            String L7_input = reader.getElementText();
                            x.setL7_input(L7_input);
                        }
                        if (elementName.equals("L8")) {
                            String L8 = reader.getElementText();
                            x.setL8(L8);
                        }
                        if (elementName.equals("L8_input")) {
                            String L8_input = reader.getElementText();
                            x.setL8_input(L8_input);
                        }
                        if (elementName.equals("L9")) {
                            String L9 = reader.getElementText();
                            x.setL9(L9);
                        }
                        if (elementName.equals("L9_input")) {
                            String L9_input = reader.getElementText();
                            x.setL9_input(L9_input);
                        }
                        if (elementName.equals("L10")) {
                            String L10 = reader.getElementText();
                            x.setL10(L10);
                        }
                        if (elementName.equals("L10_input")) {
                            String L10_input = reader.getElementText();
                            x.setL10_input(L10_input);
                        }
                        if (elementName.equals("R1")) {
                            String R1 = reader.getElementText();
                            x.setR1(R1);
                        }
                        if (elementName.equals("R1_input")) {
                            String R1_input = reader.getElementText();
                            x.setR1_input(R1_input);
                        }
                        if (elementName.equals("R2")) {
                            String R2 = reader.getElementText();
                            x.setR2(R2);
                        }
                        if (elementName.equals("R2_input")) {
                            String R2_input = reader.getElementText();
                            x.setR2_input(R2_input);
                        }
                        if (elementName.equals("R3")) {
                            String R3 = reader.getElementText();
                            x.setR3(R3);
                        }
                        if (elementName.equals("R3_input")) {
                            String R3_input = reader.getElementText();
                            x.setR3_input(R3_input);
                        }
                        if (elementName.equals("R4")) {
                            String R4 = reader.getElementText();
                            x.setR4(R4);
                        }
                        if (elementName.equals("R4_input")) {
                            String R4_input = reader.getElementText();
                            x.setR4_input(R4_input);
                        }
                        if (elementName.equals("R5")) {
                            String R5 = reader.getElementText();
                            x.setR5(R5);
                        }
                        if (elementName.equals("R5_input")) {
                            String R5_input = reader.getElementText();
                            x.setR5_input(R5_input);
                        }
                        if (elementName.equals("R6")) {
                            String R6 = reader.getElementText();
                            x.setR6(R6);
                        }
                        if (elementName.equals("R6_input")) {
                            String R6_input = reader.getElementText();
                            x.setR6_input(R6_input);
                        }
                        if (elementName.equals("R7")) {
                            String R7 = reader.getElementText();
                            x.setR7(R7);
                        }
                        if (elementName.equals("R7_input")) {
                            String R7_input = reader.getElementText();
                            x.setR7_input(R7_input);
                        }
                        if (elementName.equals("R8")) {
                            String R8 = reader.getElementText();
                            x.setR8(R8);
                        }
                        if (elementName.equals("R8_input")) {
                            String R8_input = reader.getElementText();
                            x.setR8_input(R8_input);
                        }
                        if (elementName.equals("R9")) {
                            String R9 = reader.getElementText();
                            x.setR9(R9);
                        }
                        if (elementName.equals("R9_input")) {
                            String R9_input = reader.getElementText();
                            x.setR9_input(R9_input);
                        }
                        break;

                    case XMLStreamConstants.END_ELEMENT:
                        elementName = reader.getLocalName();
                        if (elementName.equals("Aircraft")) {
                            XMLFormats.add(x);
                        }
                        break;
                    default:
                        break;
                }
                reader.next();
            }

        } catch (FileNotFoundException e) {
            throw e;
        } catch (XMLStreamException e) {
            throw e;
        }
        return XMLFormats;
    }

    public XMLFormat getXMLFormat(String code, String file) throws IOException, XMLStreamException {
        ArrayList<XMLFormat> XMLFormats = this.getXMLFormats(file);
        for (XMLFormat x : XMLFormats) {
            if (x.getAC_type().equals(code)) {
                return x;
            }
        }
        return null;
    }
}
