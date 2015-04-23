
  package gen;
  public class U_Gen142 {
  		@com.google.inject.Inject
  		public U_Gen142(U_Gen143 u_gen143){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen143 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  