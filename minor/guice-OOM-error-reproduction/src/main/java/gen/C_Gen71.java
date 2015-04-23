
  package gen;
  public class C_Gen71 {
  		@com.google.inject.Inject
  		public C_Gen71(C_Gen72 c_gen72){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen72 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  