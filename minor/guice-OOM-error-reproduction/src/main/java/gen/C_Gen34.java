
  package gen;
  public class C_Gen34 {
  		@com.google.inject.Inject
  		public C_Gen34(C_Gen35 c_gen35){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen35 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  