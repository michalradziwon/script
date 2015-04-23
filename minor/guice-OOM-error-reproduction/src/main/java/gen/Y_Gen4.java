
  package gen;
  public class Y_Gen4 {
  		@com.google.inject.Inject
  		public Y_Gen4(Y_Gen5 y_gen5){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen5 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  