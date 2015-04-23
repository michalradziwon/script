
  package gen;
  public class C_Gen69 {
  		@com.google.inject.Inject
  		public C_Gen69(C_Gen70 c_gen70){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen70 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  