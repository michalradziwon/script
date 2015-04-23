
  package gen;
  public class U_Gen7 {
  		@com.google.inject.Inject
  		public U_Gen7(U_Gen8 u_gen8){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen8 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  