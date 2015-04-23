
  package gen;
  public class C_Gen160 {
  		@com.google.inject.Inject
  		public C_Gen160(C_Gen161 c_gen161){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen161 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  