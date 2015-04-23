
  package gen;
  public class U_Gen164 {
  		@com.google.inject.Inject
  		public U_Gen164(U_Gen165 u_gen165){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen165 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  