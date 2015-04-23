
  package gen;
  public class U_Gen160 {
  		@com.google.inject.Inject
  		public U_Gen160(U_Gen161 u_gen161){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen161 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  