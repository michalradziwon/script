
  package gen;
  public class U_Gen12 {
  		@com.google.inject.Inject
  		public U_Gen12(U_Gen13 u_gen13){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen13 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  