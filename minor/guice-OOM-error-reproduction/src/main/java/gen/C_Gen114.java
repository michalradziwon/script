
  package gen;
  public class C_Gen114 {
  		@com.google.inject.Inject
  		public C_Gen114(C_Gen115 c_gen115){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen115 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  