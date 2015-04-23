
  package gen;
  public class C_Gen85 {
  		@com.google.inject.Inject
  		public C_Gen85(C_Gen86 c_gen86){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen86 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  