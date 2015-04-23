
  package gen;
  public class C_Gen115 {
  		@com.google.inject.Inject
  		public C_Gen115(C_Gen116 c_gen116){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen116 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  