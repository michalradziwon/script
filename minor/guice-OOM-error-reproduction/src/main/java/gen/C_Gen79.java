
  package gen;
  public class C_Gen79 {
  		@com.google.inject.Inject
  		public C_Gen79(C_Gen80 c_gen80){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen80 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  