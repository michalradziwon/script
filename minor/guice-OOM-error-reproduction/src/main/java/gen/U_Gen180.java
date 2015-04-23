
  package gen;
  public class U_Gen180 {
  		@com.google.inject.Inject
  		public U_Gen180(U_Gen181 u_gen181){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen181 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  