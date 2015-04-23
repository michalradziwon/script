
  package gen;
  public class U_Gen48 {
  		@com.google.inject.Inject
  		public U_Gen48(U_Gen49 u_gen49){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen49 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  