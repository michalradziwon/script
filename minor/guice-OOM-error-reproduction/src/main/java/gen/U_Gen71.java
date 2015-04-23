
  package gen;
  public class U_Gen71 {
  		@com.google.inject.Inject
  		public U_Gen71(U_Gen72 u_gen72){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen72 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  