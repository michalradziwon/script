
  package gen;
  public class H_Gen117 {
  		@com.google.inject.Inject
  		public H_Gen117(H_Gen118 h_gen118){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen118 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  