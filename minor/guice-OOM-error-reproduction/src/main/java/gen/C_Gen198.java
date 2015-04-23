
  package gen;
  public class C_Gen198 {
  		@com.google.inject.Inject
  		public C_Gen198(C_Gen199 c_gen199){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen199 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  