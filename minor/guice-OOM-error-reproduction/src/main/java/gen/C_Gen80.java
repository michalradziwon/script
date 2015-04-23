
  package gen;
  public class C_Gen80 {
  		@com.google.inject.Inject
  		public C_Gen80(C_Gen81 c_gen81){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen81 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  