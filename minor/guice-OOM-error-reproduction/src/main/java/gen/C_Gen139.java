
  package gen;
  public class C_Gen139 {
  		@com.google.inject.Inject
  		public C_Gen139(C_Gen140 c_gen140){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen140 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  