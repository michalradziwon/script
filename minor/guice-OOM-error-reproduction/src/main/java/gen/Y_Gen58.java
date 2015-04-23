
  package gen;
  public class Y_Gen58 {
  		@com.google.inject.Inject
  		public Y_Gen58(Y_Gen59 y_gen59){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen59 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  