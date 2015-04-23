
  package gen;
  public class C_Gen12 {
  		@com.google.inject.Inject
  		public C_Gen12(C_Gen13 c_gen13){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen13 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  