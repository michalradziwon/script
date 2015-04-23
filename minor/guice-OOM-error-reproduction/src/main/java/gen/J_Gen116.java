
  package gen;
  public class J_Gen116 {
  		@com.google.inject.Inject
  		public J_Gen116(J_Gen117 j_gen117){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen117 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  