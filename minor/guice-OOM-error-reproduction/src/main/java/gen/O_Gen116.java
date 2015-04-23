
  package gen;
  public class O_Gen116 {
  		@com.google.inject.Inject
  		public O_Gen116(O_Gen117 o_gen117){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen117 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  