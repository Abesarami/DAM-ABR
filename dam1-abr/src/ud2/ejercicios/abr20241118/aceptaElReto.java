package ud2.ejercicios.abr20241118;
 import java.util.*;
public class aceptaElReto {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ganador = "a";
        System.out.println("Introduce las ventas del Martes");
        double martes = sc.nextDouble();
        System.out.println("Introduce las ventas del Miercoles");
        double miercoles = sc.nextDouble();
        System.out.println("Introduce las ventas del Jueves");
        double jueves = sc.nextDouble();
        System.out.println("Introduce las ventas del Viernes");
        double viernes = sc.nextDouble();
        System.out.println("Introduce las ventas del Sabado");
        double sabado = sc.nextDouble();
        System.out.println("Introduce las ventas del Domingo");
        double domingo = sc.nextDouble();
String mediaYDomingo;
        if ((martes+miercoles+jueves+viernes+sabado)/5 < domingo) {
            mediaYDomingo = "SI";
        }else{
            mediaYDomingo = "NO";
        }



        if (martes>miercoles) {
            if (martes>jueves) {
                if (martes>viernes) {
                    if (martes>sabado) {
                        if (martes>domingo) {
                            ganador = "MARTES";
                        }else{
                            ganador = "DOMINGO";
                        }
                        
                    }else{
                        if (sabado>domingo) {
                            ganador= "SABADO";
                            
                        }else{
                            ganador = "DOMINGO";
                        }
                    }
                    
                }else{
                    if (viernes>sabado) {
                        if (viernes>domingo) {
                            ganador = "VIERNES";
                        }else{
                            ganador = "DOMINGO";
                        }   
                    }else{
                        if (sabado>domingo) {
                            ganador= "SABADO";
                            
                        }else{
                            ganador = "DOMINGO";
                        }
                    }
                }
            }else{
                if (jueves>viernes) {
                    if (jueves>sabado) {
                        if (jueves>domingo) {
                            ganador = "JUEVES";
                        }else{
                            ganador= "DOMINGO";
                        }
                    }else{
                        if (sabado>domingo) {
                            ganador= "SABADO";
                            
                        }else{
                            ganador = "DOMINGO";
                        }

                    }
                }else{
                        if (viernes>sabado) {
                            if (viernes>domingo) {
                                ganador = "VIERNES";
                            }else{
                                ganador = "DOMINGO";
                            }   
                        }else{
                            if (sabado>domingo) {
                                ganador= "SABADO";
                                
                            }else{
                                ganador = "DOMINGO";
                            }
                        }
                }
            }
        }else{
            if (miercoles>jueves) {
                if (miercoles>viernes) {
                    if (miercoles>sabado) {
                        if (miercoles>domingo) {
                            ganador="MIERCOLES";
                        }else{
                            ganador="DOMINGO";
                        }
                    }else{
                        if (sabado>domingo) {
                            ganador= "SABADO";
                            
                        }else{
                            ganador = "DOMINGO";
                        }
                    }
                }else{
                    if (viernes>sabado) {
                        if (viernes>domingo) {
                            ganador = "VIERNES";
                        }else{
                            ganador = "DOMINGO";
                        }   
                    }else{
                        if (sabado>domingo) {
                            ganador= "SABADO";
                            
                        }else{
                            ganador = "DOMINGO";
                        }
                    }
                }
            }else{
                if (jueves>viernes) {
                    if (jueves>sabado) {
                        if (jueves>domingo) {
                            ganador = "JUEVES";
                        }else{
                            ganador= "DOMINGO";
                        }
                    }else{
                        if (sabado>domingo) {
                            ganador= "SABADO";
                            
                        }else{
                            ganador = "DOMINGO";
                        }

                    }
                }else{
                        if (viernes>sabado) {
                            if (viernes>domingo) {
                                ganador = "VIERNES";
                            }else{
                                ganador = "DOMINGO";
                            }   
                        }else{
                            if (sabado>domingo) {
                                ganador= "SABADO";
                                
                            }else{
                                ganador = "DOMINGO";
                            }
                        }
                }
            }
        }{

    
        }

        
                System.out.println(ganador + mediaYDomingo);
                sc.close();
    }

}
