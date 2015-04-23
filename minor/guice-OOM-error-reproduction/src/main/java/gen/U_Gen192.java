
  package gen;
  public class U_Gen192 {
  		@com.google.inject.Inject
  		public U_Gen192(U_Gen193 u_gen193){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen193 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  