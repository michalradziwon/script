
  package gen;
  public class U_Gen199 {
  		@com.google.inject.Inject
  		public U_Gen199(U_Gen200 u_gen200){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen200 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  