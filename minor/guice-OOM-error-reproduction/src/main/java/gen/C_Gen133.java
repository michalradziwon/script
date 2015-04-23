
  package gen;
  public class C_Gen133 {
  		@com.google.inject.Inject
  		public C_Gen133(C_Gen134 c_gen134){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen134 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  