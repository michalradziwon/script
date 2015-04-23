
  package gen;
  public class U_Gen176 {
  		@com.google.inject.Inject
  		public U_Gen176(U_Gen177 u_gen177){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen177 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  