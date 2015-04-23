
  package gen;
  public class S_Gen117 {
  		@com.google.inject.Inject
  		public S_Gen117(S_Gen118 s_gen118){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen118 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  