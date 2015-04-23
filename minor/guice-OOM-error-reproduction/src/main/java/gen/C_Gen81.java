
  package gen;
  public class C_Gen81 {
  		@com.google.inject.Inject
  		public C_Gen81(C_Gen82 c_gen82){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen82 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  