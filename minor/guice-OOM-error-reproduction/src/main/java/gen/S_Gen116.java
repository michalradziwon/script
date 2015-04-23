
  package gen;
  public class S_Gen116 {
  		@com.google.inject.Inject
  		public S_Gen116(S_Gen117 s_gen117){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen117 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  