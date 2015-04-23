
  package gen;
  public class U_Gen171 {
  		@com.google.inject.Inject
  		public U_Gen171(U_Gen172 u_gen172){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen172 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  