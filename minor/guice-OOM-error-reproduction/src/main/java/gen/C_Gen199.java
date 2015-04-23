
  package gen;
  public class C_Gen199 {
  		@com.google.inject.Inject
  		public C_Gen199(C_Gen200 c_gen200){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen200 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  