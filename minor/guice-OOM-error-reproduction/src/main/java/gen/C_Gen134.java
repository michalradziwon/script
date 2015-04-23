
  package gen;
  public class C_Gen134 {
  		@com.google.inject.Inject
  		public C_Gen134(C_Gen135 c_gen135){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen135 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  