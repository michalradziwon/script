
  package gen;
  public class U_Gen2 {
  		@com.google.inject.Inject
  		public U_Gen2(U_Gen3 u_gen3){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen3 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  