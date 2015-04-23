
  package gen;
  public class C_Gen172 {
  		@com.google.inject.Inject
  		public C_Gen172(C_Gen173 c_gen173){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen173 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  