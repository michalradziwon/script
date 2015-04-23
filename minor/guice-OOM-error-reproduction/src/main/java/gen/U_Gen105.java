
  package gen;
  public class U_Gen105 {
  		@com.google.inject.Inject
  		public U_Gen105(U_Gen106 u_gen106){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen106 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  