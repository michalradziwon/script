
  package gen;
  public class H_Gen116 {
  		@com.google.inject.Inject
  		public H_Gen116(H_Gen117 h_gen117){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen117 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  