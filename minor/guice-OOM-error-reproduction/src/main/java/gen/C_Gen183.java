
  package gen;
  public class C_Gen183 {
  		@com.google.inject.Inject
  		public C_Gen183(C_Gen184 c_gen184){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen184 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  