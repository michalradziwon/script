
  package gen;
  public class C_Gen168 {
  		@com.google.inject.Inject
  		public C_Gen168(C_Gen169 c_gen169){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen169 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  