
  package gen;
  public class C_Gen140 {
  		@com.google.inject.Inject
  		public C_Gen140(C_Gen141 c_gen141){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen141 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  