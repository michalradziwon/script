
  package gen;
  public class U_Gen87 {
  		@com.google.inject.Inject
  		public U_Gen87(U_Gen88 u_gen88){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen88 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  