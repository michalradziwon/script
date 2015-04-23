
  package gen;
  public class Y_Gen3 {
  		@com.google.inject.Inject
  		public Y_Gen3(Y_Gen4 y_gen4){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen4 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  