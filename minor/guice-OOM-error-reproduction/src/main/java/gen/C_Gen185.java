
  package gen;
  public class C_Gen185 {
  		@com.google.inject.Inject
  		public C_Gen185(C_Gen186 c_gen186){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen186 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  