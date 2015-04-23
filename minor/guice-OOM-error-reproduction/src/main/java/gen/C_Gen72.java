
  package gen;
  public class C_Gen72 {
  		@com.google.inject.Inject
  		public C_Gen72(C_Gen73 c_gen73){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen73 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  