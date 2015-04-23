
  package gen;
  public class Y_Gen10 {
  		@com.google.inject.Inject
  		public Y_Gen10(Y_Gen11 y_gen11){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen11 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  