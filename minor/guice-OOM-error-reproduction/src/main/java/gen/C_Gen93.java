
  package gen;
  public class C_Gen93 {
  		@com.google.inject.Inject
  		public C_Gen93(C_Gen94 c_gen94){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen94 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  