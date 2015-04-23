
  package gen;
  public class C_Gen40 {
  		@com.google.inject.Inject
  		public C_Gen40(C_Gen41 c_gen41){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen41 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  