
  package gen;
  public class U_Gen72 {
  		@com.google.inject.Inject
  		public U_Gen72(U_Gen73 u_gen73){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen73 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  