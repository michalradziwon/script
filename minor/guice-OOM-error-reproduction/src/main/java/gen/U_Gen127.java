
  package gen;
  public class U_Gen127 {
  		@com.google.inject.Inject
  		public U_Gen127(U_Gen128 u_gen128){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen128 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  