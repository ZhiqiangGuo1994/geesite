package com.jeesite.modules.fabric.config;

import java.io.File;

public class FabricConfig {

	public static final String ORG1_MSP = "Org1MSP";

	public static final String ORG1 = "org1";

	public static final String ORG2_MSP = "Org2MSP";

	public static final String ORG2 = "org2";
	
	public static final String ORG3_MSP = "Org3MSP";

	public static final String ORG3 = "org3";
	
	public static final String ORG4_MSP = "Org4MSP";

	public static final String ORG4 = "org4";

	public static final String ADMIN = "admin";

	public static final String ADMIN_PASSWORD = "adminpw";
	
	public static final String ROOT_PATH = "C:\\Users\\Administrator\\Desktop";

	public static final String CHANNEL_CONFIG_PATH = ROOT_PATH + File.separator + "patent1.0.1/network_resources/config/channel.tx";

	public static final String ORG1_USR_BASE_PATH = ROOT_PATH + File.separator + "patent1.0.1/network_resources/crypto-config"
			+ File.separator + "peerOrganizations" + File.separator + "org1.example.com" + File.separator + "users"
			+ File.separator + "Admin@org1.example.com" + File.separator + "msp";

	public static final String ORG2_USR_BASE_PATH = ROOT_PATH + File.separator + "patent1.0.1/network_resources/crypto-config"
			+ File.separator + "peerOrganizations" + File.separator + "org2.example.com" + File.separator + "users"
			+ File.separator + "Admin@org2.example.com" + File.separator + "msp";
	
	public static final String ORG3_USR_BASE_PATH = ROOT_PATH + File.separator + "patent1.0.1/network_resources/crypto-config"
			+ File.separator + "peerOrganizations" + File.separator + "org3.example.com" + File.separator + "users"
			+ File.separator + "Admin@org3.example.com" + File.separator + "msp";
	
	public static final String ORG4_USR_BASE_PATH = ROOT_PATH + File.separator + "patent1.0.1/network_resources/crypto-config"
			+ File.separator + "peerOrganizations" + File.separator + "org4.example.com" + File.separator + "users"
			+ File.separator + "Admin@org4.example.com" + File.separator + "msp";

	public static final String ORG1_USR_ADMIN_PK = ORG1_USR_BASE_PATH + File.separator + "keystore";
	public static final String ORG1_USR_ADMIN_CERT = ORG1_USR_BASE_PATH + File.separator + "admincerts";

	public static final String ORG2_USR_ADMIN_PK = ORG2_USR_BASE_PATH + File.separator + "keystore";
	public static final String ORG2_USR_ADMIN_CERT = ORG2_USR_BASE_PATH + File.separator + "admincerts";
	
	public static final String ORG3_USR_ADMIN_PK = ORG3_USR_BASE_PATH + File.separator + "keystore";
	public static final String ORG3_USR_ADMIN_CERT = ORG3_USR_BASE_PATH + File.separator + "admincerts";
	
	public static final String ORG4_USR_ADMIN_PK = ORG4_USR_BASE_PATH + File.separator + "keystore";
	public static final String ORG4_USR_ADMIN_CERT = ORG4_USR_BASE_PATH + File.separator + "admincerts";

	public static final String CA_ORG1_URL = "http://120.77.144.63:7054";

	public static final String CA_ORG2_URL = "http://120.77.144.63:8054";
	
	public static final String CA_ORG3_URL = "http://120.77.144.63:9054";
	
	public static final String CA_ORG4_URL = "http://120.77.144.63:10054";

	public static final String ORDERER_URL = "grpc://120.77.144.63:7050";

	public static final String ORDERER_NAME = "orderer.example.com";

	public static final String CHANNEL_NAME = "mychannel";

	public static final String ORG1_PEER_0 = "peer0.org1.example.com";

	public static final String ORG1_PEER_0_URL = "grpc://120.77.144.63:7051";

	public static final String ORG1_PEER_1 = "peer1.org1.example.com";

	public static final String ORG1_PEER_1_URL = "grpc://120.77.144.63:7056";

	public static final String ORG2_PEER_0 = "peer0.org2.example.com";

	public static final String ORG2_PEER_0_URL = "grpc://120.77.144.63:8051";

	public static final String ORG2_PEER_1 = "peer1.org2.example.com";

	public static final String ORG2_PEER_1_URL = "grpc://120.77.144.63:8056";

	/*注释掉org3和org4组织*/
	public static final String ORG3_PEER_0 = "peer0.org3.example.com";

	public static final String ORG3_PEER_0_URL = "grpc://120.77.144.63:9051";

	public static final String ORG3_PEER_1 = "peer1.org3.example.com";

	public static final String ORG3_PEER_1_URL = "grpc://120.77.144.63:9056";
	
	public static final String ORG4_PEER_0 = "peer0.org4.example.com";

	public static final String ORG4_PEER_0_URL = "grpc://120.77.144.63:10051";

	public static final String ORG4_PEER_1 = "peer1.org4.example.com";

	public static final String ORG4_PEER_1_URL = "grpc://120.77.144.63:10056";


	public static final String CHAINCODE_ROOT_DIR = ROOT_PATH + File.separator + "patent1.0.1/network_resources/chaincode";

	public static final String CHAINCODE_1_NAME = "patent_chaincode";

	public static final String CHAINCODE_1_PATH = "github.com/patent";

	public static final String CHAINCODE_1_VERSION = "1";
	
	public static final String ENDORSEMENTPOLICY_ROOT_DIR = ROOT_PATH + File.separator + "patent1.0.1/network";
	
	public static final String ENDORSEMENTPOLICY_1_NAME = "chaincodeendorsementpolicy.yaml";

}