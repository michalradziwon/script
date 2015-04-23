
  package gen;
  public class U_Gen120 {
  		@com.google.inject.Inject
  		public U_Gen120(U_Gen121 u_gen121){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen121 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  