
  package gen;
  public class U_Gen81 {
  		@com.google.inject.Inject
  		public U_Gen81(U_Gen82 u_gen82){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen82 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  