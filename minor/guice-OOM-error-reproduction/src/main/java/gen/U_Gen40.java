
  package gen;
  public class U_Gen40 {
  		@com.google.inject.Inject
  		public U_Gen40(U_Gen41 u_gen41){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen41 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  