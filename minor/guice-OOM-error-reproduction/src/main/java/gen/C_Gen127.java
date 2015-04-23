
  package gen;
  public class C_Gen127 {
  		@com.google.inject.Inject
  		public C_Gen127(C_Gen128 c_gen128){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen128 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  