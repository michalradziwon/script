
  package gen;
  public class C_Gen60 {
  		@com.google.inject.Inject
  		public C_Gen60(C_Gen61 c_gen61){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen61 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  