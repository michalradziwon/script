
  package gen;
  public class C_Gen146 {
  		@com.google.inject.Inject
  		public C_Gen146(C_Gen147 c_gen147){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen147 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  