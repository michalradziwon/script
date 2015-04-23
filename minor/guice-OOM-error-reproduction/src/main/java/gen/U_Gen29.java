
  package gen;
  public class U_Gen29 {
  		@com.google.inject.Inject
  		public U_Gen29(U_Gen30 u_gen30){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen30 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  