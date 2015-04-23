
  package gen;
  public class J_Gen117 {
  		@com.google.inject.Inject
  		public J_Gen117(J_Gen118 j_gen118){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen118 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  