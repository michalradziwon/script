
  package gen;
  public class U_Gen123 {
  		@com.google.inject.Inject
  		public U_Gen123(U_Gen124 u_gen124){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen124 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  