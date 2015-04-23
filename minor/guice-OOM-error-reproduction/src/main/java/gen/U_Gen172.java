
  package gen;
  public class U_Gen172 {
  		@com.google.inject.Inject
  		public U_Gen172(U_Gen173 u_gen173){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen173 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  