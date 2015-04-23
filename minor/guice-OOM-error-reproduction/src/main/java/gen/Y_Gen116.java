
  package gen;
  public class Y_Gen116 {
  		@com.google.inject.Inject
  		public Y_Gen116(Y_Gen117 y_gen117){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen117 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  