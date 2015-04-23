
  package gen;
  public class U_Gen70 {
  		@com.google.inject.Inject
  		public U_Gen70(U_Gen71 u_gen71){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen71 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  