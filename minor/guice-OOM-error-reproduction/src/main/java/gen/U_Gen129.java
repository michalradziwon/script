
  package gen;
  public class U_Gen129 {
  		@com.google.inject.Inject
  		public U_Gen129(U_Gen130 u_gen130){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen130 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  