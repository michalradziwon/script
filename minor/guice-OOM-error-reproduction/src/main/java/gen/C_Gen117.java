
  package gen;
  public class C_Gen117 {
  		@com.google.inject.Inject
  		public C_Gen117(C_Gen118 c_gen118){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen118 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  