
  package gen;
  public class U_Gen1 {
  		@com.google.inject.Inject
  		public U_Gen1(U_Gen2 u_gen2){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen2 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  