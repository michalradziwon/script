
  package gen;
  public class Y_Gen61 {
  		@com.google.inject.Inject
  		public Y_Gen61(Y_Gen62 y_gen62){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen62 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  