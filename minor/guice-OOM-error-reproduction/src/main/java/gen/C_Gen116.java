
  package gen;
  public class C_Gen116 {
  		@com.google.inject.Inject
  		public C_Gen116(C_Gen117 c_gen117){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen117 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  