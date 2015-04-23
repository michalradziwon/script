
  package gen;
  public class Y_Gen17 {
  		@com.google.inject.Inject
  		public Y_Gen17(Y_Gen18 y_gen18){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen18 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  