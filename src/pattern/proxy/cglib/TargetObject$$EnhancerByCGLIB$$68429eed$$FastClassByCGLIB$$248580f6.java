package pattern.proxy.cglib;

import java.lang.reflect.InvocationTargetException;
import net.sf.cglib.reflect.FastClass;

public class TargetObject$$EnhancerByCGLIB$$68429eed$$FastClassByCGLIB$$248580f6
  extends FastClass
{
  public TargetObject$$EnhancerByCGLIB$$68429eed$$FastClassByCGLIB$$248580f6(Class paramClass)
  {
    super(paramClass);
  }
  
  /* Error */
  public int getIndex(net.sf.cglib.core.Signature arg1)
  {
	return 0; // for not report error
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 17	java/lang/Object:toString	()Ljava/lang/String;
    //   4: dup
    //   5: invokevirtual 21	java/lang/Object:hashCode	()I
    //   8: lookupswitch	default:+481->489, -2071771415:+212->220, -2055565910:+223->231, -1457535688:+234->242, -1411783143:+245->253, -1063114848:+256->264, -994256180:+267->275, -894172689:+277->285, -623122092:+288->296, -508378822:+299->307, -419626537:+309->317, -10051573:+320->328, 560567118:+331->339, 593200387:+342->350, 811063227:+353->361, 973717575:+364->372, 1095118023:+375->383, 1221173700:+386->394, 1230699260:+396->404, 1514770335:+407->415, 1584330438:+418->426, 1826985398:+429->437, 1886827483:+439->447, 1913648695:+450->458, 1984935277:+460->468, 2127621043:+470->478
    //   220: ldc 23
    //   222: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   225: ifeq +265 -> 490
    //   228: bipush 23
    //   230: ireturn
    //   231: ldc 29
    //   233: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   236: ifeq +254 -> 490
    //   239: bipush 13
    //   241: ireturn
    //   242: ldc 31
    //   244: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   247: ifeq +243 -> 490
    //   250: bipush 16
    //   252: ireturn
    //   253: ldc 33
    //   255: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   258: ifeq +232 -> 490
    //   261: bipush 22
    //   263: ireturn
    //   264: ldc 35
    //   266: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   269: ifeq +221 -> 490
    //   272: bipush 8
    //   274: ireturn
    //   275: ldc 37
    //   277: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   280: ifeq +210 -> 490
    //   283: iconst_0
    //   284: ireturn
    //   285: ldc 39
    //   287: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   290: ifeq +200 -> 490
    //   293: bipush 6
    //   295: ireturn
    //   296: ldc 41
    //   298: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   301: ifeq +189 -> 490
    //   304: bipush 17
    //   306: ireturn
    //   307: ldc 43
    //   309: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   312: ifeq +178 -> 490
    //   315: iconst_4
    //   316: ireturn
    //   317: ldc 45
    //   319: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   322: ifeq +168 -> 490
    //   325: bipush 11
    //   327: ireturn
    //   328: ldc 47
    //   330: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   333: ifeq +157 -> 490
    //   336: bipush 18
    //   338: ireturn
    //   339: ldc 49
    //   341: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   344: ifeq +146 -> 490
    //   347: bipush 10
    //   349: ireturn
    //   350: ldc 51
    //   352: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   355: ifeq +135 -> 490
    //   358: bipush 21
    //   360: ireturn
    //   361: ldc 53
    //   363: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   366: ifeq +124 -> 490
    //   369: bipush 7
    //   371: ireturn
    //   372: ldc 55
    //   374: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   377: ifeq +113 -> 490
    //   380: bipush 15
    //   382: ireturn
    //   383: ldc 57
    //   385: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   388: ifeq +102 -> 490
    //   391: bipush 20
    //   393: ireturn
    //   394: ldc 59
    //   396: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   399: ifeq +91 -> 490
    //   402: iconst_5
    //   403: ireturn
    //   404: ldc 61
    //   406: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   409: ifeq +81 -> 490
    //   412: bipush 14
    //   414: ireturn
    //   415: ldc 63
    //   417: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   420: ifeq +70 -> 490
    //   423: bipush 24
    //   425: ireturn
    //   426: ldc 65
    //   428: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   431: ifeq +59 -> 490
    //   434: bipush 12
    //   436: ireturn
    //   437: ldc 67
    //   439: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   442: ifeq +48 -> 490
    //   445: iconst_1
    //   446: ireturn
    //   447: ldc 69
    //   449: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   452: ifeq +38 -> 490
    //   455: bipush 19
    //   457: ireturn
    //   458: ldc 71
    //   460: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   463: ifeq +27 -> 490
    //   466: iconst_2
    //   467: ireturn
    //   468: ldc 73
    //   470: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   473: ifeq +17 -> 490
    //   476: iconst_3
    //   477: ireturn
    //   478: ldc 75
    //   480: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   483: ifeq +7 -> 490
    //   486: bipush 9
    //   488: ireturn
    //   489: pop
    //   490: iconst_m1
    //   491: ireturn
  }
  
  /* Error */
  public int getIndex(String arg1, Class[] arg2)
  {
	return 0; // for not report error
    // Byte code:
    //   0: aload_1
    //   1: aload_2
    //   2: swap
    //   3: dup
    //   4: invokevirtual 21	java/lang/Object:hashCode	()I
    //   7: lookupswitch	default:+1316->1323, -1776922004:+193->200, -1295482945:+227->234, -1285375874:+277->284, -1053468136:+326->333, -124978606:+360->367, -60403779:+410->417, -29025553:+458->465, 96511:+492->499, 3373707:+542->549, 85179481:+589->596, 94756189:+638->645, 109264530:+671->678, 147696667:+722->729, 161998109:+755->762, 367658714:+792->799, 495524492:+842->849, 1108401898:+890->897, 1154623345:+938->945, 1543336188:+986->993, 1811874389:+1020->1027, 1817099975:+1169->1176, 1905679803:+1232->1239, 1951977612:+1282->1289
    //   200: ldc 81
    //   202: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   205: ifeq +1119 -> 1324
    //   208: dup
    //   209: arraylength
    //   210: tableswitch	default:+21->231, 0:+18->228
    //   228: pop
    //   229: iconst_2
    //   230: ireturn
    //   231: goto +1096 -> 1327
    //   234: ldc 82
    //   236: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   239: ifeq +1085 -> 1324
    //   242: dup
    //   243: arraylength
    //   244: tableswitch	default:+37->281, 1:+20->264
    //   264: dup
    //   265: iconst_0
    //   266: aaload
    //   267: invokevirtual 87	java/lang/Class:getName	()Ljava/lang/String;
    //   270: ldc 89
    //   272: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   275: ifeq +1052 -> 1327
    //   278: pop
    //   279: iconst_1
    //   280: ireturn
    //   281: goto +1046 -> 1327
    //   284: ldc 91
    //   286: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   289: ifeq +1035 -> 1324
    //   292: dup
    //   293: arraylength
    //   294: tableswitch	default:+36->330, 1:+18->312
    //   312: dup
    //   313: iconst_0
    //   314: aaload
    //   315: invokevirtual 87	java/lang/Class:getName	()Ljava/lang/String;
    //   318: ldc 93
    //   320: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   323: ifeq +1004 -> 1327
    //   326: pop
    //   327: bipush 24
    //   329: ireturn
    //   330: goto +997 -> 1327
    //   333: ldc 95
    //   335: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   338: ifeq +986 -> 1324
    //   341: dup
    //   342: arraylength
    //   343: tableswitch	default:+21->364, 0:+17->360
    //   360: pop
    //   361: bipush 15
    //   363: ireturn
    //   364: goto +963 -> 1327
    //   367: ldc 97
    //   369: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   372: ifeq +952 -> 1324
    //   375: dup
    //   376: arraylength
    //   377: tableswitch	default:+37->414, 1:+19->396
    //   396: dup
    //   397: iconst_0
    //   398: aaload
    //   399: invokevirtual 87	java/lang/Class:getName	()Ljava/lang/String;
    //   402: ldc 89
    //   404: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   407: ifeq +920 -> 1327
    //   410: pop
    //   411: bipush 21
    //   413: ireturn
    //   414: goto +913 -> 1327
    //   417: ldc 99
    //   419: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   422: ifeq +902 -> 1324
    //   425: dup
    //   426: arraylength
    //   427: tableswitch	default:+35->462, 1:+17->444
    //   444: dup
    //   445: iconst_0
    //   446: aaload
    //   447: invokevirtual 87	java/lang/Class:getName	()Ljava/lang/String;
    //   450: ldc 101
    //   452: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   455: ifeq +872 -> 1327
    //   458: pop
    //   459: bipush 12
    //   461: ireturn
    //   462: goto +865 -> 1327
    //   465: ldc 103
    //   467: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   470: ifeq +854 -> 1324
    //   473: dup
    //   474: arraylength
    //   475: tableswitch	default:+21->496, 0:+17->492
    //   492: pop
    //   493: bipush 22
    //   495: ireturn
    //   496: goto +831 -> 1327
    //   499: ldc 105
    //   501: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   504: ifeq +820 -> 1324
    //   507: dup
    //   508: arraylength
    //   509: tableswitch	default:+37->546, 1:+19->528
    //   528: dup
    //   529: iconst_0
    //   530: aaload
    //   531: invokevirtual 87	java/lang/Class:getName	()Ljava/lang/String;
    //   534: ldc 93
    //   536: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   539: ifeq +788 -> 1327
    //   542: pop
    //   543: bipush 8
    //   545: ireturn
    //   546: goto +781 -> 1327
    //   549: ldc 107
    //   551: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   554: ifeq +770 -> 1324
    //   557: dup
    //   558: arraylength
    //   559: tableswitch	default:+34->593, 1:+17->576
    //   576: dup
    //   577: iconst_0
    //   578: aaload
    //   579: invokevirtual 87	java/lang/Class:getName	()Ljava/lang/String;
    //   582: ldc 109
    //   584: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   587: ifeq +740 -> 1327
    //   590: pop
    //   591: iconst_0
    //   592: ireturn
    //   593: goto +734 -> 1327
    //   596: ldc 111
    //   598: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   601: ifeq +723 -> 1324
    //   604: dup
    //   605: arraylength
    //   606: tableswitch	default:+36->642, 1:+18->624
    //   624: dup
    //   625: iconst_0
    //   626: aaload
    //   627: invokevirtual 87	java/lang/Class:getName	()Ljava/lang/String;
    //   630: ldc 101
    //   632: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   635: ifeq +692 -> 1327
    //   638: pop
    //   639: bipush 13
    //   641: ireturn
    //   642: goto +685 -> 1327
    //   645: ldc 113
    //   647: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   650: ifeq +674 -> 1324
    //   653: dup
    //   654: arraylength
    //   655: tableswitch	default:+20->675, 0:+17->672
    //   672: pop
    //   673: iconst_4
    //   674: ireturn
    //   675: goto +652 -> 1327
    //   678: ldc 115
    //   680: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   683: ifeq +641 -> 1324
    //   686: dup
    //   687: arraylength
    //   688: tableswitch	default:+38->726, 1:+20->708
    //   708: dup
    //   709: iconst_0
    //   710: aaload
    //   711: invokevirtual 87	java/lang/Class:getName	()Ljava/lang/String;
    //   714: ldc 93
    //   716: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   719: ifeq +608 -> 1327
    //   722: pop
    //   723: bipush 9
    //   725: ireturn
    //   726: goto +601 -> 1327
    //   729: ldc 116
    //   731: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   734: ifeq +590 -> 1324
    //   737: dup
    //   738: arraylength
    //   739: tableswitch	default:+20->759, 0:+17->756
    //   756: pop
    //   757: iconst_3
    //   758: ireturn
    //   759: goto +568 -> 1327
    //   762: ldc 118
    //   764: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   767: ifeq +557 -> 1324
    //   770: dup
    //   771: arraylength
    //   772: tableswitch	default:+24->796, 0:+20->792
    //   792: pop
    //   793: bipush 16
    //   795: ireturn
    //   796: goto +531 -> 1327
    //   799: ldc 120
    //   801: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   804: ifeq +520 -> 1324
    //   807: dup
    //   808: arraylength
    //   809: tableswitch	default:+37->846, 1:+19->828
    //   828: dup
    //   829: iconst_0
    //   830: aaload
    //   831: invokevirtual 87	java/lang/Class:getName	()Ljava/lang/String;
    //   834: ldc 109
    //   836: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   839: ifeq +488 -> 1327
    //   842: pop
    //   843: bipush 19
    //   845: ireturn
    //   846: goto +481 -> 1327
    //   849: ldc 122
    //   851: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   854: ifeq +470 -> 1324
    //   857: dup
    //   858: arraylength
    //   859: tableswitch	default:+35->894, 1:+17->876
    //   876: dup
    //   877: iconst_0
    //   878: aaload
    //   879: invokevirtual 87	java/lang/Class:getName	()Ljava/lang/String;
    //   882: ldc 101
    //   884: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   887: ifeq +440 -> 1327
    //   890: pop
    //   891: bipush 11
    //   893: ireturn
    //   894: goto +433 -> 1327
    //   897: ldc 124
    //   899: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   902: ifeq +422 -> 1324
    //   905: dup
    //   906: arraylength
    //   907: tableswitch	default:+35->942, 1:+17->924
    //   924: dup
    //   925: iconst_0
    //   926: aaload
    //   927: invokevirtual 87	java/lang/Class:getName	()Ljava/lang/String;
    //   930: ldc 93
    //   932: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   935: ifeq +392 -> 1327
    //   938: pop
    //   939: bipush 18
    //   941: ireturn
    //   942: goto +385 -> 1327
    //   945: ldc 126
    //   947: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   950: ifeq +374 -> 1324
    //   953: dup
    //   954: arraylength
    //   955: tableswitch	default:+35->990, 1:+17->972
    //   972: dup
    //   973: iconst_0
    //   974: aaload
    //   975: invokevirtual 87	java/lang/Class:getName	()Ljava/lang/String;
    //   978: ldc -128
    //   980: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   983: ifeq +344 -> 1327
    //   986: pop
    //   987: bipush 17
    //   989: ireturn
    //   990: goto +337 -> 1327
    //   993: ldc -126
    //   995: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   998: ifeq +326 -> 1324
    //   1001: dup
    //   1002: arraylength
    //   1003: tableswitch	default:+21->1024, 0:+17->1020
    //   1020: pop
    //   1021: bipush 20
    //   1023: ireturn
    //   1024: goto +303 -> 1327
    //   1027: ldc -124
    //   1029: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   1032: ifeq +292 -> 1324
    //   1035: dup
    //   1036: arraylength
    //   1037: tableswitch	default:+136->1173, 1:+27->1064, 2:+136->1173, 3:+90->1127
    //   1064: dup
    //   1065: iconst_0
    //   1066: aaload
    //   1067: invokevirtual 87	java/lang/Class:getName	()Ljava/lang/String;
    //   1070: dup
    //   1071: invokevirtual 21	java/lang/Object:hashCode	()I
    //   1074: lookupswitch	default:+49->1123, -845341380:+26->1100, 1730110032:+38->1112
    //   1100: ldc -122
    //   1102: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   1105: ifeq +19 -> 1124
    //   1108: pop
    //   1109: bipush 6
    //   1111: ireturn
    //   1112: ldc 101
    //   1114: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   1117: ifeq +7 -> 1124
    //   1120: pop
    //   1121: iconst_5
    //   1122: ireturn
    //   1123: pop
    //   1124: goto +203 -> 1327
    //   1127: dup
    //   1128: iconst_0
    //   1129: aaload
    //   1130: invokevirtual 87	java/lang/Class:getName	()Ljava/lang/String;
    //   1133: ldc -120
    //   1135: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   1138: ifeq +189 -> 1327
    //   1141: dup
    //   1142: iconst_1
    //   1143: aaload
    //   1144: invokevirtual 87	java/lang/Class:getName	()Ljava/lang/String;
    //   1147: ldc -118
    //   1149: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   1152: ifeq +175 -> 1327
    //   1155: dup
    //   1156: iconst_2
    //   1157: aaload
    //   1158: invokevirtual 87	java/lang/Class:getName	()Ljava/lang/String;
    //   1161: ldc 101
    //   1163: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   1166: ifeq +161 -> 1327
    //   1169: pop
    //   1170: bipush 7
    //   1172: ireturn
    //   1173: goto +154 -> 1327
    //   1176: ldc -116
    //   1178: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   1181: ifeq +143 -> 1324
    //   1184: dup
    //   1185: arraylength
    //   1186: tableswitch	default:+50->1236, 2:+18->1204
    //   1204: dup
    //   1205: iconst_0
    //   1206: aaload
    //   1207: invokevirtual 87	java/lang/Class:getName	()Ljava/lang/String;
    //   1210: ldc 93
    //   1212: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   1215: ifeq +112 -> 1327
    //   1218: dup
    //   1219: iconst_1
    //   1220: aaload
    //   1221: invokevirtual 87	java/lang/Class:getName	()Ljava/lang/String;
    //   1224: ldc -122
    //   1226: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   1229: ifeq +98 -> 1327
    //   1232: pop
    //   1233: bipush 10
    //   1235: ireturn
    //   1236: goto +91 -> 1327
    //   1239: ldc -114
    //   1241: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   1244: ifeq +80 -> 1324
    //   1247: dup
    //   1248: arraylength
    //   1249: tableswitch	default:+37->1286, 1:+19->1268
    //   1268: dup
    //   1269: iconst_0
    //   1270: aaload
    //   1271: invokevirtual 87	java/lang/Class:getName	()Ljava/lang/String;
    //   1274: ldc 93
    //   1276: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   1279: ifeq +48 -> 1327
    //   1282: pop
    //   1283: bipush 14
    //   1285: ireturn
    //   1286: goto +41 -> 1327
    //   1289: ldc -112
    //   1291: invokevirtual 27	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   1294: ifeq +30 -> 1324
    //   1297: dup
    //   1298: arraylength
    //   1299: tableswitch	default:+21->1320, 0:+17->1316
    //   1316: pop
    //   1317: bipush 23
    //   1319: ireturn
    //   1320: goto +7 -> 1327
    //   1323: pop
    //   1324: goto +3 -> 1327
    //   1327: pop
    //   1328: iconst_m1
    //   1329: ireturn
  }
  
  /* Error */
  public int getIndex(Class[] arg1)
  {
	return 0; // for not report error
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: arraylength
    //   3: tableswitch	default:+20->23, 0:+17->20
    //   20: pop
    //   21: iconst_0
    //   22: ireturn
    //   23: goto +3 -> 26
    //   26: pop
    //   27: iconst_m1
    //   28: ireturn
  }
  
  /* Error */
  public Object invoke(int arg1, Object arg2, Object[] arg3)
    throws InvocationTargetException
  {
	return arg3; // for not report error
    // Byte code:
    //   0: aload_2
    //   1: checkcast 153	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed
    //   4: iload_1
    //   5: tableswitch	default:+416->421, 0:+115->120, 1:+125->130, 2:+140->145, 3:+144->149, 4:+156->161, 5:+160->165, 6:+170->175, 7:+180->185, 8:+202->207, 9:+223->228, 10:+244->249, 11:+264->269, 12:+275->280, 13:+286->291, 14:+297->302, 15:+310->315, 16:+314->319, 17:+319->324, 18:+329->334, 19:+350->355, 20:+360->365, 21:+364->369, 22:+379->384, 23:+391->396, 24:+395->400
    //   120: aload_3
    //   121: iconst_0
    //   122: aaload
    //   123: checkcast 79	java/lang/String
    //   126: invokevirtual 156	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:name	(Ljava/lang/String;)Ljava/lang/String;
    //   129: areturn
    //   130: aload_3
    //   131: iconst_0
    //   132: aaload
    //   133: invokevirtual 157	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:equals	(Ljava/lang/Object;)Z
    //   136: new 159	java/lang/Boolean
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial 162	java/lang/Boolean:<init>	(Z)V
    //   144: areturn
    //   145: invokevirtual 163	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:toString	()Ljava/lang/String;
    //   148: areturn
    //   149: invokevirtual 164	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:hashCode	()I
    //   152: new 166	java/lang/Integer
    //   155: dup_x1
    //   156: swap
    //   157: invokespecial 169	java/lang/Integer:<init>	(I)V
    //   160: areturn
    //   161: invokevirtual 172	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:clone	()Ljava/lang/Object;
    //   164: areturn
    //   165: aload_3
    //   166: iconst_0
    //   167: aaload
    //   168: checkcast 174	[Lnet/sf/cglib/proxy/Callback;
    //   171: invokevirtual 177	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:newInstance	([Lnet/sf/cglib/proxy/Callback;)Ljava/lang/Object;
    //   174: areturn
    //   175: aload_3
    //   176: iconst_0
    //   177: aaload
    //   178: checkcast 179	net/sf/cglib/proxy/Callback
    //   181: invokevirtual 182	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:newInstance	(Lnet/sf/cglib/proxy/Callback;)Ljava/lang/Object;
    //   184: areturn
    //   185: aload_3
    //   186: iconst_0
    //   187: aaload
    //   188: checkcast 146	[Ljava/lang/Class;
    //   191: aload_3
    //   192: iconst_1
    //   193: aaload
    //   194: checkcast 184	[Ljava/lang/Object;
    //   197: aload_3
    //   198: iconst_2
    //   199: aaload
    //   200: checkcast 174	[Lnet/sf/cglib/proxy/Callback;
    //   203: invokevirtual 187	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:newInstance	([Ljava/lang/Class;[Ljava/lang/Object;[Lnet/sf/cglib/proxy/Callback;)Ljava/lang/Object;
    //   206: areturn
    //   207: aload_3
    //   208: iconst_0
    //   209: aaload
    //   210: checkcast 189	java/lang/Number
    //   213: invokevirtual 192	java/lang/Number:intValue	()I
    //   216: invokevirtual 195	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:age	(I)I
    //   219: new 166	java/lang/Integer
    //   222: dup_x1
    //   223: swap
    //   224: invokespecial 169	java/lang/Integer:<init>	(I)V
    //   227: areturn
    //   228: aload_3
    //   229: iconst_0
    //   230: aaload
    //   231: checkcast 189	java/lang/Number
    //   234: invokevirtual 192	java/lang/Number:intValue	()I
    //   237: invokevirtual 197	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:score	(I)I
    //   240: new 166	java/lang/Integer
    //   243: dup_x1
    //   244: swap
    //   245: invokespecial 169	java/lang/Integer:<init>	(I)V
    //   248: areturn
    //   249: aload_3
    //   250: iconst_0
    //   251: aaload
    //   252: checkcast 189	java/lang/Number
    //   255: invokevirtual 192	java/lang/Number:intValue	()I
    //   258: aload_3
    //   259: iconst_1
    //   260: aaload
    //   261: checkcast 179	net/sf/cglib/proxy/Callback
    //   264: invokevirtual 200	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:setCallback	(ILnet/sf/cglib/proxy/Callback;)V
    //   267: aconst_null
    //   268: areturn
    //   269: aload_3
    //   270: iconst_0
    //   271: aaload
    //   272: checkcast 174	[Lnet/sf/cglib/proxy/Callback;
    //   275: invokevirtual 203	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:setCallbacks	([Lnet/sf/cglib/proxy/Callback;)V
    //   278: aconst_null
    //   279: areturn
    //   280: aload_3
    //   281: iconst_0
    //   282: aaload
    //   283: checkcast 174	[Lnet/sf/cglib/proxy/Callback;
    //   286: invokestatic 205	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:CGLIB$SET_STATIC_CALLBACKS	([Lnet/sf/cglib/proxy/Callback;)V
    //   289: aconst_null
    //   290: areturn
    //   291: aload_3
    //   292: iconst_0
    //   293: aaload
    //   294: checkcast 174	[Lnet/sf/cglib/proxy/Callback;
    //   297: invokestatic 207	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:CGLIB$SET_THREAD_CALLBACKS	([Lnet/sf/cglib/proxy/Callback;)V
    //   300: aconst_null
    //   301: areturn
    //   302: aload_3
    //   303: iconst_0
    //   304: aaload
    //   305: checkcast 189	java/lang/Number
    //   308: invokevirtual 192	java/lang/Number:intValue	()I
    //   311: invokevirtual 210	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:getCallback	(I)Lnet/sf/cglib/proxy/Callback;
    //   314: areturn
    //   315: invokevirtual 213	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:getCallbacks	()[Lnet/sf/cglib/proxy/Callback;
    //   318: areturn
    //   319: invokestatic 216	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:CGLIB$STATICHOOK1	()V
    //   322: aconst_null
    //   323: areturn
    //   324: aload_3
    //   325: iconst_0
    //   326: aaload
    //   327: checkcast 77	net/sf/cglib/core/Signature
    //   330: invokestatic 219	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:CGLIB$findMethodProxy	(Lnet/sf/cglib/core/Signature;)Lnet/sf/cglib/proxy/MethodProxy;
    //   333: areturn
    //   334: aload_3
    //   335: iconst_0
    //   336: aaload
    //   337: checkcast 189	java/lang/Number
    //   340: invokevirtual 192	java/lang/Number:intValue	()I
    //   343: invokevirtual 221	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:CGLIB$age$2	(I)I
    //   346: new 166	java/lang/Integer
    //   349: dup_x1
    //   350: swap
    //   351: invokespecial 169	java/lang/Integer:<init>	(I)V
    //   354: areturn
    //   355: aload_3
    //   356: iconst_0
    //   357: aaload
    //   358: checkcast 79	java/lang/String
    //   361: invokevirtual 223	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:CGLIB$name$0	(Ljava/lang/String;)Ljava/lang/String;
    //   364: areturn
    //   365: invokevirtual 225	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:CGLIB$toString$1	()Ljava/lang/String;
    //   368: areturn
    //   369: aload_3
    //   370: iconst_0
    //   371: aaload
    //   372: invokevirtual 227	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:CGLIB$equals$4	(Ljava/lang/Object;)Z
    //   375: new 159	java/lang/Boolean
    //   378: dup_x1
    //   379: swap
    //   380: invokespecial 162	java/lang/Boolean:<init>	(Z)V
    //   383: areturn
    //   384: invokevirtual 229	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:CGLIB$hashCode$5	()I
    //   387: new 166	java/lang/Integer
    //   390: dup_x1
    //   391: swap
    //   392: invokespecial 169	java/lang/Integer:<init>	(I)V
    //   395: areturn
    //   396: invokevirtual 231	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:CGLIB$clone$6	()Ljava/lang/Object;
    //   399: areturn
    //   400: aload_3
    //   401: iconst_0
    //   402: aaload
    //   403: checkcast 189	java/lang/Number
    //   406: invokevirtual 192	java/lang/Number:intValue	()I
    //   409: invokevirtual 233	pattern/proxy/cglib/TargetObject$$EnhancerByCGLIB$$68429eed:CGLIB$score$3	(I)I
    //   412: new 166	java/lang/Integer
    //   415: dup_x1
    //   416: swap
    //   417: invokespecial 169	java/lang/Integer:<init>	(I)V
    //   420: areturn
    //   421: goto +12 -> 433
    //   424: new 151	java/lang/reflect/InvocationTargetException
    //   427: dup_x1
    //   428: swap
    //   429: invokespecial 238	java/lang/reflect/InvocationTargetException:<init>	(Ljava/lang/Throwable;)V
    //   432: athrow
    //   433: new 240	java/lang/IllegalArgumentException
    //   436: dup
    //   437: ldc -14
    //   439: invokespecial 245	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   442: athrow
    // Exception table:
    //   from	to	target	type
    //   5	424	424	java/lang/Throwable
  }
  
  public Object newInstance(int paramInt, Object[] paramArrayOfObject)
    throws InvocationTargetException
  {
    try
    {
      switch (paramInt)
      {
      case 0: 
       // return new TargetObject.EnhancerByCGLIB.68429eed(); // for not report error
      }
    }
    catch (Throwable localThrowable)
    {
      throw new InvocationTargetException(localThrowable);
    }
    throw new IllegalArgumentException("Cannot find matching method/constructor");
  }
  
  public int getMaxIndex()
  {
    return 24;
  }
}
