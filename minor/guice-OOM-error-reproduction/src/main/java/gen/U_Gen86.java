
  package gen;
  public class U_Gen86 {
  		@com.google.inject.Inject
  		public U_Gen86(U_Gen87 u_gen87){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen87 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  