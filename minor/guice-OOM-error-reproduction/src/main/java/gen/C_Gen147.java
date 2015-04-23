
  package gen;
  public class C_Gen147 {
  		@com.google.inject.Inject
  		public C_Gen147(C_Gen148 c_gen148){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen148 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  