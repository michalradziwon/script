
  package gen;
  public class C_Gen123 {
  		@com.google.inject.Inject
  		public C_Gen123(C_Gen124 c_gen124){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen124 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  