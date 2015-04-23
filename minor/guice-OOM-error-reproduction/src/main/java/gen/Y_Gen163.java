
  package gen;
  public class Y_Gen163 {
  		@com.google.inject.Inject
  		public Y_Gen163(Y_Gen164 y_gen164){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen164 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  