
  package gen;
  public class U_Gen148 {
  		@com.google.inject.Inject
  		public U_Gen148(U_Gen149 u_gen149){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen149 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  