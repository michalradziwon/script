
  package gen;
  public class C_Gen33 {
  		@com.google.inject.Inject
  		public C_Gen33(C_Gen34 c_gen34){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen34 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  