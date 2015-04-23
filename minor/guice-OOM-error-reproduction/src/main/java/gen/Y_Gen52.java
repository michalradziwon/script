
  package gen;
  public class Y_Gen52 {
  		@com.google.inject.Inject
  		public Y_Gen52(Y_Gen53 y_gen53){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen53 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  