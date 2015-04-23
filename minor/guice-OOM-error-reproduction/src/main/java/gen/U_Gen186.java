
  package gen;
  public class U_Gen186 {
  		@com.google.inject.Inject
  		public U_Gen186(U_Gen187 u_gen187){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen187 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  