
  package gen;
  public class U_Gen128 {
  		@com.google.inject.Inject
  		public U_Gen128(U_Gen129 u_gen129){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen129 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  