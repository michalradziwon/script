
  package gen;
  public class Y_Gen19 {
  		@com.google.inject.Inject
  		public Y_Gen19(Y_Gen20 y_gen20){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen20 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  